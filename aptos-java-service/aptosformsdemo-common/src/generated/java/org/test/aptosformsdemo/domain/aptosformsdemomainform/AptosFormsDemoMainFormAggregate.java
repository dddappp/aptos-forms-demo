// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.List;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.test.aptosformsdemo.specialization.Event;
import org.test.aptosformsdemo.domain.Command;

public interface AptosFormsDemoMainFormAggregate {
    AptosFormsDemoMainFormState getState();

    List<Event> getChanges();

    void submit(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, DateRange fr_d8rw, DateRange fr_dy3l, BigInteger fr_6f68, TimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoMainFormCommands.Submit c);

    void throwOnInvalidStateTransition(Command c);
}
