// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal;

import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.AbstractCommand;

public abstract class AbstractAptosFormsDemoGlobalCommand extends AbstractCommand implements AptosFormsDemoGlobalCommand {

    private FormAndAddress formAndAccountAddress;

    public FormAndAddress getFormAndAccountAddress()
    {
        return this.formAndAccountAddress;
    }

    public void setFormAndAccountAddress(FormAndAddress formAndAccountAddress)
    {
        this.formAndAccountAddress = formAndAccountAddress;
    }

    private Long offChainVersion;

    public Long getOffChainVersion()
    {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion)
    {
        this.offChainVersion = offChainVersion;
    }


}

