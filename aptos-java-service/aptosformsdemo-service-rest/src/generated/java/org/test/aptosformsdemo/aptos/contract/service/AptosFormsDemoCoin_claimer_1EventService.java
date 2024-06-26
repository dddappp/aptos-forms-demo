// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.service;

import com.github.wubuku.aptos.bean.Event;
import com.github.wubuku.aptos.utils.NodeApiClient;

import org.test.aptosformsdemo.domain.FormPageAndAddress;
import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.AbstractAptosFormsDemoCoin_claimer_1Event;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.DomainBeanUtils;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;

import org.test.aptosformsdemo.aptos.contract.aptosformsdemocoin_claimer_1.AptosFormsDemoCoin_claimer_1_Claimed;
import org.test.aptosformsdemo.aptos.contract.repository.AptosFormsDemoCoin_claimer_1EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.*;
import java.util.*;


@Service
public class AptosFormsDemoCoin_claimer_1EventService {

    @Autowired
    private NodeApiClient aptosNodeApiClient;

    @Autowired
    private AptosFormsDemoCoin_claimer_1EventRepository aptosFormsDemoCoin_claimer_1EventRepository;

    @Transactional
    public void updateStatusToProcessed(AbstractAptosFormsDemoCoin_claimer_1Event event) {
        event.setEventStatus("D");
        aptosFormsDemoCoin_claimer_1EventRepository.save(event);
    }

    @Transactional
    public void pullAptosFormsDemoCoin_claimer_1_ClaimedEvents(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        if (resourceAccountAddress == null) {
            return;
        }
        int limit = 1;
        BigInteger cursor = getAptosFormsDemoCoin_claimer_1_ClaimedEventNextCursor();
        if (cursor == null) {
            cursor = BigInteger.ZERO;
        }
        while (true) {
            List<Event<AptosFormsDemoCoin_claimer_1_Claimed>> eventPage;
            try {
                eventPage = aptosNodeApiClient.getEventsByEventHandle(
                        resourceAccountAddress,
                        contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEventsStructName(),
                        contractModuleNameProvider.getEventHandleFieldName("AptosFormsDemoCoin_claimer_1_Claimed"),
                        AptosFormsDemoCoin_claimer_1_Claimed.class,
                        cursor.longValue(),
                        limit
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (eventPage != null && eventPage.size() > 0) {
                cursor = cursor.add(BigInteger.ONE);
                for (Event<AptosFormsDemoCoin_claimer_1_Claimed> eventEnvelope : eventPage) {
                    saveAptosFormsDemoCoin_claimer_1_Claimed(toFormPageAndAddress, eventEnvelope);
                }
            } else {
                break;
            }
        }
    }

    private BigInteger getAptosFormsDemoCoin_claimer_1_ClaimedEventNextCursor() {
        AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed lastEvent = aptosFormsDemoCoin_claimer_1EventRepository.findFirstAptosFormsDemoCoin_claimer_1_ClaimedByOrderByAptosEventSequenceNumber();
        return lastEvent != null ? lastEvent.getAptosEventSequenceNumber() : null;
    }

    private void saveAptosFormsDemoCoin_claimer_1_Claimed(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, Event<AptosFormsDemoCoin_claimer_1_Claimed> eventEnvelope) {
        AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed aptosFormsDemoCoin_claimer_1_Claimed = DomainBeanUtils.toAptosFormsDemoCoin_claimer_1_Claimed(toFormPageAndAddress, eventEnvelope);
        if (aptosFormsDemoCoin_claimer_1EventRepository.findById(aptosFormsDemoCoin_claimer_1_Claimed.getAptosFormsDemoCoin_claimer_1EventId()).isPresent()) {
            return;
        }
        aptosFormsDemoCoin_claimer_1EventRepository.save(aptosFormsDemoCoin_claimer_1_Claimed);
    }

}
