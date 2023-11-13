// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.taskservice;

import org.test.aptosformsdemo.aptos.contract.repository.*;
import org.test.aptosformsdemo.aptos.contract.service.*;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.AptosAccount;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;
import org.test.aptosformsdemo.aptos.contract.DefaultAptosFormsDemoMainFormModuleNameProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.aptosformsdemo.domain.FormSequenceIdAndAddress;
import org.test.aptosformsdemo.aptos.contract.TestTenantizedIdFunctions;

@Service
public class UpdateAptosFormsDemoMainFormStateTaskService {

    @Value("${aptos.contract.address}")
    private String aptosContractAddress;

    @Autowired
    private AptosAccountRepository aptosAccountRepository;

    @Autowired
    private AptosAptosFormsDemoMainFormService aptosAptosFormsDemoMainFormService;

    @Autowired
    private AptosFormsDemoMainFormEventRepository aptosFormsDemoMainFormEventRepository;

    @Autowired
    private AptosFormsDemoMainFormEventService aptosFormsDemoMainFormEventService;

    @Scheduled(fixedDelayString = "${aptos.contract.update-aptos-forms-demo-main-form-states.fixed-delay:5000}")
    @Transactional
    public void updateAptosFormsDemoMainFormStates() {
        aptosFormsDemoMainFormEventRepository.findByStatusIsNull().forEach(e -> {
            aptosAptosFormsDemoMainFormService.updateAptosFormsDemoMainFormState(getContractModuleNameProvider(), getToFormSequenceIdAndAddressFunction(), e.getFormSequenceIdAndSignerAddress().getAddress());
            aptosFormsDemoMainFormEventService.updateStatusToProcessed(e);
        });
    }

    private java.util.function.Function<String, FormSequenceIdAndAddress> getToFormSequenceIdAndAddressFunction() {
        return TestTenantizedIdFunctions.toFormSequenceIdAndAddressFunction(); // todo only for test
    }

    private ContractModuleNameProvider getContractModuleNameProvider() {
        DefaultAptosFormsDemoMainFormModuleNameProvider contractModuleNameProvider = new DefaultAptosFormsDemoMainFormModuleNameProvider();
        contractModuleNameProvider.setContractAddress(aptosContractAddress);
        contractModuleNameProvider.setStoreAccountAddress(getResourceAccountAddress());
        return contractModuleNameProvider;
    }

    private String getResourceAccountAddress() {
        return aptosAccountRepository.findById(ContractConstants.RESOURCE_ACCOUNT_ADDRESS)
                .map(AptosAccount::getAddress).orElse(null);
    }
}
