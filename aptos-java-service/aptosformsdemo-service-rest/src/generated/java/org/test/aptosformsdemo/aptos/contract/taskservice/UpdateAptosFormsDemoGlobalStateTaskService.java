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
import org.test.aptosformsdemo.aptos.contract.DefaultAptosFormsDemoGlobalModuleNameProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.aptosformsdemo.domain.FormAndAddress;
import org.test.aptosformsdemo.aptos.contract.TestTenantizedIdFunctions;

@Service
public class UpdateAptosFormsDemoGlobalStateTaskService {

    @Value("${aptos.contract.address}")
    private String aptosContractAddress;

    @Autowired
    private AptosAccountRepository aptosAccountRepository;

    @Autowired
    private AptosAptosFormsDemoGlobalService aptosAptosFormsDemoGlobalService;

    @Autowired
    private AptosFormsDemoGlobalEventRepository aptosFormsDemoGlobalEventRepository;

    @Autowired
    private AptosFormsDemoGlobalEventService aptosFormsDemoGlobalEventService;

    @Scheduled(fixedDelayString = "${aptos.contract.update-aptos-forms-demo-global-states.fixed-delay:5000}")
    @Transactional
    public void updateAptosFormsDemoGlobalStates() {
        aptosFormsDemoGlobalEventRepository.findByStatusIsNull().forEach(e -> {
            aptosAptosFormsDemoGlobalService.updateAptosFormsDemoGlobalState(getContractModuleNameProvider(), getToFormAndAddressFunction(), e.getFormAndAccountAddress().getAddress());
            aptosFormsDemoGlobalEventService.updateStatusToProcessed(e);
        });
    }

    private java.util.function.Function<String, FormAndAddress> getToFormAndAddressFunction() {
        return TestTenantizedIdFunctions.toFormAndAddressFunction(); // todo only for test
    }

    private ContractModuleNameProvider getContractModuleNameProvider() {
        // Note: This 'Default' implementation contains hard-coded names. A truly generalized service may not be appropriate to use it.
        DefaultAptosFormsDemoGlobalModuleNameProvider contractModuleNameProvider = new DefaultAptosFormsDemoGlobalModuleNameProvider();
        contractModuleNameProvider.setContractAddress(aptosContractAddress);
        contractModuleNameProvider.setStoreAccountAddress(getResourceAccountAddress());
        return contractModuleNameProvider;
    }

    private String getResourceAccountAddress() {
        return aptosAccountRepository.findById(ContractConstants.RESOURCE_ACCOUNT_ADDRESS)
                .map(AptosAccount::getAddress).orElse(null);
    }
}