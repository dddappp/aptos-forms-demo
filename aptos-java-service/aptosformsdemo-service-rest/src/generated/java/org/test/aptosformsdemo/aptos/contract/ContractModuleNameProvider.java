package org.test.aptosformsdemo.aptos.contract;

public interface ContractModuleNameProvider {
    /**
     * @param eventCategory The name of the event being generalized, which we call eventCategory.
     * @return
     */
    String getModuleQualifiedEventStructName(String eventCategory);

    String getEventHandleFieldName(String eventCategory);

    String getTableFieldName();

    String getModuleQualifiedEntityStateStructName();

    /**
     * @return Tables structure holding entity state tables.
     */
    String getModuleQualifiedTablesStructName();

    /**
     * @return Events structure holding event handles.
     */
    String getModuleQualifiedEventsStructName();

    String getContractAddress();

    String getStoreAccountAddress();
}
