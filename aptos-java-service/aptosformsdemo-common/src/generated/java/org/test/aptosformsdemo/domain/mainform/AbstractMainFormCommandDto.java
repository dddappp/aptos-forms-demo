// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.mainform;

import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.test.aptosformsdemo.domain.AbstractCommand;

public abstract class AbstractMainFormCommandDto extends AbstractCommand {

    /**
     * Signer Address
     */
    private String signerAddress;

    public String getSignerAddress()
    {
        return this.signerAddress;
    }

    public void setSignerAddress(String signerAddress)
    {
        this.signerAddress = signerAddress;
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


    public void copyTo(MainFormCommand command) {
        command.setSignerAddress(this.getSignerAddress());
        command.setOffChainVersion(this.getOffChainVersion());
        
        command.setRequesterId(this.getRequesterId());
        command.setCommandId(this.getCommandId());
    }

}
