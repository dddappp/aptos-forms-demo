// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import java.io.Serializable;
import org.test.aptosformsdemo.domain.FormPageAndAddress;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;

public class AptosFormsDemoCoin_claimer_1EventId implements Serializable {
    private FormPageAndAddress formPageAndSignerAddress = new FormPageAndAddress();

    public FormPageAndAddress getFormPageAndSignerAddress()
    {
        return this.formPageAndSignerAddress;
    }

    public void setFormPageAndSignerAddress(FormPageAndAddress formPageAndSignerAddress)
    {
        this.formPageAndSignerAddress = formPageAndSignerAddress;
    }

    private BigInteger version;

    public BigInteger getVersion()
    {
        return this.version;
    }

    public void setVersion(BigInteger version)
    {
        this.version = version;
    }

    protected Long getFormPageAndSignerAddressFormSequenceId()
    {
        return getFormPageAndSignerAddress().getFormSequenceId();
    }

    protected void setFormPageAndSignerAddressFormSequenceId(Long formPageAndSignerAddressFormSequenceId)
    {
        getFormPageAndSignerAddress().setFormSequenceId(formPageAndSignerAddressFormSequenceId);
    }

    protected Integer getFormPageAndSignerAddressPageNumber()
    {
        return getFormPageAndSignerAddress().getPageNumber();
    }

    protected void setFormPageAndSignerAddressPageNumber(Integer formPageAndSignerAddressPageNumber)
    {
        getFormPageAndSignerAddress().setPageNumber(formPageAndSignerAddressPageNumber);
    }

    protected String getFormPageAndSignerAddressAddress()
    {
        return getFormPageAndSignerAddress().getAddress();
    }

    protected void setFormPageAndSignerAddressAddress(String formPageAndSignerAddressAddress)
    {
        getFormPageAndSignerAddress().setAddress(formPageAndSignerAddressAddress);
    }

    public AptosFormsDemoCoin_claimer_1EventId()
    {
    }

    public AptosFormsDemoCoin_claimer_1EventId(FormPageAndAddress formPageAndSignerAddress, BigInteger version)
    {
        this.formPageAndSignerAddress = formPageAndSignerAddress;
        this.version = version;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        AptosFormsDemoCoin_claimer_1EventId other = (AptosFormsDemoCoin_claimer_1EventId)obj;
        return true 
            && (formPageAndSignerAddress == other.formPageAndSignerAddress || (formPageAndSignerAddress != null && formPageAndSignerAddress.equals(other.formPageAndSignerAddress)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.formPageAndSignerAddress != null) {
            hash += 13 * this.formPageAndSignerAddress.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

    @Override
    public String toString() {
        return "AptosFormsDemoCoin_claimer_1EventId{" +
                "formPageAndSignerAddress=" + formPageAndSignerAddress +
                ", version=" + version +
                '}';
    }

    protected static final String[] FLATTENED_PROPERTY_NAMES = new String[]{
            "formPageAndSignerAddressFormSequenceId",
            "formPageAndSignerAddressPageNumber",
            "formPageAndSignerAddressAddress",
            "version",
    };

    protected static final String[] FLATTENED_PROPERTY_TYPES = new String[]{
            "Long",
            "Integer",
            "String",
            "BigInteger",
    };

    protected static final java.util.Map<String, String> FLATTENED_PROPERTY_TYPE_MAP;

    static {
        java.util.Map<String, String> m = new java.util.HashMap<String, String>();
        for (int i = 0; i < FLATTENED_PROPERTY_NAMES.length; i++) {
            m.put(FLATTENED_PROPERTY_NAMES[i], FLATTENED_PROPERTY_TYPES[i]);
        }
        FLATTENED_PROPERTY_TYPE_MAP = m;
    }

    protected void forEachFlattenedProperty(java.util.function.BiConsumer<String, Object> consumer) {
        for (int i = 0; i < FLATTENED_PROPERTY_NAMES.length; i++) {
            String pn = FLATTENED_PROPERTY_NAMES[i];
            if (Character.isLowerCase(pn.charAt(0))) {
                pn = Character.toUpperCase(pn.charAt(0)) + pn.substring(1);
            }
            java.lang.reflect.Method m = null;
            try {
                m = this.getClass().getDeclaredMethod("get" + pn, new Class[0]);
            } catch (NoSuchMethodException e) {
                try {
                    m = this.getClass().getMethod("get" + pn, new Class[0]);
                } catch (NoSuchMethodException e1) {
                    throw new RuntimeException(e);
                }
            }
            Object pv = null;
            try {
                pv = m.invoke(this);
            } catch (IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            consumer.accept(pn, pv);
        }
    }

    protected void setFlattenedPropertyValues(Object... values) {
        for (int i = 0; i < FLATTENED_PROPERTY_NAMES.length; i++) {
            String pn = FLATTENED_PROPERTY_NAMES[i];
            if (Character.isLowerCase(pn.charAt(0))) {
                pn = Character.toUpperCase(pn.charAt(0)) + pn.substring(1);
            }
            Object v = values[i];
            Class propCls = v == null ? Object.class : v.getClass();
            java.lang.reflect.Method setterMethod = null;
            if (v == null) {
                setterMethod = getNullValueSetterMethod(pn);
            }
            if (setterMethod == null) {
                try {
                    setterMethod = this.getClass().getDeclaredMethod("set" + pn, new Class[]{propCls});
                } catch (NoSuchMethodException e) {
                    try {
                        setterMethod = this.getClass().getMethod("set" + pn, new Class[]{propCls});
                    } catch (NoSuchMethodException e1) {
                        throw new RuntimeException(e1);
                    }
                }
            }
            try {
                setterMethod.invoke(this, v);
            } catch (IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private java.lang.reflect.Method getNullValueSetterMethod(String pascalPropName) {
        java.lang.reflect.Method m;
        final String methodName = "set" + pascalPropName;
        m = java.util.Arrays.stream(this.getClass().getDeclaredMethods())
                .filter(me -> me.getName().equals(methodName) && me.getParameterCount() == 1)
                .findFirst().orElse(null);
        if (m == null) {
            m = java.util.Arrays.stream(this.getClass().getMethods())
                    .filter(me -> me.getName().equals(methodName) && me.getParameterCount() == 1)
                    .findFirst().orElse(null);
        }
        return m;
    }

}

