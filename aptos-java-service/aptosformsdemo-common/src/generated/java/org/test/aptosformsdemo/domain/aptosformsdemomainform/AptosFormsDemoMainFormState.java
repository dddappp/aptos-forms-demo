// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.*;
import java.math.*;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.test.aptosformsdemo.specialization.Event;

public interface AptosFormsDemoMainFormState extends VersionedAptosMoveObject
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    String getSignerAddress();

    Long getOffChainVersion();

    String getCreatedBy();

    Date getCreatedAt();

    String getUpdatedBy();

    Date getUpdatedAt();

    Boolean getActive();

    Boolean getDeleted();

    Map<String, Object> getDynamicProperties();

    interface MutableAptosFormsDemoMainFormState extends AptosFormsDemoMainFormState, VersionedAptosMoveObject.MutableVersionedAptosMoveObject {
        void setSignerAddress(String signerAddress);

        void setOffChainVersion(Long offChainVersion);

        void setCreatedBy(String createdBy);

        void setCreatedAt(Date createdAt);

        void setUpdatedBy(String updatedBy);

        void setUpdatedAt(Date updatedAt);

        void setActive(Boolean active);

        void setDeleted(Boolean deleted);

        void setDynamicProperties(Map<String, Object> dynamicProperties);


        //void mutate(Event e);

        //void when(AptosFormsDemoMainFormEvent.AptosFormsDemoMainFormStateCreated e);

        //void when(AptosFormsDemoMainFormEvent.AptosFormsDemoMainFormStateMergePatched e);

        //void when(AptosFormsDemoMainFormEvent.AptosFormsDemoMainFormStateDeleted e);
    }

    interface SqlAptosFormsDemoMainFormState extends MutableAptosFormsDemoMainFormState {

        boolean isStateUnsaved();

        boolean getForReapplying();
    }
}

