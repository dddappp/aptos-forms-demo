// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.test.aptosformsdemo.specialization.Event;
import org.test.aptosformsdemo.domain.Command;

public interface AptosFormsDemoMainFormApplicationService {
    void when(AptosFormsDemoMainFormCommands.Submit c);

    AptosFormsDemoMainFormState get(String id);

    Iterable<AptosFormsDemoMainFormState> getAll(Integer firstResult, Integer maxResults);

    Iterable<AptosFormsDemoMainFormState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AptosFormsDemoMainFormState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AptosFormsDemoMainFormState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    AptosFormsDemoMainFormEvent getEvent(String signerAddress, long version);

    AptosFormsDemoMainFormState getHistoryState(String signerAddress, long version);

}

