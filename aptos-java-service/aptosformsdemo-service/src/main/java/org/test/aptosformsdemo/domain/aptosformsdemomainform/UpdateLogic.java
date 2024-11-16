// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.math.*;
import java.util.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.XRenderFormDateRange;
import org.test.aptosformsdemo.domain.XRenderFormTimeRange;
import org.test.aptosformsdemo.domain.XRenderFormDate;
import org.springframework.stereotype.Component;


/**
 * Implementation of the AptosFormsDemoMainForm.Update command logic.
 */
@Component
public class UpdateLogic implements IUpdateLogic {
    /**
     * Verifies the AptosFormsDemoMainForm.Update command by performing validation logic
     * before the state mutation. Creates and returns an event.
     * 
     * @param eventFactory The supplier that creates new AptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated events
     * @param aptosFormsDemoMainFormState The current state of the AptosFormsDemoMainForm aggregate
     * @param fr_5pqi 
     * @param fr_duif 
     * @param fr_6i34 
     * @param fr_8xjs 
     * @param fr_9c3f 
     * @param fr_4ok6 
     * @param fr_b3ub 
     * @param fr_1z7o 
     * @param fr_d8rw 
     * @param fr_dy3l 
     * @param fr_6f68 
     * @param fr_47yy 
     * @param fr_gh3o 
     * @param fr_fbba 
     * @param fr_hhzp 
     * @param single_text1 
     * @param payment_123 
     * @param verificationContext The context information for the verification process
     * @return An event that will be applied to the current state to update the AptosFormsDemoMainForm
     */
    public AptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated verify(java.util.function.Supplier<AptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated> eventFactory, AptosFormsDemoMainFormState aptosFormsDemoMainFormState, BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, XRenderFormDateRange fr_d8rw, XRenderFormDateRange fr_dy3l, BigInteger fr_6f68, XRenderFormTimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, BigInteger payment_123, VerificationContext verificationContext) {
        AptosFormsDemoMainFormEvent.AptosFormsDemoMainFormUpdated e = eventFactory.get();
        // TODO: implement
        return e;
    }

    /**
     * Performs the state mutation operation of AptosFormsDemoMainForm.Update command.
     * Creates a mutable copy of the state, updates it with the new body text,
     * and returns the new state.
     * 
     * @param aptosFormsDemoMainFormState The current immutable state of the AptosFormsDemoMainForm
     * @param fr_5pqi 
     * @param fr_duif 
     * @param fr_6i34 
     * @param fr_8xjs 
     * @param fr_9c3f 
     * @param fr_4ok6 
     * @param fr_b3ub 
     * @param fr_1z7o 
     * @param fr_d8rw 
     * @param fr_dy3l 
     * @param fr_6f68 
     * @param fr_47yy 
     * @param fr_gh3o 
     * @param fr_fbba 
     * @param fr_hhzp 
     * @param single_text1 
     * @param payment_123 
     * @param payment_123_Supplement 
     * @param payment_123_Refund 
     * @param aptosEventVersion 
     * @param aptosEventSequenceNumber 
     * @param aptosEventType 
     * @param aptosEventGuid 
     * @param eventStatus 
     * @param mutationContext The context that provides functionality including creating mutable state
     * @return The new state of the AptosFormsDemoMainForm
     */
    public AptosFormsDemoMainFormState mutate(AptosFormsDemoMainFormState aptosFormsDemoMainFormState, BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, XRenderFormDateRange fr_d8rw, XRenderFormDateRange fr_dy3l, BigInteger fr_6f68, XRenderFormTimeRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, XRenderFormDate fr_hhzp, String single_text1, BigInteger payment_123, BigInteger payment_123_Supplement, BigInteger payment_123_Refund, BigInteger aptosEventVersion, BigInteger aptosEventSequenceNumber, String aptosEventType, AptosEventGuid aptosEventGuid, String eventStatus, MutationContext<AptosFormsDemoMainFormState, AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState> mutationContext) {
        AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState s = mutationContext.createMutableState(aptosFormsDemoMainFormState);
        // TODO: implement
        return s; // Return the updated state
    }
}
