// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.aptosformsdemoglobal;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import org.test.aptosformsdemo.aptos.contract.*;

import java.math.*;
import java.util.*;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Payment_123_VaultDeposited {

    private String accountAddress;

    private BigInteger version;

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    private java.util.Map<String, Object> dynamicProperties = new HashMap<>();

    @com.fasterxml.jackson.annotation.JsonAnyGetter
    public java.util.Map<String, Object> getDynamicProperties() {
        return this.dynamicProperties;
    }

    public void setDynamicProperties(java.util.Map<String, Object> dynamicProperties) {
        this.dynamicProperties = dynamicProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter
    public void addDynamicProperty(String property, Object value) {
        this.dynamicProperties.put(property, value);
    }

    @Override
    public String toString() {
        return "Payment_123_VaultDeposited{" +
                "accountAddress=" + '\'' + accountAddress + '\'' +
                ", version=" + version +
                ", dynamicProperties=" + dynamicProperties +
                '}';
    }

}
