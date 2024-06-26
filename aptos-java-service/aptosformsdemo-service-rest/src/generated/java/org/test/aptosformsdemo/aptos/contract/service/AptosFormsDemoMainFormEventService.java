// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.service;

import com.github.wubuku.aptos.bean.Event;
import com.github.wubuku.aptos.utils.NodeApiClient;

import org.test.aptosformsdemo.domain.FormPageAndAddress;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.AbstractAptosFormsDemoMainFormEvent;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.DomainBeanUtils;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;

import org.test.aptosformsdemo.aptos.contract.aptosformsdemomainform.AptosFormsDemoMainFormSubmitted;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemomainform.AptosFormsDemoMainFormUpdated;
import org.test.aptosformsdemo.aptos.contract.repository.AptosFormsDemoMainFormEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.*;
import java.util.*;


@Service
public class AptosFormsDemoMainFormEventService {

    @Autowired
    private NodeApiClient aptosNodeApiClient;

    @Autowired
    private AptosFormsDemoMainFormEventRepository aptosFormsDemoMainFormEventRepository;

    @Transactional
    public void updateStatusToProcessed(AbstractAptosFormsDemoMainFormEvent event) {
        event.setEventStatus("D");
        aptosFormsDemoMainFormEventRepository.save(event);
    }

    @Transactional
    public void pullAptosFormsDemoMainFormSubmittedEvents(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        if (resourceAccountAddress == null) {
            return;
        }
        int limit = 1;
        BigInteger cursor = getAptosFormsDemoMainFormSubmittedEventNextCursor();
        if (cursor == null) {
            cursor = BigInteger.ZERO;
        }
        while (true) {
            List<Event<AptosFormsDemoMainFormSubmitted>> eventPage;
            try {
                eventPage = aptosNodeApiClient.getEventsByEventHandle(
                        resourceAccountAddress,
                        contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEventsStructName(),
                        contractModuleNameProvider.getEventHandleFieldName("AptosFormsDemoMainFormSubmitted"),
                        AptosFormsDemoMainFormSubmitted.class,
                        cursor.longValue(),
                        limit
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (eventPage != null && eventPage.size() > 0) {
                cursor = cursor.add(BigInteger.ONE);
                for (Event<AptosFormsDemoMainFormSubmitted> eventEnvelope : eventPage) {
                    saveAptosFormsDemoMainFormSubmitted(toFormPageAndAddress, eventEnvelope);
                }
            } else {
                break;
            }
        }
    }

    private BigInteger getAptosFormsDemoMainFormSubmittedEventNextCursor() {
        AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted lastEvent = aptosFormsDemoMainFormEventRepository.findFirstAptosFormsDemoMainFormSubmittedByOrderByAptosEventSequenceNumber();
        return lastEvent != null ? lastEvent.getAptosEventSequenceNumber() : null;
    }

    private void saveAptosFormsDemoMainFormSubmitted(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, Event<AptosFormsDemoMainFormSubmitted> eventEnvelope) {
        AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormSubmitted aptosFormsDemoMainFormSubmitted = DomainBeanUtils.toAptosFormsDemoMainFormSubmitted(toFormPageAndAddress, eventEnvelope);
        if (aptosFormsDemoMainFormEventRepository.findById(aptosFormsDemoMainFormSubmitted.getAptosFormsDemoMainFormEventId()).isPresent()) {
            return;
        }
        aptosFormsDemoMainFormEventRepository.save(aptosFormsDemoMainFormSubmitted);
    }

    @Transactional
    public void pullAptosFormsDemoMainFormUpdatedEvents(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        if (resourceAccountAddress == null) {
            return;
        }
        int limit = 1;
        BigInteger cursor = getAptosFormsDemoMainFormUpdatedEventNextCursor();
        if (cursor == null) {
            cursor = BigInteger.ZERO;
        }
        while (true) {
            List<Event<AptosFormsDemoMainFormUpdated>> eventPage;
            try {
                eventPage = aptosNodeApiClient.getEventsByEventHandle(
                        resourceAccountAddress,
                        contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEventsStructName(),
                        contractModuleNameProvider.getEventHandleFieldName("AptosFormsDemoMainFormUpdated"),
                        AptosFormsDemoMainFormUpdated.class,
                        cursor.longValue(),
                        limit
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (eventPage != null && eventPage.size() > 0) {
                cursor = cursor.add(BigInteger.ONE);
                for (Event<AptosFormsDemoMainFormUpdated> eventEnvelope : eventPage) {
                    saveAptosFormsDemoMainFormUpdated(toFormPageAndAddress, eventEnvelope);
                }
            } else {
                break;
            }
        }
    }

    private BigInteger getAptosFormsDemoMainFormUpdatedEventNextCursor() {
        AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated lastEvent = aptosFormsDemoMainFormEventRepository.findFirstAptosFormsDemoMainFormUpdatedByOrderByAptosEventSequenceNumber();
        return lastEvent != null ? lastEvent.getAptosEventSequenceNumber() : null;
    }

    private void saveAptosFormsDemoMainFormUpdated(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, Event<AptosFormsDemoMainFormUpdated> eventEnvelope) {
        AbstractAptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated aptosFormsDemoMainFormUpdated = DomainBeanUtils.toAptosFormsDemoMainFormUpdated(toFormPageAndAddress, eventEnvelope);
        if (aptosFormsDemoMainFormEventRepository.findById(aptosFormsDemoMainFormUpdated.getAptosFormsDemoMainFormEventId()).isPresent()) {
            return;
        }
        aptosFormsDemoMainFormEventRepository.save(aptosFormsDemoMainFormUpdated);
    }

}
