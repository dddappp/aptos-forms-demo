// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.Event;
import org.test.aptosformsdemo.domain.Command;

public interface FormDefinitionApplicationService {
    void when(FormDefinitionCommand.CreateFormDefinition c);

    void when(FormDefinitionCommand.MergePatchFormDefinition c);

    void when(FormDefinitionCommand.DeleteFormDefinition c);

    void when(FormDefinitionCommands.DefineFormWithFirstPage c);

    FormDefinitionState get(Long id);

    Iterable<FormDefinitionState> getAll(Integer firstResult, Integer maxResults);

    Iterable<FormDefinitionState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<FormDefinitionState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<FormDefinitionState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    FormDefinitionEvent getEvent(Long formSequenceId, long version);

    FormDefinitionState getHistoryState(Long formSequenceId, long version);

    FormPageDefinitionState getFormPageDefinition(Long formDefinitionFormSequenceId, Integer pageNumber);

    Iterable<FormPageDefinitionState> getFormPageDefinitions(Long formDefinitionFormSequenceId, Criterion filter, List<String> orders);

}

