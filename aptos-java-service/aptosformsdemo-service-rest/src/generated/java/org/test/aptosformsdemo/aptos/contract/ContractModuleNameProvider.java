package org.test.aptosformsdemo.aptos.contract;

public interface ContractModuleNameProvider {
    String getModuleQualifiedEventStructName(String eventCategory);

    String getEventHandleFieldName(String eventCategory);

    String getModuleQualifiedEntityStateStructName();

    String getModuleQualifiedTablesStructName();

    String getModuleQualifiedEventsStructName();
}
