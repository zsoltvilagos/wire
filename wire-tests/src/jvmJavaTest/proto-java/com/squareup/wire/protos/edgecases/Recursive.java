// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: edge_cases.proto
package com.squareup.wire.protos.edgecases;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class Recursive extends Message<Recursive, Recursive.Builder> {
  public static final ProtoAdapter<Recursive> ADAPTER = new ProtoAdapter_Recursive();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_VALUE = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer value;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.edgecases.Recursive#ADAPTER"
  )
  public final Recursive recursive;

  public Recursive(Integer value, Recursive recursive) {
    this(value, recursive, ByteString.EMPTY);
  }

  public Recursive(Integer value, Recursive recursive, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.value = value;
    this.recursive = recursive;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.value = value;
    builder.recursive = recursive;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Recursive)) return false;
    Recursive o = (Recursive) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(value, o.value)
        && Internal.equals(recursive, o.recursive);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (value != null ? value.hashCode() : 0);
      result = result * 37 + (recursive != null ? recursive.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (value != null) builder.append(", value=").append(value);
    if (recursive != null) builder.append(", recursive=").append(recursive);
    return builder.replace(0, 2, "Recursive{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Recursive, Builder> {
    public Integer value;

    public Recursive recursive;

    public Builder() {
    }

    public Builder value(Integer value) {
      this.value = value;
      return this;
    }

    public Builder recursive(Recursive recursive) {
      this.recursive = recursive;
      return this;
    }

    @Override
    public Recursive build() {
      return new Recursive(value, recursive, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Recursive extends ProtoAdapter<Recursive> {
    public ProtoAdapter_Recursive() {
      super(FieldEncoding.LENGTH_DELIMITED, Recursive.class, "type.googleapis.com/squareup.protos.edgecases.Recursive");
    }

    @Override
    public int encodedSize(Recursive value) {
      return ProtoAdapter.INT32.encodedSizeWithTag(1, value.value)
          + Recursive.ADAPTER.encodedSizeWithTag(2, value.recursive)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Recursive value) throws IOException {
      ProtoAdapter.INT32.encodeWithTag(writer, 1, value.value);
      Recursive.ADAPTER.encodeWithTag(writer, 2, value.recursive);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Recursive decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.value(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.recursive(Recursive.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public Recursive redact(Recursive value) {
      Builder builder = value.newBuilder();
      if (builder.recursive != null) builder.recursive = Recursive.ADAPTER.redact(builder.recursive);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
