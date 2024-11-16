// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.taskservice;

import org.test.aptosformsdemo.aptos.contract.service.AptosFormsDemoCoin_claimer_1EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Value;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.AptosAccount;
import org.test.aptosformsdemo.aptos.contract.repository.AptosAccountRepository;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;
import org.test.aptosformsdemo.aptos.contract.DefaultAptosFormsDemoCoin_claimer_1ModuleNameProvider;
import org.test.aptosformsdemo.domain.FormPageAndAddress;
import org.test.aptosformsdemo.aptos.contract.TestTenantizedIdFunctions;

@Service
public class PullAptosFormsDemoCoin_claimer_1EventsTaskService {

    @Value("${aptos.contract.address}")
    private String aptosContractAddress;

    @Autowired
    private AptosAccountRepository aptosAccountRepository;

    @Autowired
    private AptosFormsDemoCoin_claimer_1EventService aptosFormsDemoCoin_claimer_1EventService;

    @Scheduled(fixedDelayString = "${aptos.contract.pull-aptos-forms-demo-coin-claimer-1-events.aptos-forms-demo-coin-claimer-1-claimed.fixed-delay:5000}")
    public void pullAptosFormsDemoCoin_claimer_1_ClaimedEvents() {
        aptosFormsDemoCoin_claimer_1EventService.pullAptosFormsDemoCoin_claimer_1_ClaimedEvents(getContractModuleNameProvider(), getToFormPageAndAddressFunction());
    }

    private java.util.function.Function<String, FormPageAndAddress> getToFormPageAndAddressFunction() {
        return TestTenantizedIdFunctions.toFormPageAndAddressFunction(); // todo only for test
    }

    private ContractModuleNameProvider getContractModuleNameProvider() {
        // Note: This 'Default' implementation contains hard-coded names. A truly generalized service may not be appropriate to use it.
        DefaultAptosFormsDemoCoin_claimer_1ModuleNameProvider contractModuleNameProvider = new DefaultAptosFormsDemoCoin_claimer_1ModuleNameProvider();
        contractModuleNameProvider.setContractAddress(aptosContractAddress);
        contractModuleNameProvider.setStoreAccountAddress(getResourceAccountAddress());
        return contractModuleNameProvider;
    }

    private String getResourceAccountAddress() {
        return aptosAccountRepository.findById(ContractConstants.APTOS_FORMS_DEMO_RESOURCE_ACCOUNT)
                .map(AptosAccount::getAddress).orElse(null);
    }
}
