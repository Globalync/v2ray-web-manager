// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/vmess/account.proto

package com.v2ray.core.proxy.vmess;

/**
 * Protobuf type {@code v2ray.core.proxy.vmess.Account}
 */
public final class Account extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:v2ray.core.proxy.vmess.Account)
        AccountOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use Account.newBuilder() to construct.
    private Account(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Account() {
        id_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private Account(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
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
                        String s = input.readStringRequireUtf8();

                        id_ = s;
                        break;
                    }
                    case 16: {

                        alterId_ = input.readUInt32();
                        break;
                    }
                    case 26: {
                        com.v2ray.core.common.protocol.SecurityConfig.Builder subBuilder = null;
                        if (securitySettings_ != null) {
                            subBuilder = securitySettings_.toBuilder();
                        }
                        securitySettings_ = input.readMessage(com.v2ray.core.common.protocol.SecurityConfig.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(securitySettings_);
                            securitySettings_ = subBuilder.buildPartial();
                        }

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
        return com.v2ray.core.proxy.vmess.AccountOuterClass.internal_static_v2ray_core_proxy_vmess_Account_descriptor;
    }

    @Override
    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.v2ray.core.proxy.vmess.AccountOuterClass.internal_static_v2ray_core_proxy_vmess_Account_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Account.class, Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile Object id_;

    /**
     * <pre>
     * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public String getId() {
        Object ref = id_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            id_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
    getIdBytes() {
        Object ref = id_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            id_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int ALTER_ID_FIELD_NUMBER = 2;
    private int alterId_;

    /**
     * <pre>
     * Number of alternative IDs. Client and server must share the same number.
     * </pre>
     *
     * <code>uint32 alter_id = 2;</code>
     */
    public int getAlterId() {
        return alterId_;
    }

    public static final int SECURITY_SETTINGS_FIELD_NUMBER = 3;
    private com.v2ray.core.common.protocol.SecurityConfig securitySettings_;

    /**
     * <pre>
     * Security settings. Only applies to client side.
     * </pre>
     *
     * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
     */
    public boolean hasSecuritySettings() {
        return securitySettings_ != null;
    }

    /**
     * <pre>
     * Security settings. Only applies to client side.
     * </pre>
     *
     * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
     */
    public com.v2ray.core.common.protocol.SecurityConfig getSecuritySettings() {
        return securitySettings_ == null ? com.v2ray.core.common.protocol.SecurityConfig.getDefaultInstance() : securitySettings_;
    }

    /**
     * <pre>
     * Security settings. Only applies to client side.
     * </pre>
     *
     * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
     */
    public com.v2ray.core.common.protocol.SecurityConfigOrBuilder getSecuritySettingsOrBuilder() {
        return getSecuritySettings();
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!getIdBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
        }
        if (alterId_ != 0) {
            output.writeUInt32(2, alterId_);
        }
        if (securitySettings_ != null) {
            output.writeMessage(3, getSecuritySettings());
        }
        unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getIdBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
        }
        if (alterId_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt32Size(2, alterId_);
        }
        if (securitySettings_ != null) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(3, getSecuritySettings());
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
        if (!(obj instanceof Account)) {
            return super.equals(obj);
        }
        Account other = (Account) obj;

        if (!getId()
                .equals(other.getId())) return false;
        if (getAlterId()
                != other.getAlterId()) return false;
        if (hasSecuritySettings() != other.hasSecuritySettings()) return false;
        if (hasSecuritySettings()) {
            if (!getSecuritySettings()
                    .equals(other.getSecuritySettings())) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
        hash = (37 * hash) + ALTER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getAlterId();
        if (hasSecuritySettings()) {
            hash = (37 * hash) + SECURITY_SETTINGS_FIELD_NUMBER;
            hash = (53 * hash) + getSecuritySettings().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static Account parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Account parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Account parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Account parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Account parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Account parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Account parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Account parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Account parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static Account parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Account parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Account parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Account prototype) {
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
     * Protobuf type {@code v2ray.core.proxy.vmess.Account}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.vmess.Account)
            com.v2ray.core.proxy.vmess.AccountOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.v2ray.core.proxy.vmess.AccountOuterClass.internal_static_v2ray_core_proxy_vmess_Account_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.v2ray.core.proxy.vmess.AccountOuterClass.internal_static_v2ray_core_proxy_vmess_Account_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Account.class, Builder.class);
        }

        // Construct using com.v2ray.core.proxy.vmess.Account.newBuilder()
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
            id_ = "";

            alterId_ = 0;

            if (securitySettingsBuilder_ == null) {
                securitySettings_ = null;
            } else {
                securitySettings_ = null;
                securitySettingsBuilder_ = null;
            }
            return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.v2ray.core.proxy.vmess.AccountOuterClass.internal_static_v2ray_core_proxy_vmess_Account_descriptor;
        }

        @Override
        public Account getDefaultInstanceForType() {
            return Account.getDefaultInstance();
        }

        @Override
        public Account build() {
            Account result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @Override
        public Account buildPartial() {
            Account result = new Account(this);
            result.id_ = id_;
            result.alterId_ = alterId_;
            if (securitySettingsBuilder_ == null) {
                result.securitySettings_ = securitySettings_;
            } else {
                result.securitySettings_ = securitySettingsBuilder_.build();
            }
            onBuilt();
            return result;
        }

        @Override
        public Builder clone() {
            return super.clone();
        }

        @Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.setField(field, value);
        }

        @Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.addRepeatedField(field, value);
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Account) {
                return mergeFrom((Account) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Account other) {
            if (other == Account.getDefaultInstance()) return this;
            if (!other.getId().isEmpty()) {
                id_ = other.id_;
                onChanged();
            }
            if (other.getAlterId() != 0) {
                setAlterId(other.getAlterId());
            }
            if (other.hasSecuritySettings()) {
                mergeSecuritySettings(other.getSecuritySettings());
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @Override
        public final boolean isInitialized() {
            return true;
        }

        @Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Account parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Account) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object id_ = "";

        /**
         * <pre>
         * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
         * </pre>
         *
         * <code>string id = 1;</code>
         */
        public String getId() {
            Object ref = id_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                id_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <pre>
         * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
         * </pre>
         *
         * <code>string id = 1;</code>
         */
        public com.google.protobuf.ByteString
        getIdBytes() {
            Object ref = id_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                id_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
         * </pre>
         *
         * <code>string id = 1;</code>
         */
        public Builder setId(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            id_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
         * </pre>
         *
         * <code>string id = 1;</code>
         */
        public Builder clearId() {

            id_ = getDefaultInstance().getId();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * ID of the account, in the form of a UUID, e.g., "66ad4540-b58c-4ad2-9926-ea63445a9b57".
         * </pre>
         *
         * <code>string id = 1;</code>
         */
        public Builder setIdBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            id_ = value;
            onChanged();
            return this;
        }

        private int alterId_;

        /**
         * <pre>
         * Number of alternative IDs. Client and server must share the same number.
         * </pre>
         *
         * <code>uint32 alter_id = 2;</code>
         */
        public int getAlterId() {
            return alterId_;
        }

        /**
         * <pre>
         * Number of alternative IDs. Client and server must share the same number.
         * </pre>
         *
         * <code>uint32 alter_id = 2;</code>
         */
        public Builder setAlterId(int value) {

            alterId_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Number of alternative IDs. Client and server must share the same number.
         * </pre>
         *
         * <code>uint32 alter_id = 2;</code>
         */
        public Builder clearAlterId() {

            alterId_ = 0;
            onChanged();
            return this;
        }

        private com.v2ray.core.common.protocol.SecurityConfig securitySettings_;
        private com.google.protobuf.SingleFieldBuilderV3<
                com.v2ray.core.common.protocol.SecurityConfig, com.v2ray.core.common.protocol.SecurityConfig.Builder, com.v2ray.core.common.protocol.SecurityConfigOrBuilder> securitySettingsBuilder_;

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public boolean hasSecuritySettings() {
            return securitySettingsBuilder_ != null || securitySettings_ != null;
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public com.v2ray.core.common.protocol.SecurityConfig getSecuritySettings() {
            if (securitySettingsBuilder_ == null) {
                return securitySettings_ == null ? com.v2ray.core.common.protocol.SecurityConfig.getDefaultInstance() : securitySettings_;
            } else {
                return securitySettingsBuilder_.getMessage();
            }
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public Builder setSecuritySettings(com.v2ray.core.common.protocol.SecurityConfig value) {
            if (securitySettingsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                securitySettings_ = value;
                onChanged();
            } else {
                securitySettingsBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public Builder setSecuritySettings(
                com.v2ray.core.common.protocol.SecurityConfig.Builder builderForValue) {
            if (securitySettingsBuilder_ == null) {
                securitySettings_ = builderForValue.build();
                onChanged();
            } else {
                securitySettingsBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public Builder mergeSecuritySettings(com.v2ray.core.common.protocol.SecurityConfig value) {
            if (securitySettingsBuilder_ == null) {
                if (securitySettings_ != null) {
                    securitySettings_ =
                            com.v2ray.core.common.protocol.SecurityConfig.newBuilder(securitySettings_).mergeFrom(value).buildPartial();
                } else {
                    securitySettings_ = value;
                }
                onChanged();
            } else {
                securitySettingsBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public Builder clearSecuritySettings() {
            if (securitySettingsBuilder_ == null) {
                securitySettings_ = null;
                onChanged();
            } else {
                securitySettings_ = null;
                securitySettingsBuilder_ = null;
            }

            return this;
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public com.v2ray.core.common.protocol.SecurityConfig.Builder getSecuritySettingsBuilder() {

            onChanged();
            return getSecuritySettingsFieldBuilder().getBuilder();
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        public com.v2ray.core.common.protocol.SecurityConfigOrBuilder getSecuritySettingsOrBuilder() {
            if (securitySettingsBuilder_ != null) {
                return securitySettingsBuilder_.getMessageOrBuilder();
            } else {
                return securitySettings_ == null ?
                        com.v2ray.core.common.protocol.SecurityConfig.getDefaultInstance() : securitySettings_;
            }
        }

        /**
         * <pre>
         * Security settings. Only applies to client side.
         * </pre>
         *
         * <code>.v2ray.core.common.protocol.SecurityConfig security_settings = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                com.v2ray.core.common.protocol.SecurityConfig, com.v2ray.core.common.protocol.SecurityConfig.Builder, com.v2ray.core.common.protocol.SecurityConfigOrBuilder>
        getSecuritySettingsFieldBuilder() {
            if (securitySettingsBuilder_ == null) {
                securitySettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        com.v2ray.core.common.protocol.SecurityConfig, com.v2ray.core.common.protocol.SecurityConfig.Builder, com.v2ray.core.common.protocol.SecurityConfigOrBuilder>(
                        getSecuritySettings(),
                        getParentForChildren(),
                        isClean());
                securitySettings_ = null;
            }
            return securitySettingsBuilder_;
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


        // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.vmess.Account)
    }

    // @@protoc_insertion_point(class_scope:v2ray.core.proxy.vmess.Account)
    private static final Account DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new Account();
    }

    public static Account getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Account>
            PARSER = new com.google.protobuf.AbstractParser<Account>() {
        @Override
        public Account parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Account(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Account> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Account> getParserForType() {
        return PARSER;
    }

    @Override
    public Account getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

