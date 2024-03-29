// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.AbstractCommand;

public abstract class AbstractAptosFormsDemoCoin_claimer_1CommandDto extends AbstractCommand {

    /**
     * Form Page And Signer Address
     */
    private FormPageAndAddress formPageAndSignerAddress;

    public FormPageAndAddress getFormPageAndSignerAddress()
    {
        return this.formPageAndSignerAddress;
    }

    public void setFormPageAndSignerAddress(FormPageAndAddress formPageAndSignerAddress)
    {
        this.formPageAndSignerAddress = formPageAndSignerAddress;
    }

    /**
     * Off Chain Version
     */
    private Long offChainVersion;

    public Long getOffChainVersion()
    {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion)
    {
        this.offChainVersion = offChainVersion;
    }


    public void copyTo(AptosFormsDemoCoin_claimer_1Command command) {
        command.setFormPageAndSignerAddress(this.getFormPageAndSignerAddress());
        command.setOffChainVersion(this.getOffChainVersion());
        
        command.setRequesterId(this.getRequesterId());
        command.setCommandId(this.getCommandId());
    }

}
