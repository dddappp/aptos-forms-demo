// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import java.util.List;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.Event;
import org.test.aptosformsdemo.domain.Command;

public interface AptosFormsDemoCoin_claimer_1Aggregate {
    AptosFormsDemoCoin_claimer_1State getState();

    List<Event> getChanges();

    void claim(Long offChainVersion, String commandId, String requesterId, AptosFormsDemoCoin_claimer_1Commands.Claim c);

    void throwOnInvalidStateTransition(Command c);
}

