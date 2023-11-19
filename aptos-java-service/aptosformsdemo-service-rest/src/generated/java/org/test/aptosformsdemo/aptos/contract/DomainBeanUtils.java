// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract;

import java.math.*;

import com.github.wubuku.aptos.bean.Event;
import com.github.wubuku.aptos.bean.Option;
import org.test.aptosformsdemo.domain.AptosEvent;
import org.test.aptosformsdemo.domain.AptosEventGuid;
import org.test.aptosformsdemo.domain.FormPageAndAddress;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.AbstractAptosFormsDemoMainFormEvent;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemomainform.AptosFormsDemoMainFormSubmitted;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemomainform.AptosFormsDemoMainFormUpdated;

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

    public static org.test.aptosformsdemo.domain.DateRange toDateRange(DateRange contractDateRange) {
        if (contractDateRange == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.DateRange dateRange = new org.test.aptosformsdemo.domain.DateRange();
        dateRange.setStart(toXRenderFormDate(contractDateRange.getStart()));
        dateRange.setEnd(toXRenderFormDate(contractDateRange.getEnd()));
        return dateRange;
    }

    public static org.test.aptosformsdemo.domain.StringRange toStringRange(StringRange contractStringRange) {
        if (contractStringRange == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.StringRange stringRange = new org.test.aptosformsdemo.domain.StringRange();
        stringRange.setStart(contractStringRange.getStart());
        stringRange.setEnd(contractStringRange.getEnd());
        return stringRange;
    }

    public static org.test.aptosformsdemo.domain.TimeRange toTimeRange(TimeRange contractTimeRange) {
        if (contractTimeRange == null) {
            return null;
        }
        org.test.aptosformsdemo.domain.TimeRange timeRange = new org.test.aptosformsdemo.domain.TimeRange();
        timeRange.setStart(toXRenderFormTime(contractTimeRange.getStart()));
        timeRange.setEnd(toXRenderFormTime(contractTimeRange.getEnd()));
        return timeRange;
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
}
