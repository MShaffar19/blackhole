// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProducerIdAssign.proto

package com.dp.blackhole.protocol.control;

public final class ProducerIdAssignPB {
  private ProducerIdAssignPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ProducerIdAssignOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string topic = 1;
    /**
     * <code>required string topic = 1;</code>
     */
    boolean hasTopic();
    /**
     * <code>required string topic = 1;</code>
     */
    java.lang.String getTopic();
    /**
     * <code>required string topic = 1;</code>
     */
    com.google.protobuf.ByteString
        getTopicBytes();

    // required string producer_id = 2;
    /**
     * <code>required string producer_id = 2;</code>
     */
    boolean hasProducerId();
    /**
     * <code>required string producer_id = 2;</code>
     */
    java.lang.String getProducerId();
    /**
     * <code>required string producer_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getProducerIdBytes();

    // optional .blackhole.CommonConfRes conf_res = 3;
    /**
     * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
     */
    boolean hasConfRes();
    /**
     * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
     */
    com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes getConfRes();
    /**
     * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
     */
    com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfResOrBuilder getConfResOrBuilder();
  }
  /**
   * Protobuf type {@code blackhole.ProducerIdAssign}
   */
  public static final class ProducerIdAssign extends
      com.google.protobuf.GeneratedMessage
      implements ProducerIdAssignOrBuilder {
    // Use ProducerIdAssign.newBuilder() to construct.
    private ProducerIdAssign(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ProducerIdAssign(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ProducerIdAssign defaultInstance;
    public static ProducerIdAssign getDefaultInstance() {
      return defaultInstance;
    }

    public ProducerIdAssign getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ProducerIdAssign(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              topic_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              producerId_ = input.readBytes();
              break;
            }
            case 26: {
              com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = confRes_.toBuilder();
              }
              confRes_ = input.readMessage(com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(confRes_);
                confRes_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.ProducerIdAssignPB.internal_static_blackhole_ProducerIdAssign_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.ProducerIdAssignPB.internal_static_blackhole_ProducerIdAssign_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign.class, com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign.Builder.class);
    }

    public static com.google.protobuf.Parser<ProducerIdAssign> PARSER =
        new com.google.protobuf.AbstractParser<ProducerIdAssign>() {
      public ProducerIdAssign parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProducerIdAssign(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ProducerIdAssign> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string topic = 1;
    public static final int TOPIC_FIELD_NUMBER = 1;
    private java.lang.Object topic_;
    /**
     * <code>required string topic = 1;</code>
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string topic = 1;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          topic_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string topic = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string producer_id = 2;
    public static final int PRODUCER_ID_FIELD_NUMBER = 2;
    private java.lang.Object producerId_;
    /**
     * <code>required string producer_id = 2;</code>
     */
    public boolean hasProducerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string producer_id = 2;</code>
     */
    public java.lang.String getProducerId() {
      java.lang.Object ref = producerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          producerId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string producer_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProducerIdBytes() {
      java.lang.Object ref = producerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        producerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .blackhole.CommonConfRes conf_res = 3;
    public static final int CONF_RES_FIELD_NUMBER = 3;
    private com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes confRes_;
    /**
     * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
     */
    public boolean hasConfRes() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
     */
    public com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes getConfRes() {
      return confRes_;
    }
    /**
     * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
     */
    public com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfResOrBuilder getConfResOrBuilder() {
      return confRes_;
    }

    private void initFields() {
      topic_ = "";
      producerId_ = "";
      confRes_ = com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTopic()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProducerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTopicBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getProducerIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, confRes_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTopicBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getProducerIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, confRes_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code blackhole.ProducerIdAssign}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssignOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.ProducerIdAssignPB.internal_static_blackhole_ProducerIdAssign_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.ProducerIdAssignPB.internal_static_blackhole_ProducerIdAssign_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign.class, com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign.Builder.class);
      }

      // Construct using com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getConfResFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        topic_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        producerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (confResBuilder_ == null) {
          confRes_ = com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.getDefaultInstance();
        } else {
          confResBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.ProducerIdAssignPB.internal_static_blackhole_ProducerIdAssign_descriptor;
      }

      public com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign.getDefaultInstance();
      }

      public com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign build() {
        com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign buildPartial() {
        com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign result = new com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.topic_ = topic_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.producerId_ = producerId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (confResBuilder_ == null) {
          result.confRes_ = confRes_;
        } else {
          result.confRes_ = confResBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign) {
          return mergeFrom((com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign other) {
        if (other == com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign.getDefaultInstance()) return this;
        if (other.hasTopic()) {
          bitField0_ |= 0x00000001;
          topic_ = other.topic_;
          onChanged();
        }
        if (other.hasProducerId()) {
          bitField0_ |= 0x00000002;
          producerId_ = other.producerId_;
          onChanged();
        }
        if (other.hasConfRes()) {
          mergeConfRes(other.getConfRes());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTopic()) {
          
          return false;
        }
        if (!hasProducerId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.protocol.control.ProducerIdAssignPB.ProducerIdAssign) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string topic = 1;
      private java.lang.Object topic_ = "";
      /**
       * <code>required string topic = 1;</code>
       */
      public boolean hasTopic() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public java.lang.String getTopic() {
        java.lang.Object ref = topic_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          topic_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTopicBytes() {
        java.lang.Object ref = topic_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          topic_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public Builder setTopic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        topic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public Builder clearTopic() {
        bitField0_ = (bitField0_ & ~0x00000001);
        topic_ = getDefaultInstance().getTopic();
        onChanged();
        return this;
      }
      /**
       * <code>required string topic = 1;</code>
       */
      public Builder setTopicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        topic_ = value;
        onChanged();
        return this;
      }

      // required string producer_id = 2;
      private java.lang.Object producerId_ = "";
      /**
       * <code>required string producer_id = 2;</code>
       */
      public boolean hasProducerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string producer_id = 2;</code>
       */
      public java.lang.String getProducerId() {
        java.lang.Object ref = producerId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          producerId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string producer_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getProducerIdBytes() {
        java.lang.Object ref = producerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          producerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string producer_id = 2;</code>
       */
      public Builder setProducerId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        producerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string producer_id = 2;</code>
       */
      public Builder clearProducerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        producerId_ = getDefaultInstance().getProducerId();
        onChanged();
        return this;
      }
      /**
       * <code>required string producer_id = 2;</code>
       */
      public Builder setProducerIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        producerId_ = value;
        onChanged();
        return this;
      }

      // optional .blackhole.CommonConfRes conf_res = 3;
      private com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes confRes_ = com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes, com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.Builder, com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfResOrBuilder> confResBuilder_;
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public boolean hasConfRes() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes getConfRes() {
        if (confResBuilder_ == null) {
          return confRes_;
        } else {
          return confResBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public Builder setConfRes(com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes value) {
        if (confResBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          confRes_ = value;
          onChanged();
        } else {
          confResBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public Builder setConfRes(
          com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.Builder builderForValue) {
        if (confResBuilder_ == null) {
          confRes_ = builderForValue.build();
          onChanged();
        } else {
          confResBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public Builder mergeConfRes(com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes value) {
        if (confResBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              confRes_ != com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.getDefaultInstance()) {
            confRes_ =
              com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.newBuilder(confRes_).mergeFrom(value).buildPartial();
          } else {
            confRes_ = value;
          }
          onChanged();
        } else {
          confResBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public Builder clearConfRes() {
        if (confResBuilder_ == null) {
          confRes_ = com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.getDefaultInstance();
          onChanged();
        } else {
          confResBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.Builder getConfResBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getConfResFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      public com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfResOrBuilder getConfResOrBuilder() {
        if (confResBuilder_ != null) {
          return confResBuilder_.getMessageOrBuilder();
        } else {
          return confRes_;
        }
      }
      /**
       * <code>optional .blackhole.CommonConfRes conf_res = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes, com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.Builder, com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfResOrBuilder> 
          getConfResFieldBuilder() {
        if (confResBuilder_ == null) {
          confResBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes, com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfRes.Builder, com.dp.blackhole.protocol.control.CommonConfResPB.CommonConfResOrBuilder>(
                  confRes_,
                  getParentForChildren(),
                  isClean());
          confRes_ = null;
        }
        return confResBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.ProducerIdAssign)
    }

    static {
      defaultInstance = new ProducerIdAssign(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.ProducerIdAssign)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_ProducerIdAssign_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_ProducerIdAssign_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ProducerIdAssign.proto\022\tblackhole\032\023Com" +
      "monConfRes.proto\"b\n\020ProducerIdAssign\022\r\n\005" +
      "topic\030\001 \002(\t\022\023\n\013producer_id\030\002 \002(\t\022*\n\010conf" +
      "_res\030\003 \001(\0132\030.blackhole.CommonConfResB7\n!" +
      "com.dp.blackhole.protocol.controlB\022Produ" +
      "cerIdAssignPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_ProducerIdAssign_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_ProducerIdAssign_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_ProducerIdAssign_descriptor,
              new java.lang.String[] { "Topic", "ProducerId", "ConfRes", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dp.blackhole.protocol.control.CommonConfResPB.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
