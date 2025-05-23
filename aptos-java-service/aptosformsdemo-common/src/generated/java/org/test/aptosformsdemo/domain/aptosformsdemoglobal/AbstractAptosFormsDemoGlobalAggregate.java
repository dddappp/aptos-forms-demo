// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal;

import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.util.Date;
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

        @Override
        public void adminWithdrawPayment_123_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.AdminWithdrawPayment_123_Vault c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void depositCoin_claimer_1_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.DepositCoin_claimer_1_Vault c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void adminWithdrawCoin_claimer_1_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.AdminWithdrawCoin_claimer_1_Vault c) {
            throw new UnsupportedOperationException();
        }

        protected AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn newPayment_123_VaultAdminWithdrawn(BigInteger amount, Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoGlobalEventId eventId = new AptosFormsDemoGlobalEventId(getState().getFormAndAccountAddress(), null);
            AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn e = new AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn();

            e.getDynamicProperties().put("amount", amount);
            e.setAptosEventVersion(null);
            e.setAptosEventSequenceNumber(null);
            e.setAptosEventType(null);
            e.setAptosEventGuid(null);
            e.setEventStatus(null);

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((java.util.Date)ApplicationContext.current.getTimestampService().now(java.util.Date.class));

            e.setAptosFormsDemoGlobalEventId(eventId);
            return e;
        }

        protected AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited newCoin_claimer_1_VaultDeposited(BigInteger amount, Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoGlobalEventId eventId = new AptosFormsDemoGlobalEventId(getState().getFormAndAccountAddress(), null);
            AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited e = new AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited();

            e.getDynamicProperties().put("amount", amount);
            e.setAptosEventVersion(null);
            e.setAptosEventSequenceNumber(null);
            e.setAptosEventType(null);
            e.setAptosEventGuid(null);
            e.setEventStatus(null);

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((java.util.Date)ApplicationContext.current.getTimestampService().now(java.util.Date.class));

            e.setAptosFormsDemoGlobalEventId(eventId);
            return e;
        }

        protected AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn newCoin_claimer_1_VaultAdminWithdrawn(BigInteger amount, Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoGlobalEventId eventId = new AptosFormsDemoGlobalEventId(getState().getFormAndAccountAddress(), null);
            AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn e = new AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn();

            e.getDynamicProperties().put("amount", amount);
            e.setAptosEventVersion(null);
            e.setAptosEventSequenceNumber(null);
            e.setAptosEventType(null);
            e.setAptosEventGuid(null);
            e.setEventStatus(null);

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((java.util.Date)ApplicationContext.current.getTimestampService().now(java.util.Date.class));

            e.setAptosFormsDemoGlobalEventId(eventId);
            return e;
        }

        protected AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized newAptosFormsDemoGlobalInitialized(Long offChainVersion, String commandId, String requesterId) {
            AptosFormsDemoGlobalEventId eventId = new AptosFormsDemoGlobalEventId(getState().getFormAndAccountAddress(), null);
            AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized e = new AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized();

            e.setAptosEventVersion(null);
            e.setAptosEventSequenceNumber(null);
            e.setAptosEventType(null);
            e.setAptosEventGuid(null);
            e.setEventStatus(null);

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((java.util.Date)ApplicationContext.current.getTimestampService().now(java.util.Date.class));

            e.setAptosFormsDemoGlobalEventId(eventId);
            return e;
        }

    }

}

