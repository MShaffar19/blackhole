// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RemoveConf.proto

package com.dp.blackhole.common.gen;

public final class RemoveConfPB {
  private RemoveConfPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RemoveConfOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string app_name = 1;
    /**
     * <code>required string app_name = 1;</code>
     */
    boolean hasAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    java.lang.String getAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getAppNameBytes();

    // repeated string app_servers = 2;
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    java.util.List<java.lang.String>
    getAppServersList();
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    int getAppServersCount();
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    java.lang.String getAppServers(int index);
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    com.google.protobuf.ByteString
        getAppServersBytes(int index);
  }
  /**
   * Protobuf type {@code blackhole.RemoveConf}
   */
  public static final class RemoveConf extends
      com.google.protobuf.GeneratedMessage
      implements RemoveConfOrBuilder {
    // Use RemoveConf.newBuilder() to construct.
    private RemoveConf(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RemoveConf(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RemoveConf defaultInstance;
    public static RemoveConf getDefaultInstance() {
      return defaultInstance;
    }

    public RemoveConf getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveConf(
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
              appName_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                appServers_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              appServers_.add(input.readBytes());
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          appServers_ = new com.google.protobuf.UnmodifiableLazyStringList(appServers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.common.gen.RemoveConfPB.internal_static_blackhole_RemoveConf_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.common.gen.RemoveConfPB.internal_static_blackhole_RemoveConf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf.class, com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf.Builder.class);
    }

    public static com.google.protobuf.Parser<RemoveConf> PARSER =
        new com.google.protobuf.AbstractParser<RemoveConf>() {
      public RemoveConf parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveConf(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveConf> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string app_name = 1;
    public static final int APP_NAME_FIELD_NUMBER = 1;
    private java.lang.Object appName_;
    /**
     * <code>required string app_name = 1;</code>
     */
    public boolean hasAppName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public java.lang.String getAppName() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          appName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated string app_servers = 2;
    public static final int APP_SERVERS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList appServers_;
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    public java.util.List<java.lang.String>
        getAppServersList() {
      return appServers_;
    }
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    public int getAppServersCount() {
      return appServers_.size();
    }
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    public java.lang.String getAppServers(int index) {
      return appServers_.get(index);
    }
    /**
     * <code>repeated string app_servers = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAppServersBytes(int index) {
      return appServers_.getByteString(index);
    }

    private void initFields() {
      appName_ = "";
      appServers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasAppName()) {
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
        output.writeBytes(1, getAppNameBytes());
      }
      for (int i = 0; i < appServers_.size(); i++) {
        output.writeBytes(2, appServers_.getByteString(i));
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
          .computeBytesSize(1, getAppNameBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < appServers_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(appServers_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getAppServersList().size();
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

    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf prototype) {
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
     * Protobuf type {@code blackhole.RemoveConf}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.common.gen.RemoveConfPB.RemoveConfOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.common.gen.RemoveConfPB.internal_static_blackhole_RemoveConf_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.common.gen.RemoveConfPB.internal_static_blackhole_RemoveConf_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf.class, com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf.Builder.class);
      }

      // Construct using com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf.newBuilder()
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
        appName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        appServers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.common.gen.RemoveConfPB.internal_static_blackhole_RemoveConf_descriptor;
      }

      public com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf getDefaultInstanceForType() {
        return com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf.getDefaultInstance();
      }

      public com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf build() {
        com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf buildPartial() {
        com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf result = new com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.appName_ = appName_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          appServers_ = new com.google.protobuf.UnmodifiableLazyStringList(
              appServers_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.appServers_ = appServers_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf) {
          return mergeFrom((com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf other) {
        if (other == com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf.getDefaultInstance()) return this;
        if (other.hasAppName()) {
          bitField0_ |= 0x00000001;
          appName_ = other.appName_;
          onChanged();
        }
        if (!other.appServers_.isEmpty()) {
          if (appServers_.isEmpty()) {
            appServers_ = other.appServers_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAppServersIsMutable();
            appServers_.addAll(other.appServers_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAppName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.common.gen.RemoveConfPB.RemoveConf) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string app_name = 1;
      private java.lang.Object appName_ = "";
      /**
       * <code>required string app_name = 1;</code>
       */
      public boolean hasAppName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public java.lang.String getAppName() {
        java.lang.Object ref = appName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          appName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAppNameBytes() {
        java.lang.Object ref = appName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder clearAppName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        appName_ = getDefaultInstance().getAppName();
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }

      // repeated string app_servers = 2;
      private com.google.protobuf.LazyStringList appServers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureAppServersIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          appServers_ = new com.google.protobuf.LazyStringArrayList(appServers_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public java.util.List<java.lang.String>
          getAppServersList() {
        return java.util.Collections.unmodifiableList(appServers_);
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public int getAppServersCount() {
        return appServers_.size();
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public java.lang.String getAppServers(int index) {
        return appServers_.get(index);
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAppServersBytes(int index) {
        return appServers_.getByteString(index);
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public Builder setAppServers(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAppServersIsMutable();
        appServers_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public Builder addAppServers(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAppServersIsMutable();
        appServers_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public Builder addAllAppServers(
          java.lang.Iterable<java.lang.String> values) {
        ensureAppServersIsMutable();
        super.addAll(values, appServers_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public Builder clearAppServers() {
        appServers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string app_servers = 2;</code>
       */
      public Builder addAppServersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAppServersIsMutable();
        appServers_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.RemoveConf)
    }

    static {
      defaultInstance = new RemoveConf(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.RemoveConf)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_RemoveConf_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_RemoveConf_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020RemoveConf.proto\022\tblackhole\"3\n\nRemoveC" +
      "onf\022\020\n\010app_name\030\001 \002(\t\022\023\n\013app_servers\030\002 \003" +
      "(\tB+\n\033com.dp.blackhole.common.genB\014Remov" +
      "eConfPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_RemoveConf_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_RemoveConf_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_RemoveConf_descriptor,
              new java.lang.String[] { "AppName", "AppServers", });
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
