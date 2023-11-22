package org.test.aptosformsdemo.aptos.contract;

public class ContractModuleNameProviderUtils {
    private ContractModuleNameProviderUtils() {
    }

    public static ContractModuleNameProvider getAptosFormsDemoMainFormModuleNameProvider(
            final String moduleName,
            final String contractAddress,
            final String storeAccountAddress,
            final String aptosFormsDemoMainFormSubmittedStructName,
            final String aptosFormsDemoMainFormUpdatedStructName,
            final String aptosFormsDemoMainFormSubmittedHandleFieldName,
            final String aptosFormsDemoMainFormUpdatedHandleFieldName,
            final String stateTableFieldName,
            final String stateStructName
    ) {
        ContractModuleNameProvider contractModuleNameProvider = new ContractModuleNameProvider() {
            @Override
            public String getModuleQualifiedEventStructName(String eventCategory) {
                if ("AptosFormsDemoMainFormSubmitted".equals(eventCategory)) {
                    return moduleName + "::" + aptosFormsDemoMainFormSubmittedStructName;
                }
                if ("AptosFormsDemoMainFormUpdated".equals(eventCategory)) {
                    return moduleName + "::" + aptosFormsDemoMainFormUpdatedStructName;
                }
                throw new IllegalArgumentException("Unknown event category: " + eventCategory);
            }

            @Override
            public String getEventHandleFieldName(String eventCategory) {
                if ("AptosFormsDemoMainFormSubmitted".equals(eventCategory)) {
                    return aptosFormsDemoMainFormSubmittedHandleFieldName;
                }
                if ("AptosFormsDemoMainFormUpdated".equals(eventCategory)) {
                    return aptosFormsDemoMainFormUpdatedHandleFieldName;
                }
                throw new IllegalArgumentException("Unknown event category: " + eventCategory);
            }

            @Override
            public String getStateTableFieldName() {
                return stateTableFieldName;
            }

            @Override
            public String getModuleQualifiedEntityStateStructName() {
                return moduleName + "::" + stateStructName;
            }

            @Override
            public String getModuleQualifiedTablesStructName() {
                return moduleName + "::Tables";
            }

            @Override
            public String getModuleQualifiedEventsStructName() {
                return moduleName + "::Events";
            }

            @Override
            public String getContractAddress() {
                return contractAddress;
            }

            @Override
            public String getStoreAccountAddress() {
                return storeAccountAddress;
            }
        };
        return contractModuleNameProvider;
    }

}
