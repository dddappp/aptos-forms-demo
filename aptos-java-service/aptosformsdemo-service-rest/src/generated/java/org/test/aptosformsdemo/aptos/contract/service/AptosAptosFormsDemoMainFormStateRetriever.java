// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.service;


import com.github.wubuku.aptos.bean.AccountResource;
import com.github.wubuku.aptos.utils.*;
import org.test.aptosformsdemo.aptos.contract.ContractConstants;
import org.test.aptosformsdemo.aptos.contract.DomainBeanUtils;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.aptos.contract.AptosFormsDemoMainForm;
import org.test.aptosformsdemo.aptos.contract.ContractModuleNameProvider;

import java.io.IOException;
import java.math.*;
import java.util.*;
import java.util.function.*;


public class AptosAptosFormsDemoMainFormStateRetriever {

    private NodeApiClient aptosNodeApiClient;

    private BiFunction<String, java.util.function.Function<String, FormPageAndAddress>, AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState> aptosFormsDemoMainFormStateFactory;


    public AptosAptosFormsDemoMainFormStateRetriever(NodeApiClient aptosNodeApiClient,
                                    BiFunction<String, java.util.function.Function<String, FormPageAndAddress>, AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState> aptosFormsDemoMainFormStateFactory
    ) {
        this.aptosNodeApiClient = aptosNodeApiClient;
        this.aptosFormsDemoMainFormStateFactory = aptosFormsDemoMainFormStateFactory;
    }

    public AptosFormsDemoMainFormState retrieveAptosFormsDemoMainFormState(ContractModuleNameProvider contractModuleNameProvider, java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, String signerAddress) {
        String resourceAccountAddress = contractModuleNameProvider.getStoreAccountAddress();
        AccountResource<AptosFormsDemoMainForm.Tables> accountResource;
        try {
            accountResource = aptosNodeApiClient.getAccountResource(resourceAccountAddress,
                    contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedTablesStructName(),
                    AptosFormsDemoMainForm.Tables.class,
                    null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String tableHandle = accountResource.getData().get(contractModuleNameProvider.getStateTableFieldName()).getHandle();
        AptosFormsDemoMainForm aptosFormsDemoMainForm;
        try {
            aptosFormsDemoMainForm = aptosNodeApiClient.getTableItem(
                    tableHandle,
                    ContractConstants.toNumericalAddressType(ContractConstants.APTOS_FORMS_DEMO_MAIN_FORM_ID_TYPE, contractModuleNameProvider.getContractAddress()),
                    contractModuleNameProvider.getContractAddress() + "::" + contractModuleNameProvider.getModuleQualifiedEntityStateStructName(),
                    signerAddress,
                    AptosFormsDemoMainForm.class,
                    null
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return toAptosFormsDemoMainFormState(toFormPageAndAddress, aptosFormsDemoMainForm);
    }

    private AptosFormsDemoMainFormState toAptosFormsDemoMainFormState(java.util.function.Function<String, FormPageAndAddress> toFormPageAndAddress, AptosFormsDemoMainForm aptosFormsDemoMainForm) {
        AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState aptosFormsDemoMainFormState = aptosFormsDemoMainFormStateFactory.apply(aptosFormsDemoMainForm.getSignerAddress(), toFormPageAndAddress);
        aptosFormsDemoMainFormState.setVersion(aptosFormsDemoMainForm.getVersion());
        aptosFormsDemoMainFormState.setDynamicProperties(aptosFormsDemoMainForm.getDynamicProperties());
        return aptosFormsDemoMainFormState;
    }

}

