// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public interface AptosFormsDemoMainFormStateQueryRepository {
    AptosFormsDemoMainFormState get(FormPageAndAddress id);

    Iterable<AptosFormsDemoMainFormState> getAll(Integer firstResult, Integer maxResults);
    
    Iterable<AptosFormsDemoMainFormState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AptosFormsDemoMainFormState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    AptosFormsDemoMainFormState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    AptosFormsDemoMainFormState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<AptosFormsDemoMainFormState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

