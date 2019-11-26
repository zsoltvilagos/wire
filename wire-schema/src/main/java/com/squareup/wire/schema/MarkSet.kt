/*
 * Copyright (C) 2015 Square, Inc.
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
package com.squareup.wire.schema

import com.google.common.base.Preconditions.checkArgument
import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap

/**
 * A mark set is used in three phases:
 *
 *  1. Marking root types and root members. These are the identifiers specifically identified by
 *     the user in the includes set. In this phase it is an error to mark a type that is excluded,
 *     or to both a type and one of its members.
 *  2. Marking members transitively reachable by those roots. In this phase if a member is visited,
 *     the member's enclosing type is marked instead, unless it is of a type that has a specific
 *     member already marked.
 *  3. Retaining which members and types have been marked.
 */
internal class MarkSet(
  val identifierSet: IdentifierSet
) {
  /** The types to retain. We may retain a type but not all of its members. */
  val types = mutableSetOf<ProtoType>()

  /** The members to retain. Any member not in here should be pruned! */
  val members: Multimap<ProtoType, ProtoMember> = LinkedHashMultimap.create()

  /**
   * Marks `protoMember`, throwing if it is explicitly excluded. This implicitly excludes other
   * members of the same type.
   */
  fun root(protoMember: ProtoMember) {
    check(!identifierSet.excludes(protoMember))
    types.add(protoMember.type())
    members.put(protoMember.type(), protoMember)
  }

  /** Marks `type`, throwing if it is explicitly excluded. */
  fun root(type: ProtoType) {
    checkArgument(!identifierSet.excludes(type))
    types.add(type)
  }

  /**
   * Marks a type as transitively reachable by the includes set. Returns true if the mark is new,
   * the type will be retained, and reachable objects should be traversed.
   */
  fun mark(type: ProtoType): Boolean {
    if (identifierSet.excludes(type)) return false
    return types.add(type)
  }

  /**
   * Marks a member as transitively reachable by the includes set. Returns true if the mark is new,
   * the member will be retained, and reachable objects should be traversed.
   */
  fun mark(protoMember: ProtoMember): Boolean {
    if (identifierSet.excludes(protoMember)) return false
    types.add(protoMember.type())
    return members.put(protoMember.type(), protoMember)
  }

  /** Returns true if `type` is marked and should be retained. */
  operator fun contains(type: ProtoType): Boolean {
    return types.contains(type)
  }

  /** Returns true if `member` is marked and should be retained. */
  operator fun contains(protoMember: ProtoMember): Boolean {
    if (identifierSet.excludes(protoMember)) return false
    return members.containsEntry(protoMember.type(), protoMember)
  }
}
