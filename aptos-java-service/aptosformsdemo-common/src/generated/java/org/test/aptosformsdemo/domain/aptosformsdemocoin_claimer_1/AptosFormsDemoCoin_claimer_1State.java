// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import java.util.*;
import java.math.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.Event;

public interface AptosFormsDemoCoin_claimer_1State extends VersionedAptosMoveObject
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    FormPageAndAddress getFormPageAndSignerAddress();

    Long getOffChainVersion();

    String getCreatedBy();

    OffsetDateTime getCreatedAt();

    String getUpdatedBy();

    OffsetDateTime getUpdatedAt();

    Boolean getActive();

    Boolean getDeleted();

    Map<String, Object> getDynamicProperties();

    interface MutableAptosFormsDemoCoin_claimer_1State extends AptosFormsDemoCoin_claimer_1State, VersionedAptosMoveObject.MutableVersionedAptosMoveObject {
        void setFormPageAndSignerAddress(FormPageAndAddress formPageAndSignerAddress);

        void setOffChainVersion(Long offChainVersion);

        void setCreatedBy(String createdBy);

        void setCreatedAt(OffsetDateTime createdAt);

        void setUpdatedBy(String updatedBy);

        void setUpdatedAt(OffsetDateTime updatedAt);

        void setActive(Boolean active);

        void setDeleted(Boolean deleted);

        void setDynamicProperties(Map<String, Object> dynamicProperties);


        //void mutate(Event e);

        //void when(AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1StateCreated e);

        //void when(AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1StateMergePatched e);

        //void when(AptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1StateDeleted e);
    }

    interface SqlAptosFormsDemoCoin_claimer_1State extends MutableAptosFormsDemoCoin_claimer_1State {

        boolean isStateUnsaved();

        boolean getForReapplying();
    }
}

