// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract;

import java.math.*;
import java.util.*;

import com.github.wubuku.aptos.bean.Event;
import com.github.wubuku.aptos.bean.Option;
import org.test.aptosformsdemo.domain.AptosEvent;
import org.test.aptosformsdemo.domain.AptosEventGuid;
import org.test.aptosformsdemo.domain.FormPageAndAddress;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.AbstractAptosFormsDemoMainFormEvent;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemomainform.AptosFormsDemoMainFormSubmitted;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemomainform.AptosFormsDemoMainFormUpdated;
import org.test.aptosformsdemo.domain.FormPageAndAddress;
import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.AbstractAptosFormsDemoCoin_claimer_1Event;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemocoin_claimer_1.AptosFormsDemoCoin_claimer_1_Claimed;
import org.test.aptosformsdemo.domain.FormAndAddress;
import org.test.aptosformsdemo.domain.aptosformsdemoglobal.AbstractAptosFormsDemoGlobalEvent;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Payment_123_VaultDeposited;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Payment_123_VaultWithdrawn;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Payment_123_VaultAdminWithdrawn;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Coin_claimer_1_VaultDeposited;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Coin_claimer_1_VaultWithdrawn;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Coin_claimer_1_VaultAdminWithdrawn;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.AptosFormsDemoGlobalInitialized;

/**
 * Utils that convert beans in the contract package to domain beans.
 */
public class DomainBeanUtils {
    private DomainBeanUtils() {
    }

    public static org.test.aptosformsdemo.domain.Coin toCoin(Coin contractCoin) {
        if (contractCoin == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.Coin coin = new org.test.aptosformsdemo.domain.Coin();
        coin.setValue(contractCoin.getValue());
        return coin;
    }

    public static org.test.aptosformsdemo.domain.FAMetadata toFAMetadata(FAMetadata contractFAMetadata) {
        if (contractFAMetadata == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.FAMetadata faMetadata = new org.test.aptosformsdemo.domain.FAMetadata();
        faMetadata.setName(contractFAMetadata.getName());
        faMetadata.setSymbol(contractFAMetadata.getSymbol());
        faMetadata.setDecimals(contractFAMetadata.getDecimals());
        faMetadata.setIconUri(contractFAMetadata.getIconUri());
        faMetadata.setProjectUri(contractFAMetadata.getProjectUri());
        return faMetadata;
    }

    public static org.test.aptosformsdemo.domain.FungibleStore toFungibleStore(FungibleStore contractFungibleStore) {
        if (contractFungibleStore == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.FungibleStore fungibleStore = new org.test.aptosformsdemo.domain.FungibleStore();
        fungibleStore.setMetadata(contractFungibleStore.getMetadata());
        fungibleStore.setBalance(contractFungibleStore.getBalance());
        fungibleStore.setFrozen(contractFungibleStore.getFrozen());
        return fungibleStore;
    }

    public static org.test.aptosformsdemo.domain.ObjectDeleteRef toObjectDeleteRef(ObjectDeleteRef contractObjectDeleteRef) {
        if (contractObjectDeleteRef == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.ObjectDeleteRef objectDeleteRef = new org.test.aptosformsdemo.domain.ObjectDeleteRef();
        objectDeleteRef.setSelf(contractObjectDeleteRef.getSelf());
        return objectDeleteRef;
    }

    public static org.test.aptosformsdemo.domain.ObjectExtendRef toObjectExtendRef(ObjectExtendRef contractObjectExtendRef) {
        if (contractObjectExtendRef == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.ObjectExtendRef objectExtendRef = new org.test.aptosformsdemo.domain.ObjectExtendRef();
        objectExtendRef.setSelf(contractObjectExtendRef.getSelf());
        return objectExtendRef;
    }

    public static org.test.aptosformsdemo.domain.ObjectTransferRef toObjectTransferRef(ObjectTransferRef contractObjectTransferRef) {
        if (contractObjectTransferRef == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.ObjectTransferRef objectTransferRef = new org.test.aptosformsdemo.domain.ObjectTransferRef();
        objectTransferRef.setSelf(contractObjectTransferRef.getSelf());
        return objectTransferRef;
    }

    public static org.test.aptosformsdemo.domain.XRenderFormDate toXRenderFormDate(XRenderFormDate contractXRenderFormDate) {
        if (contractXRenderFormDate == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.XRenderFormDate xRenderFormDate = new org.test.aptosformsdemo.domain.XRenderFormDate();
        xRenderFormDate.setYear(contractXRenderFormDate.getYear());
        xRenderFormDate.setMonth(contractXRenderFormDate.getMonth());
        xRenderFormDate.setDay(contractXRenderFormDate.getDay());
        return xRenderFormDate;
    }

    public static org.test.aptosformsdemo.domain.XRenderFormDateRange toXRenderFormDateRange(XRenderFormDateRange contractXRenderFormDateRange) {
        if (contractXRenderFormDateRange == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.XRenderFormDateRange xRenderFormDateRange = new org.test.aptosformsdemo.domain.XRenderFormDateRange();
        xRenderFormDateRange.setStart(toXRenderFormDate(contractXRenderFormDateRange.getStart()));
        xRenderFormDateRange.setEnd(toXRenderFormDate(contractXRenderFormDateRange.getEnd()));
        return xRenderFormDateRange;
    }

    public static org.test.aptosformsdemo.domain.XRenderFormStringRange toXRenderFormStringRange(XRenderFormStringRange contractXRenderFormStringRange) {
        if (contractXRenderFormStringRange == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.XRenderFormStringRange xRenderFormStringRange = new org.test.aptosformsdemo.domain.XRenderFormStringRange();
        xRenderFormStringRange.setStart(contractXRenderFormStringRange.getStart());
        xRenderFormStringRange.setEnd(contractXRenderFormStringRange.getEnd());
        return xRenderFormStringRange;
    }

    public static org.test.aptosformsdemo.domain.XRenderFormTime toXRenderFormTime(XRenderFormTime contractXRenderFormTime) {
        if (contractXRenderFormTime == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.XRenderFormTime xRenderFormTime = new org.test.aptosformsdemo.domain.XRenderFormTime();
        xRenderFormTime.setHour(contractXRenderFormTime.getHour());
        xRenderFormTime.setMinute(contractXRenderFormTime.getMinute());
        xRenderFormTime.setSecond(contractXRenderFormTime.getSecond());
        return xRenderFormTime;
    }

    public static org.test.aptosformsdemo.domain.XRenderFormTimeRange toXRenderFormTimeRange(XRenderFormTimeRange contractXRenderFormTimeRange) {
        if (contractXRenderFormTimeRange == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.XRenderFormTimeRange xRenderFormTimeRange = new org.test.aptosformsdemo.domain.XRenderFormTimeRange();
        xRenderFormTimeRange.setStart(toXRenderFormTime(contractXRenderFormTimeRange.getStart()));
        xRenderFormTimeRange.setEnd(toXRenderFormTime(contractXRenderFormTimeRange.getEnd()));
        return xRenderFormTimeRange;
    }


    public static AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted toAptosFormsDemoMainFormSubmitted(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, Event<AptosFormsDemoMainFormSubmitted> eventEnvelope) {
        AptosFormsDemoMainFormSubmitted contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted aptosFormsDemoMainFormSubmitted = new AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted();
        aptosFormsDemoMainFormSubmitted.setFormPageAndSignerAddress(toFormPageAndAddress.apply(contractEvent.getSignerAddress()));
        aptosFormsDemoMainFormSubmitted.setDynamicProperties(contractEvent.getDynamicProperties());
        aptosFormsDemoMainFormSubmitted.setVersion(BigInteger.valueOf(-1));

        setAptosEventProperties(aptosFormsDemoMainFormSubmitted, eventEnvelope);

        return aptosFormsDemoMainFormSubmitted;
    }

    public static AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated toAptosFormsDemoMainFormUpdated(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, Event<AptosFormsDemoMainFormUpdated> eventEnvelope) {
        AptosFormsDemoMainFormUpdated contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated aptosFormsDemoMainFormUpdated = new AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated();
        aptosFormsDemoMainFormUpdated.setFormPageAndSignerAddress(toFormPageAndAddress.apply(contractEvent.getSignerAddress()));
        aptosFormsDemoMainFormUpdated.setDynamicProperties(contractEvent.getDynamicProperties());
        aptosFormsDemoMainFormUpdated.setVersion(contractEvent.getVersion());

        setAptosEventProperties(aptosFormsDemoMainFormUpdated, eventEnvelope);

        return aptosFormsDemoMainFormUpdated;
    }

    public static AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed toAptosFormsDemoCoin_claimer_1_Claimed(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, Event<AptosFormsDemoCoin_claimer_1_Claimed> eventEnvelope) {
        AptosFormsDemoCoin_claimer_1_Claimed contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed aptosFormsDemoCoin_claimer_1_Claimed = new AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed();
        aptosFormsDemoCoin_claimer_1_Claimed.setFormPageAndSignerAddress(toFormPageAndAddress.apply(contractEvent.getSignerAddress()));
        aptosFormsDemoCoin_claimer_1_Claimed.setDynamicProperties(contractEvent.getDynamicProperties());
        aptosFormsDemoCoin_claimer_1_Claimed.setVersion(BigInteger.valueOf(-1));

        setAptosEventProperties(aptosFormsDemoCoin_claimer_1_Claimed, eventEnvelope);

        return aptosFormsDemoCoin_claimer_1_Claimed;
    }

    public static AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultDeposited toPayment_123_VaultDeposited(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Payment_123_VaultDeposited> eventEnvelope) {
        Payment_123_VaultDeposited contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultDeposited payment_123_VaultDeposited = new AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultDeposited();
        payment_123_VaultDeposited.setFormAndAccountAddress(toFormAndAddress.apply(contractEvent.getAccountAddress()));
        payment_123_VaultDeposited.setDynamicProperties(contractEvent.getDynamicProperties());
        payment_123_VaultDeposited.setVersion(contractEvent.getVersion());

        setAptosEventProperties(payment_123_VaultDeposited, eventEnvelope);

        return payment_123_VaultDeposited;
    }

    public static AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn toPayment_123_VaultWithdrawn(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Payment_123_VaultWithdrawn> eventEnvelope) {
        Payment_123_VaultWithdrawn contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn payment_123_VaultWithdrawn = new AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn();
        payment_123_VaultWithdrawn.setFormAndAccountAddress(toFormAndAddress.apply(contractEvent.getAccountAddress()));
        payment_123_VaultWithdrawn.setDynamicProperties(contractEvent.getDynamicProperties());
        payment_123_VaultWithdrawn.setVersion(contractEvent.getVersion());

        setAptosEventProperties(payment_123_VaultWithdrawn, eventEnvelope);

        return payment_123_VaultWithdrawn;
    }

    public static AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn toPayment_123_VaultAdminWithdrawn(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Payment_123_VaultAdminWithdrawn> eventEnvelope) {
        Payment_123_VaultAdminWithdrawn contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn payment_123_VaultAdminWithdrawn = new AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn();
        payment_123_VaultAdminWithdrawn.setFormAndAccountAddress(toFormAndAddress.apply(contractEvent.getAccountAddress()));
        payment_123_VaultAdminWithdrawn.setDynamicProperties(contractEvent.getDynamicProperties());
        payment_123_VaultAdminWithdrawn.setVersion(contractEvent.getVersion());

        setAptosEventProperties(payment_123_VaultAdminWithdrawn, eventEnvelope);

        return payment_123_VaultAdminWithdrawn;
    }

    public static AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited toCoin_claimer_1_VaultDeposited(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Coin_claimer_1_VaultDeposited> eventEnvelope) {
        Coin_claimer_1_VaultDeposited contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited coin_claimer_1_VaultDeposited = new AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultDeposited();
        coin_claimer_1_VaultDeposited.setFormAndAccountAddress(toFormAndAddress.apply(contractEvent.getAccountAddress()));
        coin_claimer_1_VaultDeposited.setDynamicProperties(contractEvent.getDynamicProperties());
        coin_claimer_1_VaultDeposited.setVersion(contractEvent.getVersion());

        setAptosEventProperties(coin_claimer_1_VaultDeposited, eventEnvelope);

        return coin_claimer_1_VaultDeposited;
    }

    public static AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultWithdrawn toCoin_claimer_1_VaultWithdrawn(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Coin_claimer_1_VaultWithdrawn> eventEnvelope) {
        Coin_claimer_1_VaultWithdrawn contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultWithdrawn coin_claimer_1_VaultWithdrawn = new AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultWithdrawn();
        coin_claimer_1_VaultWithdrawn.setFormAndAccountAddress(toFormAndAddress.apply(contractEvent.getAccountAddress()));
        coin_claimer_1_VaultWithdrawn.setDynamicProperties(contractEvent.getDynamicProperties());
        coin_claimer_1_VaultWithdrawn.setVersion(contractEvent.getVersion());

        setAptosEventProperties(coin_claimer_1_VaultWithdrawn, eventEnvelope);

        return coin_claimer_1_VaultWithdrawn;
    }

    public static AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn toCoin_claimer_1_VaultAdminWithdrawn(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Coin_claimer_1_VaultAdminWithdrawn> eventEnvelope) {
        Coin_claimer_1_VaultAdminWithdrawn contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn coin_claimer_1_VaultAdminWithdrawn = new AbstractAptosFormsDemoGlobalEvent.Coin_claimer_1_VaultAdminWithdrawn();
        coin_claimer_1_VaultAdminWithdrawn.setFormAndAccountAddress(toFormAndAddress.apply(contractEvent.getAccountAddress()));
        coin_claimer_1_VaultAdminWithdrawn.setDynamicProperties(contractEvent.getDynamicProperties());
        coin_claimer_1_VaultAdminWithdrawn.setVersion(contractEvent.getVersion());

        setAptosEventProperties(coin_claimer_1_VaultAdminWithdrawn, eventEnvelope);

        return coin_claimer_1_VaultAdminWithdrawn;
    }

    public static AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized toAptosFormsDemoGlobalInitialized(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<AptosFormsDemoGlobalInitialized> eventEnvelope) {
        AptosFormsDemoGlobalInitialized contractEvent = eventEnvelope.getData();

        AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized aptosFormsDemoGlobalInitialized = new AbstractAptosFormsDemoGlobalEvent.AptosFormsDemoGlobalInitialized();
        aptosFormsDemoGlobalInitialized.setFormAndAccountAddress(toFormAndAddress.apply(contractEvent.getAccountAddress()));
        aptosFormsDemoGlobalInitialized.setDynamicProperties(contractEvent.getDynamicProperties());
        aptosFormsDemoGlobalInitialized.setVersion(BigInteger.valueOf(-1));

        setAptosEventProperties(aptosFormsDemoGlobalInitialized, eventEnvelope);

        return aptosFormsDemoGlobalInitialized;
    }

    public static void setAptosEventProperties(AptosEvent.MutableAptosEvent domainAptosEvent, Event<?> eventEnvelope) {
        domainAptosEvent.setAptosEventGuid(toAptosEventGuid(eventEnvelope.getGuid()));
        domainAptosEvent.setAptosEventType(eventEnvelope.getType());
        domainAptosEvent.setAptosEventSequenceNumber(new BigInteger(eventEnvelope.getSequenceNumber()));
        domainAptosEvent.setAptosEventVersion(new BigInteger(eventEnvelope.getVersion()));
    }

    public static AptosEventGuid toAptosEventGuid(com.github.wubuku.aptos.bean.Event.Guid eventGuid) {
        return new AptosEventGuid(new BigInteger(eventGuid.getCreationNumber()), eventGuid.getAccountAddress());
    }

    private static <T> T extractOptionalValue(Option<T> optionView) {
        return optionView == null ? null
                : (optionView.getVec() == null || optionView.getVec().size() == 0) ? null
                : optionView.getVec().get(0);
    }

    public static List<String> extractTypeArguments(String type) {
        int i = type.indexOf("<");
        int j = type.lastIndexOf(">");
        if (i > 0 && j > i && j == type.length() - 1) {
            String typeArguments = type.substring(i + 1, j);
            String[] typeArgumentArray = typeArguments.split(",");
            return Arrays.stream(typeArgumentArray).map(String::trim).collect(java.util.stream.Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }
}
