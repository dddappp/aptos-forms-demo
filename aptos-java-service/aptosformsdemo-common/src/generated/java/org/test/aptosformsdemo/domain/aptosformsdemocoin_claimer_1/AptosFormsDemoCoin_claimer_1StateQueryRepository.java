// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public interface AptosFormsDemoCoin_claimer_1StateQueryRepository {
    AptosFormsDemoCoin_claimer_1State get(FormPageAndAddress id);

    Iterable<AptosFormsDemoCoin_claimer_1State> getAll(Integer firstResult, Integer maxResults);
    
    Iterable<AptosFormsDemoCoin_claimer_1State> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AptosFormsDemoCoin_claimer_1State> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    AptosFormsDemoCoin_claimer_1State getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    AptosFormsDemoCoin_claimer_1State getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<AptosFormsDemoCoin_claimer_1State> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

