// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.*;

public abstract class AbstractAptosFormsDemoCoin_claimer_1Aggregate extends AbstractAggregate implements AptosFormsDemoCoin_claimer_1Aggregate {
    private AptosFormsDemoCoin_claimer_1State.MutableAptosFormsDemoCoin_claimer_1State state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAptosFormsDemoCoin_claimer_1Aggregate(AptosFormsDemoCoin_claimer_1State state) {
        this.state = (AptosFormsDemoCoin_claimer_1State.MutableAptosFormsDemoCoin_claimer_1State)state;
    }

    public AptosFormsDemoCoin_claimer_1State getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void throwOnInvalidStateTransition(Command c) {
        AptosFormsDemoCoin_claimer_1Command.throwOnInvalidStateTransition(this.state, c);
    }

    protected void apply(Event e) {
        onApplying(e);
        //state.mutate(e);
        changes.add(e);
    }


    ////////////////////////

    public static class SimpleAptosFormsDemoCoin_claimer_1Aggregate extends AbstractAptosFormsDemoCoin_claimer_1Aggregate {
        public SimpleAptosFormsDemoCoin_claimer_1Aggregate(AptosFormsDemoCoin_claimer_1State state) {
            super(state);
        }

        @Override
        public void claim(Long offChainVersion, String commandId, String requesterId, AptosFormsDemoCoin_claimer_1Commands.Claim c) {
            java.util.function.Supplier<AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed> eventFactory = () -> newAptosFormsDemoCoin_claimer_1_Claimed(offChainVersion, commandId, requesterId);
            AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed e;
            try {
                e = verifyClaim(eventFactory, c);
            } catch (Exception ex) {
                throw new DomainError("VerificationFailed", ex);
            }

            apply(e);
        }

        protected AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed verifyClaim(java.util.function.Supplier<AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed> eventFactory, AptosFormsDemoCoin_claimer_1Commands.Claim c) {

            AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed e = (AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed) ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.ClaimLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, AptosFormsDemoCoin_claimer_1State.class, VerificationContext.class},
                    new Object[]{eventFactory, getState(), VerificationContext.of(c)}
            );

//package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;
//
//public class ClaimLogic {
//    public static AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed verify(java.util.function.Supplier<AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed> eventFactory, AptosFormsDemoCoin_claimer_1State aptosFormsDemoCoin_claimer_1State, VerificationContext verificationContext) {
//    }
//}

            return e;
        }

        protected AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed newAptosFormsDemoCoin_claimer_1_Claimed(Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoCoin_claimer_1EventId eventId = new AptosFormsDemoCoin_claimer_1EventId(getState().getFormPageAndSignerAddress(), null);
            AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed e = new AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed();

            e.setRemainingAmount(null);
            e.setRemainingShares(null);
            e.setAptosEventVersion(null);
            e.setAptosEventSequenceNumber(null);
            e.setAptosEventType(null);
            e.setAptosEventGuid(null);
            e.setEventStatus(null);

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((OffsetDateTime)ApplicationContext.current.getTimestampService().now(OffsetDateTime.class));

            e.setAptosFormsDemoCoin_claimer_1EventId(eventId);
            return e;
        }

    }

}

