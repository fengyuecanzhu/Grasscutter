// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuoyantCombatInfo.proto

package emu.grasscutter.net.proto;

public final class BuoyantCombatInfoOuterClass {
  private BuoyantCombatInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuoyantCombatInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuoyantCombatInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 killMonsterCount = 3;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();

    /**
     * <code>uint32 killSpecialMonsterCount = 15;</code>
     * @return The killSpecialMonsterCount.
     */
    int getKillSpecialMonsterCount();

    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * Protobuf type {@code BuoyantCombatInfo}
   */
  public static final class BuoyantCombatInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuoyantCombatInfo)
      BuoyantCombatInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuoyantCombatInfo.newBuilder() to construct.
    private BuoyantCombatInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuoyantCombatInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuoyantCombatInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BuoyantCombatInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              killMonsterCount_ = input.readUInt32();
              break;
            }
            case 96: {

              score_ = input.readUInt32();
              break;
            }
            case 120: {

              killSpecialMonsterCount_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.internal_static_BuoyantCombatInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.internal_static_BuoyantCombatInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo.class, emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo.Builder.class);
    }

    public static final int KILLMONSTERCOUNT_FIELD_NUMBER = 3;
    private int killMonsterCount_;
    /**
     * <code>uint32 killMonsterCount = 3;</code>
     * @return The killMonsterCount.
     */
    @java.lang.Override
    public int getKillMonsterCount() {
      return killMonsterCount_;
    }

    public static final int KILLSPECIALMONSTERCOUNT_FIELD_NUMBER = 15;
    private int killSpecialMonsterCount_;
    /**
     * <code>uint32 killSpecialMonsterCount = 15;</code>
     * @return The killSpecialMonsterCount.
     */
    @java.lang.Override
    public int getKillSpecialMonsterCount() {
      return killSpecialMonsterCount_;
    }

    public static final int SCORE_FIELD_NUMBER = 12;
    private int score_;
    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (killMonsterCount_ != 0) {
        output.writeUInt32(3, killMonsterCount_);
      }
      if (score_ != 0) {
        output.writeUInt32(12, score_);
      }
      if (killSpecialMonsterCount_ != 0) {
        output.writeUInt32(15, killSpecialMonsterCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, killMonsterCount_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, score_);
      }
      if (killSpecialMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, killSpecialMonsterCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo other = (emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo) obj;

      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
      if (getKillSpecialMonsterCount()
          != other.getKillSpecialMonsterCount()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + KILLMONSTERCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (37 * hash) + KILLSPECIALMONSTERCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillSpecialMonsterCount();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo prototype) {
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
     * Protobuf type {@code BuoyantCombatInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuoyantCombatInfo)
        emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.internal_static_BuoyantCombatInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.internal_static_BuoyantCombatInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo.class, emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        killMonsterCount_ = 0;

        killSpecialMonsterCount_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.internal_static_BuoyantCombatInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo build() {
        emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo buildPartial() {
        emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo result = new emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo(this);
        result.killMonsterCount_ = killMonsterCount_;
        result.killSpecialMonsterCount_ = killSpecialMonsterCount_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo other) {
        if (other == emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo.getDefaultInstance()) return this;
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
        }
        if (other.getKillSpecialMonsterCount() != 0) {
          setKillSpecialMonsterCount(other.getKillSpecialMonsterCount());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int killMonsterCount_ ;
      /**
       * <code>uint32 killMonsterCount = 3;</code>
       * @return The killMonsterCount.
       */
      @java.lang.Override
      public int getKillMonsterCount() {
        return killMonsterCount_;
      }
      /**
       * <code>uint32 killMonsterCount = 3;</code>
       * @param value The killMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterCount(int value) {
        
        killMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killMonsterCount = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterCount() {
        
        killMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int killSpecialMonsterCount_ ;
      /**
       * <code>uint32 killSpecialMonsterCount = 15;</code>
       * @return The killSpecialMonsterCount.
       */
      @java.lang.Override
      public int getKillSpecialMonsterCount() {
        return killSpecialMonsterCount_;
      }
      /**
       * <code>uint32 killSpecialMonsterCount = 15;</code>
       * @param value The killSpecialMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillSpecialMonsterCount(int value) {
        
        killSpecialMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killSpecialMonsterCount = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillSpecialMonsterCount() {
        
        killSpecialMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 12;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:BuoyantCombatInfo)
    }

    // @@protoc_insertion_point(class_scope:BuoyantCombatInfo)
    private static final emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo();
    }

    public static emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuoyantCombatInfo>
        PARSER = new com.google.protobuf.AbstractParser<BuoyantCombatInfo>() {
      @java.lang.Override
      public BuoyantCombatInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BuoyantCombatInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BuoyantCombatInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuoyantCombatInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BuoyantCombatInfoOuterClass.BuoyantCombatInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuoyantCombatInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuoyantCombatInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BuoyantCombatInfo.proto\"]\n\021BuoyantComb" +
      "atInfo\022\030\n\020killMonsterCount\030\003 \001(\r\022\037\n\027kill" +
      "SpecialMonsterCount\030\017 \001(\r\022\r\n\005score\030\014 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BuoyantCombatInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuoyantCombatInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuoyantCombatInfo_descriptor,
        new java.lang.String[] { "KillMonsterCount", "KillSpecialMonsterCount", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}