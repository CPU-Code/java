package com.cpucode.java.seriliazer.proto.buf;

import com.google.protobuf.*;

/**
 * @author : cpucode
 * @date : 2021/8/10
 * @time : 10:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public final class UserProtos {
    private UserProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }


    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface UserOrBuilder extends MessageOrBuilder {

        /**
         * <code>required string name = 1;</code>
         */
        boolean hasName();

        /**
         * <code>required string name = 1;</code>
         */
        String getName();

        /**
         * <code>required string name = 1;</code>
         */
        ByteString getNameBytes();

        /**
         * <code>required int32 age = 2;</code>
         */
        boolean hasAge();

        /**
         * <code>required int32 age = 2;</code>
         */
        int getAge();
    }

    public  static final class User extends GeneratedMessageV3
            implements UserOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use User.newBuilder() to construct.
        private User(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private User() {
            name_ = "";
            age_ = 0;
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private User(CodedInputStream input, ExtensionRegistryLite extensionRegistry)
                throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }

            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            name_ = bs;
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            age_ = input.readInt32();
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
        public static final Descriptors.Descriptor getDescriptor() {
            return UserProtos.User_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return UserProtos.User_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            User.class, Builder.class);
        }

        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private volatile Object name_;

        /**
         * <code>required string name = 1;</code>
         */
        @Override
        public boolean hasName() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required string name = 1;</code>
         */
        @Override
        public String getName() {
            Object ref = name_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    name_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string name = 1;</code>
         */
        @Override
        public ByteString getNameBytes() {
            Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int AGE_FIELD_NUMBER = 2;
        private int age_;

        /**
         * <code>required int32 age = 2;</code>
         */
        @Override
        public boolean hasAge() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required int32 age = 2;</code>
         */
        @Override
        public int getAge() {
            return age_;
        }

        private byte memoizedIsInitialized = -1;

        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAge()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, age_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, age_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return super.equals(obj);
            }
            User other = (User) obj;

            boolean result = true;
            result = result && (hasName() == other.hasName());
            if (hasName()) {
                result = result && getName()
                        .equals(other.getName());
            }
            result = result && (hasAge() == other.hasAge());
            if (hasAge()) {
                result = result && (getAge()
                        == other.getAge());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasName()) {
                hash = (37 * hash) + NAME_FIELD_NUMBER;
                hash = (53 * hash) + getName().hashCode();
            }
            if (hasAge()) {
                hash = (37 * hash) + AGE_FIELD_NUMBER;
                hash = (53 * hash) + getAge();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static User parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static User parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static User parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static User parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static User parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static User parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static User parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static User parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static User parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static User parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static User parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static User parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() { return newBuilder(); }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(User prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code com.gupaoedu.vip.User}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.gupaoedu.vip.User)
                UserOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return UserProtos.User_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return UserProtos.User_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                User.class, Builder.class);
            }

            // Construct using com.gupaoedu.vip.UserProtos.User.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                name_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                age_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProtos.User_descriptor;
            }

            @Override
            public User getDefaultInstanceForType() {
                return User.getDefaultInstance();
            }

            @Override
            public User build() {
                User result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public User buildPartial() {
                User result = new User(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.name_ = name_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.age_ = age_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof User) {
                    return mergeFrom((User)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(User other) {
                if (other == User.getDefaultInstance()) return this;
                if (other.hasName()) {
                    bitField0_ |= 0x00000001;
                    name_ = other.name_;
                    onChanged();
                }
                if (other.hasAge()) {
                    setAge(other.getAge());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (!hasAge()) {
                    return false;
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                User parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (User) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Object name_ = "";

            /**
             * <code>required string name = 1;</code>
             */
            @Override
            public boolean hasName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string name = 1;</code>
             */
            @Override
            public String getName() {
                Object ref = name_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        name_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>required string name = 1;</code>
             */
            @Override
            public ByteString getNameBytes() {
                Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string name = 1;</code>
             */
            public Builder setName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                name_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string name = 1;</code>
             */
            public Builder clearName() {
                bitField0_ = (bitField0_ & ~0x00000001);
                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }
            /**
             * <code>required string name = 1;</code>
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                name_ = value;
                onChanged();
                return this;
            }

            private int age_ ;
            /**
             * <code>required int32 age = 2;</code>
             */
            @Override
            public boolean hasAge() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required int32 age = 2;</code>
             */
            @Override
            public int getAge() {
                return age_;
            }
            /**
             * <code>required int32 age = 2;</code>
             */
            public Builder setAge(int value) {
                bitField0_ |= 0x00000002;
                age_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 age = 2;</code>
             */
            public Builder clearAge() {
                bitField0_ = (bitField0_ & ~0x00000002);
                age_ = 0;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

        }


        private static final User DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new User();
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<User>
                PARSER = new com.google.protobuf.AbstractParser<User>() {
            @Override
            public User parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new User(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<User> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<User> getParserForType() {
            return PARSER;
        }

        @Override
        public User getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final Descriptors.Descriptor User_descriptor;

    private static final GeneratedMessageV3.FieldAccessorTable User_fieldAccessorTable;

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static Descriptors.FileDescriptor descriptor;

    static {
        String[] descriptorData = {};

        Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    @Override
                    public ExtensionRegistry assignDescriptors(
                            Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
                        new Descriptors.FileDescriptor[] {}, assigner);
        
        User_descriptor = getDescriptor().getMessageTypes().get(0);
        
        User_fieldAccessorTable = 
                new GeneratedMessageV3.FieldAccessorTable(
                User_descriptor, new String[] { "Name", "Age", });
    }

}
