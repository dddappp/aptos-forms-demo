// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.service;

import com.github.wubuku.aptos.bean.Event;
import com.github.wubuku.aptos.utils.NodeApiClient;

import org.test.aptosformsdemo.domain.FormAndAddress;
import org.test.aptosformsdemo.domain.aptosformsdemoglobal.AbstractAptosFormsDemoGlobalEvent;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.DomainBeanUtils;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;

import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Payment_123_VaultDeposited;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Payment_123_VaultWithdrawn;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.Payment_123_VaultAdminWithdrawn;
import org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal.AptosFormsDemoGlobalInitialized;
import org.test.aptosformsdemo.aptos.contract.repository.AptosFormsDemoGlobalEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.*;
import java.util.*;


@Service
public class AptosFormsDemoGlobalEventService {

    @Autowired
    private NodeApiClient aptosNodeApiClient;

    @Autowired
    private AptosFormsDemoGlobalEventRepository aptosFormsDemoGlobalEventRepository;

    @Transactional
    public void updateStatusToProcessed(AbstractAptosFormsDemoGlobalEvent event) {
        event.setStatus("D");
        aptosFormsDemoGlobalEventRepository.save(event);
    }

    @Transactional
    public void pullPayment_123_VaultDepositedEvents(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormAndAddress> toFormAndAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        if (resourceAccountAddress == null) {
            return;
        }
        int limit = 1;
        BigInteger cursor = getPayment_123_VaultDepositedEventNextCursor();
        if (cursor == null) {
            cursor = BigInteger.ZERO;
        }
        while (true) {
            List<Event<Payment_123_VaultDeposited>> eventPage;
            try {
                eventPage = aptosNodeApiClient.getEventsByEventHandle(
                        resourceAccountAddress,
                        contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEventsStructName(),
                        contractModuleNameProvider.getEventHandleFieldName("Payment_123_VaultDeposited"),
                        Payment_123_VaultDeposited.class,
                        cursor.longValue(),
                        limit
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (eventPage != null && eventPage.size() > 0) {
                cursor = cursor.add(BigInteger.ONE);
                for (Event<Payment_123_VaultDeposited> eventEnvelope : eventPage) {
                    eventEnvelope.getData().setAccountAddress(resourceAccountAddress);
                    savePayment_123_VaultDeposited(toFormAndAddress, eventEnvelope);
                }
            } else {
                break;
            }
        }
    }

    private BigInteger getPayment_123_VaultDepositedEventNextCursor() {
        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultDeposited lastEvent = aptosFormsDemoGlobalEventRepository.findFirstPayment_123_VaultDepositedByOrderByAptosEventSequenceNumber();
        return lastEvent != null ? lastEvent.getAptosEventSequenceNumber() : null;
    }

    private void savePayment_123_VaultDeposited(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Payment_123_VaultDeposited> eventEnvelope) {
        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultDeposited payment_123_VaultDeposited = DomainBeanUtils.toPayment_123_VaultDeposited(toFormAndAddress, eventEnvelope);
        if (aptosFormsDemoGlobalEventRepository.findById(payment_123_VaultDeposited.getAptosFormsDemoGlobalEventId()).isPresent()) {
            return;
        }
        aptosFormsDemoGlobalEventRepository.save(payment_123_VaultDeposited);
    }

    @Transactional
    public void pullPayment_123_VaultWithdrawnEvents(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormAndAddress> toFormAndAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        if (resourceAccountAddress == null) {
            return;
        }
        int limit = 1;
        BigInteger cursor = getPayment_123_VaultWithdrawnEventNextCursor();
        if (cursor == null) {
            cursor = BigInteger.ZERO;
        }
        while (true) {
            List<Event<Payment_123_VaultWithdrawn>> eventPage;
            try {
                eventPage = aptosNodeApiClient.getEventsByEventHandle(
                        resourceAccountAddress,
                        contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEventsStructName(),
                        contractModuleNameProvider.getEventHandleFieldName("Payment_123_VaultWithdrawn"),
                        Payment_123_VaultWithdrawn.class,
                        cursor.longValue(),
                        limit
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (eventPage != null && eventPage.size() > 0) {
                cursor = cursor.add(BigInteger.ONE);
                for (Event<Payment_123_VaultWithdrawn> eventEnvelope : eventPage) {
                    eventEnvelope.getData().setAccountAddress(resourceAccountAddress);
                    savePayment_123_VaultWithdrawn(toFormAndAddress, eventEnvelope);
                }
            } else {
                break;
            }
        }
    }

    private BigInteger getPayment_123_VaultWithdrawnEventNextCursor() {
        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn lastEvent = aptosFormsDemoGlobalEventRepository.findFirstPayment_123_VaultWithdrawnByOrderByAptosEventSequenceNumber();
        return lastEvent != null ? lastEvent.getAptosEventSequenceNumber() : null;
    }

    private void savePayment_123_VaultWithdrawn(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Payment_123_VaultWithdrawn> eventEnvelope) {
        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultWithdrawn payment_123_VaultWithdrawn = DomainBeanUtils.toPayment_123_VaultWithdrawn(toFormAndAddress, eventEnvelope);
        if (aptosFormsDemoGlobalEventRepository.findById(payment_123_VaultWithdrawn.getAptosFormsDemoGlobalEventId()).isPresent()) {
            return;
        }
        aptosFormsDemoGlobalEventRepository.save(payment_123_VaultWithdrawn);
    }

    @Transactional
    public void pullPayment_123_VaultAdminWithdrawnEvents(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormAndAddress> toFormAndAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        if (resourceAccountAddress == null) {
            return;
        }
        int limit = 1;
        BigInteger cursor = getPayment_123_VaultAdminWithdrawnEventNextCursor();
        if (cursor == null) {
            cursor = BigInteger.ZERO;
        }
        while (true) {
            List<Event<Payment_123_VaultAdminWithdrawn>> eventPage;
            try {
                eventPage = aptosNodeApiClient.getEventsByEventHandle(
                        resourceAccountAddress,
                        contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEventsStructName(),
                        contractModuleNameProvider.getEventHandleFieldName("Payment_123_VaultAdminWithdrawn"),
                        Payment_123_VaultAdminWithdrawn.class,
                        cursor.longValue(),
                        limit
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (eventPage != null && eventPage.size() > 0) {
                cursor = cursor.add(BigInteger.ONE);
                for (Event<Payment_123_VaultAdminWithdrawn> eventEnvelope : eventPage) {
                    eventEnvelope.getData().setAccountAddress(resourceAccountAddress);
                    savePayment_123_VaultAdminWithdrawn(toFormAndAddress, eventEnvelope);
                }
            } else {
                break;
            }
        }
    }

    private BigInteger getPayment_123_VaultAdminWithdrawnEventNextCursor() {
        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn lastEvent = aptosFormsDemoGlobalEventRepository.findFirstPayment_123_VaultAdminWithdrawnByOrderByAptosEventSequenceNumber();
        return lastEvent != null ? lastEvent.getAptosEventSequenceNumber() : null;
    }

    private void savePayment_123_VaultAdminWithdrawn(java.util.function.Function<String, FormAndAddress> toFormAndAddress, Event<Payment_123_VaultAdminWithdrawn> eventEnvelope) {
        AbstractAptosFormsDemoGlobalEvent.Payment_123_VaultAdminWithdrawn payment_123_VaultAdminWithdrawn = DomainBeanUtils.toPayment_123_VaultAdminWithdrawn(toFormAndAddress, eventEnvelope);
        if (aptosFormsDemoGlobalEventRepository.findById(payment_123_VaultAdminWithdrawn.getAptosFormsDemoGlobalEventId()).isPresent()) {
            return;
        }
        aptosFormsDemoGlobalEventRepository.save(payment_123_VaultAdminWithdrawn);
    }

}
