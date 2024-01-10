package org.test.aptosformsdemo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.test.aptosformsdemo.domain.EntityStateCollection;
import org.test.aptosformsdemo.domain.formdefinition.*;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;


@SpringBootTest
public class AptosFormsDemoApplicationTests {
    @Autowired
    private FormDefinitionStateRepository formDefinitionStateRepository;

    @Autowired
    private FormDefinitionStateQueryRepository formDefinitionStateQueryRepository;

    private static AbstractFormDefinitionState.SimpleFormDefinitionState createFormDefinitionStateWithTwoPage() {
    /*
INSERT INTO public.form_definition(
form_sequence_id, off_chain_version, form_id, contract_address, store_account_address
--, created_by, updated_by, active, deleted, created_at, updated_at
)
VALUES (
    1,
    0,
    'AptosFormsDemo',
    '0x56c01bfdfae128e57544f59f52be70bb883ea2d1fb97ba5774741996f77b4eb7',
    '0x71f18b1efed2477f88ad2ca4a1bba4e0711b12d62527450d32bb91fb169f74e4'
);
     */
        AbstractFormDefinitionState.SimpleFormDefinitionState formDefinition = new AbstractFormDefinitionState.SimpleFormDefinitionState();
        formDefinition.setFormSequenceId(1L);
        formDefinition.setFormId("AptosFormsDemo");
        formDefinition.setContractAddress("0x56c01bfdfae128e57544f59f52be70bb883ea2d1fb97ba5774741996f77b4eb7");
        formDefinition.setStoreAccountAddress("0x71f18b1efed2477f88ad2ca4a1bba4e0711b12d62527450d32bb91fb169f74e4");

        /*
INSERT INTO public.form_page_definition(
	form_sequence_id, page_number, off_chain_version, page_name, move_state_table_field_name, move_state_struct_name, move_submit_event_handle_field_name, move_update_event_handle_field_name
	-- , created_by, updated_by, active, deleted, created_at, updated_at
)
	VALUES (
		1, 1, 0, 'MainForm',
		'aptos_forms_demo_main_form_table',
		'AptosFormsDemoMainForm',
		'aptos_forms_demo_main_form_submitted_handle',
		'aptos_forms_demo_main_form_updated_handle'
	);
         */
        EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState> pageDefinitions
                = (EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>) formDefinition.getPageDefinitions();
        FormPageDefinitionState.MutableFormPageDefinitionState pageDefinition_1
                = (FormPageDefinitionState.MutableFormPageDefinitionState) pageDefinitions.getOrAddDefault(1);
        //pageDefinition_1.setPageNumber(1);
        pageDefinition_1.setPageName("MainForm");
        pageDefinition_1.setMoveStateTableFieldName("aptos_forms_demo_main_form_table");
        pageDefinition_1.setMoveStateStructName("AptosFormsDemoMainForm");
        pageDefinition_1.setMoveSubmitEventHandleFieldName("aptos_forms_demo_main_form_submitted_handle");
        pageDefinition_1.setMoveUpdateEventHandleFieldName("aptos_forms_demo_main_form_updated_handle");

        FormPageDefinitionState.MutableFormPageDefinitionState pageDefinition_2
                = (FormPageDefinitionState.MutableFormPageDefinitionState) pageDefinitions.getOrAddDefault(2);
        //pageDefinition_2.setPageNumber(2);
        pageDefinition_2.setPageName("SecondPage");
        pageDefinition_2.setMoveStateTableFieldName("aptos_forms_demo_second_page_table");
        pageDefinition_2.setMoveStateStructName("AptosFormsDemoSecondPage");
        pageDefinition_2.setMoveSubmitEventHandleFieldName("aptos_forms_demo_second_page_submitted_handle");
        pageDefinition_2.setMoveUpdateEventHandleFieldName("aptos_forms_demo_second_page_updated_handle");
        return formDefinition;
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testAddFormDefinition() {
        AbstractFormDefinitionState.SimpleFormDefinitionState existingFormDefinitionState
                = (AbstractFormDefinitionState.SimpleFormDefinitionState) formDefinitionStateRepository.get(1L, false);
        AbstractFormDefinitionState.SimpleFormDefinitionState formDefinition = createFormDefinitionStateWithTwoPage();
        formDefinitionStateRepository.merge(formDefinition);
        testGetAllFormDefinitionStates();
        //if (true) return;

        AbstractFormDefinitionState.SimpleFormDefinitionState formDefinition_2 = createFormDefinitionStateWithTwoPage();
        EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState> pageDefinitions_2
                = (EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>) formDefinition_2.getPageDefinitions();
        pageDefinitions_2.removeState(pageDefinitions_2.get(2));
        formDefinitionStateRepository.merge(formDefinition_2);
        testGetAllFormDefinitionStates();
    }

    //@Test
    public void testGetAllFormDefinitionStates() {
        Iterable<FormDefinitionState> formDefinitionStates = formDefinitionStateQueryRepository.getAll(0, Integer.MAX_VALUE);
        formDefinitionStates.forEach(
                formDefinitionState -> {
                    System.out.println("Form Id: " +
                            formDefinitionState.getFormId());
                    System.out.println("Form Sequence Id: " +
                            formDefinitionState.getFormSequenceId());
                    //System.out.println("Off Chain Version: " + formDefinitionState.getOffChainVersion());
                    formDefinitionState.getPageDefinitions().stream().forEach(
                            p -> {
                                System.out.println("Page Number: " +
                                        p.getPageNumber());
                                System.out.println("Page Name: " +
                                        p.getPageName());
                                //System.out.println(p.getOffChainVersion());
                            }
                    );
                }
        );
        // Get stream from iterable
        Stream<FormDefinitionState> formDefinitionStateStream = StreamSupport.stream(formDefinitionStates.spliterator(), false);
        // Get first form definition state from stream
        FormDefinitionState s = formDefinitionStateStream.findFirst().orElseThrow(() -> new RuntimeException("No form definition state found"));
        System.out.println(s.getFormId());
    }
}
