// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.meta;

import java.util.*;

import org.test.aptosformsdemo.specialization.*;


public class M {

  // /////////////////////////////////////////
  public static class BoundedContextMetadata {

    public static final String NAME_REQUESTER_ID                = "requesterId";
    public static final String DISCRIMINATOR_COMMAND_TYPE       = "commandType";
    public static final String DISCRIMINATOR_EVENT_TYPE         = "eventClass";
    public static final String DISCRIMINATOR_COMMAND_ID         = "commandId";

    public static final String HTTP_SERVICE_ORDERS_QUERY_NAME           = "sort";
    public static final String HTTP_SERVICE_FIRST_RESULT_QUERY_NAME     = "firstResult";
    public static final String HTTP_SERVICE_MAX_RESULTS_QUERY_NAME      = "maxResults";
    public static final String HTTP_SERVICE_RETURNED_FIELDS_QUERY_NAME  = "fields";
    public static final String HTTP_SERVICE_FILTER_QUERY_NAME           = "filter";

    public static final Map<String, String> TYPE_NAME_TO_AGGREGATE_NAME_MAP;

    public static final Map<String, Class<?>> CLASS_MAP;

    static {
        Map<String, String> typeToAggMap = new HashMap<>();

        typeToAggMap.put("FormDefinition", "FormDefinition");
        typeToAggMap.put("FormPageDefinition", "FormDefinition");
        typeToAggMap.put("FormIdRegistration", "FormIdRegistration");
        typeToAggMap.put("AptosFormsDemoMainForm", "AptosFormsDemoMainForm");
        typeToAggMap.put("AptosFormsDemoCoin_claimer_1", "AptosFormsDemoCoin_claimer_1");
        typeToAggMap.put("AptosFormsDemoGlobal", "AptosFormsDemoGlobal");
        TYPE_NAME_TO_AGGREGATE_NAME_MAP = typeToAggMap;

        Map<String, Class<?>> clsMap = new HashMap<>();
        clsMap.put("bool", Boolean.class);
        clsMap.put("Boolean", Boolean.class);
        clsMap.put("bool?", Boolean.class);
        clsMap.put("DateTime", java.util.Date.class);
        clsMap.put("Date", java.util.Date.class);
        clsMap.put("java.util.Date", java.util.Date.class);
        clsMap.put("DateTime?", java.util.Date.class);
        clsMap.put("decimal", java.math.BigDecimal.class);
        clsMap.put("BigDecimal", java.math.BigDecimal.class);
        clsMap.put("java.math.BigDecimal", java.math.BigDecimal.class);
        clsMap.put("decimal?", java.math.BigDecimal.class);
        clsMap.put("int", Integer.class);
        clsMap.put("Integer", Integer.class);
        clsMap.put("int?", Integer.class);
        clsMap.put("long", Long.class);
        clsMap.put("Long", Long.class);
        clsMap.put("long?", Long.class);
        clsMap.put("string", String.class);
        clsMap.put("String", String.class);
        clsMap.put("U8", Integer.class);
        clsMap.put("U16", Integer.class);
        clsMap.put("U32", Long.class);
        clsMap.put("U64", java.math.BigInteger.class);
        clsMap.put("BigInteger", java.math.BigInteger.class);
        clsMap.put("java.math.BigInteger", java.math.BigInteger.class);
        clsMap.put("U128", java.math.BigInteger.class);
        clsMap.put("U256", java.math.BigInteger.class);
        clsMap.put("u8", Integer.class);
        clsMap.put("u16", Integer.class);
        clsMap.put("u32", Long.class);
        clsMap.put("u64", java.math.BigInteger.class);
        clsMap.put("u128", java.math.BigInteger.class);
        clsMap.put("u256", java.math.BigInteger.class);
        clsMap.put("AsciiString", String.class);
        clsMap.put("vector<u8>", String.class);
        clsMap.put("OffsetDateTime", java.time.OffsetDateTime.class);
        clsMap.put("java.time.OffsetDateTime", java.time.OffsetDateTime.class);
        clsMap.put("blob", java.sql.Blob.class);
        clsMap.put("java.sql.Blob", java.sql.Blob.class);
        clsMap.put("byte-array", byte[].class);
        clsMap.put("byte[]", byte[].class);
        clsMap.put("object", Object.class);
        clsMap.put("Object", Object.class);
        clsMap.put("date-time", java.sql.Timestamp.class);
        clsMap.put("java.sql.Timestamp", java.sql.Timestamp.class);
        clsMap.put("date", java.sql.Date.class);
        clsMap.put("java.sql.Date", java.sql.Date.class);
        clsMap.put("time", java.sql.Time.class);
        clsMap.put("java.sql.Time", java.sql.Time.class);
        clsMap.put("currency-amount", java.math.BigDecimal.class);
        clsMap.put("currency-precise", java.math.BigDecimal.class);
        clsMap.put("fixed-point", java.math.BigDecimal.class);
        clsMap.put("floating-point", Double.class);
        clsMap.put("Double", Double.class);
        clsMap.put("numeric", Long.class);
        clsMap.put("id-long", String.class);
        clsMap.put("id-vlong", String.class);
        clsMap.put("indicator", String.class);
        clsMap.put("very-short", String.class);
        clsMap.put("short-varchar", String.class);
        clsMap.put("long-varchar", String.class);
        clsMap.put("very-long", String.class);
        clsMap.put("comment", String.class);
        clsMap.put("description", String.class);
        clsMap.put("name", String.class);
        clsMap.put("value", String.class);
        clsMap.put("credit-card-number", String.class);
        clsMap.put("credit-card-date", String.class);
        clsMap.put("email", String.class);
        clsMap.put("url", String.class);
        clsMap.put("id-long-ne", String.class);
        clsMap.put("id-vlong-ne", String.class);
        clsMap.put("tel-number", String.class);
        clsMap.put("address", String.class);
        CLASS_MAP = clsMap;
    }

    private BoundedContextMetadata() {
    }
  }


  // /////////////////////////////////////////////////////////  
  public static class FormDefinitionMetadata {

    private FormDefinitionMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final Class ID_CLASS = Long.class;

    public static final String[] propertyNames = new String[] {
            "formSequenceId",
            "formId",
            "contractAddress",
            "storeAccountAddress",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
    };

    public static final String[] propertyTypes = new String[] {
            "Long",
            "String",
            "String",
            "String",
            "Long",
            "String",
            "OffsetDateTime",
            "String",
            "OffsetDateTime",
            "Boolean",
            "Boolean",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("formSequenceId", "formSequenceId");
        aliasMap.put("FormSequenceId", "formSequenceId");
        aliasMap.put("formId", "formId");
        aliasMap.put("FormId", "formId");
        aliasMap.put("contractAddress", "contractAddress");
        aliasMap.put("ContractAddress", "contractAddress");
        aliasMap.put("storeAccountAddress", "storeAccountAddress");
        aliasMap.put("StoreAccountAddress", "storeAccountAddress");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }


  // /////////////////////////////////////////////////////////  
  public static class FormPageDefinitionMetadata {

    private FormPageDefinitionMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final String[] propertyNames = new String[] {
            "pageNumber",
            "pageName",
            "moveStateTableFieldName",
            "moveStateStructName",
            "moveSubmitEventHandleFieldName",
            "moveUpdateEventHandleFieldName",
            "moveSubmitEventStructName",
            "moveUpdateEventStructName",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "formDefinitionFormSequenceId",
            "formDefinitionFormPageDefinitionId.formDefinitionFormSequenceId",
            "formDefinitionFormPageDefinitionId.pageNumber",
    };

    public static final String[] propertyTypes = new String[] {
            "Integer",
            "String",
            "String",
            "String",
            "String",
            "String",
            "String",
            "String",
            "Long",
            "String",
            "OffsetDateTime",
            "String",
            "OffsetDateTime",
            "Boolean",
            "Boolean",
            "Long",
            "Long",
            "Integer",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("pageNumber", "formDefinitionFormPageDefinitionId.pageNumber");
        aliasMap.put("PageNumber", "formDefinitionFormPageDefinitionId.pageNumber");
        aliasMap.put("pageName", "pageName");
        aliasMap.put("PageName", "pageName");
        aliasMap.put("moveStateTableFieldName", "moveStateTableFieldName");
        aliasMap.put("MoveStateTableFieldName", "moveStateTableFieldName");
        aliasMap.put("moveStateStructName", "moveStateStructName");
        aliasMap.put("MoveStateStructName", "moveStateStructName");
        aliasMap.put("moveSubmitEventHandleFieldName", "moveSubmitEventHandleFieldName");
        aliasMap.put("MoveSubmitEventHandleFieldName", "moveSubmitEventHandleFieldName");
        aliasMap.put("moveUpdateEventHandleFieldName", "moveUpdateEventHandleFieldName");
        aliasMap.put("MoveUpdateEventHandleFieldName", "moveUpdateEventHandleFieldName");
        aliasMap.put("moveSubmitEventStructName", "moveSubmitEventStructName");
        aliasMap.put("MoveSubmitEventStructName", "moveSubmitEventStructName");
        aliasMap.put("moveUpdateEventStructName", "moveUpdateEventStructName");
        aliasMap.put("MoveUpdateEventStructName", "moveUpdateEventStructName");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
        aliasMap.put("formDefinitionFormSequenceId", "formDefinitionFormPageDefinitionId.formDefinitionFormSequenceId");
        aliasMap.put("FormDefinitionFormSequenceId", "formDefinitionFormPageDefinitionId.formDefinitionFormSequenceId");
        aliasMap.put("formDefinitionFormPageDefinitionId.formDefinitionFormSequenceId", "formDefinitionFormPageDefinitionId.formDefinitionFormSequenceId");
        aliasMap.put("FormDefinitionFormPageDefinitionId.FormDefinitionFormSequenceId", "formDefinitionFormPageDefinitionId.formDefinitionFormSequenceId");
        aliasMap.put("formDefinitionFormPageDefinitionId.pageNumber", "formDefinitionFormPageDefinitionId.pageNumber");
        aliasMap.put("FormDefinitionFormPageDefinitionId.PageNumber", "formDefinitionFormPageDefinitionId.pageNumber");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }


  // /////////////////////////////////////////////////////////  
  public static class FormIdRegistrationMetadata {

    private FormIdRegistrationMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final Class ID_CLASS = Long.class;

    public static final String[] propertyNames = new String[] {
            "formSequenceId",
            "formId",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
    };

    public static final String[] propertyTypes = new String[] {
            "Long",
            "String",
            "Long",
            "String",
            "OffsetDateTime",
            "String",
            "OffsetDateTime",
            "Boolean",
            "Boolean",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("formSequenceId", "formSequenceId");
        aliasMap.put("FormSequenceId", "formSequenceId");
        aliasMap.put("formId", "formId");
        aliasMap.put("FormId", "formId");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }


  // /////////////////////////////////////////////////////////  
  public static class AptosFormsDemoMainFormMetadata {

    private AptosFormsDemoMainFormMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final String URL_ID_FIELD_SEPARATOR = ",";

    public static final TextFormatter<org.test.aptosformsdemo.domain.FormPageAndAddress> URL_ID_TEXT_FORMATTER =
                    new AbstractValueObjectTextFormatter<org.test.aptosformsdemo.domain.FormPageAndAddress>(org.test.aptosformsdemo.domain.FormPageAndAddress.class, URL_ID_FIELD_SEPARATOR) {
                        @Override
                        protected Class<?> getClassByTypeName(String type) {
                            return BoundedContextMetadata.CLASS_MAP.get(type);
                        }
                    };

    public static final Class ID_CLASS = org.test.aptosformsdemo.domain.FormPageAndAddress.class;

    public static final String[] propertyNames = new String[] {
            "fr_5pqi",
            "version",
            "fr_8xjs",
            "fr_9c3f",
            "fr_4ok6",
            "fr_b3ub",
            "fr_1z7o",
            "fr_6f68",
            "single_text1",
            "payment_123",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "formPageAndSignerAddress.formSequenceId",
            "formPageAndSignerAddress.pageNumber",
            "formPageAndSignerAddress.address",
            "fr_d8rw.startYear",
            "fr_d8rw.startMonth",
            "fr_d8rw.startDay",
            "fr_d8rw.endYear",
            "fr_d8rw.endMonth",
            "fr_d8rw.endDay",
            "fr_dy3l.startYear",
            "fr_dy3l.startMonth",
            "fr_dy3l.startDay",
            "fr_dy3l.endYear",
            "fr_dy3l.endMonth",
            "fr_dy3l.endDay",
            "fr_47yy.startHour",
            "fr_47yy.startMinute",
            "fr_47yy.startSecond",
            "fr_47yy.endHour",
            "fr_47yy.endMinute",
            "fr_47yy.endSecond",
            "fr_hhzp.year",
            "fr_hhzp.month",
            "fr_hhzp.day",
    };

    public static final String[] propertyTypes = new String[] {
            "BigInteger",
            "BigInteger",
            "String",
            "String",
            "BigInteger",
            "String",
            "BigInteger",
            "BigInteger",
            "String",
            "BigInteger",
            "Long",
            "String",
            "OffsetDateTime",
            "String",
            "OffsetDateTime",
            "Boolean",
            "Boolean",
            "Long",
            "Integer",
            "String",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
            "Integer",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("fr_5pqi", "fr_5pqi");
        aliasMap.put("Fr_5pqi", "fr_5pqi");
        aliasMap.put("version", "version");
        aliasMap.put("Version", "version");
        aliasMap.put("fr_8xjs", "fr_8xjs");
        aliasMap.put("Fr_8xjs", "fr_8xjs");
        aliasMap.put("fr_9c3f", "fr_9c3f");
        aliasMap.put("Fr_9c3f", "fr_9c3f");
        aliasMap.put("fr_4ok6", "fr_4ok6");
        aliasMap.put("Fr_4ok6", "fr_4ok6");
        aliasMap.put("fr_b3ub", "fr_b3ub");
        aliasMap.put("Fr_b3ub", "fr_b3ub");
        aliasMap.put("fr_1z7o", "fr_1z7o");
        aliasMap.put("Fr_1z7o", "fr_1z7o");
        aliasMap.put("fr_6f68", "fr_6f68");
        aliasMap.put("Fr_6f68", "fr_6f68");
        aliasMap.put("single_text1", "single_text1");
        aliasMap.put("Single_text1", "single_text1");
        aliasMap.put("payment_123", "payment_123");
        aliasMap.put("Payment_123", "payment_123");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
        aliasMap.put("formPageAndSignerAddress.formSequenceId", "formPageAndSignerAddress.formSequenceId");
        aliasMap.put("FormPageAndSignerAddress.FormSequenceId", "formPageAndSignerAddress.formSequenceId");
        aliasMap.put("formPageAndSignerAddress.pageNumber", "formPageAndSignerAddress.pageNumber");
        aliasMap.put("FormPageAndSignerAddress.PageNumber", "formPageAndSignerAddress.pageNumber");
        aliasMap.put("formPageAndSignerAddress.address", "formPageAndSignerAddress.address");
        aliasMap.put("FormPageAndSignerAddress.Address", "formPageAndSignerAddress.address");
        aliasMap.put("fr_d8rw.startYear", "fr_d8rw.startYear");
        aliasMap.put("Fr_d8rw.StartYear", "fr_d8rw.startYear");
        aliasMap.put("fr_d8rw.start.year", "fr_d8rw.startYear");
        aliasMap.put("Fr_d8rw.Start.Year", "fr_d8rw.startYear");
        aliasMap.put("fr_d8rw.startMonth", "fr_d8rw.startMonth");
        aliasMap.put("Fr_d8rw.StartMonth", "fr_d8rw.startMonth");
        aliasMap.put("fr_d8rw.start.month", "fr_d8rw.startMonth");
        aliasMap.put("Fr_d8rw.Start.Month", "fr_d8rw.startMonth");
        aliasMap.put("fr_d8rw.startDay", "fr_d8rw.startDay");
        aliasMap.put("Fr_d8rw.StartDay", "fr_d8rw.startDay");
        aliasMap.put("fr_d8rw.start.day", "fr_d8rw.startDay");
        aliasMap.put("Fr_d8rw.Start.Day", "fr_d8rw.startDay");
        aliasMap.put("fr_d8rw.endYear", "fr_d8rw.endYear");
        aliasMap.put("Fr_d8rw.EndYear", "fr_d8rw.endYear");
        aliasMap.put("fr_d8rw.end.year", "fr_d8rw.endYear");
        aliasMap.put("Fr_d8rw.End.Year", "fr_d8rw.endYear");
        aliasMap.put("fr_d8rw.endMonth", "fr_d8rw.endMonth");
        aliasMap.put("Fr_d8rw.EndMonth", "fr_d8rw.endMonth");
        aliasMap.put("fr_d8rw.end.month", "fr_d8rw.endMonth");
        aliasMap.put("Fr_d8rw.End.Month", "fr_d8rw.endMonth");
        aliasMap.put("fr_d8rw.endDay", "fr_d8rw.endDay");
        aliasMap.put("Fr_d8rw.EndDay", "fr_d8rw.endDay");
        aliasMap.put("fr_d8rw.end.day", "fr_d8rw.endDay");
        aliasMap.put("Fr_d8rw.End.Day", "fr_d8rw.endDay");
        aliasMap.put("fr_dy3l.startYear", "fr_dy3l.startYear");
        aliasMap.put("Fr_dy3l.StartYear", "fr_dy3l.startYear");
        aliasMap.put("fr_dy3l.start.year", "fr_dy3l.startYear");
        aliasMap.put("Fr_dy3l.Start.Year", "fr_dy3l.startYear");
        aliasMap.put("fr_dy3l.startMonth", "fr_dy3l.startMonth");
        aliasMap.put("Fr_dy3l.StartMonth", "fr_dy3l.startMonth");
        aliasMap.put("fr_dy3l.start.month", "fr_dy3l.startMonth");
        aliasMap.put("Fr_dy3l.Start.Month", "fr_dy3l.startMonth");
        aliasMap.put("fr_dy3l.startDay", "fr_dy3l.startDay");
        aliasMap.put("Fr_dy3l.StartDay", "fr_dy3l.startDay");
        aliasMap.put("fr_dy3l.start.day", "fr_dy3l.startDay");
        aliasMap.put("Fr_dy3l.Start.Day", "fr_dy3l.startDay");
        aliasMap.put("fr_dy3l.endYear", "fr_dy3l.endYear");
        aliasMap.put("Fr_dy3l.EndYear", "fr_dy3l.endYear");
        aliasMap.put("fr_dy3l.end.year", "fr_dy3l.endYear");
        aliasMap.put("Fr_dy3l.End.Year", "fr_dy3l.endYear");
        aliasMap.put("fr_dy3l.endMonth", "fr_dy3l.endMonth");
        aliasMap.put("Fr_dy3l.EndMonth", "fr_dy3l.endMonth");
        aliasMap.put("fr_dy3l.end.month", "fr_dy3l.endMonth");
        aliasMap.put("Fr_dy3l.End.Month", "fr_dy3l.endMonth");
        aliasMap.put("fr_dy3l.endDay", "fr_dy3l.endDay");
        aliasMap.put("Fr_dy3l.EndDay", "fr_dy3l.endDay");
        aliasMap.put("fr_dy3l.end.day", "fr_dy3l.endDay");
        aliasMap.put("Fr_dy3l.End.Day", "fr_dy3l.endDay");
        aliasMap.put("fr_47yy.startHour", "fr_47yy.startHour");
        aliasMap.put("Fr_47yy.StartHour", "fr_47yy.startHour");
        aliasMap.put("fr_47yy.start.hour", "fr_47yy.startHour");
        aliasMap.put("Fr_47yy.Start.Hour", "fr_47yy.startHour");
        aliasMap.put("fr_47yy.startMinute", "fr_47yy.startMinute");
        aliasMap.put("Fr_47yy.StartMinute", "fr_47yy.startMinute");
        aliasMap.put("fr_47yy.start.minute", "fr_47yy.startMinute");
        aliasMap.put("Fr_47yy.Start.Minute", "fr_47yy.startMinute");
        aliasMap.put("fr_47yy.startSecond", "fr_47yy.startSecond");
        aliasMap.put("Fr_47yy.StartSecond", "fr_47yy.startSecond");
        aliasMap.put("fr_47yy.start.second", "fr_47yy.startSecond");
        aliasMap.put("Fr_47yy.Start.Second", "fr_47yy.startSecond");
        aliasMap.put("fr_47yy.endHour", "fr_47yy.endHour");
        aliasMap.put("Fr_47yy.EndHour", "fr_47yy.endHour");
        aliasMap.put("fr_47yy.end.hour", "fr_47yy.endHour");
        aliasMap.put("Fr_47yy.End.Hour", "fr_47yy.endHour");
        aliasMap.put("fr_47yy.endMinute", "fr_47yy.endMinute");
        aliasMap.put("Fr_47yy.EndMinute", "fr_47yy.endMinute");
        aliasMap.put("fr_47yy.end.minute", "fr_47yy.endMinute");
        aliasMap.put("Fr_47yy.End.Minute", "fr_47yy.endMinute");
        aliasMap.put("fr_47yy.endSecond", "fr_47yy.endSecond");
        aliasMap.put("Fr_47yy.EndSecond", "fr_47yy.endSecond");
        aliasMap.put("fr_47yy.end.second", "fr_47yy.endSecond");
        aliasMap.put("Fr_47yy.End.Second", "fr_47yy.endSecond");
        aliasMap.put("fr_hhzp.year", "fr_hhzp.year");
        aliasMap.put("Fr_hhzp.Year", "fr_hhzp.year");
        aliasMap.put("fr_hhzp.month", "fr_hhzp.month");
        aliasMap.put("Fr_hhzp.Month", "fr_hhzp.month");
        aliasMap.put("fr_hhzp.day", "fr_hhzp.day");
        aliasMap.put("Fr_hhzp.Day", "fr_hhzp.day");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }


  // /////////////////////////////////////////////////////////  
  public static class AptosFormsDemoCoin_claimer_1Metadata {

    private AptosFormsDemoCoin_claimer_1Metadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final String URL_ID_FIELD_SEPARATOR = ",";

    public static final TextFormatter<org.test.aptosformsdemo.domain.FormPageAndAddress> URL_ID_TEXT_FORMATTER =
                    new AbstractValueObjectTextFormatter<org.test.aptosformsdemo.domain.FormPageAndAddress>(org.test.aptosformsdemo.domain.FormPageAndAddress.class, URL_ID_FIELD_SEPARATOR) {
                        @Override
                        protected Class<?> getClassByTypeName(String type) {
                            return BoundedContextMetadata.CLASS_MAP.get(type);
                        }
                    };

    public static final Class ID_CLASS = org.test.aptosformsdemo.domain.FormPageAndAddress.class;

    public static final String[] propertyNames = new String[] {
            "version",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "formPageAndSignerAddress.formSequenceId",
            "formPageAndSignerAddress.pageNumber",
            "formPageAndSignerAddress.address",
    };

    public static final String[] propertyTypes = new String[] {
            "BigInteger",
            "Long",
            "String",
            "OffsetDateTime",
            "String",
            "OffsetDateTime",
            "Boolean",
            "Boolean",
            "Long",
            "Integer",
            "String",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("version", "version");
        aliasMap.put("Version", "version");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
        aliasMap.put("formPageAndSignerAddress.formSequenceId", "formPageAndSignerAddress.formSequenceId");
        aliasMap.put("FormPageAndSignerAddress.FormSequenceId", "formPageAndSignerAddress.formSequenceId");
        aliasMap.put("formPageAndSignerAddress.pageNumber", "formPageAndSignerAddress.pageNumber");
        aliasMap.put("FormPageAndSignerAddress.PageNumber", "formPageAndSignerAddress.pageNumber");
        aliasMap.put("formPageAndSignerAddress.address", "formPageAndSignerAddress.address");
        aliasMap.put("FormPageAndSignerAddress.Address", "formPageAndSignerAddress.address");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }


  // /////////////////////////////////////////////////////////  
  public static class AptosFormsDemoGlobalMetadata {

    private AptosFormsDemoGlobalMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final String URL_ID_FIELD_SEPARATOR = ",";

    public static final TextFormatter<org.test.aptosformsdemo.domain.FormAndAddress> URL_ID_TEXT_FORMATTER =
                    new AbstractValueObjectTextFormatter<org.test.aptosformsdemo.domain.FormAndAddress>(org.test.aptosformsdemo.domain.FormAndAddress.class, URL_ID_FIELD_SEPARATOR) {
                        @Override
                        protected Class<?> getClassByTypeName(String type) {
                            return BoundedContextMetadata.CLASS_MAP.get(type);
                        }
                    };

    public static final Class ID_CLASS = org.test.aptosformsdemo.domain.FormAndAddress.class;

    public static final String[] propertyNames = new String[] {
            "payment_123_Vault",
            "coin_claimer_1_Vault",
            "coin_claimer_1_TotalShares",
            "coin_claimer_1_ClaimedCount",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "version",
            "formAndAccountAddress.formSequenceId",
            "formAndAccountAddress.address",
    };

    public static final String[] propertyTypes = new String[] {
            "Coin",
            "Coin",
            "BigInteger",
            "BigInteger",
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "BigInteger",
            "Long",
            "String",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("payment_123_Vault", "payment_123_Vault");
        aliasMap.put("Payment_123_Vault", "payment_123_Vault");
        aliasMap.put("coin_claimer_1_Vault", "coin_claimer_1_Vault");
        aliasMap.put("Coin_claimer_1_Vault", "coin_claimer_1_Vault");
        aliasMap.put("coin_claimer_1_TotalShares", "coin_claimer_1_TotalShares");
        aliasMap.put("Coin_claimer_1_TotalShares", "coin_claimer_1_TotalShares");
        aliasMap.put("coin_claimer_1_ClaimedCount", "coin_claimer_1_ClaimedCount");
        aliasMap.put("Coin_claimer_1_ClaimedCount", "coin_claimer_1_ClaimedCount");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
        aliasMap.put("version", "version");
        aliasMap.put("Version", "version");
        aliasMap.put("formAndAccountAddress.formSequenceId", "formAndAccountAddress.formSequenceId");
        aliasMap.put("FormAndAccountAddress.FormSequenceId", "formAndAccountAddress.formSequenceId");
        aliasMap.put("formAndAccountAddress.address", "formAndAccountAddress.address");
        aliasMap.put("FormAndAccountAddress.Address", "formAndAccountAddress.address");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }

}


