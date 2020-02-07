// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import com.squareup.wire.internal.redactElements
import com.squareup.wire.protos.custom_options.FooBar
import com.squareup.wire.protos.kotlin.foreign.ForeignMessage
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Float
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class MessageOptions(
  /**
   * Set true to use the old proto1 MessageSet wire format for extensions.
   * This is provided for backwards-compatibility with the MessageSet wire
   * format.  You should not use this for any other reason:  It's less
   * efficient, has fewer features, and is more complicated.
   *
   * The message must be defined exactly as follows:
   *   message Foo {
   *     option message_set_wire_format = true;
   *     extensions 4 to max;
   *   }
   * Note that the message cannot have any defined fields; MessageSets only
   * have extensions.
   *
   * All extensions of your type must be singular messages; e.g. they cannot
   * be int32s, enums, or repeated messages.
   *
   * Because this is an option, the above two restrictions are not enforced by
   * the protocol compiler.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val message_set_wire_format: Boolean? = null,
  /**
   * Disables the generation of the standard "descriptor()" accessor, which can
   * conflict with a field of the same name.  This is meant to make migration
   * from proto1 easier; new code should avoid fields named "descriptor".
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val no_standard_descriptor_accessor: Boolean? = null,
  /**
   * Is this message deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the message, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating messages.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val deprecated: Boolean? = null,
  /**
   * Whether the message is an automatically generated map entry type for the
   * maps field.
   *
   * For maps fields:
   *     map<KeyType, ValueType> map_field = 1;
   * The parsed descriptor looks like:
   *     message MapFieldEntry {
   *         option map_entry = true;
   *         optional KeyType key = 1;
   *         optional ValueType value = 2;
   *     }
   *     repeated MapFieldEntry map_field = 1;
   *
   * Implementations may choose not to generate the map_entry=true message, but
   * use a native map in the target language to hold the keys and values.
   * The reflection APIs in such implementations still need to work as
   * if the field is a repeated message field.
   *
   * NOTE: Do not set the option in .proto files. Always use the maps syntax
   * instead. The option should only be implicitly set by the proto compiler
   * parser.
   */
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val map_entry: Boolean? = null,
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 50001,
    adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  val my_message_option_one: FooBar? = null,
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 50002,
    adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  val my_message_option_two: Float? = null,
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 50003,
    adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  val my_message_option_three: FooBar? = null,
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 50004,
    adapter = "com.squareup.wire.protos.custom_options.FooBar${'$'}FooBarBazEnum#ADAPTER"
  )
  val my_message_option_four: FooBar.FooBarBazEnum? = null,
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 50005,
    adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  val my_message_option_five: FooBar? = null,
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 50006,
    adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  val my_message_option_six: FooBar? = null,
  /**
   * Extension source: foreign.proto
   */
  @field:WireField(
    tag = 50007,
    adapter = "com.squareup.wire.protos.kotlin.foreign.ForeignMessage#ADAPTER"
  )
  val foreign_message_option: ForeignMessage? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<MessageOptions, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MessageOptions) return false
    return unknownFields == other.unknownFields
        && message_set_wire_format == other.message_set_wire_format
        && no_standard_descriptor_accessor == other.no_standard_descriptor_accessor
        && deprecated == other.deprecated
        && map_entry == other.map_entry
        && uninterpreted_option == other.uninterpreted_option
        && my_message_option_one == other.my_message_option_one
        && my_message_option_two == other.my_message_option_two
        && my_message_option_three == other.my_message_option_three
        && my_message_option_four == other.my_message_option_four
        && my_message_option_five == other.my_message_option_five
        && my_message_option_six == other.my_message_option_six
        && foreign_message_option == other.foreign_message_option
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + message_set_wire_format.hashCode()
      result = result * 37 + no_standard_descriptor_accessor.hashCode()
      result = result * 37 + deprecated.hashCode()
      result = result * 37 + map_entry.hashCode()
      result = result * 37 + uninterpreted_option.hashCode()
      result = result * 37 + my_message_option_one.hashCode()
      result = result * 37 + my_message_option_two.hashCode()
      result = result * 37 + my_message_option_three.hashCode()
      result = result * 37 + my_message_option_four.hashCode()
      result = result * 37 + my_message_option_five.hashCode()
      result = result * 37 + my_message_option_six.hashCode()
      result = result * 37 + foreign_message_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (message_set_wire_format != null) result +=
        """message_set_wire_format=$message_set_wire_format"""
    if (no_standard_descriptor_accessor != null) result +=
        """no_standard_descriptor_accessor=$no_standard_descriptor_accessor"""
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (map_entry != null) result += """map_entry=$map_entry"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    if (my_message_option_one != null) result += """my_message_option_one=$my_message_option_one"""
    if (my_message_option_two != null) result += """my_message_option_two=$my_message_option_two"""
    if (my_message_option_three != null) result +=
        """my_message_option_three=$my_message_option_three"""
    if (my_message_option_four != null) result +=
        """my_message_option_four=$my_message_option_four"""
    if (my_message_option_five != null) result +=
        """my_message_option_five=$my_message_option_five"""
    if (my_message_option_six != null) result += """my_message_option_six=$my_message_option_six"""
    if (foreign_message_option != null) result +=
        """foreign_message_option=$foreign_message_option"""
    return result.joinToString(prefix = "MessageOptions{", separator = ", ", postfix = "}")
  }

  fun copy(
    message_set_wire_format: Boolean? = this.message_set_wire_format,
    no_standard_descriptor_accessor: Boolean? = this.no_standard_descriptor_accessor,
    deprecated: Boolean? = this.deprecated,
    map_entry: Boolean? = this.map_entry,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    my_message_option_one: FooBar? = this.my_message_option_one,
    my_message_option_two: Float? = this.my_message_option_two,
    my_message_option_three: FooBar? = this.my_message_option_three,
    my_message_option_four: FooBar.FooBarBazEnum? = this.my_message_option_four,
    my_message_option_five: FooBar? = this.my_message_option_five,
    my_message_option_six: FooBar? = this.my_message_option_six,
    foreign_message_option: ForeignMessage? = this.foreign_message_option,
    unknownFields: ByteString = this.unknownFields
  ): MessageOptions = MessageOptions(message_set_wire_format, no_standard_descriptor_accessor,
      deprecated, map_entry, uninterpreted_option, my_message_option_one, my_message_option_two,
      my_message_option_three, my_message_option_four, my_message_option_five,
      my_message_option_six, foreign_message_option, unknownFields)

  companion object {
    const val DEFAULT_MESSAGE_SET_WIRE_FORMAT: Boolean = false

    const val DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR: Boolean = false

    const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    val ADAPTER: ProtoAdapter<MessageOptions> = object : ProtoAdapter<MessageOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageOptions::class, 
      "type.googleapis.com/google.protobuf.MessageOptions"
    ) {
      override fun encodedSize(value: MessageOptions): Int = 
        ProtoAdapter.BOOL.encodedSizeWithTag(1, value.message_set_wire_format) +
        ProtoAdapter.BOOL.encodedSizeWithTag(2, value.no_standard_descriptor_accessor) +
        ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated) +
        ProtoAdapter.BOOL.encodedSizeWithTag(7, value.map_entry) +
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        FooBar.ADAPTER.encodedSizeWithTag(50001, value.my_message_option_one) +
        ProtoAdapter.FLOAT.encodedSizeWithTag(50002, value.my_message_option_two) +
        FooBar.ADAPTER.encodedSizeWithTag(50003, value.my_message_option_three) +
        FooBar.FooBarBazEnum.ADAPTER.encodedSizeWithTag(50004, value.my_message_option_four) +
        FooBar.ADAPTER.encodedSizeWithTag(50005, value.my_message_option_five) +
        FooBar.ADAPTER.encodedSizeWithTag(50006, value.my_message_option_six) +
        ForeignMessage.ADAPTER.encodedSizeWithTag(50007, value.foreign_message_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MessageOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.message_set_wire_format)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.no_standard_descriptor_accessor)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.map_entry)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        FooBar.ADAPTER.encodeWithTag(writer, 50001, value.my_message_option_one)
        ProtoAdapter.FLOAT.encodeWithTag(writer, 50002, value.my_message_option_two)
        FooBar.ADAPTER.encodeWithTag(writer, 50003, value.my_message_option_three)
        FooBar.FooBarBazEnum.ADAPTER.encodeWithTag(writer, 50004, value.my_message_option_four)
        FooBar.ADAPTER.encodeWithTag(writer, 50005, value.my_message_option_five)
        FooBar.ADAPTER.encodeWithTag(writer, 50006, value.my_message_option_six)
        ForeignMessage.ADAPTER.encodeWithTag(writer, 50007, value.foreign_message_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MessageOptions {
        var message_set_wire_format: Boolean? = null
        var no_standard_descriptor_accessor: Boolean? = null
        var deprecated: Boolean? = null
        var map_entry: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        var my_message_option_one: FooBar? = null
        var my_message_option_two: Float? = null
        var my_message_option_three: FooBar? = null
        var my_message_option_four: FooBar.FooBarBazEnum? = null
        var my_message_option_five: FooBar? = null
        var my_message_option_six: FooBar? = null
        var foreign_message_option: ForeignMessage? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> message_set_wire_format = ProtoAdapter.BOOL.decode(reader)
            2 -> no_standard_descriptor_accessor = ProtoAdapter.BOOL.decode(reader)
            3 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            7 -> map_entry = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            50001 -> my_message_option_one = FooBar.ADAPTER.decode(reader)
            50002 -> my_message_option_two = ProtoAdapter.FLOAT.decode(reader)
            50003 -> my_message_option_three = FooBar.ADAPTER.decode(reader)
            50004 -> try {
              my_message_option_four = FooBar.FooBarBazEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            50005 -> my_message_option_five = FooBar.ADAPTER.decode(reader)
            50006 -> my_message_option_six = FooBar.ADAPTER.decode(reader)
            50007 -> foreign_message_option = ForeignMessage.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return MessageOptions(
          message_set_wire_format = message_set_wire_format,
          no_standard_descriptor_accessor = no_standard_descriptor_accessor,
          deprecated = deprecated,
          map_entry = map_entry,
          uninterpreted_option = uninterpreted_option,
          my_message_option_one = my_message_option_one,
          my_message_option_two = my_message_option_two,
          my_message_option_three = my_message_option_three,
          my_message_option_four = my_message_option_four,
          my_message_option_five = my_message_option_five,
          my_message_option_six = my_message_option_six,
          foreign_message_option = foreign_message_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MessageOptions): MessageOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        my_message_option_one = value.my_message_option_one?.let(FooBar.ADAPTER::redact),
        my_message_option_three = value.my_message_option_three?.let(FooBar.ADAPTER::redact),
        my_message_option_five = value.my_message_option_five?.let(FooBar.ADAPTER::redact),
        my_message_option_six = value.my_message_option_six?.let(FooBar.ADAPTER::redact),
        foreign_message_option = value.foreign_message_option?.let(ForeignMessage.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
