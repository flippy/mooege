// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stats.proto

package D3.Stats;

public final class Stats {
  private Stats() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class StatCategory extends
      com.google.protobuf.GeneratedMessage {
    // Use StatCategory.newBuilder() to construct.
    private StatCategory() {
      initFields();
    }
    private StatCategory(boolean noInit) {}
    
    private static final StatCategory defaultInstance;
    public static StatCategory getDefaultInstance() {
      return defaultInstance;
    }
    
    public StatCategory getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return D3.Stats.Stats.internal_static_D3_Stats_StatCategory_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return D3.Stats.Stats.internal_static_D3_Stats_StatCategory_fieldAccessorTable;
    }
    
    // required uint32 stat_id = 1;
    public static final int STAT_ID_FIELD_NUMBER = 1;
    private boolean hasStatId;
    private int statId_ = 0;
    public boolean hasStatId() { return hasStatId; }
    public int getStatId() { return statId_; }
    
    // required uint32 data_1 = 2;
    public static final int DATA_1_FIELD_NUMBER = 2;
    private boolean hasData1;
    private int data1_ = 0;
    public boolean hasData1() { return hasData1; }
    public int getData1() { return data1_; }
    
    // optional uint32 data_2 = 3;
    public static final int DATA_2_FIELD_NUMBER = 3;
    private boolean hasData2;
    private int data2_ = 0;
    public boolean hasData2() { return hasData2; }
    public int getData2() { return data2_; }
    
    // required uint64 total = 4;
    public static final int TOTAL_FIELD_NUMBER = 4;
    private boolean hasTotal;
    private long total_ = 0L;
    public boolean hasTotal() { return hasTotal; }
    public long getTotal() { return total_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasStatId) return false;
      if (!hasData1) return false;
      if (!hasTotal) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasStatId()) {
        output.writeUInt32(1, getStatId());
      }
      if (hasData1()) {
        output.writeUInt32(2, getData1());
      }
      if (hasData2()) {
        output.writeUInt32(3, getData2());
      }
      if (hasTotal()) {
        output.writeUInt64(4, getTotal());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasStatId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, getStatId());
      }
      if (hasData1()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, getData1());
      }
      if (hasData2()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, getData2());
      }
      if (hasTotal()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, getTotal());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static D3.Stats.Stats.StatCategory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Stats.Stats.StatCategory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Stats.Stats.StatCategory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Stats.Stats.StatCategory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Stats.Stats.StatCategory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Stats.Stats.StatCategory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static D3.Stats.Stats.StatCategory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.Stats.Stats.StatCategory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.Stats.Stats.StatCategory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Stats.Stats.StatCategory parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(D3.Stats.Stats.StatCategory prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private D3.Stats.Stats.StatCategory result;
      
      // Construct using D3.Stats.Stats.StatCategory.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new D3.Stats.Stats.StatCategory();
        return builder;
      }
      
      protected D3.Stats.Stats.StatCategory internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new D3.Stats.Stats.StatCategory();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return D3.Stats.Stats.StatCategory.getDescriptor();
      }
      
      public D3.Stats.Stats.StatCategory getDefaultInstanceForType() {
        return D3.Stats.Stats.StatCategory.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public D3.Stats.Stats.StatCategory build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private D3.Stats.Stats.StatCategory buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public D3.Stats.Stats.StatCategory buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        D3.Stats.Stats.StatCategory returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof D3.Stats.Stats.StatCategory) {
          return mergeFrom((D3.Stats.Stats.StatCategory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(D3.Stats.Stats.StatCategory other) {
        if (other == D3.Stats.Stats.StatCategory.getDefaultInstance()) return this;
        if (other.hasStatId()) {
          setStatId(other.getStatId());
        }
        if (other.hasData1()) {
          setData1(other.getData1());
        }
        if (other.hasData2()) {
          setData2(other.getData2());
        }
        if (other.hasTotal()) {
          setTotal(other.getTotal());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setStatId(input.readUInt32());
              break;
            }
            case 16: {
              setData1(input.readUInt32());
              break;
            }
            case 24: {
              setData2(input.readUInt32());
              break;
            }
            case 32: {
              setTotal(input.readUInt64());
              break;
            }
          }
        }
      }
      
      
      // required uint32 stat_id = 1;
      public boolean hasStatId() {
        return result.hasStatId();
      }
      public int getStatId() {
        return result.getStatId();
      }
      public Builder setStatId(int value) {
        result.hasStatId = true;
        result.statId_ = value;
        return this;
      }
      public Builder clearStatId() {
        result.hasStatId = false;
        result.statId_ = 0;
        return this;
      }
      
      // required uint32 data_1 = 2;
      public boolean hasData1() {
        return result.hasData1();
      }
      public int getData1() {
        return result.getData1();
      }
      public Builder setData1(int value) {
        result.hasData1 = true;
        result.data1_ = value;
        return this;
      }
      public Builder clearData1() {
        result.hasData1 = false;
        result.data1_ = 0;
        return this;
      }
      
      // optional uint32 data_2 = 3;
      public boolean hasData2() {
        return result.hasData2();
      }
      public int getData2() {
        return result.getData2();
      }
      public Builder setData2(int value) {
        result.hasData2 = true;
        result.data2_ = value;
        return this;
      }
      public Builder clearData2() {
        result.hasData2 = false;
        result.data2_ = 0;
        return this;
      }
      
      // required uint64 total = 4;
      public boolean hasTotal() {
        return result.hasTotal();
      }
      public long getTotal() {
        return result.getTotal();
      }
      public Builder setTotal(long value) {
        result.hasTotal = true;
        result.total_ = value;
        return this;
      }
      public Builder clearTotal() {
        result.hasTotal = false;
        result.total_ = 0L;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:D3.Stats.StatCategory)
    }
    
    static {
      defaultInstance = new StatCategory(true);
      D3.Stats.Stats.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:D3.Stats.StatCategory)
  }
  
  public static final class StatList extends
      com.google.protobuf.GeneratedMessage {
    // Use StatList.newBuilder() to construct.
    private StatList() {
      initFields();
    }
    private StatList(boolean noInit) {}
    
    private static final StatList defaultInstance;
    public static StatList getDefaultInstance() {
      return defaultInstance;
    }
    
    public StatList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return D3.Stats.Stats.internal_static_D3_Stats_StatList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return D3.Stats.Stats.internal_static_D3_Stats_StatList_fieldAccessorTable;
    }
    
    // repeated .D3.Stats.StatCategory stats = 1;
    public static final int STATS_FIELD_NUMBER = 1;
    private java.util.List<D3.Stats.Stats.StatCategory> stats_ =
      java.util.Collections.emptyList();
    public java.util.List<D3.Stats.Stats.StatCategory> getStatsList() {
      return stats_;
    }
    public int getStatsCount() { return stats_.size(); }
    public D3.Stats.Stats.StatCategory getStats(int index) {
      return stats_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      for (D3.Stats.Stats.StatCategory element : getStatsList()) {
        if (!element.isInitialized()) return false;
      }
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (D3.Stats.Stats.StatCategory element : getStatsList()) {
        output.writeMessage(1, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (D3.Stats.Stats.StatCategory element : getStatsList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static D3.Stats.Stats.StatList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Stats.Stats.StatList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Stats.Stats.StatList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Stats.Stats.StatList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Stats.Stats.StatList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Stats.Stats.StatList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static D3.Stats.Stats.StatList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.Stats.Stats.StatList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.Stats.Stats.StatList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Stats.Stats.StatList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(D3.Stats.Stats.StatList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private D3.Stats.Stats.StatList result;
      
      // Construct using D3.Stats.Stats.StatList.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new D3.Stats.Stats.StatList();
        return builder;
      }
      
      protected D3.Stats.Stats.StatList internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new D3.Stats.Stats.StatList();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return D3.Stats.Stats.StatList.getDescriptor();
      }
      
      public D3.Stats.Stats.StatList getDefaultInstanceForType() {
        return D3.Stats.Stats.StatList.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public D3.Stats.Stats.StatList build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private D3.Stats.Stats.StatList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public D3.Stats.Stats.StatList buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.stats_ != java.util.Collections.EMPTY_LIST) {
          result.stats_ =
            java.util.Collections.unmodifiableList(result.stats_);
        }
        D3.Stats.Stats.StatList returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof D3.Stats.Stats.StatList) {
          return mergeFrom((D3.Stats.Stats.StatList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(D3.Stats.Stats.StatList other) {
        if (other == D3.Stats.Stats.StatList.getDefaultInstance()) return this;
        if (!other.stats_.isEmpty()) {
          if (result.stats_.isEmpty()) {
            result.stats_ = new java.util.ArrayList<D3.Stats.Stats.StatCategory>();
          }
          result.stats_.addAll(other.stats_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              D3.Stats.Stats.StatCategory.Builder subBuilder = D3.Stats.Stats.StatCategory.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addStats(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // repeated .D3.Stats.StatCategory stats = 1;
      public java.util.List<D3.Stats.Stats.StatCategory> getStatsList() {
        return java.util.Collections.unmodifiableList(result.stats_);
      }
      public int getStatsCount() {
        return result.getStatsCount();
      }
      public D3.Stats.Stats.StatCategory getStats(int index) {
        return result.getStats(index);
      }
      public Builder setStats(int index, D3.Stats.Stats.StatCategory value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.stats_.set(index, value);
        return this;
      }
      public Builder setStats(int index, D3.Stats.Stats.StatCategory.Builder builderForValue) {
        result.stats_.set(index, builderForValue.build());
        return this;
      }
      public Builder addStats(D3.Stats.Stats.StatCategory value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.stats_.isEmpty()) {
          result.stats_ = new java.util.ArrayList<D3.Stats.Stats.StatCategory>();
        }
        result.stats_.add(value);
        return this;
      }
      public Builder addStats(D3.Stats.Stats.StatCategory.Builder builderForValue) {
        if (result.stats_.isEmpty()) {
          result.stats_ = new java.util.ArrayList<D3.Stats.Stats.StatCategory>();
        }
        result.stats_.add(builderForValue.build());
        return this;
      }
      public Builder addAllStats(
          java.lang.Iterable<? extends D3.Stats.Stats.StatCategory> values) {
        if (result.stats_.isEmpty()) {
          result.stats_ = new java.util.ArrayList<D3.Stats.Stats.StatCategory>();
        }
        super.addAll(values, result.stats_);
        return this;
      }
      public Builder clearStats() {
        result.stats_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:D3.Stats.StatList)
    }
    
    static {
      defaultInstance = new StatList(true);
      D3.Stats.Stats.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:D3.Stats.StatList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_D3_Stats_StatCategory_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_D3_Stats_StatCategory_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_D3_Stats_StatList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_D3_Stats_StatList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Stats.proto\022\010D3.Stats\"N\n\014StatCategory\022" +
      "\017\n\007stat_id\030\001 \002(\r\022\016\n\006data_1\030\002 \002(\r\022\016\n\006data" +
      "_2\030\003 \001(\r\022\r\n\005total\030\004 \002(\004\"1\n\010StatList\022%\n\005s" +
      "tats\030\001 \003(\0132\026.D3.Stats.StatCategory"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_D3_Stats_StatCategory_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_D3_Stats_StatCategory_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_D3_Stats_StatCategory_descriptor,
              new java.lang.String[] { "StatId", "Data1", "Data2", "Total", },
              D3.Stats.Stats.StatCategory.class,
              D3.Stats.Stats.StatCategory.Builder.class);
          internal_static_D3_Stats_StatList_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_D3_Stats_StatList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_D3_Stats_StatList_descriptor,
              new java.lang.String[] { "Stats", },
              D3.Stats.Stats.StatList.class,
              D3.Stats.Stats.StatList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
