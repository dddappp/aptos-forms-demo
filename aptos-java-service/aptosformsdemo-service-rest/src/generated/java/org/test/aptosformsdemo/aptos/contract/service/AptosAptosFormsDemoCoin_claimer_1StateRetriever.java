// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.service;


import com.github.wubuku.aptos.bean.AccountResource;
import com.github.wubuku.aptos.utils.*;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.DomainBeanUtils;
import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.aptos.contract.AptosFormsDemoCoin_claimer_1;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;

import java.io.IOException;
import java.math.*;
import java.util.*;
import java.util.function.*;


public class AptosAptosFormsDemoCoin_claimer_1StateRetriever {

    private NodeApiClient aptosNodeApiClient;

    private BiFunction<String, java.util.function.Function<String, FormPageAndAddress>, AptosFormsDemoCoin_claimer_1State.MutableAptosFormsDemoCoin_claimer_1State> aptosFormsDemoCoin_claimer_1StateFactory;


    public AptosAptosFormsDemoCoin_claimer_1StateRetriever(NodeApiClient aptosNodeApiClient,
                                    BiFunction<String, java.util.function.Function<String, FormPageAndAddress>, AptosFormsDemoCoin_claimer_1State.MutableAptosFormsDemoCoin_claimer_1State> aptosFormsDemoCoin_claimer_1StateFactory
    ) {
        this.aptosNodeApiClient = aptosNodeApiClient;
        this.aptosFormsDemoCoin_claimer_1StateFactory = aptosFormsDemoCoin_claimer_1StateFactory;
    }

    public AptosFormsDemoCoin_claimer_1State retrieveAptosFormsDemoCoin_claimer_1State(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, String signerAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        AccountResource<AptosFormsDemoCoin_claimer_1.Tables> accountResource;
        try {
            accountResource = aptosNodeApiClient.getAccountResource(resourceAccountAddress,
                    contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedTablesStructName(),
                    AptosFormsDemoCoin_claimer_1.Tables.class,
                    null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String tableHandle = accountResource.getData().get(contractModuleNameProvider.getStateTableFieldName()).getHandle();
        AptosFormsDemoCoin_claimer_1 aptosFormsDemoCoin_claimer_1;
        try {
            aptosFormsDemoCoin_claimer_1 = aptosNodeApiClient.getTableItem(
                    tableHandle,
                    ContractConstants.toNumericalAddressType(ContractConstants.APTOS_FORMS_DEMO_COIN_CLAIMER_1_ID_TYPE, contractModuleNameProvider.getContractAddress()),
                    contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEntityStateStructName(),
                    signerAddress,
                    AptosFormsDemoCoin_claimer_1.class,
                    null
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return toAptosFormsDemoCoin_claimer_1State(toFormPageAndAddress, aptosFormsDemoCoin_claimer_1);
    }

    private AptosFormsDemoCoin_claimer_1State toAptosFormsDemoCoin_claimer_1State(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, AptosFormsDemoCoin_claimer_1 aptosFormsDemoCoin_claimer_1) {
        AptosFormsDemoCoin_claimer_1State.MutableAptosFormsDemoCoin_claimer_1State aptosFormsDemoCoin_claimer_1State = aptosFormsDemoCoin_claimer_1StateFactory.apply(aptosFormsDemoCoin_claimer_1.getSignerAddress(), toFormPageAndAddress);
        aptosFormsDemoCoin_claimer_1State.setVersion(aptosFormsDemoCoin_claimer_1.getVersion());
        aptosFormsDemoCoin_claimer_1State.setDynamicProperties(aptosFormsDemoCoin_claimer_1.getDynamicProperties());
        return aptosFormsDemoCoin_claimer_1State;
    }

}

