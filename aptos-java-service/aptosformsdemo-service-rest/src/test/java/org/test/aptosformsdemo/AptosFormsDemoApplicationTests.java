package org.test.aptosformsdemo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.test.aptosformsdemo.domain.formdefinition.FormDefinitionState;
import org.test.aptosformsdemo.domain.formdefinition.FormDefinitionStateQueryRepository;
import org.test.aptosformsdemo.domain.formdefinition.FormDefinitionStateRepository;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;


@SpringBootTest
public class AptosFormsDemoApplicationTests {
    @Autowired
    private FormDefinitionStateRepository formDefinitionStateRepository;

    @Autowired
    private FormDefinitionStateQueryRepository formDefinitionStateQueryRepository;


    @Test
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
