// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract;

public class DefaultAptosFormsDemoCoin_claimer_1ModuleNameProvider implements ContractModuleNameProvider {
    private static final String MODULE_NAME = "aptos_forms_demo_coin_claimer_1";
    private String contractAddress;
    private String storeAccountAddress;

    @Override
    public String getModuleQualifiedEventStructName(String eventCategory) {
        return MODULE_NAME + "::" + eventCategory;
    }

    @Override
    public String getEventHandleFieldName(String eventCategory) {
        if ("AptosFormsDemoCoin_claimer_1_Claimed".equals(eventCategory)) {
            return "aptos_forms_demo_coin_claimer_1_claimed_handle";
        }
        throw new IllegalArgumentException("Unknown event category: " + eventCategory);
    }

    @Override
    public String getStateTableFieldName() {
        return "aptos_forms_demo_coin_claimer_1_table";
    }

    @Override
    public String getModuleQualifiedEntityStateStructName() {
        return MODULE_NAME + "::AptosFormsDemoCoin_claimer_1";
    }

    @Override
    public String getModuleQualifiedTablesStructName() {
        return MODULE_NAME + "::Tables";
    }

    @Override
    public String getModuleQualifiedEventsStructName() {
        return MODULE_NAME + "::Events";
    }

    @Override
    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    @Override
    public String getStoreAccountAddress() {
        return storeAccountAddress;
    }

    public void setStoreAccountAddress(String storeAccountAddress) {
        this.storeAccountAddress = storeAccountAddress;
    }

}
