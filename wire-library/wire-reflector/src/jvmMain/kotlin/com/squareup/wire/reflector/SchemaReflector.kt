/*
 * Copyright 2021 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire.reflector

import com.squareup.wire.GrpcStatus
import com.squareup.wire.schema.Location
import com.squareup.wire.schema.Schema
import com.squareup.wire.schema.internal.SchemaEncoder
import grpc.reflection.v1alpha.ErrorResponse
import grpc.reflection.v1alpha.ExtensionRequest
import grpc.reflection.v1alpha.FileDescriptorResponse
import grpc.reflection.v1alpha.ListServiceResponse
import grpc.reflection.v1alpha.ServerReflectionRequest
import grpc.reflection.v1alpha.ServerReflectionResponse
import grpc.reflection.v1alpha.ServiceResponse
import okio.ByteString

/**
 * This converts a Wire Schema model to a protobuf DescriptorProtos model and serves that.
 */
class SchemaReflector(
  private val schema: Schema
) {
  fun process(request: ServerReflectionRequest): ServerReflectionResponse = when {
    request.list_services != null -> listServices()
    request.file_by_filename != null -> fileByFilename(request)
    request.file_containing_symbol != null -> fileContainingSymbol(request.file_containing_symbol)
    request.file_containing_extension != null ->
      fileContainingExtension(request.file_containing_extension)
    request.all_extension_numbers_of_type != null ->
      allExtensionNumbersOfType(request.all_extension_numbers_of_type)
    else -> {
      ServerReflectionResponse(
        original_request = request,
        error_response = ErrorResponse(
          error_code = GrpcStatus.INVALID_ARGUMENT.code,
          "unsupported request"
        )
      )
    }
  }

  private fun listServices(): ServerReflectionResponse {
    val allServiceNames = mutableListOf<ServiceResponse>()
    for (protoFile in schema.protoFiles) {
      for (service in protoFile.services) {
        val packagePrefix = when {
          protoFile.packageName != null -> protoFile.packageName + "."
          else -> ""
        }
        val serviceName = packagePrefix + service.name
        allServiceNames += ServiceResponse(name = serviceName)
      }
    }

    return ServerReflectionResponse(
      list_services_response = ListServiceResponse(
        service = allServiceNames
      )
    )
  }

  private fun fileByFilename(request: ServerReflectionRequest): ServerReflectionResponse {
    val protoFile = schema.protoFile(request.file_by_filename!!)!!

    return ServerReflectionResponse(
      file_descriptor_response = SchemaEncoder(schema).encode(protoFile).toFileDescriptorResponse()
    )
  }

  private fun fileContainingSymbol(file_containing_symbol: String): ServerReflectionResponse {
    val symbol = file_containing_symbol.removePrefix(".")

    val location: Location = findLocation(symbol) ?: return ServerReflectionResponse(
      error_response = ErrorResponse(
        error_code = GrpcStatus.NOT_FOUND.code,
        error_message = "cannot find file for symbol: $file_containing_symbol"
      )
    )

    val protoFile = schema.protoFile(location.path)!!
    val result = SchemaEncoder(schema).encode(protoFile).toFileDescriptorResponse()
    return ServerReflectionResponse(
      file_descriptor_response = result
    )
  }

  private fun findLocation(symbol: String): Location? {
    val service = schema.getService(symbol)
    if (service != null) {
      return service.location
    }

    val type = schema.getType(symbol)
    if (type != null) {
      return type.location
    }

    val fullServiceName = symbol.substringBeforeLast(".")
    val serviceWithMethod = schema.getService(fullServiceName)
    if (serviceWithMethod != null) {
      return serviceWithMethod.location
    }

    return null
  }

  private fun fileContainingExtension(fileContainingExtension: ExtensionRequest): ServerReflectionResponse {
    TODO("Not yet implemented")
  }

  private fun allExtensionNumbersOfType(allExtensionNumbersOfType: String): ServerReflectionResponse {
    TODO("Not yet implemented")
  }

  private fun ByteString.toFileDescriptorResponse(): FileDescriptorResponse {
    return FileDescriptorResponse(
      file_descriptor_proto = listOf(this)
    )
  }
}
