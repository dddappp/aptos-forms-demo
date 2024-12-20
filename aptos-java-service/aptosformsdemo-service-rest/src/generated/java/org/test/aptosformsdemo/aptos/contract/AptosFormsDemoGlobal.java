// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.wubuku.aptos.bean.*;

import java.math.*;
import java.util.*;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AptosFormsDemoGlobal {

    private String accountAddress;

    private Long offChainVersion;

    private BigInteger version;

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    public Long getOffChainVersion() {
        return offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion) {
        this.offChainVersion = offChainVersion;
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
        return "AptosFormsDemoGlobal{" +
                ", accountAddress=" + '\'' + accountAddress + '\'' +
                ", offChainVersion=" + offChainVersion +
                ", version=" + version +
                ", dynamicProperties=" + dynamicProperties +
                '}';
    }

}
