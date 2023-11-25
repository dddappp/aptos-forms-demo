package org.test.aptosformsdemo.domain.formdefinition;

import org.test.aptosformsdemo.specialization.MutationContext;
import org.test.aptosformsdemo.specialization.VerificationContext;

public class DefineFormWithFirstPageLogic {
    public static FormDefinitionEvent.FormWithFirstPageDefined verify(java.util.function.Supplier<FormDefinitionEvent.FormWithFirstPageDefined> eventFactory, FormDefinitionState formDefinitionState, String formId, String contractAddress, String storeAccountAddress, String pageName, String moveStateTableFieldName, String moveStateStructName, String moveSubmitEventHandleFieldName, String moveUpdateEventHandleFieldName, String moveSubmitEventStructName, String moveUpdateEventStructName, VerificationContext verificationContext) {
        return eventFactory.get();
    }

    public static FormDefinitionState mutate(FormDefinitionState formDefinitionState, String formId, String contractAddress, String storeAccountAddress, String pageName, String moveStateTableFieldName, String moveStateStructName, String moveSubmitEventHandleFieldName, String moveUpdateEventHandleFieldName, String moveSubmitEventStructName, String moveUpdateEventStructName, MutationContext<FormDefinitionState, FormDefinitionState.MutableFormDefinitionState> mutationContext) {
        //todo
        return formDefinitionState;
    }
}
