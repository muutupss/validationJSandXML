package com.sbt.validation.proto;

public final class Valid {
  private Valid() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NotifySMITZNOStatusRqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
     */
    boolean hasNotifySMITZNOStatusRq();
    /**
     * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
     */
    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ getNotifySMITZNOStatusRq();
    /**
     * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
     */
    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQOrBuilder getNotifySMITZNOStatusRqOrBuilder();
  }
  /**
   * Protobuf type {@code NotifySMITZNOStatusRq}
   */
  public  static final class NotifySMITZNOStatusRq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq)
      NotifySMITZNOStatusRqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NotifySMITZNOStatusRq.newBuilder() to construct.
    private NotifySMITZNOStatusRq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NotifySMITZNOStatusRq() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NotifySMITZNOStatusRq(
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
            case 322: {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = notifySMITZNOStatusRq_.toBuilder();
              }
              notifySMITZNOStatusRq_ = input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(notifySMITZNOStatusRq_);
                notifySMITZNOStatusRq_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return Valid.internal_static_NotifySMITZNOStatusRq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Valid.internal_static_NotifySMITZNOStatusRq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Valid.NotifySMITZNOStatusRq.class, Valid.NotifySMITZNOStatusRq.Builder.class);
    }

    public interface NOTIFYSMITZNOSTATUSRQOrBuilder extends
        // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
       */
      boolean hasZno();
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
       */
      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO getZno();
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
       */
      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNOOrBuilder getZnoOrBuilder();
    }
    /**
     * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ}
     */
    public  static final class NOTIFYSMITZNOSTATUSRQ extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ)
        NOTIFYSMITZNOSTATUSRQOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use NOTIFYSMITZNOSTATUSRQ.newBuilder() to construct.
      private NOTIFYSMITZNOSTATUSRQ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private NOTIFYSMITZNOSTATUSRQ() {
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private NOTIFYSMITZNOSTATUSRQ(
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
              case 314: {
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = zno_.toBuilder();
                }
                zno_ = input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(zno_);
                  zno_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
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
        return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder.class);
      }

      public interface ZNOOrBuilder extends
          // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO)
          com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string Number = 32 [(.validation.regex) = ""];</code>
         */
        boolean hasNumber();
        /**
         * <code>required string Number = 32 [(.validation.regex) = ""];</code>
         */
        java.lang.String getNumber();
        /**
         * <code>required string Number = 32 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getNumberBytes();

        /**
         * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
         */
        boolean hasSourceID();
        /**
         * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSourceID();
        /**
         * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSourceIDBytes();

        /**
         * <code>required string Title = 2 [(.validation.regex) = ""];</code>
         */
        boolean hasTitle();
        /**
         * <code>required string Title = 2 [(.validation.regex) = ""];</code>
         */
        java.lang.String getTitle();
        /**
         * <code>required string Title = 2 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getTitleBytes();

        /**
         * <code>required string Description = 3 [(.validation.regex) = ""];</code>
         */
        boolean hasDescription();
        /**
         * <code>required string Description = 3 [(.validation.regex) = ""];</code>
         */
        java.lang.String getDescription();
        /**
         * <code>required string Description = 3 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getDescriptionBytes();

        /**
         * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
         */
        boolean hasTemplateID();
        /**
         * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
         */
        java.lang.String getTemplateID();
        /**
         * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getTemplateIDBytes();

        /**
         * <code>required string Status = 5 [(.validation.regex) = ""];</code>
         */
        boolean hasStatus();
        /**
         * <code>required string Status = 5 [(.validation.regex) = ""];</code>
         */
        java.lang.String getStatus();
        /**
         * <code>required string Status = 5 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getStatusBytes();

        /**
         * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
         */
        boolean hasAssigneeName();
        /**
         * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
         */
        java.lang.String getAssigneeName();
        /**
         * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getAssigneeNameBytes();

        /**
         * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
         */
        boolean hasAssignmentName();
        /**
         * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
         */
        java.lang.String getAssignmentName();
        /**
         * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getAssignmentNameBytes();

        /**
         * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
         */
        boolean hasNextBreach();
        /**
         * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
         */
        java.lang.String getNextBreach();
        /**
         * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getNextBreachBytes();

        /**
         * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
         */
        boolean hasActualFinish();
        /**
         * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
         */
        java.lang.String getActualFinish();
        /**
         * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getActualFinishBytes();

        /**
         * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
         */
        boolean hasCloseTime();
        /**
         * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
         */
        java.lang.String getCloseTime();
        /**
         * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getCloseTimeBytes();

        /**
         * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
         */
        boolean hasResolution();
        /**
         * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
         */
        java.lang.String getResolution();
        /**
         * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getResolutionBytes();

        /**
         * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
         */
        boolean hasResolutionCode();
        /**
         * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
         */
        java.lang.String getResolutionCode();
        /**
         * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getResolutionCodeBytes();

        /**
         * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
         */
        boolean hasAttachmentStatus();
        /**
         * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
         */
        java.lang.String getAttachmentStatus();
        /**
         * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getAttachmentStatusBytes();

        /**
         * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
         */
        boolean hasPriorityCode();
        /**
         * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
         */
        java.lang.String getPriorityCode();
        /**
         * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getPriorityCodeBytes();

        /**
         * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
         */
        boolean hasContactName();
        /**
         * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
         */
        java.lang.String getContactName();
        /**
         * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getContactNameBytes();

        /**
         * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
         */
        boolean hasCallbackContact();
        /**
         * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
         */
        java.lang.String getCallbackContact();
        /**
         * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getCallbackContactBytes();

        /**
         * <code>required string Category = 17 [(.validation.regex) = ""];</code>
         */
        boolean hasCategory();
        /**
         * <code>required string Category = 17 [(.validation.regex) = ""];</code>
         */
        java.lang.String getCategory();
        /**
         * <code>required string Category = 17 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getCategoryBytes();

        /**
         * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
         */
        boolean hasSbK2();
        /**
         * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbK2();
        /**
         * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbK2Bytes();

        /**
         * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
         */
        boolean hasSbAIB();
        /**
         * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbAIB();
        /**
         * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbAIBBytes();

        /**
         * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
         */
        boolean hasSbDRUGId();
        /**
         * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbDRUGId();
        /**
         * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbDRUGIdBytes();

        /**
         * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
         */
        boolean hasSbMqrqid();
        /**
         * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbMqrqid();
        /**
         * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbMqrqidBytes();

        /**
         * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
         */
        boolean hasSbSourceName();
        /**
         * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbSourceName();
        /**
         * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbSourceNameBytes();

        /**
         * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
         */
        boolean hasIncidentID();
        /**
         * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
         */
        java.lang.String getIncidentID();
        /**
         * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getIncidentIDBytes();

        /**
         * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
         */
        boolean hasSbForecastMoveCause();
        /**
         * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbForecastMoveCause();
        /**
         * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbForecastMoveCauseBytes();

        /**
         * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
         */
        boolean hasSbLogin();
        /**
         * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbLogin();
        /**
         * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbLoginBytes();

        /**
         * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
         */
        boolean hasSbPassword();
        /**
         * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
         */
        java.lang.String getSbPassword();
        /**
         * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getSbPasswordBytes();

        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
         */
        boolean hasAdditionalFields();
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS getAdditionalFields();
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDSOrBuilder getAdditionalFieldsOrBuilder();

        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM> 
            getEcmList();
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM getEcm(int index);
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        int getEcmCount();
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder> 
            getEcmOrBuilderList();
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder getEcmOrBuilder(
            int index);

        /**
         * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
         */
        boolean hasChannel();
        /**
         * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
         */
        java.lang.String getChannel();
        /**
         * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
         */
        com.google.protobuf.ByteString
            getChannelBytes();

        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
         */
        boolean hasDynamicFields();
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS getDynamicFields();
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDSOrBuilder getDynamicFieldsOrBuilder();

        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
         */
        boolean hasSbDynamicFields();
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS getSbDynamicFields();
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
         */
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDSOrBuilder getSbDynamicFieldsOrBuilder();
      }
      /**
       * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO}
       */
      public  static final class ZNO extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO)
          ZNOOrBuilder {
      private static final long serialVersionUID = 0L;
        // Use ZNO.newBuilder() to construct.
        private ZNO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
          super(builder);
        }
        private ZNO() {
          number_ = "";
          sourceID_ = "";
          title_ = "";
          description_ = "";
          templateID_ = "";
          status_ = "";
          assigneeName_ = "";
          assignmentName_ = "";
          nextBreach_ = "";
          actualFinish_ = "";
          closeTime_ = "";
          resolution_ = "";
          resolutionCode_ = "";
          attachmentStatus_ = "";
          priorityCode_ = "";
          contactName_ = "";
          callbackContact_ = "";
          category_ = "";
          sbK2_ = "";
          sbAIB_ = "";
          sbDRUGId_ = "";
          sbMqrqid_ = "";
          sbSourceName_ = "";
          incidentID_ = "";
          sbForecastMoveCause_ = "";
          sbLogin_ = "";
          sbPassword_ = "";
          ecm_ = java.util.Collections.emptyList();
          channel_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
          return this.unknownFields;
        }
        private ZNO(
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
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000002;
                  sourceID_ = bs;
                  break;
                }
                case 18: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000004;
                  title_ = bs;
                  break;
                }
                case 26: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000008;
                  description_ = bs;
                  break;
                }
                case 34: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000010;
                  templateID_ = bs;
                  break;
                }
                case 42: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000020;
                  status_ = bs;
                  break;
                }
                case 50: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000040;
                  assigneeName_ = bs;
                  break;
                }
                case 58: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000080;
                  assignmentName_ = bs;
                  break;
                }
                case 66: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000100;
                  nextBreach_ = bs;
                  break;
                }
                case 74: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000200;
                  actualFinish_ = bs;
                  break;
                }
                case 82: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000400;
                  closeTime_ = bs;
                  break;
                }
                case 90: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000800;
                  resolution_ = bs;
                  break;
                }
                case 98: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00001000;
                  resolutionCode_ = bs;
                  break;
                }
                case 106: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00002000;
                  attachmentStatus_ = bs;
                  break;
                }
                case 114: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00004000;
                  priorityCode_ = bs;
                  break;
                }
                case 122: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00008000;
                  contactName_ = bs;
                  break;
                }
                case 130: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00010000;
                  callbackContact_ = bs;
                  break;
                }
                case 138: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00020000;
                  category_ = bs;
                  break;
                }
                case 146: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00040000;
                  sbK2_ = bs;
                  break;
                }
                case 154: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00080000;
                  sbAIB_ = bs;
                  break;
                }
                case 162: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00100000;
                  sbDRUGId_ = bs;
                  break;
                }
                case 170: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00200000;
                  sbMqrqid_ = bs;
                  break;
                }
                case 178: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00400000;
                  sbSourceName_ = bs;
                  break;
                }
                case 186: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00800000;
                  incidentID_ = bs;
                  break;
                }
                case 194: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x01000000;
                  sbForecastMoveCause_ = bs;
                  break;
                }
                case 202: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x02000000;
                  sbLogin_ = bs;
                  break;
                }
                case 210: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x04000000;
                  sbPassword_ = bs;
                  break;
                }
                case 218: {
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder subBuilder = null;
                  if (((bitField0_ & 0x08000000) == 0x08000000)) {
                    subBuilder = additionalFields_.toBuilder();
                  }
                  additionalFields_ = input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.PARSER, extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(additionalFields_);
                    additionalFields_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x08000000;
                  break;
                }
                case 226: {
                  if (!((mutable_bitField0_ & 0x10000000) == 0x10000000)) {
                    ecm_ = new java.util.ArrayList<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM>();
                    mutable_bitField0_ |= 0x10000000;
                  }
                  ecm_.add(
                      input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.PARSER, extensionRegistry));
                  break;
                }
                case 234: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x10000000;
                  channel_ = bs;
                  break;
                }
                case 242: {
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder subBuilder = null;
                  if (((bitField0_ & 0x20000000) == 0x20000000)) {
                    subBuilder = dynamicFields_.toBuilder();
                  }
                  dynamicFields_ = input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.PARSER, extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(dynamicFields_);
                    dynamicFields_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x20000000;
                  break;
                }
                case 250: {
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder subBuilder = null;
                  if (((bitField0_ & 0x40000000) == 0x40000000)) {
                    subBuilder = sbDynamicFields_.toBuilder();
                  }
                  sbDynamicFields_ = input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.PARSER, extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(sbDynamicFields_);
                    sbDynamicFields_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x40000000;
                  break;
                }
                case 258: {
                  com.google.protobuf.ByteString bs = input.readBytes();
                  bitField0_ |= 0x00000001;
                  number_ = bs;
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
            if (((mutable_bitField0_ & 0x10000000) == 0x10000000)) {
              ecm_ = java.util.Collections.unmodifiableList(ecm_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
          }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder.class);
        }

        public interface ADDITIONALFIELDSOrBuilder extends
            // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS)
            com.google.protobuf.MessageOrBuilder {

          /**
           * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
           */
          boolean hasClientFullName();
          /**
           * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
           */
          java.lang.String getClientFullName();
          /**
           * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getClientFullNameBytes();

          /**
           * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
           */
          boolean hasClientINN();
          /**
           * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
           */
          java.lang.String getClientINN();
          /**
           * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getClientINNBytes();

          /**
           * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
           */
          boolean hasClientSegment();
          /**
           * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
           */
          java.lang.String getClientSegment();
          /**
           * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getClientSegmentBytes();

          /**
           * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
           */
          boolean hasClientTB();
          /**
           * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
           */
          java.lang.String getClientTB();
          /**
           * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getClientTBBytes();

          /**
           * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
           */
          boolean hasClientVSP();
          /**
           * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
           */
          java.lang.String getClientVSP();
          /**
           * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getClientVSPBytes();

          /**
           * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
           */
          boolean hasPSFNumber();
          /**
           * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
           */
          java.lang.String getPSFNumber();
          /**
           * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getPSFNumberBytes();

          /**
           * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
           */
          boolean hasManualRouting();
          /**
           * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
           */
          java.lang.String getManualRouting();
          /**
           * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getManualRoutingBytes();

          /**
           * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
           */
          boolean hasAnswerClient();
          /**
           * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
           */
          java.lang.String getAnswerClient();
          /**
           * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getAnswerClientBytes();

          /**
           * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
           */
          boolean hasPSFRouter();
          /**
           * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
           */
          java.lang.String getPSFRouter();
          /**
           * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getPSFRouterBytes();
        }
        /**
         * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS}
         */
        public  static final class ADDITIONALFIELDS extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS)
            ADDITIONALFIELDSOrBuilder {
        private static final long serialVersionUID = 0L;
          // Use ADDITIONALFIELDS.newBuilder() to construct.
          private ADDITIONALFIELDS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
          }
          private ADDITIONALFIELDS() {
            clientFullName_ = "";
            clientINN_ = "";
            clientSegment_ = "";
            clientTB_ = "";
            clientVSP_ = "";
            pSFNumber_ = "";
            manualRouting_ = "";
            answerClient_ = "";
            pSFRouter_ = "";
          }

          @java.lang.Override
          public final com.google.protobuf.UnknownFieldSet
          getUnknownFields() {
            return this.unknownFields;
          }
          private ADDITIONALFIELDS(
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
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000002;
                    clientINN_ = bs;
                    break;
                  }
                  case 18: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000004;
                    clientSegment_ = bs;
                    break;
                  }
                  case 26: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000008;
                    clientTB_ = bs;
                    break;
                  }
                  case 34: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000010;
                    clientVSP_ = bs;
                    break;
                  }
                  case 42: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000020;
                    pSFNumber_ = bs;
                    break;
                  }
                  case 50: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000040;
                    manualRouting_ = bs;
                    break;
                  }
                  case 58: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000080;
                    answerClient_ = bs;
                    break;
                  }
                  case 66: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000100;
                    pSFRouter_ = bs;
                    break;
                  }
                  case 266: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000001;
                    clientFullName_ = bs;
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
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_descriptor;
          }

          @java.lang.Override
          protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
              internalGetFieldAccessorTable() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder.class);
          }

          private int bitField0_;
          public static final int CLIENTFULLNAME_FIELD_NUMBER = 33;
          private volatile java.lang.Object clientFullName_;
          /**
           * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
           */
          public boolean hasClientFullName() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
          }
          /**
           * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getClientFullName() {
            java.lang.Object ref = clientFullName_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                clientFullName_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getClientFullNameBytes() {
            java.lang.Object ref = clientFullName_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              clientFullName_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int CLIENTINN_FIELD_NUMBER = 1;
          private volatile java.lang.Object clientINN_;
          /**
           * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
           */
          public boolean hasClientINN() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
          }
          /**
           * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getClientINN() {
            java.lang.Object ref = clientINN_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                clientINN_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getClientINNBytes() {
            java.lang.Object ref = clientINN_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              clientINN_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int CLIENTSEGMENT_FIELD_NUMBER = 2;
          private volatile java.lang.Object clientSegment_;
          /**
           * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
           */
          public boolean hasClientSegment() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
          }
          /**
           * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getClientSegment() {
            java.lang.Object ref = clientSegment_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                clientSegment_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getClientSegmentBytes() {
            java.lang.Object ref = clientSegment_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              clientSegment_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int CLIENTTB_FIELD_NUMBER = 3;
          private volatile java.lang.Object clientTB_;
          /**
           * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
           */
          public boolean hasClientTB() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
          }
          /**
           * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getClientTB() {
            java.lang.Object ref = clientTB_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                clientTB_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getClientTBBytes() {
            java.lang.Object ref = clientTB_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              clientTB_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int CLIENTVSP_FIELD_NUMBER = 4;
          private volatile java.lang.Object clientVSP_;
          /**
           * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
           */
          public boolean hasClientVSP() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
          }
          /**
           * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getClientVSP() {
            java.lang.Object ref = clientVSP_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                clientVSP_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getClientVSPBytes() {
            java.lang.Object ref = clientVSP_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              clientVSP_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int PSFNUMBER_FIELD_NUMBER = 5;
          private volatile java.lang.Object pSFNumber_;
          /**
           * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
           */
          public boolean hasPSFNumber() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
          }
          /**
           * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getPSFNumber() {
            java.lang.Object ref = pSFNumber_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                pSFNumber_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getPSFNumberBytes() {
            java.lang.Object ref = pSFNumber_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              pSFNumber_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int MANUALROUTING_FIELD_NUMBER = 6;
          private volatile java.lang.Object manualRouting_;
          /**
           * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
           */
          public boolean hasManualRouting() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
          }
          /**
           * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getManualRouting() {
            java.lang.Object ref = manualRouting_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                manualRouting_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getManualRoutingBytes() {
            java.lang.Object ref = manualRouting_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              manualRouting_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int ANSWERCLIENT_FIELD_NUMBER = 7;
          private volatile java.lang.Object answerClient_;
          /**
           * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
           */
          public boolean hasAnswerClient() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
          }
          /**
           * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getAnswerClient() {
            java.lang.Object ref = answerClient_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                answerClient_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getAnswerClientBytes() {
            java.lang.Object ref = answerClient_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              answerClient_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int PSFROUTER_FIELD_NUMBER = 8;
          private volatile java.lang.Object pSFRouter_;
          /**
           * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
           */
          public boolean hasPSFRouter() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
          }
          /**
           * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getPSFRouter() {
            java.lang.Object ref = pSFRouter_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                pSFRouter_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getPSFRouterBytes() {
            java.lang.Object ref = pSFRouter_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              pSFRouter_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          private byte memoizedIsInitialized = -1;
          @java.lang.Override
          public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasClientFullName()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasClientINN()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasClientSegment()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasClientTB()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasClientVSP()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasPSFNumber()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasManualRouting()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasAnswerClient()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasPSFRouter()) {
              memoizedIsInitialized = 0;
              return false;
            }
            memoizedIsInitialized = 1;
            return true;
          }

          @java.lang.Override
          public void writeTo(com.google.protobuf.CodedOutputStream output)
                              throws java.io.IOException {
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientINN_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientSegment_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clientTB_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 4, clientVSP_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 5, pSFNumber_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 6, manualRouting_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 7, answerClient_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 8, pSFRouter_);
            }
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 33, clientFullName_);
            }
            unknownFields.writeTo(output);
          }

          @java.lang.Override
          public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientINN_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientSegment_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clientTB_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, clientVSP_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, pSFNumber_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, manualRouting_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, answerClient_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, pSFRouter_);
            }
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(33, clientFullName_);
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
            if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS)) {
              return super.equals(obj);
            }
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS) obj;

            boolean result = true;
            result = result && (hasClientFullName() == other.hasClientFullName());
            if (hasClientFullName()) {
              result = result && getClientFullName()
                  .equals(other.getClientFullName());
            }
            result = result && (hasClientINN() == other.hasClientINN());
            if (hasClientINN()) {
              result = result && getClientINN()
                  .equals(other.getClientINN());
            }
            result = result && (hasClientSegment() == other.hasClientSegment());
            if (hasClientSegment()) {
              result = result && getClientSegment()
                  .equals(other.getClientSegment());
            }
            result = result && (hasClientTB() == other.hasClientTB());
            if (hasClientTB()) {
              result = result && getClientTB()
                  .equals(other.getClientTB());
            }
            result = result && (hasClientVSP() == other.hasClientVSP());
            if (hasClientVSP()) {
              result = result && getClientVSP()
                  .equals(other.getClientVSP());
            }
            result = result && (hasPSFNumber() == other.hasPSFNumber());
            if (hasPSFNumber()) {
              result = result && getPSFNumber()
                  .equals(other.getPSFNumber());
            }
            result = result && (hasManualRouting() == other.hasManualRouting());
            if (hasManualRouting()) {
              result = result && getManualRouting()
                  .equals(other.getManualRouting());
            }
            result = result && (hasAnswerClient() == other.hasAnswerClient());
            if (hasAnswerClient()) {
              result = result && getAnswerClient()
                  .equals(other.getAnswerClient());
            }
            result = result && (hasPSFRouter() == other.hasPSFRouter());
            if (hasPSFRouter()) {
              result = result && getPSFRouter()
                  .equals(other.getPSFRouter());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
          }

          @java.lang.Override
          public int hashCode() {
            if (memoizedHashCode != 0) {
              return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasClientFullName()) {
              hash = (37 * hash) + CLIENTFULLNAME_FIELD_NUMBER;
              hash = (53 * hash) + getClientFullName().hashCode();
            }
            if (hasClientINN()) {
              hash = (37 * hash) + CLIENTINN_FIELD_NUMBER;
              hash = (53 * hash) + getClientINN().hashCode();
            }
            if (hasClientSegment()) {
              hash = (37 * hash) + CLIENTSEGMENT_FIELD_NUMBER;
              hash = (53 * hash) + getClientSegment().hashCode();
            }
            if (hasClientTB()) {
              hash = (37 * hash) + CLIENTTB_FIELD_NUMBER;
              hash = (53 * hash) + getClientTB().hashCode();
            }
            if (hasClientVSP()) {
              hash = (37 * hash) + CLIENTVSP_FIELD_NUMBER;
              hash = (53 * hash) + getClientVSP().hashCode();
            }
            if (hasPSFNumber()) {
              hash = (37 * hash) + PSFNUMBER_FIELD_NUMBER;
              hash = (53 * hash) + getPSFNumber().hashCode();
            }
            if (hasManualRouting()) {
              hash = (37 * hash) + MANUALROUTING_FIELD_NUMBER;
              hash = (53 * hash) + getManualRouting().hashCode();
            }
            if (hasAnswerClient()) {
              hash = (37 * hash) + ANSWERCLIENT_FIELD_NUMBER;
              hash = (53 * hash) + getAnswerClient().hashCode();
            }
            if (hasPSFRouter()) {
              hash = (37 * hash) + PSFROUTER_FIELD_NUMBER;
              hash = (53 * hash) + getPSFRouter().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
              java.nio.ByteBuffer data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
              java.nio.ByteBuffer data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
              com.google.protobuf.ByteString data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
              com.google.protobuf.ByteString data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(byte[] data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
              byte[] data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseDelimitedFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseDelimitedFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
              com.google.protobuf.CodedInputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parseFrom(
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
          public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS prototype) {
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
           * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS}
           */
          public static final class Builder extends
              com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
              // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS)
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDSOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(
                      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder.class);
            }

            // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.newBuilder()
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
              clientFullName_ = "";
              bitField0_ = (bitField0_ & ~0x00000001);
              clientINN_ = "";
              bitField0_ = (bitField0_ & ~0x00000002);
              clientSegment_ = "";
              bitField0_ = (bitField0_ & ~0x00000004);
              clientTB_ = "";
              bitField0_ = (bitField0_ & ~0x00000008);
              clientVSP_ = "";
              bitField0_ = (bitField0_ & ~0x00000010);
              pSFNumber_ = "";
              bitField0_ = (bitField0_ & ~0x00000020);
              manualRouting_ = "";
              bitField0_ = (bitField0_ & ~0x00000040);
              answerClient_ = "";
              bitField0_ = (bitField0_ & ~0x00000080);
              pSFRouter_ = "";
              bitField0_ = (bitField0_ & ~0x00000100);
              return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_descriptor;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS getDefaultInstanceForType() {
              return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.getDefaultInstance();
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS build() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS result = buildPartial();
              if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
              }
              return result;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS buildPartial() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS(this);
              int from_bitField0_ = bitField0_;
              int to_bitField0_ = 0;
              if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
              }
              result.clientFullName_ = clientFullName_;
              if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
              }
              result.clientINN_ = clientINN_;
              if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
              }
              result.clientSegment_ = clientSegment_;
              if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                to_bitField0_ |= 0x00000008;
              }
              result.clientTB_ = clientTB_;
              if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                to_bitField0_ |= 0x00000010;
              }
              result.clientVSP_ = clientVSP_;
              if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                to_bitField0_ |= 0x00000020;
              }
              result.pSFNumber_ = pSFNumber_;
              if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                to_bitField0_ |= 0x00000040;
              }
              result.manualRouting_ = manualRouting_;
              if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                to_bitField0_ |= 0x00000080;
              }
              result.answerClient_ = answerClient_;
              if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                to_bitField0_ |= 0x00000100;
              }
              result.pSFRouter_ = pSFRouter_;
              result.bitField0_ = to_bitField0_;
              onBuilt();
              return result;
            }

            @java.lang.Override
            public Builder clone() {
              return (Builder) super.clone();
            }
            @java.lang.Override
            public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
              return (Builder) super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
              return (Builder) super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
              return (Builder) super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
              if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS) {
                return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS)other);
              } else {
                super.mergeFrom(other);
                return this;
              }
            }

            public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS other) {
              if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.getDefaultInstance()) return this;
              if (other.hasClientFullName()) {
                bitField0_ |= 0x00000001;
                clientFullName_ = other.clientFullName_;
                onChanged();
              }
              if (other.hasClientINN()) {
                bitField0_ |= 0x00000002;
                clientINN_ = other.clientINN_;
                onChanged();
              }
              if (other.hasClientSegment()) {
                bitField0_ |= 0x00000004;
                clientSegment_ = other.clientSegment_;
                onChanged();
              }
              if (other.hasClientTB()) {
                bitField0_ |= 0x00000008;
                clientTB_ = other.clientTB_;
                onChanged();
              }
              if (other.hasClientVSP()) {
                bitField0_ |= 0x00000010;
                clientVSP_ = other.clientVSP_;
                onChanged();
              }
              if (other.hasPSFNumber()) {
                bitField0_ |= 0x00000020;
                pSFNumber_ = other.pSFNumber_;
                onChanged();
              }
              if (other.hasManualRouting()) {
                bitField0_ |= 0x00000040;
                manualRouting_ = other.manualRouting_;
                onChanged();
              }
              if (other.hasAnswerClient()) {
                bitField0_ |= 0x00000080;
                answerClient_ = other.answerClient_;
                onChanged();
              }
              if (other.hasPSFRouter()) {
                bitField0_ |= 0x00000100;
                pSFRouter_ = other.pSFRouter_;
                onChanged();
              }
              this.mergeUnknownFields(other.unknownFields);
              onChanged();
              return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
              if (!hasClientFullName()) {
                return false;
              }
              if (!hasClientINN()) {
                return false;
              }
              if (!hasClientSegment()) {
                return false;
              }
              if (!hasClientTB()) {
                return false;
              }
              if (!hasClientVSP()) {
                return false;
              }
              if (!hasPSFNumber()) {
                return false;
              }
              if (!hasManualRouting()) {
                return false;
              }
              if (!hasAnswerClient()) {
                return false;
              }
              if (!hasPSFRouter()) {
                return false;
              }
              return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS parsedMessage = null;
              try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS) e.getUnfinishedMessage();
                throw e.unwrapIOException();
              } finally {
                if (parsedMessage != null) {
                  mergeFrom(parsedMessage);
                }
              }
              return this;
            }
            private int bitField0_;

            private java.lang.Object clientFullName_ = "";
            /**
             * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
             */
            public boolean hasClientFullName() {
              return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getClientFullName() {
              java.lang.Object ref = clientFullName_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  clientFullName_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getClientFullNameBytes() {
              java.lang.Object ref = clientFullName_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                clientFullName_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
             */
            public Builder setClientFullName(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
              clientFullName_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
             */
            public Builder clearClientFullName() {
              bitField0_ = (bitField0_ & ~0x00000001);
              clientFullName_ = getDefaultInstance().getClientFullName();
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientFullName = 33 [(.validation.regex) = ""];</code>
             */
            public Builder setClientFullNameBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
              clientFullName_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object clientINN_ = "";
            /**
             * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
             */
            public boolean hasClientINN() {
              return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getClientINN() {
              java.lang.Object ref = clientINN_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  clientINN_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getClientINNBytes() {
              java.lang.Object ref = clientINN_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                clientINN_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
             */
            public Builder setClientINN(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
              clientINN_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
             */
            public Builder clearClientINN() {
              bitField0_ = (bitField0_ & ~0x00000002);
              clientINN_ = getDefaultInstance().getClientINN();
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientINN = 1 [(.validation.regex) = ""];</code>
             */
            public Builder setClientINNBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
              clientINN_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object clientSegment_ = "";
            /**
             * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
             */
            public boolean hasClientSegment() {
              return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getClientSegment() {
              java.lang.Object ref = clientSegment_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  clientSegment_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getClientSegmentBytes() {
              java.lang.Object ref = clientSegment_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                clientSegment_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
             */
            public Builder setClientSegment(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
              clientSegment_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
             */
            public Builder clearClientSegment() {
              bitField0_ = (bitField0_ & ~0x00000004);
              clientSegment_ = getDefaultInstance().getClientSegment();
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientSegment = 2 [(.validation.regex) = ""];</code>
             */
            public Builder setClientSegmentBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
              clientSegment_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object clientTB_ = "";
            /**
             * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
             */
            public boolean hasClientTB() {
              return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getClientTB() {
              java.lang.Object ref = clientTB_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  clientTB_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getClientTBBytes() {
              java.lang.Object ref = clientTB_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                clientTB_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
             */
            public Builder setClientTB(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
              clientTB_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
             */
            public Builder clearClientTB() {
              bitField0_ = (bitField0_ & ~0x00000008);
              clientTB_ = getDefaultInstance().getClientTB();
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientTB = 3 [(.validation.regex) = ""];</code>
             */
            public Builder setClientTBBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
              clientTB_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object clientVSP_ = "";
            /**
             * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
             */
            public boolean hasClientVSP() {
              return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getClientVSP() {
              java.lang.Object ref = clientVSP_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  clientVSP_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getClientVSPBytes() {
              java.lang.Object ref = clientVSP_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                clientVSP_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
             */
            public Builder setClientVSP(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
              clientVSP_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
             */
            public Builder clearClientVSP() {
              bitField0_ = (bitField0_ & ~0x00000010);
              clientVSP_ = getDefaultInstance().getClientVSP();
              onChanged();
              return this;
            }
            /**
             * <code>required string ClientVSP = 4 [(.validation.regex) = ""];</code>
             */
            public Builder setClientVSPBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
              clientVSP_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object pSFNumber_ = "";
            /**
             * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
             */
            public boolean hasPSFNumber() {
              return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getPSFNumber() {
              java.lang.Object ref = pSFNumber_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  pSFNumber_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getPSFNumberBytes() {
              java.lang.Object ref = pSFNumber_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                pSFNumber_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
             */
            public Builder setPSFNumber(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
              pSFNumber_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
             */
            public Builder clearPSFNumber() {
              bitField0_ = (bitField0_ & ~0x00000020);
              pSFNumber_ = getDefaultInstance().getPSFNumber();
              onChanged();
              return this;
            }
            /**
             * <code>required string PSFNumber = 5 [(.validation.regex) = ""];</code>
             */
            public Builder setPSFNumberBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
              pSFNumber_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object manualRouting_ = "";
            /**
             * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
             */
            public boolean hasManualRouting() {
              return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getManualRouting() {
              java.lang.Object ref = manualRouting_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  manualRouting_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getManualRoutingBytes() {
              java.lang.Object ref = manualRouting_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                manualRouting_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
             */
            public Builder setManualRouting(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
              manualRouting_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
             */
            public Builder clearManualRouting() {
              bitField0_ = (bitField0_ & ~0x00000040);
              manualRouting_ = getDefaultInstance().getManualRouting();
              onChanged();
              return this;
            }
            /**
             * <code>required string ManualRouting = 6 [(.validation.regex) = ""];</code>
             */
            public Builder setManualRoutingBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
              manualRouting_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object answerClient_ = "";
            /**
             * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
             */
            public boolean hasAnswerClient() {
              return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getAnswerClient() {
              java.lang.Object ref = answerClient_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  answerClient_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getAnswerClientBytes() {
              java.lang.Object ref = answerClient_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                answerClient_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
             */
            public Builder setAnswerClient(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
              answerClient_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
             */
            public Builder clearAnswerClient() {
              bitField0_ = (bitField0_ & ~0x00000080);
              answerClient_ = getDefaultInstance().getAnswerClient();
              onChanged();
              return this;
            }
            /**
             * <code>required string AnswerClient = 7 [(.validation.regex) = ""];</code>
             */
            public Builder setAnswerClientBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
              answerClient_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object pSFRouter_ = "";
            /**
             * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
             */
            public boolean hasPSFRouter() {
              return ((bitField0_ & 0x00000100) == 0x00000100);
            }
            /**
             * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getPSFRouter() {
              java.lang.Object ref = pSFRouter_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  pSFRouter_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getPSFRouterBytes() {
              java.lang.Object ref = pSFRouter_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                pSFRouter_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
             */
            public Builder setPSFRouter(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
              pSFRouter_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
             */
            public Builder clearPSFRouter() {
              bitField0_ = (bitField0_ & ~0x00000100);
              pSFRouter_ = getDefaultInstance().getPSFRouter();
              onChanged();
              return this;
            }
            /**
             * <code>required string PSFRouter = 8 [(.validation.regex) = ""];</code>
             */
            public Builder setPSFRouterBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
              pSFRouter_ = value;
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


            // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS)
          }

          // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS)
          private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS DEFAULT_INSTANCE;
          static {
            DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS();
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS getDefaultInstance() {
            return DEFAULT_INSTANCE;
          }

          @java.lang.Deprecated public static final com.google.protobuf.Parser<ADDITIONALFIELDS>
              PARSER = new com.google.protobuf.AbstractParser<ADDITIONALFIELDS>() {
            @java.lang.Override
            public ADDITIONALFIELDS parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new ADDITIONALFIELDS(input, extensionRegistry);
            }
          };

          public static com.google.protobuf.Parser<ADDITIONALFIELDS> parser() {
            return PARSER;
          }

          @java.lang.Override
          public com.google.protobuf.Parser<ADDITIONALFIELDS> getParserForType() {
            return PARSER;
          }

          @java.lang.Override
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
          }

        }

        public interface ECMOrBuilder extends
            // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM)
            com.google.protobuf.MessageOrBuilder {

          /**
           * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
           */
          boolean hasECMFolderId();
          /**
           * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
           */
          java.lang.String getECMFolderId();
          /**
           * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getECMFolderIdBytes();

          /**
           * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
           */
          boolean hasECMFolderType();
          /**
           * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
           */
          java.lang.String getECMFolderType();
          /**
           * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
           */
          com.google.protobuf.ByteString
              getECMFolderTypeBytes();
        }
        /**
         * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM}
         */
        public  static final class ECM extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM)
            ECMOrBuilder {
        private static final long serialVersionUID = 0L;
          // Use ECM.newBuilder() to construct.
          private ECM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
          }
          private ECM() {
            eCMFolderId_ = "";
            eCMFolderType_ = "";
          }

          @java.lang.Override
          public final com.google.protobuf.UnknownFieldSet
          getUnknownFields() {
            return this.unknownFields;
          }
          private ECM(
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
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000002;
                    eCMFolderType_ = bs;
                    break;
                  }
                  case 274: {
                    com.google.protobuf.ByteString bs = input.readBytes();
                    bitField0_ |= 0x00000001;
                    eCMFolderId_ = bs;
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
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_descriptor;
          }

          @java.lang.Override
          protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
              internalGetFieldAccessorTable() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder.class);
          }

          private int bitField0_;
          public static final int ECMFOLDERID_FIELD_NUMBER = 34;
          private volatile java.lang.Object eCMFolderId_;
          /**
           * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
           */
          public boolean hasECMFolderId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
          }
          /**
           * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getECMFolderId() {
            java.lang.Object ref = eCMFolderId_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                eCMFolderId_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getECMFolderIdBytes() {
            java.lang.Object ref = eCMFolderId_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              eCMFolderId_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          public static final int ECMFOLDERTYPE_FIELD_NUMBER = 1;
          private volatile java.lang.Object eCMFolderType_;
          /**
           * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
           */
          public boolean hasECMFolderType() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
          }
          /**
           * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getECMFolderType() {
            java.lang.Object ref = eCMFolderType_;
            if (ref instanceof java.lang.String) {
              return (java.lang.String) ref;
            } else {
              com.google.protobuf.ByteString bs = 
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                eCMFolderType_ = s;
              }
              return s;
            }
          }
          /**
           * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getECMFolderTypeBytes() {
            java.lang.Object ref = eCMFolderType_;
            if (ref instanceof java.lang.String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              eCMFolderType_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }

          private byte memoizedIsInitialized = -1;
          @java.lang.Override
          public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasECMFolderId()) {
              memoizedIsInitialized = 0;
              return false;
            }
            if (!hasECMFolderType()) {
              memoizedIsInitialized = 0;
              return false;
            }
            memoizedIsInitialized = 1;
            return true;
          }

          @java.lang.Override
          public void writeTo(com.google.protobuf.CodedOutputStream output)
                              throws java.io.IOException {
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eCMFolderType_);
            }
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              com.google.protobuf.GeneratedMessageV3.writeString(output, 34, eCMFolderId_);
            }
            unknownFields.writeTo(output);
          }

          @java.lang.Override
          public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eCMFolderType_);
            }
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              size += com.google.protobuf.GeneratedMessageV3.computeStringSize(34, eCMFolderId_);
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
            if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM)) {
              return super.equals(obj);
            }
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM) obj;

            boolean result = true;
            result = result && (hasECMFolderId() == other.hasECMFolderId());
            if (hasECMFolderId()) {
              result = result && getECMFolderId()
                  .equals(other.getECMFolderId());
            }
            result = result && (hasECMFolderType() == other.hasECMFolderType());
            if (hasECMFolderType()) {
              result = result && getECMFolderType()
                  .equals(other.getECMFolderType());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
          }

          @java.lang.Override
          public int hashCode() {
            if (memoizedHashCode != 0) {
              return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasECMFolderId()) {
              hash = (37 * hash) + ECMFOLDERID_FIELD_NUMBER;
              hash = (53 * hash) + getECMFolderId().hashCode();
            }
            if (hasECMFolderType()) {
              hash = (37 * hash) + ECMFOLDERTYPE_FIELD_NUMBER;
              hash = (53 * hash) + getECMFolderType().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
              java.nio.ByteBuffer data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
              java.nio.ByteBuffer data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
              com.google.protobuf.ByteString data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
              com.google.protobuf.ByteString data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(byte[] data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
              byte[] data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseDelimitedFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseDelimitedFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
              com.google.protobuf.CodedInputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parseFrom(
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
          public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM prototype) {
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
           * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM}
           */
          public static final class Builder extends
              com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
              // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM)
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(
                      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder.class);
            }

            // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.newBuilder()
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
              eCMFolderId_ = "";
              bitField0_ = (bitField0_ & ~0x00000001);
              eCMFolderType_ = "";
              bitField0_ = (bitField0_ & ~0x00000002);
              return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_descriptor;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM getDefaultInstanceForType() {
              return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.getDefaultInstance();
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM build() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM result = buildPartial();
              if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
              }
              return result;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM buildPartial() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM(this);
              int from_bitField0_ = bitField0_;
              int to_bitField0_ = 0;
              if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
              }
              result.eCMFolderId_ = eCMFolderId_;
              if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
              }
              result.eCMFolderType_ = eCMFolderType_;
              result.bitField0_ = to_bitField0_;
              onBuilt();
              return result;
            }

            @java.lang.Override
            public Builder clone() {
              return (Builder) super.clone();
            }
            @java.lang.Override
            public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
              return (Builder) super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
              return (Builder) super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
              return (Builder) super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
              if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM) {
                return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM)other);
              } else {
                super.mergeFrom(other);
                return this;
              }
            }

            public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM other) {
              if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.getDefaultInstance()) return this;
              if (other.hasECMFolderId()) {
                bitField0_ |= 0x00000001;
                eCMFolderId_ = other.eCMFolderId_;
                onChanged();
              }
              if (other.hasECMFolderType()) {
                bitField0_ |= 0x00000002;
                eCMFolderType_ = other.eCMFolderType_;
                onChanged();
              }
              this.mergeUnknownFields(other.unknownFields);
              onChanged();
              return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
              if (!hasECMFolderId()) {
                return false;
              }
              if (!hasECMFolderType()) {
                return false;
              }
              return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM parsedMessage = null;
              try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM) e.getUnfinishedMessage();
                throw e.unwrapIOException();
              } finally {
                if (parsedMessage != null) {
                  mergeFrom(parsedMessage);
                }
              }
              return this;
            }
            private int bitField0_;

            private java.lang.Object eCMFolderId_ = "";
            /**
             * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
             */
            public boolean hasECMFolderId() {
              return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getECMFolderId() {
              java.lang.Object ref = eCMFolderId_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  eCMFolderId_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getECMFolderIdBytes() {
              java.lang.Object ref = eCMFolderId_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                eCMFolderId_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
             */
            public Builder setECMFolderId(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
              eCMFolderId_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
             */
            public Builder clearECMFolderId() {
              bitField0_ = (bitField0_ & ~0x00000001);
              eCMFolderId_ = getDefaultInstance().getECMFolderId();
              onChanged();
              return this;
            }
            /**
             * <code>required string ECMFolderId = 34 [(.validation.regex) = ""];</code>
             */
            public Builder setECMFolderIdBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
              eCMFolderId_ = value;
              onChanged();
              return this;
            }

            private java.lang.Object eCMFolderType_ = "";
            /**
             * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
             */
            public boolean hasECMFolderType() {
              return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getECMFolderType() {
              java.lang.Object ref = eCMFolderType_;
              if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  eCMFolderType_ = s;
                }
                return s;
              } else {
                return (java.lang.String) ref;
              }
            }
            /**
             * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getECMFolderTypeBytes() {
              java.lang.Object ref = eCMFolderType_;
              if (ref instanceof String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                eCMFolderType_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }
            /**
             * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
             */
            public Builder setECMFolderType(
                java.lang.String value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
              eCMFolderType_ = value;
              onChanged();
              return this;
            }
            /**
             * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
             */
            public Builder clearECMFolderType() {
              bitField0_ = (bitField0_ & ~0x00000002);
              eCMFolderType_ = getDefaultInstance().getECMFolderType();
              onChanged();
              return this;
            }
            /**
             * <code>required string ECMFolderType = 1 [(.validation.regex) = ""];</code>
             */
            public Builder setECMFolderTypeBytes(
                com.google.protobuf.ByteString value) {
              if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
              eCMFolderType_ = value;
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


            // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM)
          }

          // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM)
          private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM DEFAULT_INSTANCE;
          static {
            DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM();
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM getDefaultInstance() {
            return DEFAULT_INSTANCE;
          }

          @java.lang.Deprecated public static final com.google.protobuf.Parser<ECM>
              PARSER = new com.google.protobuf.AbstractParser<ECM>() {
            @java.lang.Override
            public ECM parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new ECM(input, extensionRegistry);
            }
          };

          public static com.google.protobuf.Parser<ECM> parser() {
            return PARSER;
          }

          @java.lang.Override
          public com.google.protobuf.Parser<ECM> getParserForType() {
            return PARSER;
          }

          @java.lang.Override
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
          }

        }

        public interface DYNAMICFIELDSOrBuilder extends
            // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS)
            com.google.protobuf.MessageOrBuilder {

          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD> 
              getDynamicFieldList();
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD getDynamicField(int index);
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          int getDynamicFieldCount();
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
              getDynamicFieldOrBuilderList();
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder getDynamicFieldOrBuilder(
              int index);
        }
        /**
         * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS}
         */
        public  static final class DYNAMICFIELDS extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS)
            DYNAMICFIELDSOrBuilder {
        private static final long serialVersionUID = 0L;
          // Use DYNAMICFIELDS.newBuilder() to construct.
          private DYNAMICFIELDS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
          }
          private DYNAMICFIELDS() {
            dynamicField_ = java.util.Collections.emptyList();
          }

          @java.lang.Override
          public final com.google.protobuf.UnknownFieldSet
          getUnknownFields() {
            return this.unknownFields;
          }
          private DYNAMICFIELDS(
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
                  case 290: {
                    if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                      dynamicField_ = new java.util.ArrayList<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD>();
                      mutable_bitField0_ |= 0x00000001;
                    }
                    dynamicField_.add(
                        input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.PARSER, extensionRegistry));
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
              if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                dynamicField_ = java.util.Collections.unmodifiableList(dynamicField_);
              }
              this.unknownFields = unknownFields.build();
              makeExtensionsImmutable();
            }
          }
          public static final com.google.protobuf.Descriptors.Descriptor
              getDescriptor() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_descriptor;
          }

          @java.lang.Override
          protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
              internalGetFieldAccessorTable() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder.class);
          }

          public interface DYNAMICFIELDOrBuilder extends
              // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD)
              com.google.protobuf.MessageOrBuilder {

            /**
             * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
             */
            boolean hasDFId();
            /**
             * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
             */
            java.lang.String getDFId();
            /**
             * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
             */
            com.google.protobuf.ByteString
                getDFIdBytes();

            /**
             * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
             */
            boolean hasDFName();
            /**
             * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
             */
            java.lang.String getDFName();
            /**
             * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
             */
            com.google.protobuf.ByteString
                getDFNameBytes();

            /**
             * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
             */
            boolean hasDFValue();
            /**
             * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
             */
            java.lang.String getDFValue();
            /**
             * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
             */
            com.google.protobuf.ByteString
                getDFValueBytes();
          }
          /**
           * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD}
           */
          public  static final class DYNAMICFIELD extends
              com.google.protobuf.GeneratedMessageV3 implements
              // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD)
              DYNAMICFIELDOrBuilder {
          private static final long serialVersionUID = 0L;
            // Use DYNAMICFIELD.newBuilder() to construct.
            private DYNAMICFIELD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
              super(builder);
            }
            private DYNAMICFIELD() {
              dFId_ = "";
              dFName_ = "";
              dFValue_ = "";
            }

            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
              return this.unknownFields;
            }
            private DYNAMICFIELD(
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
                      com.google.protobuf.ByteString bs = input.readBytes();
                      bitField0_ |= 0x00000002;
                      dFName_ = bs;
                      break;
                    }
                    case 18: {
                      com.google.protobuf.ByteString bs = input.readBytes();
                      bitField0_ |= 0x00000004;
                      dFValue_ = bs;
                      break;
                    }
                    case 282: {
                      com.google.protobuf.ByteString bs = input.readBytes();
                      bitField0_ |= 0x00000001;
                      dFId_ = bs;
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
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(
                      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder.class);
            }

            private int bitField0_;
            public static final int DFID_FIELD_NUMBER = 35;
            private volatile java.lang.Object dFId_;
            /**
             * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
             */
            public boolean hasDFId() {
              return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getDFId() {
              java.lang.Object ref = dFId_;
              if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
              } else {
                com.google.protobuf.ByteString bs = 
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  dFId_ = s;
                }
                return s;
              }
            }
            /**
             * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getDFIdBytes() {
              java.lang.Object ref = dFId_;
              if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                dFId_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }

            public static final int DFNAME_FIELD_NUMBER = 1;
            private volatile java.lang.Object dFName_;
            /**
             * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
             */
            public boolean hasDFName() {
              return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getDFName() {
              java.lang.Object ref = dFName_;
              if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
              } else {
                com.google.protobuf.ByteString bs = 
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  dFName_ = s;
                }
                return s;
              }
            }
            /**
             * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getDFNameBytes() {
              java.lang.Object ref = dFName_;
              if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                dFName_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }

            public static final int DFVALUE_FIELD_NUMBER = 2;
            private volatile java.lang.Object dFValue_;
            /**
             * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
             */
            public boolean hasDFValue() {
              return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getDFValue() {
              java.lang.Object ref = dFValue_;
              if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
              } else {
                com.google.protobuf.ByteString bs = 
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  dFValue_ = s;
                }
                return s;
              }
            }
            /**
             * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getDFValueBytes() {
              java.lang.Object ref = dFValue_;
              if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                dFValue_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }

            private byte memoizedIsInitialized = -1;
            @java.lang.Override
            public final boolean isInitialized() {
              byte isInitialized = memoizedIsInitialized;
              if (isInitialized == 1) return true;
              if (isInitialized == 0) return false;

              if (!hasDFId()) {
                memoizedIsInitialized = 0;
                return false;
              }
              if (!hasDFName()) {
                memoizedIsInitialized = 0;
                return false;
              }
              if (!hasDFValue()) {
                memoizedIsInitialized = 0;
                return false;
              }
              memoizedIsInitialized = 1;
              return true;
            }

            @java.lang.Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                                throws java.io.IOException {
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dFName_);
              }
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dFValue_);
              }
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 35, dFId_);
              }
              unknownFields.writeTo(output);
            }

            @java.lang.Override
            public int getSerializedSize() {
              int size = memoizedSize;
              if (size != -1) return size;

              size = 0;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dFName_);
              }
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dFValue_);
              }
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(35, dFId_);
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
              if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD)) {
                return super.equals(obj);
              }
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD) obj;

              boolean result = true;
              result = result && (hasDFId() == other.hasDFId());
              if (hasDFId()) {
                result = result && getDFId()
                    .equals(other.getDFId());
              }
              result = result && (hasDFName() == other.hasDFName());
              if (hasDFName()) {
                result = result && getDFName()
                    .equals(other.getDFName());
              }
              result = result && (hasDFValue() == other.hasDFValue());
              if (hasDFValue()) {
                result = result && getDFValue()
                    .equals(other.getDFValue());
              }
              result = result && unknownFields.equals(other.unknownFields);
              return result;
            }

            @java.lang.Override
            public int hashCode() {
              if (memoizedHashCode != 0) {
                return memoizedHashCode;
              }
              int hash = 41;
              hash = (19 * hash) + getDescriptor().hashCode();
              if (hasDFId()) {
                hash = (37 * hash) + DFID_FIELD_NUMBER;
                hash = (53 * hash) + getDFId().hashCode();
              }
              if (hasDFName()) {
                hash = (37 * hash) + DFNAME_FIELD_NUMBER;
                hash = (53 * hash) + getDFName().hashCode();
              }
              if (hasDFValue()) {
                hash = (37 * hash) + DFVALUE_FIELD_NUMBER;
                hash = (53 * hash) + getDFValue().hashCode();
              }
              hash = (29 * hash) + unknownFields.hashCode();
              memoizedHashCode = hash;
              return hash;
            }

            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(java.io.InputStream input)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseWithIOException(PARSER, input);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseDelimitedWithIOException(PARSER, input);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseWithIOException(PARSER, input);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parseFrom(
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
            public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD prototype) {
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
             * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD}
             */
            public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD)
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder {
              public static final com.google.protobuf.Descriptors.Descriptor
                  getDescriptor() {
                return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_descriptor;
              }

              @java.lang.Override
              protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                  internalGetFieldAccessorTable() {
                return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder.class);
              }

              // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.newBuilder()
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
                dFId_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                dFName_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                dFValue_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
              }

              @java.lang.Override
              public com.google.protobuf.Descriptors.Descriptor
                  getDescriptorForType() {
                return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_descriptor;
              }

              @java.lang.Override
              public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD getDefaultInstanceForType() {
                return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance();
              }

              @java.lang.Override
              public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD build() {
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD result = buildPartial();
                if (!result.isInitialized()) {
                  throw newUninitializedMessageException(result);
                }
                return result;
              }

              @java.lang.Override
              public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD buildPartial() {
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                  to_bitField0_ |= 0x00000001;
                }
                result.dFId_ = dFId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                  to_bitField0_ |= 0x00000002;
                }
                result.dFName_ = dFName_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                  to_bitField0_ |= 0x00000004;
                }
                result.dFValue_ = dFValue_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
              }

              @java.lang.Override
              public Builder clone() {
                return (Builder) super.clone();
              }
              @java.lang.Override
              public Builder setField(
                  com.google.protobuf.Descriptors.FieldDescriptor field,
                  java.lang.Object value) {
                return (Builder) super.setField(field, value);
              }
              @java.lang.Override
              public Builder clearField(
                  com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
              }
              @java.lang.Override
              public Builder clearOneof(
                  com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
              }
              @java.lang.Override
              public Builder setRepeatedField(
                  com.google.protobuf.Descriptors.FieldDescriptor field,
                  int index, java.lang.Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
              }
              @java.lang.Override
              public Builder addRepeatedField(
                  com.google.protobuf.Descriptors.FieldDescriptor field,
                  java.lang.Object value) {
                return (Builder) super.addRepeatedField(field, value);
              }
              @java.lang.Override
              public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD) {
                  return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD)other);
                } else {
                  super.mergeFrom(other);
                  return this;
                }
              }

              public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD other) {
                if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance()) return this;
                if (other.hasDFId()) {
                  bitField0_ |= 0x00000001;
                  dFId_ = other.dFId_;
                  onChanged();
                }
                if (other.hasDFName()) {
                  bitField0_ |= 0x00000002;
                  dFName_ = other.dFName_;
                  onChanged();
                }
                if (other.hasDFValue()) {
                  bitField0_ |= 0x00000004;
                  dFValue_ = other.dFValue_;
                  onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
              }

              @java.lang.Override
              public final boolean isInitialized() {
                if (!hasDFId()) {
                  return false;
                }
                if (!hasDFName()) {
                  return false;
                }
                if (!hasDFValue()) {
                  return false;
                }
                return true;
              }

              @java.lang.Override
              public Builder mergeFrom(
                  com.google.protobuf.CodedInputStream input,
                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                  throws java.io.IOException {
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD parsedMessage = null;
                try {
                  parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                  parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD) e.getUnfinishedMessage();
                  throw e.unwrapIOException();
                } finally {
                  if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                  }
                }
                return this;
              }
              private int bitField0_;

              private java.lang.Object dFId_ = "";
              /**
               * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
               */
              public boolean hasDFId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
              }
              /**
               * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
               */
              public java.lang.String getDFId() {
                java.lang.Object ref = dFId_;
                if (!(ref instanceof java.lang.String)) {
                  com.google.protobuf.ByteString bs =
                      (com.google.protobuf.ByteString) ref;
                  java.lang.String s = bs.toStringUtf8();
                  if (bs.isValidUtf8()) {
                    dFId_ = s;
                  }
                  return s;
                } else {
                  return (java.lang.String) ref;
                }
              }
              /**
               * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
               */
              public com.google.protobuf.ByteString
                  getDFIdBytes() {
                java.lang.Object ref = dFId_;
                if (ref instanceof String) {
                  com.google.protobuf.ByteString b = 
                      com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
                  dFId_ = b;
                  return b;
                } else {
                  return (com.google.protobuf.ByteString) ref;
                }
              }
              /**
               * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
               */
              public Builder setDFId(
                  java.lang.String value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
                dFId_ = value;
                onChanged();
                return this;
              }
              /**
               * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
               */
              public Builder clearDFId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                dFId_ = getDefaultInstance().getDFId();
                onChanged();
                return this;
              }
              /**
               * <code>required string DFId = 35 [(.validation.regex) = ""];</code>
               */
              public Builder setDFIdBytes(
                  com.google.protobuf.ByteString value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
                dFId_ = value;
                onChanged();
                return this;
              }

              private java.lang.Object dFName_ = "";
              /**
               * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
               */
              public boolean hasDFName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
              }
              /**
               * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
               */
              public java.lang.String getDFName() {
                java.lang.Object ref = dFName_;
                if (!(ref instanceof java.lang.String)) {
                  com.google.protobuf.ByteString bs =
                      (com.google.protobuf.ByteString) ref;
                  java.lang.String s = bs.toStringUtf8();
                  if (bs.isValidUtf8()) {
                    dFName_ = s;
                  }
                  return s;
                } else {
                  return (java.lang.String) ref;
                }
              }
              /**
               * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
               */
              public com.google.protobuf.ByteString
                  getDFNameBytes() {
                java.lang.Object ref = dFName_;
                if (ref instanceof String) {
                  com.google.protobuf.ByteString b = 
                      com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
                  dFName_ = b;
                  return b;
                } else {
                  return (com.google.protobuf.ByteString) ref;
                }
              }
              /**
               * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
               */
              public Builder setDFName(
                  java.lang.String value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
                dFName_ = value;
                onChanged();
                return this;
              }
              /**
               * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
               */
              public Builder clearDFName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                dFName_ = getDefaultInstance().getDFName();
                onChanged();
                return this;
              }
              /**
               * <code>required string DFName = 1 [(.validation.regex) = ""];</code>
               */
              public Builder setDFNameBytes(
                  com.google.protobuf.ByteString value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
                dFName_ = value;
                onChanged();
                return this;
              }

              private java.lang.Object dFValue_ = "";
              /**
               * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
               */
              public boolean hasDFValue() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
              }
              /**
               * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
               */
              public java.lang.String getDFValue() {
                java.lang.Object ref = dFValue_;
                if (!(ref instanceof java.lang.String)) {
                  com.google.protobuf.ByteString bs =
                      (com.google.protobuf.ByteString) ref;
                  java.lang.String s = bs.toStringUtf8();
                  if (bs.isValidUtf8()) {
                    dFValue_ = s;
                  }
                  return s;
                } else {
                  return (java.lang.String) ref;
                }
              }
              /**
               * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
               */
              public com.google.protobuf.ByteString
                  getDFValueBytes() {
                java.lang.Object ref = dFValue_;
                if (ref instanceof String) {
                  com.google.protobuf.ByteString b = 
                      com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
                  dFValue_ = b;
                  return b;
                } else {
                  return (com.google.protobuf.ByteString) ref;
                }
              }
              /**
               * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
               */
              public Builder setDFValue(
                  java.lang.String value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
                dFValue_ = value;
                onChanged();
                return this;
              }
              /**
               * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
               */
              public Builder clearDFValue() {
                bitField0_ = (bitField0_ & ~0x00000004);
                dFValue_ = getDefaultInstance().getDFValue();
                onChanged();
                return this;
              }
              /**
               * <code>required string DFValue = 2 [(.validation.regex) = ""];</code>
               */
              public Builder setDFValueBytes(
                  com.google.protobuf.ByteString value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
                dFValue_ = value;
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


              // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD)
            }

            // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD)
            private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DEFAULT_INSTANCE;
            static {
              DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD();
            }

            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD getDefaultInstance() {
              return DEFAULT_INSTANCE;
            }

            @java.lang.Deprecated public static final com.google.protobuf.Parser<DYNAMICFIELD>
                PARSER = new com.google.protobuf.AbstractParser<DYNAMICFIELD>() {
              @java.lang.Override
              public DYNAMICFIELD parsePartialFrom(
                  com.google.protobuf.CodedInputStream input,
                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                  throws com.google.protobuf.InvalidProtocolBufferException {
                return new DYNAMICFIELD(input, extensionRegistry);
              }
            };

            public static com.google.protobuf.Parser<DYNAMICFIELD> parser() {
              return PARSER;
            }

            @java.lang.Override
            public com.google.protobuf.Parser<DYNAMICFIELD> getParserForType() {
              return PARSER;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD getDefaultInstanceForType() {
              return DEFAULT_INSTANCE;
            }

          }

          public static final int DYNAMICFIELD_FIELD_NUMBER = 36;
          private java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD> dynamicField_;
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD> getDynamicFieldList() {
            return dynamicField_;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
              getDynamicFieldOrBuilderList() {
            return dynamicField_;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public int getDynamicFieldCount() {
            return dynamicField_.size();
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD getDynamicField(int index) {
            return dynamicField_.get(index);
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder getDynamicFieldOrBuilder(
              int index) {
            return dynamicField_.get(index);
          }

          private byte memoizedIsInitialized = -1;
          @java.lang.Override
          public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            for (int i = 0; i < getDynamicFieldCount(); i++) {
              if (!getDynamicField(i).isInitialized()) {
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
            for (int i = 0; i < dynamicField_.size(); i++) {
              output.writeMessage(36, dynamicField_.get(i));
            }
            unknownFields.writeTo(output);
          }

          @java.lang.Override
          public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < dynamicField_.size(); i++) {
              size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(36, dynamicField_.get(i));
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
            if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS)) {
              return super.equals(obj);
            }
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS) obj;

            boolean result = true;
            result = result && getDynamicFieldList()
                .equals(other.getDynamicFieldList());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
          }

          @java.lang.Override
          public int hashCode() {
            if (memoizedHashCode != 0) {
              return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getDynamicFieldCount() > 0) {
              hash = (37 * hash) + DYNAMICFIELD_FIELD_NUMBER;
              hash = (53 * hash) + getDynamicFieldList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
              java.nio.ByteBuffer data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
              java.nio.ByteBuffer data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
              com.google.protobuf.ByteString data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
              com.google.protobuf.ByteString data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(byte[] data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
              byte[] data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseDelimitedFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseDelimitedFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
              com.google.protobuf.CodedInputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parseFrom(
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
          public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS prototype) {
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
           * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS}
           */
          public static final class Builder extends
              com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
              // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS)
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDSOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(
                      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder.class);
            }

            // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.newBuilder()
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
                getDynamicFieldFieldBuilder();
              }
            }
            @java.lang.Override
            public Builder clear() {
              super.clear();
              if (dynamicFieldBuilder_ == null) {
                dynamicField_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
              } else {
                dynamicFieldBuilder_.clear();
              }
              return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_descriptor;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS getDefaultInstanceForType() {
              return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.getDefaultInstance();
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS build() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS result = buildPartial();
              if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
              }
              return result;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS buildPartial() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS(this);
              int from_bitField0_ = bitField0_;
              if (dynamicFieldBuilder_ == null) {
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  dynamicField_ = java.util.Collections.unmodifiableList(dynamicField_);
                  bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.dynamicField_ = dynamicField_;
              } else {
                result.dynamicField_ = dynamicFieldBuilder_.build();
              }
              onBuilt();
              return result;
            }

            @java.lang.Override
            public Builder clone() {
              return (Builder) super.clone();
            }
            @java.lang.Override
            public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
              return (Builder) super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
              return (Builder) super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
              return (Builder) super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
              if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS) {
                return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS)other);
              } else {
                super.mergeFrom(other);
                return this;
              }
            }

            public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS other) {
              if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.getDefaultInstance()) return this;
              if (dynamicFieldBuilder_ == null) {
                if (!other.dynamicField_.isEmpty()) {
                  if (dynamicField_.isEmpty()) {
                    dynamicField_ = other.dynamicField_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                  } else {
                    ensureDynamicFieldIsMutable();
                    dynamicField_.addAll(other.dynamicField_);
                  }
                  onChanged();
                }
              } else {
                if (!other.dynamicField_.isEmpty()) {
                  if (dynamicFieldBuilder_.isEmpty()) {
                    dynamicFieldBuilder_.dispose();
                    dynamicFieldBuilder_ = null;
                    dynamicField_ = other.dynamicField_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    dynamicFieldBuilder_ = 
                      com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                         getDynamicFieldFieldBuilder() : null;
                  } else {
                    dynamicFieldBuilder_.addAllMessages(other.dynamicField_);
                  }
                }
              }
              this.mergeUnknownFields(other.unknownFields);
              onChanged();
              return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
              for (int i = 0; i < getDynamicFieldCount(); i++) {
                if (!getDynamicField(i).isInitialized()) {
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
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS parsedMessage = null;
              try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS) e.getUnfinishedMessage();
                throw e.unwrapIOException();
              } finally {
                if (parsedMessage != null) {
                  mergeFrom(parsedMessage);
                }
              }
              return this;
            }
            private int bitField0_;

            private java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD> dynamicField_ =
              java.util.Collections.emptyList();
            private void ensureDynamicFieldIsMutable() {
              if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                dynamicField_ = new java.util.ArrayList<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD>(dynamicField_);
                bitField0_ |= 0x00000001;
               }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder> dynamicFieldBuilder_;

            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD> getDynamicFieldList() {
              if (dynamicFieldBuilder_ == null) {
                return java.util.Collections.unmodifiableList(dynamicField_);
              } else {
                return dynamicFieldBuilder_.getMessageList();
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public int getDynamicFieldCount() {
              if (dynamicFieldBuilder_ == null) {
                return dynamicField_.size();
              } else {
                return dynamicFieldBuilder_.getCount();
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD getDynamicField(int index) {
              if (dynamicFieldBuilder_ == null) {
                return dynamicField_.get(index);
              } else {
                return dynamicFieldBuilder_.getMessage(index);
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder setDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD value) {
              if (dynamicFieldBuilder_ == null) {
                if (value == null) {
                  throw new NullPointerException();
                }
                ensureDynamicFieldIsMutable();
                dynamicField_.set(index, value);
                onChanged();
              } else {
                dynamicFieldBuilder_.setMessage(index, value);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder setDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder builderForValue) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.set(index, builderForValue.build());
                onChanged();
              } else {
                dynamicFieldBuilder_.setMessage(index, builderForValue.build());
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD value) {
              if (dynamicFieldBuilder_ == null) {
                if (value == null) {
                  throw new NullPointerException();
                }
                ensureDynamicFieldIsMutable();
                dynamicField_.add(value);
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(value);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD value) {
              if (dynamicFieldBuilder_ == null) {
                if (value == null) {
                  throw new NullPointerException();
                }
                ensureDynamicFieldIsMutable();
                dynamicField_.add(index, value);
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(index, value);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder builderForValue) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.add(builderForValue.build());
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(builderForValue.build());
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder builderForValue) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.add(index, builderForValue.build());
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(index, builderForValue.build());
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addAllDynamicField(
                java.lang.Iterable<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD> values) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, dynamicField_);
                onChanged();
              } else {
                dynamicFieldBuilder_.addAllMessages(values);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder clearDynamicField() {
              if (dynamicFieldBuilder_ == null) {
                dynamicField_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
              } else {
                dynamicFieldBuilder_.clear();
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder removeDynamicField(int index) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.remove(index);
                onChanged();
              } else {
                dynamicFieldBuilder_.remove(index);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder getDynamicFieldBuilder(
                int index) {
              return getDynamicFieldFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder getDynamicFieldOrBuilder(
                int index) {
              if (dynamicFieldBuilder_ == null) {
                return dynamicField_.get(index);  } else {
                return dynamicFieldBuilder_.getMessageOrBuilder(index);
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
                 getDynamicFieldOrBuilderList() {
              if (dynamicFieldBuilder_ != null) {
                return dynamicFieldBuilder_.getMessageOrBuilderList();
              } else {
                return java.util.Collections.unmodifiableList(dynamicField_);
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder addDynamicFieldBuilder() {
              return getDynamicFieldFieldBuilder().addBuilder(
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance());
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder addDynamicFieldBuilder(
                int index) {
              return getDynamicFieldFieldBuilder().addBuilder(
                  index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance());
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD DynamicField = 36 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder> 
                 getDynamicFieldBuilderList() {
              return getDynamicFieldFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
                getDynamicFieldFieldBuilder() {
              if (dynamicFieldBuilder_ == null) {
                dynamicFieldBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELD.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.DYNAMICFIELDOrBuilder>(
                        dynamicField_,
                        ((bitField0_ & 0x00000001) == 0x00000001),
                        getParentForChildren(),
                        isClean());
                dynamicField_ = null;
              }
              return dynamicFieldBuilder_;
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


            // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS)
          }

          // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS)
          private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DEFAULT_INSTANCE;
          static {
            DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS();
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS getDefaultInstance() {
            return DEFAULT_INSTANCE;
          }

          @java.lang.Deprecated public static final com.google.protobuf.Parser<DYNAMICFIELDS>
              PARSER = new com.google.protobuf.AbstractParser<DYNAMICFIELDS>() {
            @java.lang.Override
            public DYNAMICFIELDS parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new DYNAMICFIELDS(input, extensionRegistry);
            }
          };

          public static com.google.protobuf.Parser<DYNAMICFIELDS> parser() {
            return PARSER;
          }

          @java.lang.Override
          public com.google.protobuf.Parser<DYNAMICFIELDS> getParserForType() {
            return PARSER;
          }

          @java.lang.Override
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
          }

        }

        public interface SBDYNAMICFIELDSOrBuilder extends
            // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS)
            com.google.protobuf.MessageOrBuilder {

          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD> 
              getDynamicFieldList();
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD getDynamicField(int index);
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          int getDynamicFieldCount();
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
              getDynamicFieldOrBuilderList();
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder getDynamicFieldOrBuilder(
              int index);
        }
        /**
         * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS}
         */
        public  static final class SBDYNAMICFIELDS extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS)
            SBDYNAMICFIELDSOrBuilder {
        private static final long serialVersionUID = 0L;
          // Use SBDYNAMICFIELDS.newBuilder() to construct.
          private SBDYNAMICFIELDS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
          }
          private SBDYNAMICFIELDS() {
            dynamicField_ = java.util.Collections.emptyList();
          }

          @java.lang.Override
          public final com.google.protobuf.UnknownFieldSet
          getUnknownFields() {
            return this.unknownFields;
          }
          private SBDYNAMICFIELDS(
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
                  case 306: {
                    if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                      dynamicField_ = new java.util.ArrayList<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD>();
                      mutable_bitField0_ |= 0x00000001;
                    }
                    dynamicField_.add(
                        input.readMessage(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.PARSER, extensionRegistry));
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
              if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                dynamicField_ = java.util.Collections.unmodifiableList(dynamicField_);
              }
              this.unknownFields = unknownFields.build();
              makeExtensionsImmutable();
            }
          }
          public static final com.google.protobuf.Descriptors.Descriptor
              getDescriptor() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_descriptor;
          }

          @java.lang.Override
          protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
              internalGetFieldAccessorTable() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder.class);
          }

          public interface DYNAMICFIELDOrBuilder extends
              // @@protoc_insertion_point(interface_extends:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD)
              com.google.protobuf.MessageOrBuilder {

            /**
             * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
             */
            boolean hasSbDFId();
            /**
             * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
             */
            java.lang.String getSbDFId();
            /**
             * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
             */
            com.google.protobuf.ByteString
                getSbDFIdBytes();

            /**
             * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
             */
            boolean hasSbDFName();
            /**
             * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
             */
            java.lang.String getSbDFName();
            /**
             * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
             */
            com.google.protobuf.ByteString
                getSbDFNameBytes();

            /**
             * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
             */
            boolean hasSbDFValue();
            /**
             * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
             */
            java.lang.String getSbDFValue();
            /**
             * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
             */
            com.google.protobuf.ByteString
                getSbDFValueBytes();
          }
          /**
           * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD}
           */
          public  static final class DYNAMICFIELD extends
              com.google.protobuf.GeneratedMessageV3 implements
              // @@protoc_insertion_point(message_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD)
              DYNAMICFIELDOrBuilder {
          private static final long serialVersionUID = 0L;
            // Use DYNAMICFIELD.newBuilder() to construct.
            private DYNAMICFIELD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
              super(builder);
            }
            private DYNAMICFIELD() {
              sbDFId_ = "";
              sbDFName_ = "";
              sbDFValue_ = "";
            }

            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
              return this.unknownFields;
            }
            private DYNAMICFIELD(
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
                      com.google.protobuf.ByteString bs = input.readBytes();
                      bitField0_ |= 0x00000002;
                      sbDFName_ = bs;
                      break;
                    }
                    case 18: {
                      com.google.protobuf.ByteString bs = input.readBytes();
                      bitField0_ |= 0x00000004;
                      sbDFValue_ = bs;
                      break;
                    }
                    case 298: {
                      com.google.protobuf.ByteString bs = input.readBytes();
                      bitField0_ |= 0x00000001;
                      sbDFId_ = bs;
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
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(
                      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder.class);
            }

            private int bitField0_;
            public static final int SBDFID_FIELD_NUMBER = 37;
            private volatile java.lang.Object sbDFId_;
            /**
             * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
             */
            public boolean hasSbDFId() {
              return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getSbDFId() {
              java.lang.Object ref = sbDFId_;
              if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
              } else {
                com.google.protobuf.ByteString bs = 
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  sbDFId_ = s;
                }
                return s;
              }
            }
            /**
             * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getSbDFIdBytes() {
              java.lang.Object ref = sbDFId_;
              if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                sbDFId_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }

            public static final int SBDFNAME_FIELD_NUMBER = 1;
            private volatile java.lang.Object sbDFName_;
            /**
             * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
             */
            public boolean hasSbDFName() {
              return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getSbDFName() {
              java.lang.Object ref = sbDFName_;
              if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
              } else {
                com.google.protobuf.ByteString bs = 
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  sbDFName_ = s;
                }
                return s;
              }
            }
            /**
             * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getSbDFNameBytes() {
              java.lang.Object ref = sbDFName_;
              if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                sbDFName_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }

            public static final int SBDFVALUE_FIELD_NUMBER = 2;
            private volatile java.lang.Object sbDFValue_;
            /**
             * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
             */
            public boolean hasSbDFValue() {
              return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
             */
            public java.lang.String getSbDFValue() {
              java.lang.Object ref = sbDFValue_;
              if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
              } else {
                com.google.protobuf.ByteString bs = 
                    (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                  sbDFValue_ = s;
                }
                return s;
              }
            }
            /**
             * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
             */
            public com.google.protobuf.ByteString
                getSbDFValueBytes() {
              java.lang.Object ref = sbDFValue_;
              if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
                sbDFValue_ = b;
                return b;
              } else {
                return (com.google.protobuf.ByteString) ref;
              }
            }

            private byte memoizedIsInitialized = -1;
            @java.lang.Override
            public final boolean isInitialized() {
              byte isInitialized = memoizedIsInitialized;
              if (isInitialized == 1) return true;
              if (isInitialized == 0) return false;

              if (!hasSbDFId()) {
                memoizedIsInitialized = 0;
                return false;
              }
              if (!hasSbDFName()) {
                memoizedIsInitialized = 0;
                return false;
              }
              if (!hasSbDFValue()) {
                memoizedIsInitialized = 0;
                return false;
              }
              memoizedIsInitialized = 1;
              return true;
            }

            @java.lang.Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                                throws java.io.IOException {
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sbDFName_);
              }
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sbDFValue_);
              }
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 37, sbDFId_);
              }
              unknownFields.writeTo(output);
            }

            @java.lang.Override
            public int getSerializedSize() {
              int size = memoizedSize;
              if (size != -1) return size;

              size = 0;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sbDFName_);
              }
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sbDFValue_);
              }
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(37, sbDFId_);
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
              if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD)) {
                return super.equals(obj);
              }
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD) obj;

              boolean result = true;
              result = result && (hasSbDFId() == other.hasSbDFId());
              if (hasSbDFId()) {
                result = result && getSbDFId()
                    .equals(other.getSbDFId());
              }
              result = result && (hasSbDFName() == other.hasSbDFName());
              if (hasSbDFName()) {
                result = result && getSbDFName()
                    .equals(other.getSbDFName());
              }
              result = result && (hasSbDFValue() == other.hasSbDFValue());
              if (hasSbDFValue()) {
                result = result && getSbDFValue()
                    .equals(other.getSbDFValue());
              }
              result = result && unknownFields.equals(other.unknownFields);
              return result;
            }

            @java.lang.Override
            public int hashCode() {
              if (memoizedHashCode != 0) {
                return memoizedHashCode;
              }
              int hash = 41;
              hash = (19 * hash) + getDescriptor().hashCode();
              if (hasSbDFId()) {
                hash = (37 * hash) + SBDFID_FIELD_NUMBER;
                hash = (53 * hash) + getSbDFId().hashCode();
              }
              if (hasSbDFName()) {
                hash = (37 * hash) + SBDFNAME_FIELD_NUMBER;
                hash = (53 * hash) + getSbDFName().hashCode();
              }
              if (hasSbDFValue()) {
                hash = (37 * hash) + SBDFVALUE_FIELD_NUMBER;
                hash = (53 * hash) + getSbDFValue().hashCode();
              }
              hash = (29 * hash) + unknownFields.hashCode();
              memoizedHashCode = hash;
              return hash;
            }

            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(java.io.InputStream input)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseWithIOException(PARSER, input);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseDelimitedWithIOException(PARSER, input);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
              return com.google.protobuf.GeneratedMessageV3
                  .parseWithIOException(PARSER, input);
            }
            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parseFrom(
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
            public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD prototype) {
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
             * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD}
             */
            public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD)
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder {
              public static final com.google.protobuf.Descriptors.Descriptor
                  getDescriptor() {
                return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_descriptor;
              }

              @java.lang.Override
              protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                  internalGetFieldAccessorTable() {
                return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder.class);
              }

              // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.newBuilder()
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
                sbDFId_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                sbDFName_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                sbDFValue_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
              }

              @java.lang.Override
              public com.google.protobuf.Descriptors.Descriptor
                  getDescriptorForType() {
                return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_descriptor;
              }

              @java.lang.Override
              public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD getDefaultInstanceForType() {
                return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance();
              }

              @java.lang.Override
              public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD build() {
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD result = buildPartial();
                if (!result.isInitialized()) {
                  throw newUninitializedMessageException(result);
                }
                return result;
              }

              @java.lang.Override
              public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD buildPartial() {
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                  to_bitField0_ |= 0x00000001;
                }
                result.sbDFId_ = sbDFId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                  to_bitField0_ |= 0x00000002;
                }
                result.sbDFName_ = sbDFName_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                  to_bitField0_ |= 0x00000004;
                }
                result.sbDFValue_ = sbDFValue_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
              }

              @java.lang.Override
              public Builder clone() {
                return (Builder) super.clone();
              }
              @java.lang.Override
              public Builder setField(
                  com.google.protobuf.Descriptors.FieldDescriptor field,
                  java.lang.Object value) {
                return (Builder) super.setField(field, value);
              }
              @java.lang.Override
              public Builder clearField(
                  com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
              }
              @java.lang.Override
              public Builder clearOneof(
                  com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
              }
              @java.lang.Override
              public Builder setRepeatedField(
                  com.google.protobuf.Descriptors.FieldDescriptor field,
                  int index, java.lang.Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
              }
              @java.lang.Override
              public Builder addRepeatedField(
                  com.google.protobuf.Descriptors.FieldDescriptor field,
                  java.lang.Object value) {
                return (Builder) super.addRepeatedField(field, value);
              }
              @java.lang.Override
              public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD) {
                  return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD)other);
                } else {
                  super.mergeFrom(other);
                  return this;
                }
              }

              public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD other) {
                if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance()) return this;
                if (other.hasSbDFId()) {
                  bitField0_ |= 0x00000001;
                  sbDFId_ = other.sbDFId_;
                  onChanged();
                }
                if (other.hasSbDFName()) {
                  bitField0_ |= 0x00000002;
                  sbDFName_ = other.sbDFName_;
                  onChanged();
                }
                if (other.hasSbDFValue()) {
                  bitField0_ |= 0x00000004;
                  sbDFValue_ = other.sbDFValue_;
                  onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
              }

              @java.lang.Override
              public final boolean isInitialized() {
                if (!hasSbDFId()) {
                  return false;
                }
                if (!hasSbDFName()) {
                  return false;
                }
                if (!hasSbDFValue()) {
                  return false;
                }
                return true;
              }

              @java.lang.Override
              public Builder mergeFrom(
                  com.google.protobuf.CodedInputStream input,
                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                  throws java.io.IOException {
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD parsedMessage = null;
                try {
                  parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                  parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD) e.getUnfinishedMessage();
                  throw e.unwrapIOException();
                } finally {
                  if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                  }
                }
                return this;
              }
              private int bitField0_;

              private java.lang.Object sbDFId_ = "";
              /**
               * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
               */
              public boolean hasSbDFId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
              }
              /**
               * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
               */
              public java.lang.String getSbDFId() {
                java.lang.Object ref = sbDFId_;
                if (!(ref instanceof java.lang.String)) {
                  com.google.protobuf.ByteString bs =
                      (com.google.protobuf.ByteString) ref;
                  java.lang.String s = bs.toStringUtf8();
                  if (bs.isValidUtf8()) {
                    sbDFId_ = s;
                  }
                  return s;
                } else {
                  return (java.lang.String) ref;
                }
              }
              /**
               * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
               */
              public com.google.protobuf.ByteString
                  getSbDFIdBytes() {
                java.lang.Object ref = sbDFId_;
                if (ref instanceof String) {
                  com.google.protobuf.ByteString b = 
                      com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
                  sbDFId_ = b;
                  return b;
                } else {
                  return (com.google.protobuf.ByteString) ref;
                }
              }
              /**
               * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
               */
              public Builder setSbDFId(
                  java.lang.String value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
                sbDFId_ = value;
                onChanged();
                return this;
              }
              /**
               * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
               */
              public Builder clearSbDFId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sbDFId_ = getDefaultInstance().getSbDFId();
                onChanged();
                return this;
              }
              /**
               * <code>required string SbDFId = 37 [(.validation.regex) = ""];</code>
               */
              public Builder setSbDFIdBytes(
                  com.google.protobuf.ByteString value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
                sbDFId_ = value;
                onChanged();
                return this;
              }

              private java.lang.Object sbDFName_ = "";
              /**
               * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
               */
              public boolean hasSbDFName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
              }
              /**
               * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
               */
              public java.lang.String getSbDFName() {
                java.lang.Object ref = sbDFName_;
                if (!(ref instanceof java.lang.String)) {
                  com.google.protobuf.ByteString bs =
                      (com.google.protobuf.ByteString) ref;
                  java.lang.String s = bs.toStringUtf8();
                  if (bs.isValidUtf8()) {
                    sbDFName_ = s;
                  }
                  return s;
                } else {
                  return (java.lang.String) ref;
                }
              }
              /**
               * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
               */
              public com.google.protobuf.ByteString
                  getSbDFNameBytes() {
                java.lang.Object ref = sbDFName_;
                if (ref instanceof String) {
                  com.google.protobuf.ByteString b = 
                      com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
                  sbDFName_ = b;
                  return b;
                } else {
                  return (com.google.protobuf.ByteString) ref;
                }
              }
              /**
               * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
               */
              public Builder setSbDFName(
                  java.lang.String value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
                sbDFName_ = value;
                onChanged();
                return this;
              }
              /**
               * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
               */
              public Builder clearSbDFName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                sbDFName_ = getDefaultInstance().getSbDFName();
                onChanged();
                return this;
              }
              /**
               * <code>required string SbDFName = 1 [(.validation.regex) = ""];</code>
               */
              public Builder setSbDFNameBytes(
                  com.google.protobuf.ByteString value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
                sbDFName_ = value;
                onChanged();
                return this;
              }

              private java.lang.Object sbDFValue_ = "";
              /**
               * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
               */
              public boolean hasSbDFValue() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
              }
              /**
               * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
               */
              public java.lang.String getSbDFValue() {
                java.lang.Object ref = sbDFValue_;
                if (!(ref instanceof java.lang.String)) {
                  com.google.protobuf.ByteString bs =
                      (com.google.protobuf.ByteString) ref;
                  java.lang.String s = bs.toStringUtf8();
                  if (bs.isValidUtf8()) {
                    sbDFValue_ = s;
                  }
                  return s;
                } else {
                  return (java.lang.String) ref;
                }
              }
              /**
               * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
               */
              public com.google.protobuf.ByteString
                  getSbDFValueBytes() {
                java.lang.Object ref = sbDFValue_;
                if (ref instanceof String) {
                  com.google.protobuf.ByteString b = 
                      com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
                  sbDFValue_ = b;
                  return b;
                } else {
                  return (com.google.protobuf.ByteString) ref;
                }
              }
              /**
               * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
               */
              public Builder setSbDFValue(
                  java.lang.String value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
                sbDFValue_ = value;
                onChanged();
                return this;
              }
              /**
               * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
               */
              public Builder clearSbDFValue() {
                bitField0_ = (bitField0_ & ~0x00000004);
                sbDFValue_ = getDefaultInstance().getSbDFValue();
                onChanged();
                return this;
              }
              /**
               * <code>required string SbDFValue = 2 [(.validation.regex) = ""];</code>
               */
              public Builder setSbDFValueBytes(
                  com.google.protobuf.ByteString value) {
                if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
                sbDFValue_ = value;
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


              // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD)
            }

            // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD)
            private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DEFAULT_INSTANCE;
            static {
              DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD();
            }

            public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD getDefaultInstance() {
              return DEFAULT_INSTANCE;
            }

            @java.lang.Deprecated public static final com.google.protobuf.Parser<DYNAMICFIELD>
                PARSER = new com.google.protobuf.AbstractParser<DYNAMICFIELD>() {
              @java.lang.Override
              public DYNAMICFIELD parsePartialFrom(
                  com.google.protobuf.CodedInputStream input,
                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                  throws com.google.protobuf.InvalidProtocolBufferException {
                return new DYNAMICFIELD(input, extensionRegistry);
              }
            };

            public static com.google.protobuf.Parser<DYNAMICFIELD> parser() {
              return PARSER;
            }

            @java.lang.Override
            public com.google.protobuf.Parser<DYNAMICFIELD> getParserForType() {
              return PARSER;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD getDefaultInstanceForType() {
              return DEFAULT_INSTANCE;
            }

          }

          public static final int DYNAMICFIELD_FIELD_NUMBER = 38;
          private java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD> dynamicField_;
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD> getDynamicFieldList() {
            return dynamicField_;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
              getDynamicFieldOrBuilderList() {
            return dynamicField_;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public int getDynamicFieldCount() {
            return dynamicField_.size();
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD getDynamicField(int index) {
            return dynamicField_.get(index);
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder getDynamicFieldOrBuilder(
              int index) {
            return dynamicField_.get(index);
          }

          private byte memoizedIsInitialized = -1;
          @java.lang.Override
          public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            for (int i = 0; i < getDynamicFieldCount(); i++) {
              if (!getDynamicField(i).isInitialized()) {
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
            for (int i = 0; i < dynamicField_.size(); i++) {
              output.writeMessage(38, dynamicField_.get(i));
            }
            unknownFields.writeTo(output);
          }

          @java.lang.Override
          public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < dynamicField_.size(); i++) {
              size += com.google.protobuf.CodedOutputStream
                .computeMessageSize(38, dynamicField_.get(i));
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
            if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS)) {
              return super.equals(obj);
            }
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS) obj;

            boolean result = true;
            result = result && getDynamicFieldList()
                .equals(other.getDynamicFieldList());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
          }

          @java.lang.Override
          public int hashCode() {
            if (memoizedHashCode != 0) {
              return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getDynamicFieldCount() > 0) {
              hash = (37 * hash) + DYNAMICFIELD_FIELD_NUMBER;
              hash = (53 * hash) + getDynamicFieldList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
              java.nio.ByteBuffer data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
              java.nio.ByteBuffer data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
              com.google.protobuf.ByteString data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
              com.google.protobuf.ByteString data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(byte[] data)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
              byte[] data,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseDelimitedFrom(java.io.InputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseDelimitedFrom(
              java.io.InputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
              com.google.protobuf.CodedInputStream input)
              throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
          }
          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parseFrom(
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
          public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS prototype) {
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
           * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS}
           */
          public static final class Builder extends
              com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
              // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS)
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDSOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(
                      Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder.class);
            }

            // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.newBuilder()
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
                getDynamicFieldFieldBuilder();
              }
            }
            @java.lang.Override
            public Builder clear() {
              super.clear();
              if (dynamicFieldBuilder_ == null) {
                dynamicField_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
              } else {
                dynamicFieldBuilder_.clear();
              }
              return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
              return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_descriptor;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS getDefaultInstanceForType() {
              return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.getDefaultInstance();
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS build() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS result = buildPartial();
              if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
              }
              return result;
            }

            @java.lang.Override
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS buildPartial() {
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS(this);
              int from_bitField0_ = bitField0_;
              if (dynamicFieldBuilder_ == null) {
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  dynamicField_ = java.util.Collections.unmodifiableList(dynamicField_);
                  bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.dynamicField_ = dynamicField_;
              } else {
                result.dynamicField_ = dynamicFieldBuilder_.build();
              }
              onBuilt();
              return result;
            }

            @java.lang.Override
            public Builder clone() {
              return (Builder) super.clone();
            }
            @java.lang.Override
            public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
              return (Builder) super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
              return (Builder) super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
              return (Builder) super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
              return (Builder) super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
              if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS) {
                return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS)other);
              } else {
                super.mergeFrom(other);
                return this;
              }
            }

            public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS other) {
              if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.getDefaultInstance()) return this;
              if (dynamicFieldBuilder_ == null) {
                if (!other.dynamicField_.isEmpty()) {
                  if (dynamicField_.isEmpty()) {
                    dynamicField_ = other.dynamicField_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                  } else {
                    ensureDynamicFieldIsMutable();
                    dynamicField_.addAll(other.dynamicField_);
                  }
                  onChanged();
                }
              } else {
                if (!other.dynamicField_.isEmpty()) {
                  if (dynamicFieldBuilder_.isEmpty()) {
                    dynamicFieldBuilder_.dispose();
                    dynamicFieldBuilder_ = null;
                    dynamicField_ = other.dynamicField_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    dynamicFieldBuilder_ = 
                      com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                         getDynamicFieldFieldBuilder() : null;
                  } else {
                    dynamicFieldBuilder_.addAllMessages(other.dynamicField_);
                  }
                }
              }
              this.mergeUnknownFields(other.unknownFields);
              onChanged();
              return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
              for (int i = 0; i < getDynamicFieldCount(); i++) {
                if (!getDynamicField(i).isInitialized()) {
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
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS parsedMessage = null;
              try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS) e.getUnfinishedMessage();
                throw e.unwrapIOException();
              } finally {
                if (parsedMessage != null) {
                  mergeFrom(parsedMessage);
                }
              }
              return this;
            }
            private int bitField0_;

            private java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD> dynamicField_ =
              java.util.Collections.emptyList();
            private void ensureDynamicFieldIsMutable() {
              if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                dynamicField_ = new java.util.ArrayList<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD>(dynamicField_);
                bitField0_ |= 0x00000001;
               }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder> dynamicFieldBuilder_;

            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD> getDynamicFieldList() {
              if (dynamicFieldBuilder_ == null) {
                return java.util.Collections.unmodifiableList(dynamicField_);
              } else {
                return dynamicFieldBuilder_.getMessageList();
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public int getDynamicFieldCount() {
              if (dynamicFieldBuilder_ == null) {
                return dynamicField_.size();
              } else {
                return dynamicFieldBuilder_.getCount();
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD getDynamicField(int index) {
              if (dynamicFieldBuilder_ == null) {
                return dynamicField_.get(index);
              } else {
                return dynamicFieldBuilder_.getMessage(index);
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder setDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD value) {
              if (dynamicFieldBuilder_ == null) {
                if (value == null) {
                  throw new NullPointerException();
                }
                ensureDynamicFieldIsMutable();
                dynamicField_.set(index, value);
                onChanged();
              } else {
                dynamicFieldBuilder_.setMessage(index, value);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder setDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder builderForValue) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.set(index, builderForValue.build());
                onChanged();
              } else {
                dynamicFieldBuilder_.setMessage(index, builderForValue.build());
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD value) {
              if (dynamicFieldBuilder_ == null) {
                if (value == null) {
                  throw new NullPointerException();
                }
                ensureDynamicFieldIsMutable();
                dynamicField_.add(value);
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(value);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD value) {
              if (dynamicFieldBuilder_ == null) {
                if (value == null) {
                  throw new NullPointerException();
                }
                ensureDynamicFieldIsMutable();
                dynamicField_.add(index, value);
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(index, value);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder builderForValue) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.add(builderForValue.build());
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(builderForValue.build());
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addDynamicField(
                int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder builderForValue) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.add(index, builderForValue.build());
                onChanged();
              } else {
                dynamicFieldBuilder_.addMessage(index, builderForValue.build());
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder addAllDynamicField(
                java.lang.Iterable<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD> values) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, dynamicField_);
                onChanged();
              } else {
                dynamicFieldBuilder_.addAllMessages(values);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder clearDynamicField() {
              if (dynamicFieldBuilder_ == null) {
                dynamicField_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
              } else {
                dynamicFieldBuilder_.clear();
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Builder removeDynamicField(int index) {
              if (dynamicFieldBuilder_ == null) {
                ensureDynamicFieldIsMutable();
                dynamicField_.remove(index);
                onChanged();
              } else {
                dynamicFieldBuilder_.remove(index);
              }
              return this;
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder getDynamicFieldBuilder(
                int index) {
              return getDynamicFieldFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder getDynamicFieldOrBuilder(
                int index) {
              if (dynamicFieldBuilder_ == null) {
                return dynamicField_.get(index);  } else {
                return dynamicFieldBuilder_.getMessageOrBuilder(index);
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
                 getDynamicFieldOrBuilderList() {
              if (dynamicFieldBuilder_ != null) {
                return dynamicFieldBuilder_.getMessageOrBuilderList();
              } else {
                return java.util.Collections.unmodifiableList(dynamicField_);
              }
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder addDynamicFieldBuilder() {
              return getDynamicFieldFieldBuilder().addBuilder(
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance());
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder addDynamicFieldBuilder(
                int index) {
              return getDynamicFieldFieldBuilder().addBuilder(
                  index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.getDefaultInstance());
            }
            /**
             * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD DynamicField = 38 [(.validation.repeatMax) = 5, (.validation.repeatMin) = 0];</code>
             */
            public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder> 
                 getDynamicFieldBuilderList() {
              return getDynamicFieldFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder> 
                getDynamicFieldFieldBuilder() {
              if (dynamicFieldBuilder_ == null) {
                dynamicFieldBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELD.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.DYNAMICFIELDOrBuilder>(
                        dynamicField_,
                        ((bitField0_ & 0x00000001) == 0x00000001),
                        getParentForChildren(),
                        isClean());
                dynamicField_ = null;
              }
              return dynamicFieldBuilder_;
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


            // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS)
          }

          // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS)
          private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS DEFAULT_INSTANCE;
          static {
            DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS();
          }

          public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS getDefaultInstance() {
            return DEFAULT_INSTANCE;
          }

          @java.lang.Deprecated public static final com.google.protobuf.Parser<SBDYNAMICFIELDS>
              PARSER = new com.google.protobuf.AbstractParser<SBDYNAMICFIELDS>() {
            @java.lang.Override
            public SBDYNAMICFIELDS parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new SBDYNAMICFIELDS(input, extensionRegistry);
            }
          };

          public static com.google.protobuf.Parser<SBDYNAMICFIELDS> parser() {
            return PARSER;
          }

          @java.lang.Override
          public com.google.protobuf.Parser<SBDYNAMICFIELDS> getParserForType() {
            return PARSER;
          }

          @java.lang.Override
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
          }

        }

        private int bitField0_;
        public static final int NUMBER_FIELD_NUMBER = 32;
        private volatile java.lang.Object number_;
        /**
         * <code>required string Number = 32 [(.validation.regex) = ""];</code>
         */
        public boolean hasNumber() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string Number = 32 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getNumber() {
          java.lang.Object ref = number_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              number_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string Number = 32 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getNumberBytes() {
          java.lang.Object ref = number_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            number_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SOURCEID_FIELD_NUMBER = 1;
        private volatile java.lang.Object sourceID_;
        /**
         * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
         */
        public boolean hasSourceID() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSourceID() {
          java.lang.Object ref = sourceID_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sourceID_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSourceIDBytes() {
          java.lang.Object ref = sourceID_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sourceID_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int TITLE_FIELD_NUMBER = 2;
        private volatile java.lang.Object title_;
        /**
         * <code>required string Title = 2 [(.validation.regex) = ""];</code>
         */
        public boolean hasTitle() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required string Title = 2 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getTitle() {
          java.lang.Object ref = title_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              title_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string Title = 2 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getTitleBytes() {
          java.lang.Object ref = title_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            title_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private volatile java.lang.Object description_;
        /**
         * <code>required string Description = 3 [(.validation.regex) = ""];</code>
         */
        public boolean hasDescription() {
          return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>required string Description = 3 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getDescription() {
          java.lang.Object ref = description_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              description_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string Description = 3 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getDescriptionBytes() {
          java.lang.Object ref = description_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            description_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int TEMPLATEID_FIELD_NUMBER = 4;
        private volatile java.lang.Object templateID_;
        /**
         * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
         */
        public boolean hasTemplateID() {
          return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getTemplateID() {
          java.lang.Object ref = templateID_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              templateID_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getTemplateIDBytes() {
          java.lang.Object ref = templateID_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            templateID_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int STATUS_FIELD_NUMBER = 5;
        private volatile java.lang.Object status_;
        /**
         * <code>required string Status = 5 [(.validation.regex) = ""];</code>
         */
        public boolean hasStatus() {
          return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>required string Status = 5 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getStatus() {
          java.lang.Object ref = status_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              status_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string Status = 5 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getStatusBytes() {
          java.lang.Object ref = status_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            status_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int ASSIGNEENAME_FIELD_NUMBER = 6;
        private volatile java.lang.Object assigneeName_;
        /**
         * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
         */
        public boolean hasAssigneeName() {
          return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getAssigneeName() {
          java.lang.Object ref = assigneeName_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              assigneeName_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getAssigneeNameBytes() {
          java.lang.Object ref = assigneeName_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            assigneeName_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int ASSIGNMENTNAME_FIELD_NUMBER = 7;
        private volatile java.lang.Object assignmentName_;
        /**
         * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
         */
        public boolean hasAssignmentName() {
          return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getAssignmentName() {
          java.lang.Object ref = assignmentName_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              assignmentName_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getAssignmentNameBytes() {
          java.lang.Object ref = assignmentName_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            assignmentName_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int NEXTBREACH_FIELD_NUMBER = 8;
        private volatile java.lang.Object nextBreach_;
        /**
         * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
         */
        public boolean hasNextBreach() {
          return ((bitField0_ & 0x00000100) == 0x00000100);
        }
        /**
         * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getNextBreach() {
          java.lang.Object ref = nextBreach_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              nextBreach_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getNextBreachBytes() {
          java.lang.Object ref = nextBreach_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            nextBreach_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int ACTUALFINISH_FIELD_NUMBER = 9;
        private volatile java.lang.Object actualFinish_;
        /**
         * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
         */
        public boolean hasActualFinish() {
          return ((bitField0_ & 0x00000200) == 0x00000200);
        }
        /**
         * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getActualFinish() {
          java.lang.Object ref = actualFinish_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              actualFinish_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getActualFinishBytes() {
          java.lang.Object ref = actualFinish_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            actualFinish_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int CLOSETIME_FIELD_NUMBER = 10;
        private volatile java.lang.Object closeTime_;
        /**
         * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
         */
        public boolean hasCloseTime() {
          return ((bitField0_ & 0x00000400) == 0x00000400);
        }
        /**
         * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getCloseTime() {
          java.lang.Object ref = closeTime_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              closeTime_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getCloseTimeBytes() {
          java.lang.Object ref = closeTime_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            closeTime_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int RESOLUTION_FIELD_NUMBER = 11;
        private volatile java.lang.Object resolution_;
        /**
         * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
         */
        public boolean hasResolution() {
          return ((bitField0_ & 0x00000800) == 0x00000800);
        }
        /**
         * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getResolution() {
          java.lang.Object ref = resolution_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              resolution_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getResolutionBytes() {
          java.lang.Object ref = resolution_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            resolution_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int RESOLUTIONCODE_FIELD_NUMBER = 12;
        private volatile java.lang.Object resolutionCode_;
        /**
         * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
         */
        public boolean hasResolutionCode() {
          return ((bitField0_ & 0x00001000) == 0x00001000);
        }
        /**
         * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getResolutionCode() {
          java.lang.Object ref = resolutionCode_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              resolutionCode_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getResolutionCodeBytes() {
          java.lang.Object ref = resolutionCode_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            resolutionCode_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int ATTACHMENTSTATUS_FIELD_NUMBER = 13;
        private volatile java.lang.Object attachmentStatus_;
        /**
         * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
         */
        public boolean hasAttachmentStatus() {
          return ((bitField0_ & 0x00002000) == 0x00002000);
        }
        /**
         * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getAttachmentStatus() {
          java.lang.Object ref = attachmentStatus_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              attachmentStatus_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getAttachmentStatusBytes() {
          java.lang.Object ref = attachmentStatus_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            attachmentStatus_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int PRIORITYCODE_FIELD_NUMBER = 14;
        private volatile java.lang.Object priorityCode_;
        /**
         * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
         */
        public boolean hasPriorityCode() {
          return ((bitField0_ & 0x00004000) == 0x00004000);
        }
        /**
         * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getPriorityCode() {
          java.lang.Object ref = priorityCode_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              priorityCode_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getPriorityCodeBytes() {
          java.lang.Object ref = priorityCode_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            priorityCode_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int CONTACTNAME_FIELD_NUMBER = 15;
        private volatile java.lang.Object contactName_;
        /**
         * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
         */
        public boolean hasContactName() {
          return ((bitField0_ & 0x00008000) == 0x00008000);
        }
        /**
         * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getContactName() {
          java.lang.Object ref = contactName_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              contactName_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getContactNameBytes() {
          java.lang.Object ref = contactName_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            contactName_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int CALLBACKCONTACT_FIELD_NUMBER = 16;
        private volatile java.lang.Object callbackContact_;
        /**
         * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
         */
        public boolean hasCallbackContact() {
          return ((bitField0_ & 0x00010000) == 0x00010000);
        }
        /**
         * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getCallbackContact() {
          java.lang.Object ref = callbackContact_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              callbackContact_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getCallbackContactBytes() {
          java.lang.Object ref = callbackContact_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            callbackContact_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int CATEGORY_FIELD_NUMBER = 17;
        private volatile java.lang.Object category_;
        /**
         * <code>required string Category = 17 [(.validation.regex) = ""];</code>
         */
        public boolean hasCategory() {
          return ((bitField0_ & 0x00020000) == 0x00020000);
        }
        /**
         * <code>required string Category = 17 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getCategory() {
          java.lang.Object ref = category_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              category_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string Category = 17 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getCategoryBytes() {
          java.lang.Object ref = category_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            category_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBK2_FIELD_NUMBER = 18;
        private volatile java.lang.Object sbK2_;
        /**
         * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbK2() {
          return ((bitField0_ & 0x00040000) == 0x00040000);
        }
        /**
         * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbK2() {
          java.lang.Object ref = sbK2_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbK2_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbK2Bytes() {
          java.lang.Object ref = sbK2_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbK2_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBAIB_FIELD_NUMBER = 19;
        private volatile java.lang.Object sbAIB_;
        /**
         * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbAIB() {
          return ((bitField0_ & 0x00080000) == 0x00080000);
        }
        /**
         * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbAIB() {
          java.lang.Object ref = sbAIB_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbAIB_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbAIBBytes() {
          java.lang.Object ref = sbAIB_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbAIB_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBDRUGID_FIELD_NUMBER = 20;
        private volatile java.lang.Object sbDRUGId_;
        /**
         * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbDRUGId() {
          return ((bitField0_ & 0x00100000) == 0x00100000);
        }
        /**
         * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbDRUGId() {
          java.lang.Object ref = sbDRUGId_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbDRUGId_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbDRUGIdBytes() {
          java.lang.Object ref = sbDRUGId_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbDRUGId_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBMQRQID_FIELD_NUMBER = 21;
        private volatile java.lang.Object sbMqrqid_;
        /**
         * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbMqrqid() {
          return ((bitField0_ & 0x00200000) == 0x00200000);
        }
        /**
         * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbMqrqid() {
          java.lang.Object ref = sbMqrqid_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbMqrqid_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbMqrqidBytes() {
          java.lang.Object ref = sbMqrqid_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbMqrqid_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBSOURCENAME_FIELD_NUMBER = 22;
        private volatile java.lang.Object sbSourceName_;
        /**
         * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbSourceName() {
          return ((bitField0_ & 0x00400000) == 0x00400000);
        }
        /**
         * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbSourceName() {
          java.lang.Object ref = sbSourceName_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbSourceName_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbSourceNameBytes() {
          java.lang.Object ref = sbSourceName_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbSourceName_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int INCIDENTID_FIELD_NUMBER = 23;
        private volatile java.lang.Object incidentID_;
        /**
         * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
         */
        public boolean hasIncidentID() {
          return ((bitField0_ & 0x00800000) == 0x00800000);
        }
        /**
         * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getIncidentID() {
          java.lang.Object ref = incidentID_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              incidentID_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getIncidentIDBytes() {
          java.lang.Object ref = incidentID_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            incidentID_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBFORECASTMOVECAUSE_FIELD_NUMBER = 24;
        private volatile java.lang.Object sbForecastMoveCause_;
        /**
         * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbForecastMoveCause() {
          return ((bitField0_ & 0x01000000) == 0x01000000);
        }
        /**
         * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbForecastMoveCause() {
          java.lang.Object ref = sbForecastMoveCause_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbForecastMoveCause_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbForecastMoveCauseBytes() {
          java.lang.Object ref = sbForecastMoveCause_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbForecastMoveCause_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBLOGIN_FIELD_NUMBER = 25;
        private volatile java.lang.Object sbLogin_;
        /**
         * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbLogin() {
          return ((bitField0_ & 0x02000000) == 0x02000000);
        }
        /**
         * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbLogin() {
          java.lang.Object ref = sbLogin_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbLogin_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbLoginBytes() {
          java.lang.Object ref = sbLogin_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbLogin_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int SBPASSWORD_FIELD_NUMBER = 26;
        private volatile java.lang.Object sbPassword_;
        /**
         * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
         */
        public boolean hasSbPassword() {
          return ((bitField0_ & 0x04000000) == 0x04000000);
        }
        /**
         * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getSbPassword() {
          java.lang.Object ref = sbPassword_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              sbPassword_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getSbPasswordBytes() {
          java.lang.Object ref = sbPassword_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            sbPassword_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int ADDITIONALFIELDS_FIELD_NUMBER = 27;
        private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS additionalFields_;
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
         */
        public boolean hasAdditionalFields() {
          return ((bitField0_ & 0x08000000) == 0x08000000);
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS getAdditionalFields() {
          return additionalFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.getDefaultInstance() : additionalFields_;
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDSOrBuilder getAdditionalFieldsOrBuilder() {
          return additionalFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.getDefaultInstance() : additionalFields_;
        }

        public static final int ECM_FIELD_NUMBER = 28;
        private java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM> ecm_;
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM> getEcmList() {
          return ecm_;
        }
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        public java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder> 
            getEcmOrBuilderList() {
          return ecm_;
        }
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        public int getEcmCount() {
          return ecm_.size();
        }
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM getEcm(int index) {
          return ecm_.get(index);
        }
        /**
         * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder getEcmOrBuilder(
            int index) {
          return ecm_.get(index);
        }

        public static final int CHANNEL_FIELD_NUMBER = 29;
        private volatile java.lang.Object channel_;
        /**
         * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
         */
        public boolean hasChannel() {
          return ((bitField0_ & 0x10000000) == 0x10000000);
        }
        /**
         * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
         */
        public java.lang.String getChannel() {
          java.lang.Object ref = channel_;
          if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
          } else {
            com.google.protobuf.ByteString bs = 
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              channel_ = s;
            }
            return s;
          }
        }
        /**
         * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
         */
        public com.google.protobuf.ByteString
            getChannelBytes() {
          java.lang.Object ref = channel_;
          if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            channel_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        public static final int DYNAMICFIELDS_FIELD_NUMBER = 30;
        private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS dynamicFields_;
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
         */
        public boolean hasDynamicFields() {
          return ((bitField0_ & 0x20000000) == 0x20000000);
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS getDynamicFields() {
          return dynamicFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.getDefaultInstance() : dynamicFields_;
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDSOrBuilder getDynamicFieldsOrBuilder() {
          return dynamicFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.getDefaultInstance() : dynamicFields_;
        }

        public static final int SBDYNAMICFIELDS_FIELD_NUMBER = 31;
        private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS sbDynamicFields_;
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
         */
        public boolean hasSbDynamicFields() {
          return ((bitField0_ & 0x40000000) == 0x40000000);
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS getSbDynamicFields() {
          return sbDynamicFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.getDefaultInstance() : sbDynamicFields_;
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDSOrBuilder getSbDynamicFieldsOrBuilder() {
          return sbDynamicFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.getDefaultInstance() : sbDynamicFields_;
        }

        private byte memoizedIsInitialized = -1;
        @java.lang.Override
        public final boolean isInitialized() {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return true;
          if (isInitialized == 0) return false;

          if (!hasNumber()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSourceID()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasTitle()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasDescription()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasTemplateID()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasStatus()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasAssigneeName()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasAssignmentName()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasNextBreach()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasActualFinish()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasCloseTime()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasResolution()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasResolutionCode()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasAttachmentStatus()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasPriorityCode()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasContactName()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasCallbackContact()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasCategory()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbK2()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbAIB()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbDRUGId()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbMqrqid()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbSourceName()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasIncidentID()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbForecastMoveCause()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbLogin()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbPassword()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasAdditionalFields()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasChannel()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasDynamicFields()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!hasSbDynamicFields()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!getAdditionalFields().isInitialized()) {
            memoizedIsInitialized = 0;
            return false;
          }
          for (int i = 0; i < getEcmCount(); i++) {
            if (!getEcm(i).isInitialized()) {
              memoizedIsInitialized = 0;
              return false;
            }
          }
          if (!getDynamicFields().isInitialized()) {
            memoizedIsInitialized = 0;
            return false;
          }
          if (!getSbDynamicFields().isInitialized()) {
            memoizedIsInitialized = 0;
            return false;
          }
          memoizedIsInitialized = 1;
          return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                            throws java.io.IOException {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceID_);
          }
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
          }
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
          }
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 4, templateID_);
          }
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 5, status_);
          }
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 6, assigneeName_);
          }
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 7, assignmentName_);
          }
          if (((bitField0_ & 0x00000100) == 0x00000100)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 8, nextBreach_);
          }
          if (((bitField0_ & 0x00000200) == 0x00000200)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 9, actualFinish_);
          }
          if (((bitField0_ & 0x00000400) == 0x00000400)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 10, closeTime_);
          }
          if (((bitField0_ & 0x00000800) == 0x00000800)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 11, resolution_);
          }
          if (((bitField0_ & 0x00001000) == 0x00001000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 12, resolutionCode_);
          }
          if (((bitField0_ & 0x00002000) == 0x00002000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 13, attachmentStatus_);
          }
          if (((bitField0_ & 0x00004000) == 0x00004000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 14, priorityCode_);
          }
          if (((bitField0_ & 0x00008000) == 0x00008000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 15, contactName_);
          }
          if (((bitField0_ & 0x00010000) == 0x00010000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 16, callbackContact_);
          }
          if (((bitField0_ & 0x00020000) == 0x00020000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 17, category_);
          }
          if (((bitField0_ & 0x00040000) == 0x00040000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 18, sbK2_);
          }
          if (((bitField0_ & 0x00080000) == 0x00080000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 19, sbAIB_);
          }
          if (((bitField0_ & 0x00100000) == 0x00100000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 20, sbDRUGId_);
          }
          if (((bitField0_ & 0x00200000) == 0x00200000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 21, sbMqrqid_);
          }
          if (((bitField0_ & 0x00400000) == 0x00400000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 22, sbSourceName_);
          }
          if (((bitField0_ & 0x00800000) == 0x00800000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 23, incidentID_);
          }
          if (((bitField0_ & 0x01000000) == 0x01000000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 24, sbForecastMoveCause_);
          }
          if (((bitField0_ & 0x02000000) == 0x02000000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 25, sbLogin_);
          }
          if (((bitField0_ & 0x04000000) == 0x04000000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 26, sbPassword_);
          }
          if (((bitField0_ & 0x08000000) == 0x08000000)) {
            output.writeMessage(27, getAdditionalFields());
          }
          for (int i = 0; i < ecm_.size(); i++) {
            output.writeMessage(28, ecm_.get(i));
          }
          if (((bitField0_ & 0x10000000) == 0x10000000)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 29, channel_);
          }
          if (((bitField0_ & 0x20000000) == 0x20000000)) {
            output.writeMessage(30, getDynamicFields());
          }
          if (((bitField0_ & 0x40000000) == 0x40000000)) {
            output.writeMessage(31, getSbDynamicFields());
          }
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 32, number_);
          }
          unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
          int size = memoizedSize;
          if (size != -1) return size;

          size = 0;
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceID_);
          }
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
          }
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
          }
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, templateID_);
          }
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, status_);
          }
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, assigneeName_);
          }
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, assignmentName_);
          }
          if (((bitField0_ & 0x00000100) == 0x00000100)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, nextBreach_);
          }
          if (((bitField0_ & 0x00000200) == 0x00000200)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, actualFinish_);
          }
          if (((bitField0_ & 0x00000400) == 0x00000400)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, closeTime_);
          }
          if (((bitField0_ & 0x00000800) == 0x00000800)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, resolution_);
          }
          if (((bitField0_ & 0x00001000) == 0x00001000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, resolutionCode_);
          }
          if (((bitField0_ & 0x00002000) == 0x00002000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, attachmentStatus_);
          }
          if (((bitField0_ & 0x00004000) == 0x00004000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, priorityCode_);
          }
          if (((bitField0_ & 0x00008000) == 0x00008000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, contactName_);
          }
          if (((bitField0_ & 0x00010000) == 0x00010000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(16, callbackContact_);
          }
          if (((bitField0_ & 0x00020000) == 0x00020000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(17, category_);
          }
          if (((bitField0_ & 0x00040000) == 0x00040000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(18, sbK2_);
          }
          if (((bitField0_ & 0x00080000) == 0x00080000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(19, sbAIB_);
          }
          if (((bitField0_ & 0x00100000) == 0x00100000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(20, sbDRUGId_);
          }
          if (((bitField0_ & 0x00200000) == 0x00200000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(21, sbMqrqid_);
          }
          if (((bitField0_ & 0x00400000) == 0x00400000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(22, sbSourceName_);
          }
          if (((bitField0_ & 0x00800000) == 0x00800000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(23, incidentID_);
          }
          if (((bitField0_ & 0x01000000) == 0x01000000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(24, sbForecastMoveCause_);
          }
          if (((bitField0_ & 0x02000000) == 0x02000000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(25, sbLogin_);
          }
          if (((bitField0_ & 0x04000000) == 0x04000000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(26, sbPassword_);
          }
          if (((bitField0_ & 0x08000000) == 0x08000000)) {
            size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(27, getAdditionalFields());
          }
          for (int i = 0; i < ecm_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(28, ecm_.get(i));
          }
          if (((bitField0_ & 0x10000000) == 0x10000000)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(29, channel_);
          }
          if (((bitField0_ & 0x20000000) == 0x20000000)) {
            size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(30, getDynamicFields());
          }
          if (((bitField0_ & 0x40000000) == 0x40000000)) {
            size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(31, getSbDynamicFields());
          }
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(32, number_);
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
          if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO)) {
            return super.equals(obj);
          }
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO) obj;

          boolean result = true;
          result = result && (hasNumber() == other.hasNumber());
          if (hasNumber()) {
            result = result && getNumber()
                .equals(other.getNumber());
          }
          result = result && (hasSourceID() == other.hasSourceID());
          if (hasSourceID()) {
            result = result && getSourceID()
                .equals(other.getSourceID());
          }
          result = result && (hasTitle() == other.hasTitle());
          if (hasTitle()) {
            result = result && getTitle()
                .equals(other.getTitle());
          }
          result = result && (hasDescription() == other.hasDescription());
          if (hasDescription()) {
            result = result && getDescription()
                .equals(other.getDescription());
          }
          result = result && (hasTemplateID() == other.hasTemplateID());
          if (hasTemplateID()) {
            result = result && getTemplateID()
                .equals(other.getTemplateID());
          }
          result = result && (hasStatus() == other.hasStatus());
          if (hasStatus()) {
            result = result && getStatus()
                .equals(other.getStatus());
          }
          result = result && (hasAssigneeName() == other.hasAssigneeName());
          if (hasAssigneeName()) {
            result = result && getAssigneeName()
                .equals(other.getAssigneeName());
          }
          result = result && (hasAssignmentName() == other.hasAssignmentName());
          if (hasAssignmentName()) {
            result = result && getAssignmentName()
                .equals(other.getAssignmentName());
          }
          result = result && (hasNextBreach() == other.hasNextBreach());
          if (hasNextBreach()) {
            result = result && getNextBreach()
                .equals(other.getNextBreach());
          }
          result = result && (hasActualFinish() == other.hasActualFinish());
          if (hasActualFinish()) {
            result = result && getActualFinish()
                .equals(other.getActualFinish());
          }
          result = result && (hasCloseTime() == other.hasCloseTime());
          if (hasCloseTime()) {
            result = result && getCloseTime()
                .equals(other.getCloseTime());
          }
          result = result && (hasResolution() == other.hasResolution());
          if (hasResolution()) {
            result = result && getResolution()
                .equals(other.getResolution());
          }
          result = result && (hasResolutionCode() == other.hasResolutionCode());
          if (hasResolutionCode()) {
            result = result && getResolutionCode()
                .equals(other.getResolutionCode());
          }
          result = result && (hasAttachmentStatus() == other.hasAttachmentStatus());
          if (hasAttachmentStatus()) {
            result = result && getAttachmentStatus()
                .equals(other.getAttachmentStatus());
          }
          result = result && (hasPriorityCode() == other.hasPriorityCode());
          if (hasPriorityCode()) {
            result = result && getPriorityCode()
                .equals(other.getPriorityCode());
          }
          result = result && (hasContactName() == other.hasContactName());
          if (hasContactName()) {
            result = result && getContactName()
                .equals(other.getContactName());
          }
          result = result && (hasCallbackContact() == other.hasCallbackContact());
          if (hasCallbackContact()) {
            result = result && getCallbackContact()
                .equals(other.getCallbackContact());
          }
          result = result && (hasCategory() == other.hasCategory());
          if (hasCategory()) {
            result = result && getCategory()
                .equals(other.getCategory());
          }
          result = result && (hasSbK2() == other.hasSbK2());
          if (hasSbK2()) {
            result = result && getSbK2()
                .equals(other.getSbK2());
          }
          result = result && (hasSbAIB() == other.hasSbAIB());
          if (hasSbAIB()) {
            result = result && getSbAIB()
                .equals(other.getSbAIB());
          }
          result = result && (hasSbDRUGId() == other.hasSbDRUGId());
          if (hasSbDRUGId()) {
            result = result && getSbDRUGId()
                .equals(other.getSbDRUGId());
          }
          result = result && (hasSbMqrqid() == other.hasSbMqrqid());
          if (hasSbMqrqid()) {
            result = result && getSbMqrqid()
                .equals(other.getSbMqrqid());
          }
          result = result && (hasSbSourceName() == other.hasSbSourceName());
          if (hasSbSourceName()) {
            result = result && getSbSourceName()
                .equals(other.getSbSourceName());
          }
          result = result && (hasIncidentID() == other.hasIncidentID());
          if (hasIncidentID()) {
            result = result && getIncidentID()
                .equals(other.getIncidentID());
          }
          result = result && (hasSbForecastMoveCause() == other.hasSbForecastMoveCause());
          if (hasSbForecastMoveCause()) {
            result = result && getSbForecastMoveCause()
                .equals(other.getSbForecastMoveCause());
          }
          result = result && (hasSbLogin() == other.hasSbLogin());
          if (hasSbLogin()) {
            result = result && getSbLogin()
                .equals(other.getSbLogin());
          }
          result = result && (hasSbPassword() == other.hasSbPassword());
          if (hasSbPassword()) {
            result = result && getSbPassword()
                .equals(other.getSbPassword());
          }
          result = result && (hasAdditionalFields() == other.hasAdditionalFields());
          if (hasAdditionalFields()) {
            result = result && getAdditionalFields()
                .equals(other.getAdditionalFields());
          }
          result = result && getEcmList()
              .equals(other.getEcmList());
          result = result && (hasChannel() == other.hasChannel());
          if (hasChannel()) {
            result = result && getChannel()
                .equals(other.getChannel());
          }
          result = result && (hasDynamicFields() == other.hasDynamicFields());
          if (hasDynamicFields()) {
            result = result && getDynamicFields()
                .equals(other.getDynamicFields());
          }
          result = result && (hasSbDynamicFields() == other.hasSbDynamicFields());
          if (hasSbDynamicFields()) {
            result = result && getSbDynamicFields()
                .equals(other.getSbDynamicFields());
          }
          result = result && unknownFields.equals(other.unknownFields);
          return result;
        }

        @java.lang.Override
        public int hashCode() {
          if (memoizedHashCode != 0) {
            return memoizedHashCode;
          }
          int hash = 41;
          hash = (19 * hash) + getDescriptor().hashCode();
          if (hasNumber()) {
            hash = (37 * hash) + NUMBER_FIELD_NUMBER;
            hash = (53 * hash) + getNumber().hashCode();
          }
          if (hasSourceID()) {
            hash = (37 * hash) + SOURCEID_FIELD_NUMBER;
            hash = (53 * hash) + getSourceID().hashCode();
          }
          if (hasTitle()) {
            hash = (37 * hash) + TITLE_FIELD_NUMBER;
            hash = (53 * hash) + getTitle().hashCode();
          }
          if (hasDescription()) {
            hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
            hash = (53 * hash) + getDescription().hashCode();
          }
          if (hasTemplateID()) {
            hash = (37 * hash) + TEMPLATEID_FIELD_NUMBER;
            hash = (53 * hash) + getTemplateID().hashCode();
          }
          if (hasStatus()) {
            hash = (37 * hash) + STATUS_FIELD_NUMBER;
            hash = (53 * hash) + getStatus().hashCode();
          }
          if (hasAssigneeName()) {
            hash = (37 * hash) + ASSIGNEENAME_FIELD_NUMBER;
            hash = (53 * hash) + getAssigneeName().hashCode();
          }
          if (hasAssignmentName()) {
            hash = (37 * hash) + ASSIGNMENTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getAssignmentName().hashCode();
          }
          if (hasNextBreach()) {
            hash = (37 * hash) + NEXTBREACH_FIELD_NUMBER;
            hash = (53 * hash) + getNextBreach().hashCode();
          }
          if (hasActualFinish()) {
            hash = (37 * hash) + ACTUALFINISH_FIELD_NUMBER;
            hash = (53 * hash) + getActualFinish().hashCode();
          }
          if (hasCloseTime()) {
            hash = (37 * hash) + CLOSETIME_FIELD_NUMBER;
            hash = (53 * hash) + getCloseTime().hashCode();
          }
          if (hasResolution()) {
            hash = (37 * hash) + RESOLUTION_FIELD_NUMBER;
            hash = (53 * hash) + getResolution().hashCode();
          }
          if (hasResolutionCode()) {
            hash = (37 * hash) + RESOLUTIONCODE_FIELD_NUMBER;
            hash = (53 * hash) + getResolutionCode().hashCode();
          }
          if (hasAttachmentStatus()) {
            hash = (37 * hash) + ATTACHMENTSTATUS_FIELD_NUMBER;
            hash = (53 * hash) + getAttachmentStatus().hashCode();
          }
          if (hasPriorityCode()) {
            hash = (37 * hash) + PRIORITYCODE_FIELD_NUMBER;
            hash = (53 * hash) + getPriorityCode().hashCode();
          }
          if (hasContactName()) {
            hash = (37 * hash) + CONTACTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getContactName().hashCode();
          }
          if (hasCallbackContact()) {
            hash = (37 * hash) + CALLBACKCONTACT_FIELD_NUMBER;
            hash = (53 * hash) + getCallbackContact().hashCode();
          }
          if (hasCategory()) {
            hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
            hash = (53 * hash) + getCategory().hashCode();
          }
          if (hasSbK2()) {
            hash = (37 * hash) + SBK2_FIELD_NUMBER;
            hash = (53 * hash) + getSbK2().hashCode();
          }
          if (hasSbAIB()) {
            hash = (37 * hash) + SBAIB_FIELD_NUMBER;
            hash = (53 * hash) + getSbAIB().hashCode();
          }
          if (hasSbDRUGId()) {
            hash = (37 * hash) + SBDRUGID_FIELD_NUMBER;
            hash = (53 * hash) + getSbDRUGId().hashCode();
          }
          if (hasSbMqrqid()) {
            hash = (37 * hash) + SBMQRQID_FIELD_NUMBER;
            hash = (53 * hash) + getSbMqrqid().hashCode();
          }
          if (hasSbSourceName()) {
            hash = (37 * hash) + SBSOURCENAME_FIELD_NUMBER;
            hash = (53 * hash) + getSbSourceName().hashCode();
          }
          if (hasIncidentID()) {
            hash = (37 * hash) + INCIDENTID_FIELD_NUMBER;
            hash = (53 * hash) + getIncidentID().hashCode();
          }
          if (hasSbForecastMoveCause()) {
            hash = (37 * hash) + SBFORECASTMOVECAUSE_FIELD_NUMBER;
            hash = (53 * hash) + getSbForecastMoveCause().hashCode();
          }
          if (hasSbLogin()) {
            hash = (37 * hash) + SBLOGIN_FIELD_NUMBER;
            hash = (53 * hash) + getSbLogin().hashCode();
          }
          if (hasSbPassword()) {
            hash = (37 * hash) + SBPASSWORD_FIELD_NUMBER;
            hash = (53 * hash) + getSbPassword().hashCode();
          }
          if (hasAdditionalFields()) {
            hash = (37 * hash) + ADDITIONALFIELDS_FIELD_NUMBER;
            hash = (53 * hash) + getAdditionalFields().hashCode();
          }
          if (getEcmCount() > 0) {
            hash = (37 * hash) + ECM_FIELD_NUMBER;
            hash = (53 * hash) + getEcmList().hashCode();
          }
          if (hasChannel()) {
            hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
            hash = (53 * hash) + getChannel().hashCode();
          }
          if (hasDynamicFields()) {
            hash = (37 * hash) + DYNAMICFIELDS_FIELD_NUMBER;
            hash = (53 * hash) + getDynamicFields().hashCode();
          }
          if (hasSbDynamicFields()) {
            hash = (37 * hash) + SBDYNAMICFIELDS_FIELD_NUMBER;
            hash = (53 * hash) + getSbDynamicFields().hashCode();
          }
          hash = (29 * hash) + unknownFields.hashCode();
          memoizedHashCode = hash;
          return hash;
        }

        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(java.io.InputStream input)
            throws java.io.IOException {
          return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
          return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
          return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
        }
        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parseFrom(
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
        public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO prototype) {
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
         * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO}
         */
        public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO)
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNOOrBuilder {
          public static final com.google.protobuf.Descriptors.Descriptor
              getDescriptor() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor;
          }

          @java.lang.Override
          protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
              internalGetFieldAccessorTable() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder.class);
          }

          // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.newBuilder()
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
              getAdditionalFieldsFieldBuilder();
              getEcmFieldBuilder();
              getDynamicFieldsFieldBuilder();
              getSbDynamicFieldsFieldBuilder();
            }
          }
          @java.lang.Override
          public Builder clear() {
            super.clear();
            number_ = "";
            bitField0_ = (bitField0_ & ~0x00000001);
            sourceID_ = "";
            bitField0_ = (bitField0_ & ~0x00000002);
            title_ = "";
            bitField0_ = (bitField0_ & ~0x00000004);
            description_ = "";
            bitField0_ = (bitField0_ & ~0x00000008);
            templateID_ = "";
            bitField0_ = (bitField0_ & ~0x00000010);
            status_ = "";
            bitField0_ = (bitField0_ & ~0x00000020);
            assigneeName_ = "";
            bitField0_ = (bitField0_ & ~0x00000040);
            assignmentName_ = "";
            bitField0_ = (bitField0_ & ~0x00000080);
            nextBreach_ = "";
            bitField0_ = (bitField0_ & ~0x00000100);
            actualFinish_ = "";
            bitField0_ = (bitField0_ & ~0x00000200);
            closeTime_ = "";
            bitField0_ = (bitField0_ & ~0x00000400);
            resolution_ = "";
            bitField0_ = (bitField0_ & ~0x00000800);
            resolutionCode_ = "";
            bitField0_ = (bitField0_ & ~0x00001000);
            attachmentStatus_ = "";
            bitField0_ = (bitField0_ & ~0x00002000);
            priorityCode_ = "";
            bitField0_ = (bitField0_ & ~0x00004000);
            contactName_ = "";
            bitField0_ = (bitField0_ & ~0x00008000);
            callbackContact_ = "";
            bitField0_ = (bitField0_ & ~0x00010000);
            category_ = "";
            bitField0_ = (bitField0_ & ~0x00020000);
            sbK2_ = "";
            bitField0_ = (bitField0_ & ~0x00040000);
            sbAIB_ = "";
            bitField0_ = (bitField0_ & ~0x00080000);
            sbDRUGId_ = "";
            bitField0_ = (bitField0_ & ~0x00100000);
            sbMqrqid_ = "";
            bitField0_ = (bitField0_ & ~0x00200000);
            sbSourceName_ = "";
            bitField0_ = (bitField0_ & ~0x00400000);
            incidentID_ = "";
            bitField0_ = (bitField0_ & ~0x00800000);
            sbForecastMoveCause_ = "";
            bitField0_ = (bitField0_ & ~0x01000000);
            sbLogin_ = "";
            bitField0_ = (bitField0_ & ~0x02000000);
            sbPassword_ = "";
            bitField0_ = (bitField0_ & ~0x04000000);
            if (additionalFieldsBuilder_ == null) {
              additionalFields_ = null;
            } else {
              additionalFieldsBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x08000000);
            if (ecmBuilder_ == null) {
              ecm_ = java.util.Collections.emptyList();
              bitField0_ = (bitField0_ & ~0x10000000);
            } else {
              ecmBuilder_.clear();
            }
            channel_ = "";
            bitField0_ = (bitField0_ & ~0x20000000);
            if (dynamicFieldsBuilder_ == null) {
              dynamicFields_ = null;
            } else {
              dynamicFieldsBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x40000000);
            if (sbDynamicFieldsBuilder_ == null) {
              sbDynamicFields_ = null;
            } else {
              sbDynamicFieldsBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x80000000);
            return this;
          }

          @java.lang.Override
          public com.google.protobuf.Descriptors.Descriptor
              getDescriptorForType() {
            return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor;
          }

          @java.lang.Override
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO getDefaultInstanceForType() {
            return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.getDefaultInstance();
          }

          @java.lang.Override
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO build() {
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO result = buildPartial();
            if (!result.isInitialized()) {
              throw newUninitializedMessageException(result);
            }
            return result;
          }

          @java.lang.Override
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO buildPartial() {
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
              to_bitField0_ |= 0x00000001;
            }
            result.number_ = number_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
              to_bitField0_ |= 0x00000002;
            }
            result.sourceID_ = sourceID_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
              to_bitField0_ |= 0x00000004;
            }
            result.title_ = title_;
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
              to_bitField0_ |= 0x00000008;
            }
            result.description_ = description_;
            if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
              to_bitField0_ |= 0x00000010;
            }
            result.templateID_ = templateID_;
            if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
              to_bitField0_ |= 0x00000020;
            }
            result.status_ = status_;
            if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
              to_bitField0_ |= 0x00000040;
            }
            result.assigneeName_ = assigneeName_;
            if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
              to_bitField0_ |= 0x00000080;
            }
            result.assignmentName_ = assignmentName_;
            if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
              to_bitField0_ |= 0x00000100;
            }
            result.nextBreach_ = nextBreach_;
            if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
              to_bitField0_ |= 0x00000200;
            }
            result.actualFinish_ = actualFinish_;
            if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
              to_bitField0_ |= 0x00000400;
            }
            result.closeTime_ = closeTime_;
            if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
              to_bitField0_ |= 0x00000800;
            }
            result.resolution_ = resolution_;
            if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
              to_bitField0_ |= 0x00001000;
            }
            result.resolutionCode_ = resolutionCode_;
            if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
              to_bitField0_ |= 0x00002000;
            }
            result.attachmentStatus_ = attachmentStatus_;
            if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
              to_bitField0_ |= 0x00004000;
            }
            result.priorityCode_ = priorityCode_;
            if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
              to_bitField0_ |= 0x00008000;
            }
            result.contactName_ = contactName_;
            if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
              to_bitField0_ |= 0x00010000;
            }
            result.callbackContact_ = callbackContact_;
            if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
              to_bitField0_ |= 0x00020000;
            }
            result.category_ = category_;
            if (((from_bitField0_ & 0x00040000) == 0x00040000)) {
              to_bitField0_ |= 0x00040000;
            }
            result.sbK2_ = sbK2_;
            if (((from_bitField0_ & 0x00080000) == 0x00080000)) {
              to_bitField0_ |= 0x00080000;
            }
            result.sbAIB_ = sbAIB_;
            if (((from_bitField0_ & 0x00100000) == 0x00100000)) {
              to_bitField0_ |= 0x00100000;
            }
            result.sbDRUGId_ = sbDRUGId_;
            if (((from_bitField0_ & 0x00200000) == 0x00200000)) {
              to_bitField0_ |= 0x00200000;
            }
            result.sbMqrqid_ = sbMqrqid_;
            if (((from_bitField0_ & 0x00400000) == 0x00400000)) {
              to_bitField0_ |= 0x00400000;
            }
            result.sbSourceName_ = sbSourceName_;
            if (((from_bitField0_ & 0x00800000) == 0x00800000)) {
              to_bitField0_ |= 0x00800000;
            }
            result.incidentID_ = incidentID_;
            if (((from_bitField0_ & 0x01000000) == 0x01000000)) {
              to_bitField0_ |= 0x01000000;
            }
            result.sbForecastMoveCause_ = sbForecastMoveCause_;
            if (((from_bitField0_ & 0x02000000) == 0x02000000)) {
              to_bitField0_ |= 0x02000000;
            }
            result.sbLogin_ = sbLogin_;
            if (((from_bitField0_ & 0x04000000) == 0x04000000)) {
              to_bitField0_ |= 0x04000000;
            }
            result.sbPassword_ = sbPassword_;
            if (((from_bitField0_ & 0x08000000) == 0x08000000)) {
              to_bitField0_ |= 0x08000000;
            }
            if (additionalFieldsBuilder_ == null) {
              result.additionalFields_ = additionalFields_;
            } else {
              result.additionalFields_ = additionalFieldsBuilder_.build();
            }
            if (ecmBuilder_ == null) {
              if (((bitField0_ & 0x10000000) == 0x10000000)) {
                ecm_ = java.util.Collections.unmodifiableList(ecm_);
                bitField0_ = (bitField0_ & ~0x10000000);
              }
              result.ecm_ = ecm_;
            } else {
              result.ecm_ = ecmBuilder_.build();
            }
            if (((from_bitField0_ & 0x20000000) == 0x20000000)) {
              to_bitField0_ |= 0x10000000;
            }
            result.channel_ = channel_;
            if (((from_bitField0_ & 0x40000000) == 0x40000000)) {
              to_bitField0_ |= 0x20000000;
            }
            if (dynamicFieldsBuilder_ == null) {
              result.dynamicFields_ = dynamicFields_;
            } else {
              result.dynamicFields_ = dynamicFieldsBuilder_.build();
            }
            if (((from_bitField0_ & 0x80000000) == 0x80000000)) {
              to_bitField0_ |= 0x40000000;
            }
            if (sbDynamicFieldsBuilder_ == null) {
              result.sbDynamicFields_ = sbDynamicFields_;
            } else {
              result.sbDynamicFields_ = sbDynamicFieldsBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
          }

          @java.lang.Override
          public Builder clone() {
            return (Builder) super.clone();
          }
          @java.lang.Override
          public Builder setField(
              com.google.protobuf.Descriptors.FieldDescriptor field,
              java.lang.Object value) {
            return (Builder) super.setField(field, value);
          }
          @java.lang.Override
          public Builder clearField(
              com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
          }
          @java.lang.Override
          public Builder clearOneof(
              com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
          }
          @java.lang.Override
          public Builder setRepeatedField(
              com.google.protobuf.Descriptors.FieldDescriptor field,
              int index, java.lang.Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
          }
          @java.lang.Override
          public Builder addRepeatedField(
              com.google.protobuf.Descriptors.FieldDescriptor field,
              java.lang.Object value) {
            return (Builder) super.addRepeatedField(field, value);
          }
          @java.lang.Override
          public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO) {
              return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO)other);
            } else {
              super.mergeFrom(other);
              return this;
            }
          }

          public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO other) {
            if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.getDefaultInstance()) return this;
            if (other.hasNumber()) {
              bitField0_ |= 0x00000001;
              number_ = other.number_;
              onChanged();
            }
            if (other.hasSourceID()) {
              bitField0_ |= 0x00000002;
              sourceID_ = other.sourceID_;
              onChanged();
            }
            if (other.hasTitle()) {
              bitField0_ |= 0x00000004;
              title_ = other.title_;
              onChanged();
            }
            if (other.hasDescription()) {
              bitField0_ |= 0x00000008;
              description_ = other.description_;
              onChanged();
            }
            if (other.hasTemplateID()) {
              bitField0_ |= 0x00000010;
              templateID_ = other.templateID_;
              onChanged();
            }
            if (other.hasStatus()) {
              bitField0_ |= 0x00000020;
              status_ = other.status_;
              onChanged();
            }
            if (other.hasAssigneeName()) {
              bitField0_ |= 0x00000040;
              assigneeName_ = other.assigneeName_;
              onChanged();
            }
            if (other.hasAssignmentName()) {
              bitField0_ |= 0x00000080;
              assignmentName_ = other.assignmentName_;
              onChanged();
            }
            if (other.hasNextBreach()) {
              bitField0_ |= 0x00000100;
              nextBreach_ = other.nextBreach_;
              onChanged();
            }
            if (other.hasActualFinish()) {
              bitField0_ |= 0x00000200;
              actualFinish_ = other.actualFinish_;
              onChanged();
            }
            if (other.hasCloseTime()) {
              bitField0_ |= 0x00000400;
              closeTime_ = other.closeTime_;
              onChanged();
            }
            if (other.hasResolution()) {
              bitField0_ |= 0x00000800;
              resolution_ = other.resolution_;
              onChanged();
            }
            if (other.hasResolutionCode()) {
              bitField0_ |= 0x00001000;
              resolutionCode_ = other.resolutionCode_;
              onChanged();
            }
            if (other.hasAttachmentStatus()) {
              bitField0_ |= 0x00002000;
              attachmentStatus_ = other.attachmentStatus_;
              onChanged();
            }
            if (other.hasPriorityCode()) {
              bitField0_ |= 0x00004000;
              priorityCode_ = other.priorityCode_;
              onChanged();
            }
            if (other.hasContactName()) {
              bitField0_ |= 0x00008000;
              contactName_ = other.contactName_;
              onChanged();
            }
            if (other.hasCallbackContact()) {
              bitField0_ |= 0x00010000;
              callbackContact_ = other.callbackContact_;
              onChanged();
            }
            if (other.hasCategory()) {
              bitField0_ |= 0x00020000;
              category_ = other.category_;
              onChanged();
            }
            if (other.hasSbK2()) {
              bitField0_ |= 0x00040000;
              sbK2_ = other.sbK2_;
              onChanged();
            }
            if (other.hasSbAIB()) {
              bitField0_ |= 0x00080000;
              sbAIB_ = other.sbAIB_;
              onChanged();
            }
            if (other.hasSbDRUGId()) {
              bitField0_ |= 0x00100000;
              sbDRUGId_ = other.sbDRUGId_;
              onChanged();
            }
            if (other.hasSbMqrqid()) {
              bitField0_ |= 0x00200000;
              sbMqrqid_ = other.sbMqrqid_;
              onChanged();
            }
            if (other.hasSbSourceName()) {
              bitField0_ |= 0x00400000;
              sbSourceName_ = other.sbSourceName_;
              onChanged();
            }
            if (other.hasIncidentID()) {
              bitField0_ |= 0x00800000;
              incidentID_ = other.incidentID_;
              onChanged();
            }
            if (other.hasSbForecastMoveCause()) {
              bitField0_ |= 0x01000000;
              sbForecastMoveCause_ = other.sbForecastMoveCause_;
              onChanged();
            }
            if (other.hasSbLogin()) {
              bitField0_ |= 0x02000000;
              sbLogin_ = other.sbLogin_;
              onChanged();
            }
            if (other.hasSbPassword()) {
              bitField0_ |= 0x04000000;
              sbPassword_ = other.sbPassword_;
              onChanged();
            }
            if (other.hasAdditionalFields()) {
              mergeAdditionalFields(other.getAdditionalFields());
            }
            if (ecmBuilder_ == null) {
              if (!other.ecm_.isEmpty()) {
                if (ecm_.isEmpty()) {
                  ecm_ = other.ecm_;
                  bitField0_ = (bitField0_ & ~0x10000000);
                } else {
                  ensureEcmIsMutable();
                  ecm_.addAll(other.ecm_);
                }
                onChanged();
              }
            } else {
              if (!other.ecm_.isEmpty()) {
                if (ecmBuilder_.isEmpty()) {
                  ecmBuilder_.dispose();
                  ecmBuilder_ = null;
                  ecm_ = other.ecm_;
                  bitField0_ = (bitField0_ & ~0x10000000);
                  ecmBuilder_ = 
                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                       getEcmFieldBuilder() : null;
                } else {
                  ecmBuilder_.addAllMessages(other.ecm_);
                }
              }
            }
            if (other.hasChannel()) {
              bitField0_ |= 0x20000000;
              channel_ = other.channel_;
              onChanged();
            }
            if (other.hasDynamicFields()) {
              mergeDynamicFields(other.getDynamicFields());
            }
            if (other.hasSbDynamicFields()) {
              mergeSbDynamicFields(other.getSbDynamicFields());
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
          }

          @java.lang.Override
          public final boolean isInitialized() {
            if (!hasNumber()) {
              return false;
            }
            if (!hasSourceID()) {
              return false;
            }
            if (!hasTitle()) {
              return false;
            }
            if (!hasDescription()) {
              return false;
            }
            if (!hasTemplateID()) {
              return false;
            }
            if (!hasStatus()) {
              return false;
            }
            if (!hasAssigneeName()) {
              return false;
            }
            if (!hasAssignmentName()) {
              return false;
            }
            if (!hasNextBreach()) {
              return false;
            }
            if (!hasActualFinish()) {
              return false;
            }
            if (!hasCloseTime()) {
              return false;
            }
            if (!hasResolution()) {
              return false;
            }
            if (!hasResolutionCode()) {
              return false;
            }
            if (!hasAttachmentStatus()) {
              return false;
            }
            if (!hasPriorityCode()) {
              return false;
            }
            if (!hasContactName()) {
              return false;
            }
            if (!hasCallbackContact()) {
              return false;
            }
            if (!hasCategory()) {
              return false;
            }
            if (!hasSbK2()) {
              return false;
            }
            if (!hasSbAIB()) {
              return false;
            }
            if (!hasSbDRUGId()) {
              return false;
            }
            if (!hasSbMqrqid()) {
              return false;
            }
            if (!hasSbSourceName()) {
              return false;
            }
            if (!hasIncidentID()) {
              return false;
            }
            if (!hasSbForecastMoveCause()) {
              return false;
            }
            if (!hasSbLogin()) {
              return false;
            }
            if (!hasSbPassword()) {
              return false;
            }
            if (!hasAdditionalFields()) {
              return false;
            }
            if (!hasChannel()) {
              return false;
            }
            if (!hasDynamicFields()) {
              return false;
            }
            if (!hasSbDynamicFields()) {
              return false;
            }
            if (!getAdditionalFields().isInitialized()) {
              return false;
            }
            for (int i = 0; i < getEcmCount(); i++) {
              if (!getEcm(i).isInitialized()) {
                return false;
              }
            }
            if (!getDynamicFields().isInitialized()) {
              return false;
            }
            if (!getSbDynamicFields().isInitialized()) {
              return false;
            }
            return true;
          }

          @java.lang.Override
          public Builder mergeFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO parsedMessage = null;
            try {
              parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
              parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO) e.getUnfinishedMessage();
              throw e.unwrapIOException();
            } finally {
              if (parsedMessage != null) {
                mergeFrom(parsedMessage);
              }
            }
            return this;
          }
          private int bitField0_;

          private java.lang.Object number_ = "";
          /**
           * <code>required string Number = 32 [(.validation.regex) = ""];</code>
           */
          public boolean hasNumber() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
          }
          /**
           * <code>required string Number = 32 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getNumber() {
            java.lang.Object ref = number_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                number_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string Number = 32 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getNumberBytes() {
            java.lang.Object ref = number_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              number_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string Number = 32 [(.validation.regex) = ""];</code>
           */
          public Builder setNumber(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
            number_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string Number = 32 [(.validation.regex) = ""];</code>
           */
          public Builder clearNumber() {
            bitField0_ = (bitField0_ & ~0x00000001);
            number_ = getDefaultInstance().getNumber();
            onChanged();
            return this;
          }
          /**
           * <code>required string Number = 32 [(.validation.regex) = ""];</code>
           */
          public Builder setNumberBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
            number_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sourceID_ = "";
          /**
           * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
           */
          public boolean hasSourceID() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
          }
          /**
           * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSourceID() {
            java.lang.Object ref = sourceID_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sourceID_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSourceIDBytes() {
            java.lang.Object ref = sourceID_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sourceID_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
           */
          public Builder setSourceID(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
            sourceID_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
           */
          public Builder clearSourceID() {
            bitField0_ = (bitField0_ & ~0x00000002);
            sourceID_ = getDefaultInstance().getSourceID();
            onChanged();
            return this;
          }
          /**
           * <code>required string SourceID = 1 [(.validation.regex) = ""];</code>
           */
          public Builder setSourceIDBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
            sourceID_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object title_ = "";
          /**
           * <code>required string Title = 2 [(.validation.regex) = ""];</code>
           */
          public boolean hasTitle() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
          }
          /**
           * <code>required string Title = 2 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getTitle() {
            java.lang.Object ref = title_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                title_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string Title = 2 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getTitleBytes() {
            java.lang.Object ref = title_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              title_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string Title = 2 [(.validation.regex) = ""];</code>
           */
          public Builder setTitle(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
            title_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string Title = 2 [(.validation.regex) = ""];</code>
           */
          public Builder clearTitle() {
            bitField0_ = (bitField0_ & ~0x00000004);
            title_ = getDefaultInstance().getTitle();
            onChanged();
            return this;
          }
          /**
           * <code>required string Title = 2 [(.validation.regex) = ""];</code>
           */
          public Builder setTitleBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
            title_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object description_ = "";
          /**
           * <code>required string Description = 3 [(.validation.regex) = ""];</code>
           */
          public boolean hasDescription() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
          }
          /**
           * <code>required string Description = 3 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getDescription() {
            java.lang.Object ref = description_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                description_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string Description = 3 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getDescriptionBytes() {
            java.lang.Object ref = description_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              description_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string Description = 3 [(.validation.regex) = ""];</code>
           */
          public Builder setDescription(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
            description_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string Description = 3 [(.validation.regex) = ""];</code>
           */
          public Builder clearDescription() {
            bitField0_ = (bitField0_ & ~0x00000008);
            description_ = getDefaultInstance().getDescription();
            onChanged();
            return this;
          }
          /**
           * <code>required string Description = 3 [(.validation.regex) = ""];</code>
           */
          public Builder setDescriptionBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
            description_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object templateID_ = "";
          /**
           * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
           */
          public boolean hasTemplateID() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
          }
          /**
           * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getTemplateID() {
            java.lang.Object ref = templateID_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                templateID_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getTemplateIDBytes() {
            java.lang.Object ref = templateID_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              templateID_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
           */
          public Builder setTemplateID(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
            templateID_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
           */
          public Builder clearTemplateID() {
            bitField0_ = (bitField0_ & ~0x00000010);
            templateID_ = getDefaultInstance().getTemplateID();
            onChanged();
            return this;
          }
          /**
           * <code>required string TemplateID = 4 [(.validation.regex) = ""];</code>
           */
          public Builder setTemplateIDBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
            templateID_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object status_ = "";
          /**
           * <code>required string Status = 5 [(.validation.regex) = ""];</code>
           */
          public boolean hasStatus() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
          }
          /**
           * <code>required string Status = 5 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getStatus() {
            java.lang.Object ref = status_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                status_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string Status = 5 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getStatusBytes() {
            java.lang.Object ref = status_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              status_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string Status = 5 [(.validation.regex) = ""];</code>
           */
          public Builder setStatus(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
            status_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string Status = 5 [(.validation.regex) = ""];</code>
           */
          public Builder clearStatus() {
            bitField0_ = (bitField0_ & ~0x00000020);
            status_ = getDefaultInstance().getStatus();
            onChanged();
            return this;
          }
          /**
           * <code>required string Status = 5 [(.validation.regex) = ""];</code>
           */
          public Builder setStatusBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
            status_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object assigneeName_ = "";
          /**
           * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
           */
          public boolean hasAssigneeName() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
          }
          /**
           * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getAssigneeName() {
            java.lang.Object ref = assigneeName_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                assigneeName_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getAssigneeNameBytes() {
            java.lang.Object ref = assigneeName_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              assigneeName_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
           */
          public Builder setAssigneeName(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
            assigneeName_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
           */
          public Builder clearAssigneeName() {
            bitField0_ = (bitField0_ & ~0x00000040);
            assigneeName_ = getDefaultInstance().getAssigneeName();
            onChanged();
            return this;
          }
          /**
           * <code>required string AssigneeName = 6 [(.validation.regex) = ""];</code>
           */
          public Builder setAssigneeNameBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
            assigneeName_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object assignmentName_ = "";
          /**
           * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
           */
          public boolean hasAssignmentName() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
          }
          /**
           * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getAssignmentName() {
            java.lang.Object ref = assignmentName_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                assignmentName_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getAssignmentNameBytes() {
            java.lang.Object ref = assignmentName_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              assignmentName_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
           */
          public Builder setAssignmentName(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
            assignmentName_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
           */
          public Builder clearAssignmentName() {
            bitField0_ = (bitField0_ & ~0x00000080);
            assignmentName_ = getDefaultInstance().getAssignmentName();
            onChanged();
            return this;
          }
          /**
           * <code>required string AssignmentName = 7 [(.validation.regex) = ""];</code>
           */
          public Builder setAssignmentNameBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
            assignmentName_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object nextBreach_ = "";
          /**
           * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
           */
          public boolean hasNextBreach() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
          }
          /**
           * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getNextBreach() {
            java.lang.Object ref = nextBreach_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                nextBreach_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getNextBreachBytes() {
            java.lang.Object ref = nextBreach_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              nextBreach_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
           */
          public Builder setNextBreach(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
            nextBreach_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
           */
          public Builder clearNextBreach() {
            bitField0_ = (bitField0_ & ~0x00000100);
            nextBreach_ = getDefaultInstance().getNextBreach();
            onChanged();
            return this;
          }
          /**
           * <code>required string NextBreach = 8 [(.validation.regex) = ""];</code>
           */
          public Builder setNextBreachBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
            nextBreach_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object actualFinish_ = "";
          /**
           * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
           */
          public boolean hasActualFinish() {
            return ((bitField0_ & 0x00000200) == 0x00000200);
          }
          /**
           * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getActualFinish() {
            java.lang.Object ref = actualFinish_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                actualFinish_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getActualFinishBytes() {
            java.lang.Object ref = actualFinish_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              actualFinish_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
           */
          public Builder setActualFinish(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
            actualFinish_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
           */
          public Builder clearActualFinish() {
            bitField0_ = (bitField0_ & ~0x00000200);
            actualFinish_ = getDefaultInstance().getActualFinish();
            onChanged();
            return this;
          }
          /**
           * <code>required string ActualFinish = 9 [(.validation.regex) = ""];</code>
           */
          public Builder setActualFinishBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
            actualFinish_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object closeTime_ = "";
          /**
           * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
           */
          public boolean hasCloseTime() {
            return ((bitField0_ & 0x00000400) == 0x00000400);
          }
          /**
           * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getCloseTime() {
            java.lang.Object ref = closeTime_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                closeTime_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getCloseTimeBytes() {
            java.lang.Object ref = closeTime_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              closeTime_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
           */
          public Builder setCloseTime(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
            closeTime_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
           */
          public Builder clearCloseTime() {
            bitField0_ = (bitField0_ & ~0x00000400);
            closeTime_ = getDefaultInstance().getCloseTime();
            onChanged();
            return this;
          }
          /**
           * <code>required string CloseTime = 10 [(.validation.regex) = ""];</code>
           */
          public Builder setCloseTimeBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
            closeTime_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object resolution_ = "";
          /**
           * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
           */
          public boolean hasResolution() {
            return ((bitField0_ & 0x00000800) == 0x00000800);
          }
          /**
           * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getResolution() {
            java.lang.Object ref = resolution_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                resolution_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getResolutionBytes() {
            java.lang.Object ref = resolution_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              resolution_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
           */
          public Builder setResolution(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
            resolution_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
           */
          public Builder clearResolution() {
            bitField0_ = (bitField0_ & ~0x00000800);
            resolution_ = getDefaultInstance().getResolution();
            onChanged();
            return this;
          }
          /**
           * <code>required string Resolution = 11 [(.validation.regex) = ""];</code>
           */
          public Builder setResolutionBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
            resolution_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object resolutionCode_ = "";
          /**
           * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
           */
          public boolean hasResolutionCode() {
            return ((bitField0_ & 0x00001000) == 0x00001000);
          }
          /**
           * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getResolutionCode() {
            java.lang.Object ref = resolutionCode_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                resolutionCode_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getResolutionCodeBytes() {
            java.lang.Object ref = resolutionCode_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              resolutionCode_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
           */
          public Builder setResolutionCode(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
            resolutionCode_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
           */
          public Builder clearResolutionCode() {
            bitField0_ = (bitField0_ & ~0x00001000);
            resolutionCode_ = getDefaultInstance().getResolutionCode();
            onChanged();
            return this;
          }
          /**
           * <code>required string ResolutionCode = 12 [(.validation.regex) = ""];</code>
           */
          public Builder setResolutionCodeBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
            resolutionCode_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object attachmentStatus_ = "";
          /**
           * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
           */
          public boolean hasAttachmentStatus() {
            return ((bitField0_ & 0x00002000) == 0x00002000);
          }
          /**
           * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getAttachmentStatus() {
            java.lang.Object ref = attachmentStatus_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                attachmentStatus_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getAttachmentStatusBytes() {
            java.lang.Object ref = attachmentStatus_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              attachmentStatus_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
           */
          public Builder setAttachmentStatus(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00002000;
            attachmentStatus_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
           */
          public Builder clearAttachmentStatus() {
            bitField0_ = (bitField0_ & ~0x00002000);
            attachmentStatus_ = getDefaultInstance().getAttachmentStatus();
            onChanged();
            return this;
          }
          /**
           * <code>required string AttachmentStatus = 13 [(.validation.regex) = ""];</code>
           */
          public Builder setAttachmentStatusBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00002000;
            attachmentStatus_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object priorityCode_ = "";
          /**
           * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
           */
          public boolean hasPriorityCode() {
            return ((bitField0_ & 0x00004000) == 0x00004000);
          }
          /**
           * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getPriorityCode() {
            java.lang.Object ref = priorityCode_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                priorityCode_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getPriorityCodeBytes() {
            java.lang.Object ref = priorityCode_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              priorityCode_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
           */
          public Builder setPriorityCode(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00004000;
            priorityCode_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
           */
          public Builder clearPriorityCode() {
            bitField0_ = (bitField0_ & ~0x00004000);
            priorityCode_ = getDefaultInstance().getPriorityCode();
            onChanged();
            return this;
          }
          /**
           * <code>required string PriorityCode = 14 [(.validation.regex) = ""];</code>
           */
          public Builder setPriorityCodeBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00004000;
            priorityCode_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object contactName_ = "";
          /**
           * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
           */
          public boolean hasContactName() {
            return ((bitField0_ & 0x00008000) == 0x00008000);
          }
          /**
           * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getContactName() {
            java.lang.Object ref = contactName_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                contactName_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getContactNameBytes() {
            java.lang.Object ref = contactName_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              contactName_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
           */
          public Builder setContactName(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00008000;
            contactName_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
           */
          public Builder clearContactName() {
            bitField0_ = (bitField0_ & ~0x00008000);
            contactName_ = getDefaultInstance().getContactName();
            onChanged();
            return this;
          }
          /**
           * <code>required string ContactName = 15 [(.validation.regex) = ""];</code>
           */
          public Builder setContactNameBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00008000;
            contactName_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object callbackContact_ = "";
          /**
           * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
           */
          public boolean hasCallbackContact() {
            return ((bitField0_ & 0x00010000) == 0x00010000);
          }
          /**
           * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getCallbackContact() {
            java.lang.Object ref = callbackContact_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                callbackContact_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getCallbackContactBytes() {
            java.lang.Object ref = callbackContact_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              callbackContact_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
           */
          public Builder setCallbackContact(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00010000;
            callbackContact_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
           */
          public Builder clearCallbackContact() {
            bitField0_ = (bitField0_ & ~0x00010000);
            callbackContact_ = getDefaultInstance().getCallbackContact();
            onChanged();
            return this;
          }
          /**
           * <code>required string CallbackContact = 16 [(.validation.regex) = ""];</code>
           */
          public Builder setCallbackContactBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00010000;
            callbackContact_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object category_ = "";
          /**
           * <code>required string Category = 17 [(.validation.regex) = ""];</code>
           */
          public boolean hasCategory() {
            return ((bitField0_ & 0x00020000) == 0x00020000);
          }
          /**
           * <code>required string Category = 17 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getCategory() {
            java.lang.Object ref = category_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                category_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string Category = 17 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getCategoryBytes() {
            java.lang.Object ref = category_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              category_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string Category = 17 [(.validation.regex) = ""];</code>
           */
          public Builder setCategory(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00020000;
            category_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string Category = 17 [(.validation.regex) = ""];</code>
           */
          public Builder clearCategory() {
            bitField0_ = (bitField0_ & ~0x00020000);
            category_ = getDefaultInstance().getCategory();
            onChanged();
            return this;
          }
          /**
           * <code>required string Category = 17 [(.validation.regex) = ""];</code>
           */
          public Builder setCategoryBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00020000;
            category_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbK2_ = "";
          /**
           * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbK2() {
            return ((bitField0_ & 0x00040000) == 0x00040000);
          }
          /**
           * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbK2() {
            java.lang.Object ref = sbK2_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbK2_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbK2Bytes() {
            java.lang.Object ref = sbK2_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbK2_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
           */
          public Builder setSbK2(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00040000;
            sbK2_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbK2() {
            bitField0_ = (bitField0_ & ~0x00040000);
            sbK2_ = getDefaultInstance().getSbK2();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbK2 = 18 [(.validation.regex) = ""];</code>
           */
          public Builder setSbK2Bytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00040000;
            sbK2_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbAIB_ = "";
          /**
           * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbAIB() {
            return ((bitField0_ & 0x00080000) == 0x00080000);
          }
          /**
           * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbAIB() {
            java.lang.Object ref = sbAIB_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbAIB_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbAIBBytes() {
            java.lang.Object ref = sbAIB_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbAIB_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
           */
          public Builder setSbAIB(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00080000;
            sbAIB_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbAIB() {
            bitField0_ = (bitField0_ & ~0x00080000);
            sbAIB_ = getDefaultInstance().getSbAIB();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbAIB = 19 [(.validation.regex) = ""];</code>
           */
          public Builder setSbAIBBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00080000;
            sbAIB_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbDRUGId_ = "";
          /**
           * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbDRUGId() {
            return ((bitField0_ & 0x00100000) == 0x00100000);
          }
          /**
           * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbDRUGId() {
            java.lang.Object ref = sbDRUGId_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbDRUGId_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbDRUGIdBytes() {
            java.lang.Object ref = sbDRUGId_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbDRUGId_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
           */
          public Builder setSbDRUGId(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00100000;
            sbDRUGId_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbDRUGId() {
            bitField0_ = (bitField0_ & ~0x00100000);
            sbDRUGId_ = getDefaultInstance().getSbDRUGId();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbDRUGId = 20 [(.validation.regex) = ""];</code>
           */
          public Builder setSbDRUGIdBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00100000;
            sbDRUGId_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbMqrqid_ = "";
          /**
           * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbMqrqid() {
            return ((bitField0_ & 0x00200000) == 0x00200000);
          }
          /**
           * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbMqrqid() {
            java.lang.Object ref = sbMqrqid_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbMqrqid_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbMqrqidBytes() {
            java.lang.Object ref = sbMqrqid_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbMqrqid_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
           */
          public Builder setSbMqrqid(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00200000;
            sbMqrqid_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbMqrqid() {
            bitField0_ = (bitField0_ & ~0x00200000);
            sbMqrqid_ = getDefaultInstance().getSbMqrqid();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbMqrqid = 21 [(.validation.regex) = ""];</code>
           */
          public Builder setSbMqrqidBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00200000;
            sbMqrqid_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbSourceName_ = "";
          /**
           * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbSourceName() {
            return ((bitField0_ & 0x00400000) == 0x00400000);
          }
          /**
           * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbSourceName() {
            java.lang.Object ref = sbSourceName_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbSourceName_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbSourceNameBytes() {
            java.lang.Object ref = sbSourceName_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbSourceName_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
           */
          public Builder setSbSourceName(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00400000;
            sbSourceName_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbSourceName() {
            bitField0_ = (bitField0_ & ~0x00400000);
            sbSourceName_ = getDefaultInstance().getSbSourceName();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbSourceName = 22 [(.validation.regex) = ""];</code>
           */
          public Builder setSbSourceNameBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00400000;
            sbSourceName_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object incidentID_ = "";
          /**
           * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
           */
          public boolean hasIncidentID() {
            return ((bitField0_ & 0x00800000) == 0x00800000);
          }
          /**
           * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getIncidentID() {
            java.lang.Object ref = incidentID_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                incidentID_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getIncidentIDBytes() {
            java.lang.Object ref = incidentID_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              incidentID_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
           */
          public Builder setIncidentID(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00800000;
            incidentID_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
           */
          public Builder clearIncidentID() {
            bitField0_ = (bitField0_ & ~0x00800000);
            incidentID_ = getDefaultInstance().getIncidentID();
            onChanged();
            return this;
          }
          /**
           * <code>required string IncidentID = 23 [(.validation.regex) = ""];</code>
           */
          public Builder setIncidentIDBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00800000;
            incidentID_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbForecastMoveCause_ = "";
          /**
           * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbForecastMoveCause() {
            return ((bitField0_ & 0x01000000) == 0x01000000);
          }
          /**
           * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbForecastMoveCause() {
            java.lang.Object ref = sbForecastMoveCause_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbForecastMoveCause_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbForecastMoveCauseBytes() {
            java.lang.Object ref = sbForecastMoveCause_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbForecastMoveCause_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
           */
          public Builder setSbForecastMoveCause(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x01000000;
            sbForecastMoveCause_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbForecastMoveCause() {
            bitField0_ = (bitField0_ & ~0x01000000);
            sbForecastMoveCause_ = getDefaultInstance().getSbForecastMoveCause();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbForecastMoveCause = 24 [(.validation.regex) = ""];</code>
           */
          public Builder setSbForecastMoveCauseBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x01000000;
            sbForecastMoveCause_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbLogin_ = "";
          /**
           * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbLogin() {
            return ((bitField0_ & 0x02000000) == 0x02000000);
          }
          /**
           * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbLogin() {
            java.lang.Object ref = sbLogin_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbLogin_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbLoginBytes() {
            java.lang.Object ref = sbLogin_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbLogin_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
           */
          public Builder setSbLogin(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x02000000;
            sbLogin_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbLogin() {
            bitField0_ = (bitField0_ & ~0x02000000);
            sbLogin_ = getDefaultInstance().getSbLogin();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbLogin = 25 [(.validation.regex) = ""];</code>
           */
          public Builder setSbLoginBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x02000000;
            sbLogin_ = value;
            onChanged();
            return this;
          }

          private java.lang.Object sbPassword_ = "";
          /**
           * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
           */
          public boolean hasSbPassword() {
            return ((bitField0_ & 0x04000000) == 0x04000000);
          }
          /**
           * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getSbPassword() {
            java.lang.Object ref = sbPassword_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                sbPassword_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getSbPasswordBytes() {
            java.lang.Object ref = sbPassword_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              sbPassword_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
           */
          public Builder setSbPassword(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x04000000;
            sbPassword_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
           */
          public Builder clearSbPassword() {
            bitField0_ = (bitField0_ & ~0x04000000);
            sbPassword_ = getDefaultInstance().getSbPassword();
            onChanged();
            return this;
          }
          /**
           * <code>required string SbPassword = 26 [(.validation.regex) = ""];</code>
           */
          public Builder setSbPasswordBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x04000000;
            sbPassword_ = value;
            onChanged();
            return this;
          }

          private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS additionalFields_ = null;
          private com.google.protobuf.SingleFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDSOrBuilder> additionalFieldsBuilder_;
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public boolean hasAdditionalFields() {
            return ((bitField0_ & 0x08000000) == 0x08000000);
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS getAdditionalFields() {
            if (additionalFieldsBuilder_ == null) {
              return additionalFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.getDefaultInstance() : additionalFields_;
            } else {
              return additionalFieldsBuilder_.getMessage();
            }
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public Builder setAdditionalFields(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS value) {
            if (additionalFieldsBuilder_ == null) {
              if (value == null) {
                throw new NullPointerException();
              }
              additionalFields_ = value;
              onChanged();
            } else {
              additionalFieldsBuilder_.setMessage(value);
            }
            bitField0_ |= 0x08000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public Builder setAdditionalFields(
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder builderForValue) {
            if (additionalFieldsBuilder_ == null) {
              additionalFields_ = builderForValue.build();
              onChanged();
            } else {
              additionalFieldsBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x08000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public Builder mergeAdditionalFields(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS value) {
            if (additionalFieldsBuilder_ == null) {
              if (((bitField0_ & 0x08000000) == 0x08000000) &&
                  additionalFields_ != null &&
                  additionalFields_ != Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.getDefaultInstance()) {
                additionalFields_ =
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.newBuilder(additionalFields_).mergeFrom(value).buildPartial();
              } else {
                additionalFields_ = value;
              }
              onChanged();
            } else {
              additionalFieldsBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x08000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public Builder clearAdditionalFields() {
            if (additionalFieldsBuilder_ == null) {
              additionalFields_ = null;
              onChanged();
            } else {
              additionalFieldsBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x08000000);
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder getAdditionalFieldsBuilder() {
            bitField0_ |= 0x08000000;
            onChanged();
            return getAdditionalFieldsFieldBuilder().getBuilder();
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDSOrBuilder getAdditionalFieldsOrBuilder() {
            if (additionalFieldsBuilder_ != null) {
              return additionalFieldsBuilder_.getMessageOrBuilder();
            } else {
              return additionalFields_ == null ?
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.getDefaultInstance() : additionalFields_;
            }
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS AdditionalFields = 27 [(.validation.regex) = ""];</code>
           */
          private com.google.protobuf.SingleFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDSOrBuilder> 
              getAdditionalFieldsFieldBuilder() {
            if (additionalFieldsBuilder_ == null) {
              additionalFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDSOrBuilder>(
                      getAdditionalFields(),
                      getParentForChildren(),
                      isClean());
              additionalFields_ = null;
            }
            return additionalFieldsBuilder_;
          }

          private java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM> ecm_ =
            java.util.Collections.emptyList();
          private void ensureEcmIsMutable() {
            if (!((bitField0_ & 0x10000000) == 0x10000000)) {
              ecm_ = new java.util.ArrayList<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM>(ecm_);
              bitField0_ |= 0x10000000;
             }
          }

          private com.google.protobuf.RepeatedFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder> ecmBuilder_;

          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM> getEcmList() {
            if (ecmBuilder_ == null) {
              return java.util.Collections.unmodifiableList(ecm_);
            } else {
              return ecmBuilder_.getMessageList();
            }
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public int getEcmCount() {
            if (ecmBuilder_ == null) {
              return ecm_.size();
            } else {
              return ecmBuilder_.getCount();
            }
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM getEcm(int index) {
            if (ecmBuilder_ == null) {
              return ecm_.get(index);
            } else {
              return ecmBuilder_.getMessage(index);
            }
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder setEcm(
              int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM value) {
            if (ecmBuilder_ == null) {
              if (value == null) {
                throw new NullPointerException();
              }
              ensureEcmIsMutable();
              ecm_.set(index, value);
              onChanged();
            } else {
              ecmBuilder_.setMessage(index, value);
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder setEcm(
              int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder builderForValue) {
            if (ecmBuilder_ == null) {
              ensureEcmIsMutable();
              ecm_.set(index, builderForValue.build());
              onChanged();
            } else {
              ecmBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder addEcm(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM value) {
            if (ecmBuilder_ == null) {
              if (value == null) {
                throw new NullPointerException();
              }
              ensureEcmIsMutable();
              ecm_.add(value);
              onChanged();
            } else {
              ecmBuilder_.addMessage(value);
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder addEcm(
              int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM value) {
            if (ecmBuilder_ == null) {
              if (value == null) {
                throw new NullPointerException();
              }
              ensureEcmIsMutable();
              ecm_.add(index, value);
              onChanged();
            } else {
              ecmBuilder_.addMessage(index, value);
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder addEcm(
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder builderForValue) {
            if (ecmBuilder_ == null) {
              ensureEcmIsMutable();
              ecm_.add(builderForValue.build());
              onChanged();
            } else {
              ecmBuilder_.addMessage(builderForValue.build());
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder addEcm(
              int index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder builderForValue) {
            if (ecmBuilder_ == null) {
              ensureEcmIsMutable();
              ecm_.add(index, builderForValue.build());
              onChanged();
            } else {
              ecmBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder addAllEcm(
              java.lang.Iterable<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM> values) {
            if (ecmBuilder_ == null) {
              ensureEcmIsMutable();
              com.google.protobuf.AbstractMessageLite.Builder.addAll(
                  values, ecm_);
              onChanged();
            } else {
              ecmBuilder_.addAllMessages(values);
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder clearEcm() {
            if (ecmBuilder_ == null) {
              ecm_ = java.util.Collections.emptyList();
              bitField0_ = (bitField0_ & ~0x10000000);
              onChanged();
            } else {
              ecmBuilder_.clear();
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Builder removeEcm(int index) {
            if (ecmBuilder_ == null) {
              ensureEcmIsMutable();
              ecm_.remove(index);
              onChanged();
            } else {
              ecmBuilder_.remove(index);
            }
            return this;
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder getEcmBuilder(
              int index) {
            return getEcmFieldBuilder().getBuilder(index);
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder getEcmOrBuilder(
              int index) {
            if (ecmBuilder_ == null) {
              return ecm_.get(index);  } else {
              return ecmBuilder_.getMessageOrBuilder(index);
            }
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public java.util.List<? extends Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder> 
               getEcmOrBuilderList() {
            if (ecmBuilder_ != null) {
              return ecmBuilder_.getMessageOrBuilderList();
            } else {
              return java.util.Collections.unmodifiableList(ecm_);
            }
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder addEcmBuilder() {
            return getEcmFieldBuilder().addBuilder(
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.getDefaultInstance());
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder addEcmBuilder(
              int index) {
            return getEcmFieldBuilder().addBuilder(
                index, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.getDefaultInstance());
          }
          /**
           * <code>repeated .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM Ecm = 28 [(.validation.required) = true];</code>
           */
          public java.util.List<Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder> 
               getEcmBuilderList() {
            return getEcmFieldBuilder().getBuilderList();
          }
          private com.google.protobuf.RepeatedFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder> 
              getEcmFieldBuilder() {
            if (ecmBuilder_ == null) {
              ecmBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECM.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMOrBuilder>(
                      ecm_,
                      ((bitField0_ & 0x10000000) == 0x10000000),
                      getParentForChildren(),
                      isClean());
              ecm_ = null;
            }
            return ecmBuilder_;
          }

          private java.lang.Object channel_ = "";
          /**
           * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
           */
          public boolean hasChannel() {
            return ((bitField0_ & 0x20000000) == 0x20000000);
          }
          /**
           * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
           */
          public java.lang.String getChannel() {
            java.lang.Object ref = channel_;
            if (!(ref instanceof java.lang.String)) {
              com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
              java.lang.String s = bs.toStringUtf8();
              if (bs.isValidUtf8()) {
                channel_ = s;
              }
              return s;
            } else {
              return (java.lang.String) ref;
            }
          }
          /**
           * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
           */
          public com.google.protobuf.ByteString
              getChannelBytes() {
            java.lang.Object ref = channel_;
            if (ref instanceof String) {
              com.google.protobuf.ByteString b = 
                  com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
              channel_ = b;
              return b;
            } else {
              return (com.google.protobuf.ByteString) ref;
            }
          }
          /**
           * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
           */
          public Builder setChannel(
              java.lang.String value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x20000000;
            channel_ = value;
            onChanged();
            return this;
          }
          /**
           * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
           */
          public Builder clearChannel() {
            bitField0_ = (bitField0_ & ~0x20000000);
            channel_ = getDefaultInstance().getChannel();
            onChanged();
            return this;
          }
          /**
           * <code>required string Channel = 29 [(.validation.regex) = ""];</code>
           */
          public Builder setChannelBytes(
              com.google.protobuf.ByteString value) {
            if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x20000000;
            channel_ = value;
            onChanged();
            return this;
          }

          private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS dynamicFields_ = null;
          private com.google.protobuf.SingleFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDSOrBuilder> dynamicFieldsBuilder_;
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public boolean hasDynamicFields() {
            return ((bitField0_ & 0x40000000) == 0x40000000);
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS getDynamicFields() {
            if (dynamicFieldsBuilder_ == null) {
              return dynamicFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.getDefaultInstance() : dynamicFields_;
            } else {
              return dynamicFieldsBuilder_.getMessage();
            }
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public Builder setDynamicFields(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS value) {
            if (dynamicFieldsBuilder_ == null) {
              if (value == null) {
                throw new NullPointerException();
              }
              dynamicFields_ = value;
              onChanged();
            } else {
              dynamicFieldsBuilder_.setMessage(value);
            }
            bitField0_ |= 0x40000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public Builder setDynamicFields(
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder builderForValue) {
            if (dynamicFieldsBuilder_ == null) {
              dynamicFields_ = builderForValue.build();
              onChanged();
            } else {
              dynamicFieldsBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x40000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public Builder mergeDynamicFields(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS value) {
            if (dynamicFieldsBuilder_ == null) {
              if (((bitField0_ & 0x40000000) == 0x40000000) &&
                  dynamicFields_ != null &&
                  dynamicFields_ != Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.getDefaultInstance()) {
                dynamicFields_ =
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.newBuilder(dynamicFields_).mergeFrom(value).buildPartial();
              } else {
                dynamicFields_ = value;
              }
              onChanged();
            } else {
              dynamicFieldsBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x40000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public Builder clearDynamicFields() {
            if (dynamicFieldsBuilder_ == null) {
              dynamicFields_ = null;
              onChanged();
            } else {
              dynamicFieldsBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x40000000);
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder getDynamicFieldsBuilder() {
            bitField0_ |= 0x40000000;
            onChanged();
            return getDynamicFieldsFieldBuilder().getBuilder();
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDSOrBuilder getDynamicFieldsOrBuilder() {
            if (dynamicFieldsBuilder_ != null) {
              return dynamicFieldsBuilder_.getMessageOrBuilder();
            } else {
              return dynamicFields_ == null ?
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.getDefaultInstance() : dynamicFields_;
            }
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS DynamicFields = 30 [(.validation.required) = true];</code>
           */
          private com.google.protobuf.SingleFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDSOrBuilder> 
              getDynamicFieldsFieldBuilder() {
            if (dynamicFieldsBuilder_ == null) {
              dynamicFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDSOrBuilder>(
                      getDynamicFields(),
                      getParentForChildren(),
                      isClean());
              dynamicFields_ = null;
            }
            return dynamicFieldsBuilder_;
          }

          private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS sbDynamicFields_ = null;
          private com.google.protobuf.SingleFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDSOrBuilder> sbDynamicFieldsBuilder_;
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public boolean hasSbDynamicFields() {
            return ((bitField0_ & 0x80000000) == 0x80000000);
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS getSbDynamicFields() {
            if (sbDynamicFieldsBuilder_ == null) {
              return sbDynamicFields_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.getDefaultInstance() : sbDynamicFields_;
            } else {
              return sbDynamicFieldsBuilder_.getMessage();
            }
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public Builder setSbDynamicFields(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS value) {
            if (sbDynamicFieldsBuilder_ == null) {
              if (value == null) {
                throw new NullPointerException();
              }
              sbDynamicFields_ = value;
              onChanged();
            } else {
              sbDynamicFieldsBuilder_.setMessage(value);
            }
            bitField0_ |= 0x80000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public Builder setSbDynamicFields(
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder builderForValue) {
            if (sbDynamicFieldsBuilder_ == null) {
              sbDynamicFields_ = builderForValue.build();
              onChanged();
            } else {
              sbDynamicFieldsBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x80000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public Builder mergeSbDynamicFields(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS value) {
            if (sbDynamicFieldsBuilder_ == null) {
              if (((bitField0_ & 0x80000000) == 0x80000000) &&
                  sbDynamicFields_ != null &&
                  sbDynamicFields_ != Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.getDefaultInstance()) {
                sbDynamicFields_ =
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.newBuilder(sbDynamicFields_).mergeFrom(value).buildPartial();
              } else {
                sbDynamicFields_ = value;
              }
              onChanged();
            } else {
              sbDynamicFieldsBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x80000000;
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public Builder clearSbDynamicFields() {
            if (sbDynamicFieldsBuilder_ == null) {
              sbDynamicFields_ = null;
              onChanged();
            } else {
              sbDynamicFieldsBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x80000000);
            return this;
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder getSbDynamicFieldsBuilder() {
            bitField0_ |= 0x80000000;
            onChanged();
            return getSbDynamicFieldsFieldBuilder().getBuilder();
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDSOrBuilder getSbDynamicFieldsOrBuilder() {
            if (sbDynamicFieldsBuilder_ != null) {
              return sbDynamicFieldsBuilder_.getMessageOrBuilder();
            } else {
              return sbDynamicFields_ == null ?
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.getDefaultInstance() : sbDynamicFields_;
            }
          }
          /**
           * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS SbDynamicFields = 31 [(.validation.required) = true];</code>
           */
          private com.google.protobuf.SingleFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDSOrBuilder> 
              getSbDynamicFieldsFieldBuilder() {
            if (sbDynamicFieldsBuilder_ == null) {
              sbDynamicFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDS.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMICFIELDSOrBuilder>(
                      getSbDynamicFields(),
                      getParentForChildren(),
                      isClean());
              sbDynamicFields_ = null;
            }
            return sbDynamicFieldsBuilder_;
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


          // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO)
        }

        // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO)
        private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO DEFAULT_INSTANCE;
        static {
          DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO();
        }

        public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO getDefaultInstance() {
          return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<ZNO>
            PARSER = new com.google.protobuf.AbstractParser<ZNO>() {
          @java.lang.Override
          public ZNO parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ZNO(input, extensionRegistry);
          }
        };

        public static com.google.protobuf.Parser<ZNO> parser() {
          return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ZNO> getParserForType() {
          return PARSER;
        }

        @java.lang.Override
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO getDefaultInstanceForType() {
          return DEFAULT_INSTANCE;
        }

      }

      private int bitField0_;
      public static final int ZNO_FIELD_NUMBER = 39;
      private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO zno_;
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
       */
      public boolean hasZno() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
       */
      public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO getZno() {
        return zno_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.getDefaultInstance() : zno_;
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
       */
      public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNOOrBuilder getZnoOrBuilder() {
        return zno_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.getDefaultInstance() : zno_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasZno()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!getZno().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeMessage(39, getZno());
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(39, getZno());
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
        if (!(obj instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ)) {
          return super.equals(obj);
        }
        Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ other = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ) obj;

        boolean result = true;
        result = result && (hasZno() == other.hasZno());
        if (hasZno()) {
          result = result && getZno()
              .equals(other.getZno());
        }
        result = result && unknownFields.equals(other.unknownFields);
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasZno()) {
          hash = (37 * hash) + ZNO_FIELD_NUMBER;
          hash = (53 * hash) + getZno().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parseFrom(
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
      public static Builder newBuilder(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ prototype) {
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
       * Protobuf type {@code NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ)
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.class, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder.class);
        }

        // Construct using Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.newBuilder()
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
            getZnoFieldBuilder();
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          if (znoBuilder_ == null) {
            zno_ = null;
          } else {
            znoBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return Valid.internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_descriptor;
        }

        @java.lang.Override
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ getDefaultInstanceForType() {
          return Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.getDefaultInstance();
        }

        @java.lang.Override
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ build() {
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ buildPartial() {
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ result = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          if (znoBuilder_ == null) {
            result.zno_ = zno_;
          } else {
            result.zno_ = znoBuilder_.build();
          }
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return (Builder) super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return (Builder) super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ) {
            return mergeFrom((Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ other) {
          if (other == Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.getDefaultInstance()) return this;
          if (other.hasZno()) {
            mergeZno(other.getZno());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasZno()) {
            return false;
          }
          if (!getZno().isInitialized()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO zno_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNOOrBuilder> znoBuilder_;
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public boolean hasZno() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO getZno() {
          if (znoBuilder_ == null) {
            return zno_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.getDefaultInstance() : zno_;
          } else {
            return znoBuilder_.getMessage();
          }
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public Builder setZno(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO value) {
          if (znoBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            zno_ = value;
            onChanged();
          } else {
            znoBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public Builder setZno(
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder builderForValue) {
          if (znoBuilder_ == null) {
            zno_ = builderForValue.build();
            onChanged();
          } else {
            znoBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public Builder mergeZno(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO value) {
          if (znoBuilder_ == null) {
            if (((bitField0_ & 0x00000001) == 0x00000001) &&
                zno_ != null &&
                zno_ != Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.getDefaultInstance()) {
              zno_ =
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.newBuilder(zno_).mergeFrom(value).buildPartial();
            } else {
              zno_ = value;
            }
            onChanged();
          } else {
            znoBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public Builder clearZno() {
          if (znoBuilder_ == null) {
            zno_ = null;
            onChanged();
          } else {
            znoBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder getZnoBuilder() {
          bitField0_ |= 0x00000001;
          onChanged();
          return getZnoFieldBuilder().getBuilder();
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNOOrBuilder getZnoOrBuilder() {
          if (znoBuilder_ != null) {
            return znoBuilder_.getMessageOrBuilder();
          } else {
            return zno_ == null ?
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.getDefaultInstance() : zno_;
          }
        }
        /**
         * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO Zno = 39 [(.validation.required) = true];</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNOOrBuilder> 
            getZnoFieldBuilder() {
          if (znoBuilder_ == null) {
            znoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNOOrBuilder>(
                    getZno(),
                    getParentForChildren(),
                    isClean());
            zno_ = null;
          }
          return znoBuilder_;
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


        // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ)
      }

      // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ)
      private static final Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ();
      }

      public static Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<NOTIFYSMITZNOSTATUSRQ>
          PARSER = new com.google.protobuf.AbstractParser<NOTIFYSMITZNOSTATUSRQ>() {
        @java.lang.Override
        public NOTIFYSMITZNOSTATUSRQ parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NOTIFYSMITZNOSTATUSRQ(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<NOTIFYSMITZNOSTATUSRQ> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<NOTIFYSMITZNOSTATUSRQ> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int NOTIFYSMITZNOSTATUSRQ_FIELD_NUMBER = 40;
    private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ notifySMITZNOStatusRq_;
    /**
     * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
     */
    public boolean hasNotifySMITZNOStatusRq() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
     */
    public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ getNotifySMITZNOStatusRq() {
      return notifySMITZNOStatusRq_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.getDefaultInstance() : notifySMITZNOStatusRq_;
    }
    /**
     * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
     */
    public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQOrBuilder getNotifySMITZNOStatusRqOrBuilder() {
      return notifySMITZNOStatusRq_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.getDefaultInstance() : notifySMITZNOStatusRq_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNotifySMITZNOStatusRq()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getNotifySMITZNOStatusRq().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(40, getNotifySMITZNOStatusRq());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(40, getNotifySMITZNOStatusRq());
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
      if (!(obj instanceof Valid.NotifySMITZNOStatusRq)) {
        return super.equals(obj);
      }
      Valid.NotifySMITZNOStatusRq other = (Valid.NotifySMITZNOStatusRq) obj;

      boolean result = true;
      result = result && (hasNotifySMITZNOStatusRq() == other.hasNotifySMITZNOStatusRq());
      if (hasNotifySMITZNOStatusRq()) {
        result = result && getNotifySMITZNOStatusRq()
            .equals(other.getNotifySMITZNOStatusRq());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasNotifySMITZNOStatusRq()) {
        hash = (37 * hash) + NOTIFYSMITZNOSTATUSRQ_FIELD_NUMBER;
        hash = (53 * hash) + getNotifySMITZNOStatusRq().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Valid.NotifySMITZNOStatusRq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Valid.NotifySMITZNOStatusRq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Valid.NotifySMITZNOStatusRq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Valid.NotifySMITZNOStatusRq parseFrom(
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
    public static Builder newBuilder(Valid.NotifySMITZNOStatusRq prototype) {
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
     * Protobuf type {@code NotifySMITZNOStatusRq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NotifySMITZNOStatusRq)
        Valid.NotifySMITZNOStatusRqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Valid.internal_static_NotifySMITZNOStatusRq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Valid.internal_static_NotifySMITZNOStatusRq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Valid.NotifySMITZNOStatusRq.class, Valid.NotifySMITZNOStatusRq.Builder.class);
      }

      // Construct using Valid.NotifySMITZNOStatusRq.newBuilder()
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
          getNotifySMITZNOStatusRqFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (notifySMITZNOStatusRqBuilder_ == null) {
          notifySMITZNOStatusRq_ = null;
        } else {
          notifySMITZNOStatusRqBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Valid.internal_static_NotifySMITZNOStatusRq_descriptor;
      }

      @java.lang.Override
      public Valid.NotifySMITZNOStatusRq getDefaultInstanceForType() {
        return Valid.NotifySMITZNOStatusRq.getDefaultInstance();
      }

      @java.lang.Override
      public Valid.NotifySMITZNOStatusRq build() {
        Valid.NotifySMITZNOStatusRq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Valid.NotifySMITZNOStatusRq buildPartial() {
        Valid.NotifySMITZNOStatusRq result = new Valid.NotifySMITZNOStatusRq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (notifySMITZNOStatusRqBuilder_ == null) {
          result.notifySMITZNOStatusRq_ = notifySMITZNOStatusRq_;
        } else {
          result.notifySMITZNOStatusRq_ = notifySMITZNOStatusRqBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Valid.NotifySMITZNOStatusRq) {
          return mergeFrom((Valid.NotifySMITZNOStatusRq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Valid.NotifySMITZNOStatusRq other) {
        if (other == Valid.NotifySMITZNOStatusRq.getDefaultInstance()) return this;
        if (other.hasNotifySMITZNOStatusRq()) {
          mergeNotifySMITZNOStatusRq(other.getNotifySMITZNOStatusRq());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNotifySMITZNOStatusRq()) {
          return false;
        }
        if (!getNotifySMITZNOStatusRq().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Valid.NotifySMITZNOStatusRq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Valid.NotifySMITZNOStatusRq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ notifySMITZNOStatusRq_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQOrBuilder> notifySMITZNOStatusRqBuilder_;
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public boolean hasNotifySMITZNOStatusRq() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ getNotifySMITZNOStatusRq() {
        if (notifySMITZNOStatusRqBuilder_ == null) {
          return notifySMITZNOStatusRq_ == null ? Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.getDefaultInstance() : notifySMITZNOStatusRq_;
        } else {
          return notifySMITZNOStatusRqBuilder_.getMessage();
        }
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public Builder setNotifySMITZNOStatusRq(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ value) {
        if (notifySMITZNOStatusRqBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          notifySMITZNOStatusRq_ = value;
          onChanged();
        } else {
          notifySMITZNOStatusRqBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public Builder setNotifySMITZNOStatusRq(
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder builderForValue) {
        if (notifySMITZNOStatusRqBuilder_ == null) {
          notifySMITZNOStatusRq_ = builderForValue.build();
          onChanged();
        } else {
          notifySMITZNOStatusRqBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public Builder mergeNotifySMITZNOStatusRq(Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ value) {
        if (notifySMITZNOStatusRqBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              notifySMITZNOStatusRq_ != null &&
              notifySMITZNOStatusRq_ != Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.getDefaultInstance()) {
            notifySMITZNOStatusRq_ =
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.newBuilder(notifySMITZNOStatusRq_).mergeFrom(value).buildPartial();
          } else {
            notifySMITZNOStatusRq_ = value;
          }
          onChanged();
        } else {
          notifySMITZNOStatusRqBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public Builder clearNotifySMITZNOStatusRq() {
        if (notifySMITZNOStatusRqBuilder_ == null) {
          notifySMITZNOStatusRq_ = null;
          onChanged();
        } else {
          notifySMITZNOStatusRqBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder getNotifySMITZNOStatusRqBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getNotifySMITZNOStatusRqFieldBuilder().getBuilder();
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      public Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQOrBuilder getNotifySMITZNOStatusRqOrBuilder() {
        if (notifySMITZNOStatusRqBuilder_ != null) {
          return notifySMITZNOStatusRqBuilder_.getMessageOrBuilder();
        } else {
          return notifySMITZNOStatusRq_ == null ?
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.getDefaultInstance() : notifySMITZNOStatusRq_;
        }
      }
      /**
       * <code>required .NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ NotifySMITZNOStatusRq = 40 [(.validation.required) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQOrBuilder> 
          getNotifySMITZNOStatusRqFieldBuilder() {
        if (notifySMITZNOStatusRqBuilder_ == null) {
          notifySMITZNOStatusRqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQ.Builder, Valid.NotifySMITZNOStatusRq.NOTIFYSMITZNOSTATUSRQOrBuilder>(
                  getNotifySMITZNOStatusRq(),
                  getParentForChildren(),
                  isClean());
          notifySMITZNOStatusRq_ = null;
        }
        return notifySMITZNOStatusRqBuilder_;
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


      // @@protoc_insertion_point(builder_scope:NotifySMITZNOStatusRq)
    }

    // @@protoc_insertion_point(class_scope:NotifySMITZNOStatusRq)
    private static final Valid.NotifySMITZNOStatusRq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Valid.NotifySMITZNOStatusRq();
    }

    public static Valid.NotifySMITZNOStatusRq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<NotifySMITZNOStatusRq>
        PARSER = new com.google.protobuf.AbstractParser<NotifySMITZNOStatusRq>() {
      @java.lang.Override
      public NotifySMITZNOStatusRq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NotifySMITZNOStatusRq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NotifySMITZNOStatusRq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NotifySMITZNOStatusRq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Valid.NotifySMITZNOStatusRq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013valid.proto\032\020validation.proto\"\200\020\n\025Noti" +
      "fySMITZNOStatusRq\022Q\n\025NotifySMITZNOStatus" +
      "Rq\030( \002(\0132,.NotifySMITZNOStatusRq.NOTIFYS" +
      "MITZNOSTATUSRQB\004\300\265\030\001\032\223\017\n\025NOTIFYSMITZNOST" +
      "ATUSRQ\022C\n\003Zno\030\' \002(\01320.NotifySMITZNOStatu" +
      "sRq.NOTIFYSMITZNOSTATUSRQ.ZNOB\004\300\265\030\001\032\264\016\n\003" +
      "ZNO\022\024\n\006Number\030  \002(\tB\004\272\265\030\000\022\026\n\010SourceID\030\001 " +
      "\002(\tB\004\272\265\030\000\022\023\n\005Title\030\002 \002(\tB\004\272\265\030\000\022\031\n\013Descri" +
      "ption\030\003 \002(\tB\004\272\265\030\000\022\030\n\nTemplateID\030\004 \002(\tB\004\272" +
      "\265\030\000\022\024\n\006Status\030\005 \002(\tB\004\272\265\030\000\022\032\n\014AssigneeNam" +
      "e\030\006 \002(\tB\004\272\265\030\000\022\034\n\016AssignmentName\030\007 \002(\tB\004\272" +
      "\265\030\000\022\030\n\nNextBreach\030\010 \002(\tB\004\272\265\030\000\022\032\n\014ActualF" +
      "inish\030\t \002(\tB\004\272\265\030\000\022\027\n\tCloseTime\030\n \002(\tB\004\272\265" +
      "\030\000\022\030\n\nResolution\030\013 \002(\tB\004\272\265\030\000\022\034\n\016Resoluti" +
      "onCode\030\014 \002(\tB\004\272\265\030\000\022\036\n\020AttachmentStatus\030\r" +
      " \002(\tB\004\272\265\030\000\022\032\n\014PriorityCode\030\016 \002(\tB\004\272\265\030\000\022\031" +
      "\n\013ContactName\030\017 \002(\tB\004\272\265\030\000\022\035\n\017CallbackCon" +
      "tact\030\020 \002(\tB\004\272\265\030\000\022\026\n\010Category\030\021 \002(\tB\004\272\265\030\000" +
      "\022\022\n\004SbK2\030\022 \002(\tB\004\272\265\030\000\022\023\n\005SbAIB\030\023 \002(\tB\004\272\265\030" +
      "\000\022\026\n\010SbDRUGId\030\024 \002(\tB\004\272\265\030\000\022\026\n\010SbMqrqid\030\025 " +
      "\002(\tB\004\272\265\030\000\022\032\n\014SbSourceName\030\026 \002(\tB\004\272\265\030\000\022\030\n" +
      "\nIncidentID\030\027 \002(\tB\004\272\265\030\000\022!\n\023SbForecastMov" +
      "eCause\030\030 \002(\tB\004\272\265\030\000\022\025\n\007SbLogin\030\031 \002(\tB\004\272\265\030" +
      "\000\022\030\n\nSbPassword\030\032 \002(\tB\004\272\265\030\000\022a\n\020Additiona" +
      "lFields\030\033 \002(\0132A.NotifySMITZNOStatusRq.NO" +
      "TIFYSMITZNOSTATUSRQ.ZNO.ADDITIONALFIELDS" +
      "B\004\272\265\030\000\022G\n\003Ecm\030\034 \003(\01324.NotifySMITZNOStatu" +
      "sRq.NOTIFYSMITZNOSTATUSRQ.ZNO.ECMB\004\300\265\030\001\022" +
      "\025\n\007Channel\030\035 \002(\tB\004\272\265\030\000\022[\n\rDynamicFields\030" +
      "\036 \002(\0132>.NotifySMITZNOStatusRq.NOTIFYSMIT" +
      "ZNOSTATUSRQ.ZNO.DYNAMICFIELDSB\004\300\265\030\001\022_\n\017S" +
      "bDynamicFields\030\037 \002(\0132@.NotifySMITZNOStat" +
      "usRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBDYNAMIC" +
      "FIELDSB\004\300\265\030\001\032\202\002\n\020ADDITIONALFIELDS\022\034\n\016Cli" +
      "entFullName\030! \002(\tB\004\272\265\030\000\022\027\n\tClientINN\030\001 \002" +
      "(\tB\004\272\265\030\000\022\033\n\rClientSegment\030\002 \002(\tB\004\272\265\030\000\022\026\n" +
      "\010ClientTB\030\003 \002(\tB\004\272\265\030\000\022\027\n\tClientVSP\030\004 \002(\t" +
      "B\004\272\265\030\000\022\027\n\tPSFNumber\030\005 \002(\tB\004\272\265\030\000\022\033\n\rManua" +
      "lRouting\030\006 \002(\tB\004\272\265\030\000\022\032\n\014AnswerClient\030\007 \002" +
      "(\tB\004\272\265\030\000\022\027\n\tPSFRouter\030\010 \002(\tB\004\272\265\030\000\032=\n\003ECM" +
      "\022\031\n\013ECMFolderId\030\" \002(\tB\004\272\265\030\000\022\033\n\rECMFolder" +
      "Type\030\001 \002(\tB\004\272\265\030\000\032\315\001\n\rDYNAMICFIELDS\022k\n\014Dy" +
      "namicField\030$ \003(\0132K.NotifySMITZNOStatusRq" +
      ".NOTIFYSMITZNOSTATUSRQ.ZNO.DYNAMICFIELDS" +
      ".DYNAMICFIELDB\010\250\265\030\005\260\265\030\000\032O\n\014DYNAMICFIELD\022" +
      "\022\n\004DFId\030# \002(\tB\004\272\265\030\000\022\024\n\006DFName\030\001 \002(\tB\004\272\265\030" +
      "\000\022\025\n\007DFValue\030\002 \002(\tB\004\272\265\030\000\032\327\001\n\017SBDYNAMICFI" +
      "ELDS\022m\n\014DynamicField\030& \003(\0132M.NotifySMITZ" +
      "NOStatusRq.NOTIFYSMITZNOSTATUSRQ.ZNO.SBD" +
      "YNAMICFIELDS.DYNAMICFIELDB\010\250\265\030\005\260\265\030\000\032U\n\014D" +
      "YNAMICFIELD\022\024\n\006SbDFId\030% \002(\tB\004\272\265\030\000\022\026\n\010SbD" +
      "FName\030\001 \002(\tB\004\272\265\030\000\022\027\n\tSbDFValue\030\002 \002(\tB\004\272\265" +
      "\030\000"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Validation.getDescriptor(),
        }, assigner);
    internal_static_NotifySMITZNOStatusRq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NotifySMITZNOStatusRq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_descriptor,
        new java.lang.String[] { "NotifySMITZNOStatusRq", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_descriptor =
      internal_static_NotifySMITZNOStatusRq_descriptor.getNestedTypes().get(0);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_descriptor,
        new java.lang.String[] { "Zno", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor =
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_descriptor.getNestedTypes().get(0);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor,
        new java.lang.String[] { "Number", "SourceID", "Title", "Description", "TemplateID", "Status", "AssigneeName", "AssignmentName", "NextBreach", "ActualFinish", "CloseTime", "Resolution", "ResolutionCode", "AttachmentStatus", "PriorityCode", "ContactName", "CallbackContact", "Category", "SbK2", "SbAIB", "SbDRUGId", "SbMqrqid", "SbSourceName", "IncidentID", "SbForecastMoveCause", "SbLogin", "SbPassword", "AdditionalFields", "Ecm", "Channel", "DynamicFields", "SbDynamicFields", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_descriptor =
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor.getNestedTypes().get(0);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ADDITIONALFIELDS_descriptor,
        new java.lang.String[] { "ClientFullName", "ClientINN", "ClientSegment", "ClientTB", "ClientVSP", "PSFNumber", "ManualRouting", "AnswerClient", "PSFRouter", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_descriptor =
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor.getNestedTypes().get(1);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_ECM_descriptor,
        new java.lang.String[] { "ECMFolderId", "ECMFolderType", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_descriptor =
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor.getNestedTypes().get(2);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_descriptor,
        new java.lang.String[] { "DynamicField", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_descriptor =
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_descriptor.getNestedTypes().get(0);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_DYNAMICFIELDS_DYNAMICFIELD_descriptor,
        new java.lang.String[] { "DFId", "DFName", "DFValue", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_descriptor =
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_descriptor.getNestedTypes().get(3);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_descriptor,
        new java.lang.String[] { "DynamicField", });
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_descriptor =
      internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_descriptor.getNestedTypes().get(0);
    internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotifySMITZNOStatusRq_NOTIFYSMITZNOSTATUSRQ_ZNO_SBDYNAMICFIELDS_DYNAMICFIELD_descriptor,
        new java.lang.String[] { "SbDFId", "SbDFName", "SbDFValue", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(Validation.regex);
    registry.add(Validation.repeatMax);
    registry.add(Validation.repeatMin);
    registry.add(Validation.required);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    Validation.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
