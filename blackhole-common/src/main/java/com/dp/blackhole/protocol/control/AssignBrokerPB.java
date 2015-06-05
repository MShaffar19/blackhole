// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AssignBroker.proto

package com.dp.blackhole.protocol.control;

public final class AssignBrokerPB {
  private AssignBrokerPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AssignBrokerOrBuilder
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

    // required string broker_server = 2;
    /**
     * <code>required string broker_server = 2;</code>
     */
    boolean hasBrokerServer();
    /**
     * <code>required string broker_server = 2;</code>
     */
    java.lang.String getBrokerServer();
    /**
     * <code>required string broker_server = 2;</code>
     */
    com.google.protobuf.ByteString
        getBrokerServerBytes();

    // required int32 broker_port = 3;
    /**
     * <code>required int32 broker_port = 3;</code>
     */
    boolean hasBrokerPort();
    /**
     * <code>required int32 broker_port = 3;</code>
     */
    int getBrokerPort();

    // optional string instance_id = 4;
    /**
     * <code>optional string instance_id = 4;</code>
     */
    boolean hasInstanceId();
    /**
     * <code>optional string instance_id = 4;</code>
     */
    java.lang.String getInstanceId();
    /**
     * <code>optional string instance_id = 4;</code>
     */
    com.google.protobuf.ByteString
        getInstanceIdBytes();

    // optional string partition_id = 5;
    /**
     * <code>optional string partition_id = 5;</code>
     */
    boolean hasPartitionId();
    /**
     * <code>optional string partition_id = 5;</code>
     */
    java.lang.String getPartitionId();
    /**
     * <code>optional string partition_id = 5;</code>
     */
    com.google.protobuf.ByteString
        getPartitionIdBytes();
  }
  /**
   * Protobuf type {@code blackhole.AssignBroker}
   */
  public static final class AssignBroker extends
      com.google.protobuf.GeneratedMessage
      implements AssignBrokerOrBuilder {
    // Use AssignBroker.newBuilder() to construct.
    private AssignBroker(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AssignBroker(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AssignBroker defaultInstance;
    public static AssignBroker getDefaultInstance() {
      return defaultInstance;
    }

    public AssignBroker getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AssignBroker(
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
              brokerServer_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              brokerPort_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              instanceId_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              partitionId_ = input.readBytes();
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
      return com.dp.blackhole.protocol.control.AssignBrokerPB.internal_static_blackhole_AssignBroker_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.AssignBrokerPB.internal_static_blackhole_AssignBroker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker.class, com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker.Builder.class);
    }

    public static com.google.protobuf.Parser<AssignBroker> PARSER =
        new com.google.protobuf.AbstractParser<AssignBroker>() {
      public AssignBroker parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssignBroker(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AssignBroker> getParserForType() {
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

    // required string broker_server = 2;
    public static final int BROKER_SERVER_FIELD_NUMBER = 2;
    private java.lang.Object brokerServer_;
    /**
     * <code>required string broker_server = 2;</code>
     */
    public boolean hasBrokerServer() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string broker_server = 2;</code>
     */
    public java.lang.String getBrokerServer() {
      java.lang.Object ref = brokerServer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          brokerServer_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string broker_server = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBrokerServerBytes() {
      java.lang.Object ref = brokerServer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brokerServer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 broker_port = 3;
    public static final int BROKER_PORT_FIELD_NUMBER = 3;
    private int brokerPort_;
    /**
     * <code>required int32 broker_port = 3;</code>
     */
    public boolean hasBrokerPort() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 broker_port = 3;</code>
     */
    public int getBrokerPort() {
      return brokerPort_;
    }

    // optional string instance_id = 4;
    public static final int INSTANCE_ID_FIELD_NUMBER = 4;
    private java.lang.Object instanceId_;
    /**
     * <code>optional string instance_id = 4;</code>
     */
    public boolean hasInstanceId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string instance_id = 4;</code>
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          instanceId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string instance_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string partition_id = 5;
    public static final int PARTITION_ID_FIELD_NUMBER = 5;
    private java.lang.Object partitionId_;
    /**
     * <code>optional string partition_id = 5;</code>
     */
    public boolean hasPartitionId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string partition_id = 5;</code>
     */
    public java.lang.String getPartitionId() {
      java.lang.Object ref = partitionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          partitionId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string partition_id = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPartitionIdBytes() {
      java.lang.Object ref = partitionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partitionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      topic_ = "";
      brokerServer_ = "";
      brokerPort_ = 0;
      instanceId_ = "";
      partitionId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTopic()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBrokerServer()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBrokerPort()) {
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
        output.writeBytes(2, getBrokerServerBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, brokerPort_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getInstanceIdBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getPartitionIdBytes());
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
          .computeBytesSize(2, getBrokerServerBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, brokerPort_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getInstanceIdBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getPartitionIdBytes());
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

    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker prototype) {
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
     * Protobuf type {@code blackhole.AssignBroker}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBrokerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.AssignBrokerPB.internal_static_blackhole_AssignBroker_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.AssignBrokerPB.internal_static_blackhole_AssignBroker_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker.class, com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker.Builder.class);
      }

      // Construct using com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        topic_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        brokerServer_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        brokerPort_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        instanceId_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        partitionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.AssignBrokerPB.internal_static_blackhole_AssignBroker_descriptor;
      }

      public com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker.getDefaultInstance();
      }

      public com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker build() {
        com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker buildPartial() {
        com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker result = new com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.topic_ = topic_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.brokerServer_ = brokerServer_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.brokerPort_ = brokerPort_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.instanceId_ = instanceId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.partitionId_ = partitionId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker) {
          return mergeFrom((com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker other) {
        if (other == com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker.getDefaultInstance()) return this;
        if (other.hasTopic()) {
          bitField0_ |= 0x00000001;
          topic_ = other.topic_;
          onChanged();
        }
        if (other.hasBrokerServer()) {
          bitField0_ |= 0x00000002;
          brokerServer_ = other.brokerServer_;
          onChanged();
        }
        if (other.hasBrokerPort()) {
          setBrokerPort(other.getBrokerPort());
        }
        if (other.hasInstanceId()) {
          bitField0_ |= 0x00000008;
          instanceId_ = other.instanceId_;
          onChanged();
        }
        if (other.hasPartitionId()) {
          bitField0_ |= 0x00000010;
          partitionId_ = other.partitionId_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTopic()) {
          
          return false;
        }
        if (!hasBrokerServer()) {
          
          return false;
        }
        if (!hasBrokerPort()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.protocol.control.AssignBrokerPB.AssignBroker) e.getUnfinishedMessage();
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

      // required string broker_server = 2;
      private java.lang.Object brokerServer_ = "";
      /**
       * <code>required string broker_server = 2;</code>
       */
      public boolean hasBrokerServer() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string broker_server = 2;</code>
       */
      public java.lang.String getBrokerServer() {
        java.lang.Object ref = brokerServer_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          brokerServer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string broker_server = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBrokerServerBytes() {
        java.lang.Object ref = brokerServer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          brokerServer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string broker_server = 2;</code>
       */
      public Builder setBrokerServer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        brokerServer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string broker_server = 2;</code>
       */
      public Builder clearBrokerServer() {
        bitField0_ = (bitField0_ & ~0x00000002);
        brokerServer_ = getDefaultInstance().getBrokerServer();
        onChanged();
        return this;
      }
      /**
       * <code>required string broker_server = 2;</code>
       */
      public Builder setBrokerServerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        brokerServer_ = value;
        onChanged();
        return this;
      }

      // required int32 broker_port = 3;
      private int brokerPort_ ;
      /**
       * <code>required int32 broker_port = 3;</code>
       */
      public boolean hasBrokerPort() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 broker_port = 3;</code>
       */
      public int getBrokerPort() {
        return brokerPort_;
      }
      /**
       * <code>required int32 broker_port = 3;</code>
       */
      public Builder setBrokerPort(int value) {
        bitField0_ |= 0x00000004;
        brokerPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 broker_port = 3;</code>
       */
      public Builder clearBrokerPort() {
        bitField0_ = (bitField0_ & ~0x00000004);
        brokerPort_ = 0;
        onChanged();
        return this;
      }

      // optional string instance_id = 4;
      private java.lang.Object instanceId_ = "";
      /**
       * <code>optional string instance_id = 4;</code>
       */
      public boolean hasInstanceId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string instance_id = 4;</code>
       */
      public java.lang.String getInstanceId() {
        java.lang.Object ref = instanceId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          instanceId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string instance_id = 4;</code>
       */
      public com.google.protobuf.ByteString
          getInstanceIdBytes() {
        java.lang.Object ref = instanceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          instanceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string instance_id = 4;</code>
       */
      public Builder setInstanceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        instanceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string instance_id = 4;</code>
       */
      public Builder clearInstanceId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        instanceId_ = getDefaultInstance().getInstanceId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string instance_id = 4;</code>
       */
      public Builder setInstanceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        instanceId_ = value;
        onChanged();
        return this;
      }

      // optional string partition_id = 5;
      private java.lang.Object partitionId_ = "";
      /**
       * <code>optional string partition_id = 5;</code>
       */
      public boolean hasPartitionId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string partition_id = 5;</code>
       */
      public java.lang.String getPartitionId() {
        java.lang.Object ref = partitionId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          partitionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string partition_id = 5;</code>
       */
      public com.google.protobuf.ByteString
          getPartitionIdBytes() {
        java.lang.Object ref = partitionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          partitionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string partition_id = 5;</code>
       */
      public Builder setPartitionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        partitionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string partition_id = 5;</code>
       */
      public Builder clearPartitionId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        partitionId_ = getDefaultInstance().getPartitionId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string partition_id = 5;</code>
       */
      public Builder setPartitionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        partitionId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.AssignBroker)
    }

    static {
      defaultInstance = new AssignBroker(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.AssignBroker)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_AssignBroker_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_AssignBroker_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022AssignBroker.proto\022\tblackhole\"t\n\014Assig" +
      "nBroker\022\r\n\005topic\030\001 \002(\t\022\025\n\rbroker_server\030" +
      "\002 \002(\t\022\023\n\013broker_port\030\003 \002(\005\022\023\n\013instance_i" +
      "d\030\004 \001(\t\022\024\n\014partition_id\030\005 \001(\tB3\n!com.dp." +
      "blackhole.protocol.controlB\016AssignBroker" +
      "PB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_AssignBroker_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_AssignBroker_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_AssignBroker_descriptor,
              new java.lang.String[] { "Topic", "BrokerServer", "BrokerPort", "InstanceId", "PartitionId", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
