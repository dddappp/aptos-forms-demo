package org.test.aptosformsdemo.aptos.contract;

import org.test.aptosformsdemo.domain.FormSequenceIdAndAddress;

public class TestTenantizedIdFunctions {
    private TestTenantizedIdFunctions() {
    }

    public static java.util.function.Function<String, FormSequenceIdAndAddress> toFormSequenceIdAndAddressFunction() {
        return (address) -> {
            FormSequenceIdAndAddress formSequenceIdAndAddress = new FormSequenceIdAndAddress();
            formSequenceIdAndAddress.setFormSequenceId(1L); // todo hard-coded for now
            formSequenceIdAndAddress.setAddress(address);
            return formSequenceIdAndAddress;
        };
    }
}
