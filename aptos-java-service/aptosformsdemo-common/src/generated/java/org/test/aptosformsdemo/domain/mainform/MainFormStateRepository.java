// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.mainform;

import java.util.*;
import org.dddml.support.criterion.Criterion;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;

public interface MainFormStateRepository {
    MainFormState get(String id, boolean nullAllowed);

    void save(MainFormState state);

    void merge(MainFormState detached);
}

