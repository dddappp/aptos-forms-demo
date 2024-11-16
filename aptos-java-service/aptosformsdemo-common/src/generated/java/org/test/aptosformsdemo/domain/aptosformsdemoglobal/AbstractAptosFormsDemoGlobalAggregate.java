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
            java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn> eventFactory = () -> newPayment_123_VaultAdminWithdrawn(amount, offChainVersion, commandId, requesterId);
            AptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn e;
            try {
                e = verifyAdminWithdrawPayment_123_Vault(eventFactory, amount, c);
            } catch (Exception ex) {
                throw new DomainError("VerificationFailed", ex);
            }

            apply(e);
        }

        @Override
        public void depositCoin_claimer_1_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.DepositCoin_claimer_1_Vault c) {
            java.util.function.Supplier<AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited> eventFactory = () -> newCoin_claimer_1_VaultDeposited(amount, offChainVersion, commandId, requesterId);
            AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited e;
            try {
                e = verifyDepositCoin_claimer_1_Vault(eventFactory, amount, c);
            } catch (Exception ex) {
                throw new DomainError("VerificationFailed", ex);
            }

            apply(e);
        }

        @Override
        public void adminWithdrawCoin_claimer_1_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.AdminWithdrawCoin_claimer_1_Vault c) {
            java.util.function.Supplier<AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn> eventFactory = () -> newCoin_claimer_1_VaultAdminWithdrawn(amount, offChainVersion, commandId, requesterId);
            AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn e;
            try {
                e = verifyAdminWithdrawCoin_claimer_1_Vault(eventFactory, amount, c);
            } catch (Exception ex) {
                throw new DomainError("VerificationFailed", ex);
            }

            apply(e);
        }

        protected AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited verifyDepositPayment_123_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited> eventFactory, AptosFormsDemoGlobalCommands.DepositPayment_123_Vault c) {

            AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited e = (AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited) ApplicationContext.current.get(IDepositPayment_123_VaultLogic.class).verify(
                    eventFactory, getState(), VerificationContext.of(c));

            return e;
        }

        protected AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn verifyWithdrawPayment_123_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn> eventFactory, BigInteger amount, AptosFormsDemoGlobalCommands.WithdrawPayment_123_Vault c) {
            BigInteger Amount = amount;

            AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn e = (AptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn) ApplicationContext.current.get(IWithdrawPayment_123_VaultLogic.class).verify(
                    eventFactory, getState(), amount, VerificationContext.of(c));

            return e;
        }

        protected AptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn verifyAdminWithdrawPayment_123_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn> eventFactory, BigInteger amount, AptosFormsDemoGlobalCommands.AdminWithdrawPayment_123_Vault c) {
            BigInteger Amount = amount;

            AptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn e = (AptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn) ApplicationContext.current.get(IAdminWithdrawPayment_123_VaultLogic.class).verify(
                    eventFactory, getState(), amount, VerificationContext.of(c));

            return e;
        }

        protected AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited verifyDepositCoin_claimer_1_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited> eventFactory, BigInteger amount, AptosFormsDemoGlobalCommands.DepositCoin_claimer_1_Vault c) {
            BigInteger Amount = amount;

            AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited e = (AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited) ApplicationContext.current.get(IDepositCoin_claimer_1_VaultLogic.class).verify(
                    eventFactory, getState(), amount, VerificationContext.of(c));

            return e;
        }

        protected AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultWithdrawn verifyWithdrawCoin_claimer_1_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultWithdrawn> eventFactory, BigInteger amount, AptosFormsDemoGlobalCommands.WithdrawCoin_claimer_1_Vault c) {
            BigInteger Amount = amount;

            AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultWithdrawn e = (AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultWithdrawn) ApplicationContext.current.get(IWithdrawCoin_claimer_1_VaultLogic.class).verify(
                    eventFactory, getState(), amount, VerificationContext.of(c));

            return e;
        }

        protected AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn verifyAdminWithdrawCoin_claimer_1_Vault(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn> eventFactory, BigInteger amount, AptosFormsDemoGlobalCommands.AdminWithdrawCoin_claimer_1_Vault c) {
            BigInteger Amount = amount;

            AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn e = (AptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn) ApplicationContext.current.get(IAdminWithdrawCoin_claimer_1_VaultLogic.class).verify(
                    eventFactory, getState(), amount, VerificationContext.of(c));

            return e;
        }

//        protected AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized verify__Init__(java.util.function.Supplier<AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized> eventFactory, AptosFormsDemoGlobalCommands.__Init__ c) {
//
//            AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized e = (AptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized) ApplicationContext.current.get(I__Init__Logic.class).verify(
//                    eventFactory, getState(), VerificationContext.of(c));
//
//            return e;
//        }

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

