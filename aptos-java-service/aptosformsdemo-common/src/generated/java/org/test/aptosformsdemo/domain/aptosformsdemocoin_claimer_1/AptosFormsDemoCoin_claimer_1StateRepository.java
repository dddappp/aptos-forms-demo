// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import java.util.*;
import org.dddml.support.criterion.Criterion;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public interface AptosFormsDemoCoin_claimer_1StateRepository {
    AptosFormsDemoCoin_claimer_1State get(FormPageAndAddress id, boolean nullAllowed);

    void save(AptosFormsDemoCoin_claimer_1State state);

    void merge(AptosFormsDemoCoin_claimer_1State detached);
}

