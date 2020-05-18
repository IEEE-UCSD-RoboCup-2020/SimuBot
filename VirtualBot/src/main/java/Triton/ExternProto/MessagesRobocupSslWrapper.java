package Triton.ExternProto;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages_robocup_ssl_wrapper.proto

public final class MessagesRobocupSslWrapper {
  private MessagesRobocupSslWrapper() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SSL_WrapperPacketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SSL_WrapperPacket)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .SSL_DetectionFrame detection = 1;</code>
     * @return Whether the detection field is set.
     */
    boolean hasDetection();
    /**
     * <code>optional .SSL_DetectionFrame detection = 1;</code>
     * @return The detection.
     */
    MessagesRobocupSslDetection.SSL_DetectionFrame getDetection();
    /**
     * <code>optional .SSL_DetectionFrame detection = 1;</code>
     */
    MessagesRobocupSslDetection.SSL_DetectionFrameOrBuilder getDetectionOrBuilder();

    /**
     * <code>optional .SSL_GeometryData geometry = 2;</code>
     * @return Whether the geometry field is set.
     */
    boolean hasGeometry();
    /**
     * <code>optional .SSL_GeometryData geometry = 2;</code>
     * @return The geometry.
     */
    MessagesRobocupSslGeometry.SSL_GeometryData getGeometry();
    /**
     * <code>optional .SSL_GeometryData geometry = 2;</code>
     */
    MessagesRobocupSslGeometry.SSL_GeometryDataOrBuilder getGeometryOrBuilder();
  }
  /**
   * Protobuf type {@code SSL_WrapperPacket}
   */
  public  static final class SSL_WrapperPacket extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SSL_WrapperPacket)
      SSL_WrapperPacketOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SSL_WrapperPacket.newBuilder() to construct.
    private SSL_WrapperPacket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SSL_WrapperPacket() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SSL_WrapperPacket();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SSL_WrapperPacket(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              MessagesRobocupSslDetection.SSL_DetectionFrame.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = detection_.toBuilder();
              }
              detection_ = input.readMessage(MessagesRobocupSslDetection.SSL_DetectionFrame.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(detection_);
                detection_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              MessagesRobocupSslGeometry.SSL_GeometryData.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = geometry_.toBuilder();
              }
              geometry_ = input.readMessage(MessagesRobocupSslGeometry.SSL_GeometryData.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(geometry_);
                geometry_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessagesRobocupSslWrapper.internal_static_SSL_WrapperPacket_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessagesRobocupSslWrapper.internal_static_SSL_WrapperPacket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MessagesRobocupSslWrapper.SSL_WrapperPacket.class, MessagesRobocupSslWrapper.SSL_WrapperPacket.Builder.class);
    }

    private int bitField0_;
    public static final int DETECTION_FIELD_NUMBER = 1;
    private MessagesRobocupSslDetection.SSL_DetectionFrame detection_;
    /**
     * <code>optional .SSL_DetectionFrame detection = 1;</code>
     * @return Whether the detection field is set.
     */
    public boolean hasDetection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .SSL_DetectionFrame detection = 1;</code>
     * @return The detection.
     */
    public MessagesRobocupSslDetection.SSL_DetectionFrame getDetection() {
      return detection_ == null ? MessagesRobocupSslDetection.SSL_DetectionFrame.getDefaultInstance() : detection_;
    }
    /**
     * <code>optional .SSL_DetectionFrame detection = 1;</code>
     */
    public MessagesRobocupSslDetection.SSL_DetectionFrameOrBuilder getDetectionOrBuilder() {
      return detection_ == null ? MessagesRobocupSslDetection.SSL_DetectionFrame.getDefaultInstance() : detection_;
    }

    public static final int GEOMETRY_FIELD_NUMBER = 2;
    private MessagesRobocupSslGeometry.SSL_GeometryData geometry_;
    /**
     * <code>optional .SSL_GeometryData geometry = 2;</code>
     * @return Whether the geometry field is set.
     */
    public boolean hasGeometry() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .SSL_GeometryData geometry = 2;</code>
     * @return The geometry.
     */
    public MessagesRobocupSslGeometry.SSL_GeometryData getGeometry() {
      return geometry_ == null ? MessagesRobocupSslGeometry.SSL_GeometryData.getDefaultInstance() : geometry_;
    }
    /**
     * <code>optional .SSL_GeometryData geometry = 2;</code>
     */
    public MessagesRobocupSslGeometry.SSL_GeometryDataOrBuilder getGeometryOrBuilder() {
      return geometry_ == null ? MessagesRobocupSslGeometry.SSL_GeometryData.getDefaultInstance() : geometry_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasDetection()) {
        if (!getDetection().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasGeometry()) {
        if (!getGeometry().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getDetection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getGeometry());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getDetection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getGeometry());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MessagesRobocupSslWrapper.SSL_WrapperPacket)) {
        return super.equals(obj);
      }
      MessagesRobocupSslWrapper.SSL_WrapperPacket other = (MessagesRobocupSslWrapper.SSL_WrapperPacket) obj;

      if (hasDetection() != other.hasDetection()) return false;
      if (hasDetection()) {
        if (!getDetection()
            .equals(other.getDetection())) return false;
      }
      if (hasGeometry() != other.hasGeometry()) return false;
      if (hasGeometry()) {
        if (!getGeometry()
            .equals(other.getGeometry())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDetection()) {
        hash = (37 * hash) + DETECTION_FIELD_NUMBER;
        hash = (53 * hash) + getDetection().hashCode();
      }
      if (hasGeometry()) {
        hash = (37 * hash) + GEOMETRY_FIELD_NUMBER;
        hash = (53 * hash) + getGeometry().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessagesRobocupSslWrapper.SSL_WrapperPacket parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(MessagesRobocupSslWrapper.SSL_WrapperPacket prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SSL_WrapperPacket}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SSL_WrapperPacket)
        MessagesRobocupSslWrapper.SSL_WrapperPacketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessagesRobocupSslWrapper.internal_static_SSL_WrapperPacket_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessagesRobocupSslWrapper.internal_static_SSL_WrapperPacket_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MessagesRobocupSslWrapper.SSL_WrapperPacket.class, MessagesRobocupSslWrapper.SSL_WrapperPacket.Builder.class);
      }

      // Construct using MessagesRobocupSslWrapper.SSL_WrapperPacket.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getDetectionFieldBuilder();
          getGeometryFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (detectionBuilder_ == null) {
          detection_ = null;
        } else {
          detectionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (geometryBuilder_ == null) {
          geometry_ = null;
        } else {
          geometryBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessagesRobocupSslWrapper.internal_static_SSL_WrapperPacket_descriptor;
      }

      @java.lang.Override
      public MessagesRobocupSslWrapper.SSL_WrapperPacket getDefaultInstanceForType() {
        return MessagesRobocupSslWrapper.SSL_WrapperPacket.getDefaultInstance();
      }

      @java.lang.Override
      public MessagesRobocupSslWrapper.SSL_WrapperPacket build() {
        MessagesRobocupSslWrapper.SSL_WrapperPacket result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MessagesRobocupSslWrapper.SSL_WrapperPacket buildPartial() {
        MessagesRobocupSslWrapper.SSL_WrapperPacket result = new MessagesRobocupSslWrapper.SSL_WrapperPacket(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (detectionBuilder_ == null) {
            result.detection_ = detection_;
          } else {
            result.detection_ = detectionBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (geometryBuilder_ == null) {
            result.geometry_ = geometry_;
          } else {
            result.geometry_ = geometryBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MessagesRobocupSslWrapper.SSL_WrapperPacket) {
          return mergeFrom((MessagesRobocupSslWrapper.SSL_WrapperPacket)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MessagesRobocupSslWrapper.SSL_WrapperPacket other) {
        if (other == MessagesRobocupSslWrapper.SSL_WrapperPacket.getDefaultInstance()) return this;
        if (other.hasDetection()) {
          mergeDetection(other.getDetection());
        }
        if (other.hasGeometry()) {
          mergeGeometry(other.getGeometry());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasDetection()) {
          if (!getDetection().isInitialized()) {
            return false;
          }
        }
        if (hasGeometry()) {
          if (!getGeometry().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MessagesRobocupSslWrapper.SSL_WrapperPacket parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MessagesRobocupSslWrapper.SSL_WrapperPacket) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private MessagesRobocupSslDetection.SSL_DetectionFrame detection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          MessagesRobocupSslDetection.SSL_DetectionFrame, MessagesRobocupSslDetection.SSL_DetectionFrame.Builder, MessagesRobocupSslDetection.SSL_DetectionFrameOrBuilder> detectionBuilder_;
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       * @return Whether the detection field is set.
       */
      public boolean hasDetection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       * @return The detection.
       */
      public MessagesRobocupSslDetection.SSL_DetectionFrame getDetection() {
        if (detectionBuilder_ == null) {
          return detection_ == null ? MessagesRobocupSslDetection.SSL_DetectionFrame.getDefaultInstance() : detection_;
        } else {
          return detectionBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       */
      public Builder setDetection(MessagesRobocupSslDetection.SSL_DetectionFrame value) {
        if (detectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detection_ = value;
          onChanged();
        } else {
          detectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       */
      public Builder setDetection(
          MessagesRobocupSslDetection.SSL_DetectionFrame.Builder builderForValue) {
        if (detectionBuilder_ == null) {
          detection_ = builderForValue.build();
          onChanged();
        } else {
          detectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       */
      public Builder mergeDetection(MessagesRobocupSslDetection.SSL_DetectionFrame value) {
        if (detectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              detection_ != null &&
              detection_ != MessagesRobocupSslDetection.SSL_DetectionFrame.getDefaultInstance()) {
            detection_ =
              MessagesRobocupSslDetection.SSL_DetectionFrame.newBuilder(detection_).mergeFrom(value).buildPartial();
          } else {
            detection_ = value;
          }
          onChanged();
        } else {
          detectionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       */
      public Builder clearDetection() {
        if (detectionBuilder_ == null) {
          detection_ = null;
          onChanged();
        } else {
          detectionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       */
      public MessagesRobocupSslDetection.SSL_DetectionFrame.Builder getDetectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getDetectionFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       */
      public MessagesRobocupSslDetection.SSL_DetectionFrameOrBuilder getDetectionOrBuilder() {
        if (detectionBuilder_ != null) {
          return detectionBuilder_.getMessageOrBuilder();
        } else {
          return detection_ == null ?
              MessagesRobocupSslDetection.SSL_DetectionFrame.getDefaultInstance() : detection_;
        }
      }
      /**
       * <code>optional .SSL_DetectionFrame detection = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          MessagesRobocupSslDetection.SSL_DetectionFrame, MessagesRobocupSslDetection.SSL_DetectionFrame.Builder, MessagesRobocupSslDetection.SSL_DetectionFrameOrBuilder> 
          getDetectionFieldBuilder() {
        if (detectionBuilder_ == null) {
          detectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              MessagesRobocupSslDetection.SSL_DetectionFrame, MessagesRobocupSslDetection.SSL_DetectionFrame.Builder, MessagesRobocupSslDetection.SSL_DetectionFrameOrBuilder>(
                  getDetection(),
                  getParentForChildren(),
                  isClean());
          detection_ = null;
        }
        return detectionBuilder_;
      }

      private MessagesRobocupSslGeometry.SSL_GeometryData geometry_;
      private com.google.protobuf.SingleFieldBuilderV3<
          MessagesRobocupSslGeometry.SSL_GeometryData, MessagesRobocupSslGeometry.SSL_GeometryData.Builder, MessagesRobocupSslGeometry.SSL_GeometryDataOrBuilder> geometryBuilder_;
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       * @return Whether the geometry field is set.
       */
      public boolean hasGeometry() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       * @return The geometry.
       */
      public MessagesRobocupSslGeometry.SSL_GeometryData getGeometry() {
        if (geometryBuilder_ == null) {
          return geometry_ == null ? MessagesRobocupSslGeometry.SSL_GeometryData.getDefaultInstance() : geometry_;
        } else {
          return geometryBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       */
      public Builder setGeometry(MessagesRobocupSslGeometry.SSL_GeometryData value) {
        if (geometryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          geometry_ = value;
          onChanged();
        } else {
          geometryBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       */
      public Builder setGeometry(
          MessagesRobocupSslGeometry.SSL_GeometryData.Builder builderForValue) {
        if (geometryBuilder_ == null) {
          geometry_ = builderForValue.build();
          onChanged();
        } else {
          geometryBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       */
      public Builder mergeGeometry(MessagesRobocupSslGeometry.SSL_GeometryData value) {
        if (geometryBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              geometry_ != null &&
              geometry_ != MessagesRobocupSslGeometry.SSL_GeometryData.getDefaultInstance()) {
            geometry_ =
              MessagesRobocupSslGeometry.SSL_GeometryData.newBuilder(geometry_).mergeFrom(value).buildPartial();
          } else {
            geometry_ = value;
          }
          onChanged();
        } else {
          geometryBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       */
      public Builder clearGeometry() {
        if (geometryBuilder_ == null) {
          geometry_ = null;
          onChanged();
        } else {
          geometryBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       */
      public MessagesRobocupSslGeometry.SSL_GeometryData.Builder getGeometryBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getGeometryFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       */
      public MessagesRobocupSslGeometry.SSL_GeometryDataOrBuilder getGeometryOrBuilder() {
        if (geometryBuilder_ != null) {
          return geometryBuilder_.getMessageOrBuilder();
        } else {
          return geometry_ == null ?
              MessagesRobocupSslGeometry.SSL_GeometryData.getDefaultInstance() : geometry_;
        }
      }
      /**
       * <code>optional .SSL_GeometryData geometry = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          MessagesRobocupSslGeometry.SSL_GeometryData, MessagesRobocupSslGeometry.SSL_GeometryData.Builder, MessagesRobocupSslGeometry.SSL_GeometryDataOrBuilder> 
          getGeometryFieldBuilder() {
        if (geometryBuilder_ == null) {
          geometryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              MessagesRobocupSslGeometry.SSL_GeometryData, MessagesRobocupSslGeometry.SSL_GeometryData.Builder, MessagesRobocupSslGeometry.SSL_GeometryDataOrBuilder>(
                  getGeometry(),
                  getParentForChildren(),
                  isClean());
          geometry_ = null;
        }
        return geometryBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SSL_WrapperPacket)
    }

    // @@protoc_insertion_point(class_scope:SSL_WrapperPacket)
    private static final MessagesRobocupSslWrapper.SSL_WrapperPacket DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessagesRobocupSslWrapper.SSL_WrapperPacket();
    }

    public static MessagesRobocupSslWrapper.SSL_WrapperPacket getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SSL_WrapperPacket>
        PARSER = new com.google.protobuf.AbstractParser<SSL_WrapperPacket>() {
      @java.lang.Override
      public SSL_WrapperPacket parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SSL_WrapperPacket(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SSL_WrapperPacket> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SSL_WrapperPacket> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MessagesRobocupSslWrapper.SSL_WrapperPacket getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SSL_WrapperPacket_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SSL_WrapperPacket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"messages_robocup_ssl_wrapper.proto\032$me" +
      "ssages_robocup_ssl_detection.proto\032#mess" +
      "ages_robocup_ssl_geometry.proto\"`\n\021SSL_W" +
      "rapperPacket\022&\n\tdetection\030\001 \001(\0132\023.SSL_De" +
      "tectionFrame\022#\n\010geometry\030\002 \001(\0132\021.SSL_Geo" +
      "metryData"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          MessagesRobocupSslDetection.getDescriptor(),
          MessagesRobocupSslGeometry.getDescriptor(),
        });
    internal_static_SSL_WrapperPacket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SSL_WrapperPacket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SSL_WrapperPacket_descriptor,
        new java.lang.String[] { "Detection", "Geometry", });
    MessagesRobocupSslDetection.getDescriptor();
    MessagesRobocupSslGeometry.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
