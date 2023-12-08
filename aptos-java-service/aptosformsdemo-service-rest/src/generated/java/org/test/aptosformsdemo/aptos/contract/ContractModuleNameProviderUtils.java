// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

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

    public static ContractModuleNameProvider getAptosFormsDemoGlobalModuleNameProvider(
            final String moduleName,
            final String contractAddress,
            final String storeAccountAddress,
            final String payment_123_VaultDepositedStructName,
            final String payment_123_VaultWithdrawnStructName,
            final String aptosFormsDemoGlobalInitializedStructName,
            final String payment_123_VaultDepositedHandleFieldName,
            final String payment_123_VaultWithdrawnHandleFieldName,
            final String aptosFormsDemoGlobalInitializedHandleFieldName,
            final String stateTableFieldName,
            final String stateStructName
    ) {
        ContractModuleNameProvider contractModuleNameProvider = new ContractModuleNameProvider() {
            @Override
            public String getModuleQualifiedEventStructName(String eventCategory) {
                if ("Payment_123_VaultDeposited".equals(eventCategory)) {
                    return moduleName + "::" + payment_123_VaultDepositedStructName;
                }
                if ("Payment_123_VaultWithdrawn".equals(eventCategory)) {
                    return moduleName + "::" + payment_123_VaultWithdrawnStructName;
                }
                if ("AptosFormsDemoGlobalInitialized".equals(eventCategory)) {
                    return moduleName + "::" + aptosFormsDemoGlobalInitializedStructName;
                }
                throw new IllegalArgumentException("Unknown event category: " + eventCategory);
            }

            @Override
            public String getEventHandleFieldName(String eventCategory) {
                if ("Payment_123_VaultDeposited".equals(eventCategory)) {
                    return payment_123_VaultDepositedHandleFieldName;
                }
                if ("Payment_123_VaultWithdrawn".equals(eventCategory)) {
                    return payment_123_VaultWithdrawnHandleFieldName;
                }
                if ("AptosFormsDemoGlobalInitialized".equals(eventCategory)) {
                    return aptosFormsDemoGlobalInitializedHandleFieldName;
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
