package org.test.aptosformsdemo.aptos.contract;

public class DefaultContractModuleNameProvider implements ContractModuleNameProvider {
    private static final String MODULE_NAME = "aptos_forms_demo_main_form";

    @Override
    public String getModuleQualifiedEventStructName(String eventCategory) {
        //MODULE_NAME + "::AptosFormsDemoMainFormSubmitted";
        //MODULE_NAME + "::AptosFormsDemoMainFormUpdated";
        return MODULE_NAME + "::" + eventCategory;
    }

    @Override
    public String getEventHandleFieldName(String eventCategory) {
        //"aptos_forms_demo_main_form_submitted_handle";
        //"aptos_forms_demo_main_form_updated_handle";
        if ("AptosFormsDemoMainFormSubmitted".equals(eventCategory)) {
            return "aptos_forms_demo_main_form_submitted_handle";
        }
        if ("AptosFormsDemoMainFormUpdated".equals(eventCategory)) {
            return "aptos_forms_demo_main_form_updated_handle";
        }
        throw new IllegalArgumentException("Unknown event category: " + eventCategory);
    }

    @Override
    public String getTableFieldName() {
        return "aptos_forms_demo_main_form_table";
    }

    @Override
    public String getModuleQualifiedEntityStateStructName() {
        return MODULE_NAME + "::AptosFormsDemoMainForm";
    }

    @Override
    public String getModuleQualifiedTablesStructName() {
        return MODULE_NAME + "::Tables";
    }

    @Override
    public String getModuleQualifiedEventsStructName() {
        return MODULE_NAME + "::Events";
    }
}
