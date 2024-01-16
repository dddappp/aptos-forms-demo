// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal;

import java.util.List;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.aptosformsdemo.specialization.Event;
import org.test.aptosformsdemo.domain.Command;

public interface AptosFormsDemoGlobalAggregate {
    AptosFormsDemoGlobalState getState();

    List<Event> getChanges();

    void adminWithdrawPayment_123_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.AdminWithdrawPayment_123_Vault c);

    void depositCoin_claimer_1_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.DepositCoin_claimer_1_Vault c);

    void adminWithdrawCoin_claimer_1_Vault(BigInteger amount, Long offChainVersion, String commandId, String requesterId, AptosFormsDemoGlobalCommands.AdminWithdrawCoin_claimer_1_Vault c);

    void throwOnInvalidStateTransition(Command c);
}

