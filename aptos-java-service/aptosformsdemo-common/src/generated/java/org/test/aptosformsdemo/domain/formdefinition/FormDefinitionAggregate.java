// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.List;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.Event;
import org.test.aptosformsdemo.domain.Command;

public interface FormDefinitionAggregate {
    FormDefinitionState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);
}
