// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal;

import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import java.math.BigInteger;
import org.test.aptosformsdemo.specialization.*;

public abstract class AbstractAptosFormsDemoGlobalAggregate extends AbstractAggregate implements AptosFormsDemoGlobalAggregate {
    private AptosFormsDemoGlobalState.MutableAptosFormsDemoGlobalState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAptosFormsDemoGlobalAggregate(AptosFormsDemoGlobalState state) {
        this.state = (AptosFormsDemoGlobalState.MutableAptosFormsDemoGlobalState)state;
    }

    public AptosFormsDemoGlobalState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void throwOnInvalidStateTransition(Command c) {
        AptosFormsDemoGlobalCommand.throwOnInvalidStateTransition(this.state, c);
    }

    protected void apply(Event e) {
        onApplying(e);
        //state.mutate(e);
        changes.add(e);
    }


    ////////////////////////

    public static class SimpleAptosFormsDemoGlobalAggregate extends AbstractAptosFormsDemoGlobalAggregate {
        public SimpleAptosFormsDemoGlobalAggregate(AptosFormsDemoGlobalState state) {
            super(state);
        }

        protected AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited verifyDepositPayment_123_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited> eventFactory, AptosFormsDemoGlobalCommands.DepositPayment_123_Vault c) {

            AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited e = (AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited) ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.aptosformsdemoglobal.DepositPayment_123_VaultLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, AptosFormsDemoGlobalState.class, VerificationContext.class},
                    new Object[]{eventFactory, getState(), VerificationContext.forCommand(c)}
            );

//package org.test.aptosformsdemo.domain.aptosformsdemoglobal;
//
//public class DepositPayment_123_VaultLogic {
//    public static AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited verify(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited> eventFactory, AptosFormsDemoGlobalState aptosFormsDemoGlobalState, VerificationContext verificationContext) {
//    }
//}

            return e;
        }
           

        protected AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn verifyWithdrawPayment_123_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn> eventFactory, BigInteger amount, AptosFormsDemoGlobalCommands.WithdrawPayment_123_Vault c) {
            BigInteger Amount = amount;

            AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn e = (AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn) ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.aptosformsdemoglobal.WithdrawPayment_123_VaultLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, AptosFormsDemoGlobalState.class, BigInteger.class, VerificationContext.class},
                    new Object[]{eventFactory, getState(), amount, VerificationContext.forCommand(c)}
            );

//package org.test.aptosformsdemo.domain.aptosformsdemoglobal;
//
//public class WithdrawPayment_123_VaultLogic {
//    public static AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn verify(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn> eventFactory, AptosFormsDemoGlobalState aptosFormsDemoGlobalState, BigInteger amount, VerificationContext verificationContext) {
//    }
//}

            return e;
        }
           

        protected AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized verify__Init__(java.util.function.Supplier<AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized> eventFactory, AptosFormsDemoGlobalCommands.__Init__ c) {

            AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized e = (AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized) ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.aptosformsdemoglobal.__Init__Logic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, AptosFormsDemoGlobalState.class, VerificationContext.class},
                    new Object[]{eventFactory, getState(), VerificationContext.forCommand(c)}
            );

//package org.test.aptosformsdemo.domain.aptosformsdemoglobal;
//
//public class __Init__Logic {
//    public static AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized verify(java.util.function.Supplier<AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized> eventFactory, AptosFormsDemoGlobalState aptosFormsDemoGlobalState, VerificationContext verificationContext) {
//    }
//}

            return e;
        }
           

        protected AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized newAptosFormsDemoGlobalInitialized(Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoGlobalEventId eventId = new AptosFormsDemoGlobalEventId(getState().getFormPageAndAccountAddress(), null);
            AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized e = new AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized();

            e.setAptosEventVersion(null);
            e.setAptosEventSequenceNumber(null);
            e.setAptosEventType(null);
            e.setAptosEventGuid(null);
            e.setStatus(null);

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((java.util.Date)ApplicationContext.current.getTimestampService().now(java.util.Date.class));

            e.setAptosFormsDemoGlobalEventId(eventId);
            return e;
        }

    }

}

