// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal;

import java.math.*;
import java.util.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;

public interface IDepositPayment_123_VaultLogic {

    AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited verify(java.util.function.Supplier<AptosFormsDemoGlobalEvent.Payment_123_VaultDeposited> eventFactory, AptosFormsDemoGlobalState aptosFormsDemoGlobalState, VerificationContext verificationContext);

    AptosFormsDemoGlobalState mutate(AptosFormsDemoGlobalState aptosFormsDemoGlobalState, BigInteger amount, BigInteger aptosEventVersion, BigInteger aptosEventSequenceNumber, String aptosEventType, AptosEventGuid aptosEventGuid, String eventStatus, MutationContext<AptosFormsDemoGlobalState, AptosFormsDemoGlobalState.MutableAptosFormsDemoGlobalState> mutationContext);
}