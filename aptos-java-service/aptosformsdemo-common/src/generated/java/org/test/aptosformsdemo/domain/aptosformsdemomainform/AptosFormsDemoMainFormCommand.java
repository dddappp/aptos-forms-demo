// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.Command;
import org.test.aptosformsdemo.specialization.DomainError;

public interface AptosFormsDemoMainFormCommand extends Command {

    FormPageAndAddress getFormPageAndSignerAddress();

    void setFormPageAndSignerAddress(FormPageAndAddress formPageAndSignerAddress);

    Long getOffChainVersion();

    void setOffChainVersion(Long offChainVersion);

    static void throwOnInvalidStateTransition(AptosFormsDemoMainFormState state, Command c) {
        if (state.getOffChainVersion() == null) {
            if (isCommandCreate((AptosFormsDemoMainFormCommand)c)) {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (state.getDeleted() != null && state.getDeleted()) {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AptosFormsDemoMainFormCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    static boolean isCommandCreate(AptosFormsDemoMainFormCommand c) {
        if (c.getOffChainVersion().equals(AptosFormsDemoMainFormState.VERSION_NULL))
            return true;
        return false;
    }

}

