package org.test.aptosformsdemo.aptos.contract;

public interface ContractModuleNameProvider {
    String getModuleQualifiedEventStructName(String eventCategory);

    String getEventHandleFieldName(String eventCategory);

    String getTableFieldName();

    String getModuleQualifiedEntityStateStructName();

    String getModuleQualifiedTablesStructName();

    String getModuleQualifiedEventsStructName();

    String getContractAddress();

    String getStoreAccountAddress();
}
