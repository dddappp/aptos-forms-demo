// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.mainform;

import java.util.*;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.test.aptosformsdemo.specialization.*;

public abstract class AbstractMainFormAggregate extends AbstractAggregate implements MainFormAggregate {
    private MainFormState.MutableMainFormState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractMainFormAggregate(MainFormState state) {
        this.state = (MainFormState.MutableMainFormState)state;
    }

    public MainFormState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void throwOnInvalidStateTransition(Command c) {
        MainFormCommand.throwOnInvalidStateTransition(this.state, c);
    }

    protected void apply(Event e) {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }


    ////////////////////////

    public static class SimpleMainFormAggregate extends AbstractMainFormAggregate {
        public SimpleMainFormAggregate(MainFormState state) {
            super(state);
        }

        @Override
        public void create(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, StringRange fr_d8rw, StringRange fr_dy3l, BigInteger fr_6f68, StringRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, String fr_hhzp, String single_text1, Long offChainVersion, String commandId, String requesterId, MainFormCommands.Create c) {
            try {
                verifyCreate(fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, c);
            } catch (Exception ex) {
                throw new DomainError("VerificationFailed", ex);
            }

            Event e = newMainFormCreated(fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, offChainVersion, commandId, requesterId);
            apply(e);
        }

        protected void verifyCreate(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, StringRange fr_d8rw, StringRange fr_dy3l, BigInteger fr_6f68, StringRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, String fr_hhzp, String single_text1, MainFormCommands.Create c) {
            BigInteger Fr_5pqi = fr_5pqi;
            String[] Fr_duif = fr_duif;
            String[] Fr_6i34 = fr_6i34;
            String Fr_8xjs = fr_8xjs;
            String Fr_9c3f = fr_9c3f;
            BigInteger Fr_4ok6 = fr_4ok6;
            String Fr_b3ub = fr_b3ub;
            BigInteger Fr_1z7o = fr_1z7o;
            StringRange Fr_d8rw = fr_d8rw;
            StringRange Fr_dy3l = fr_dy3l;
            BigInteger Fr_6f68 = fr_6f68;
            StringRange Fr_47yy = fr_47yy;
            String[] Fr_gh3o = fr_gh3o;
            String[] Fr_fbba = fr_fbba;
            String Fr_hhzp = fr_hhzp;
            String Single_text1 = single_text1;

            ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.mainform.CreateLogic",
                    "verify",
                    new Class[]{MainFormState.class, BigInteger.class, String[].class, String[].class, String.class, String.class, BigInteger.class, String.class, BigInteger.class, StringRange.class, StringRange.class, BigInteger.class, StringRange.class, String[].class, String[].class, String.class, String.class, VerificationContext.class},
                    new Object[]{getState(), fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_d8rw, fr_dy3l, fr_6f68, fr_47yy, fr_gh3o, fr_fbba, fr_hhzp, single_text1, VerificationContext.forCommand(c)}
            );

//package org.test.aptosformsdemo.domain.mainform;
//
//public class CreateLogic {
//    public static void verify(MainFormState mainFormState, BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, StringRange fr_d8rw, StringRange fr_dy3l, BigInteger fr_6f68, StringRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, String fr_hhzp, String single_text1, VerificationContext verificationContext) {
//    }
//}

        }
           

        protected AbstractMainFormEvent.MainFormCreated newMainFormCreated(BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, StringRange fr_d8rw, StringRange fr_dy3l, BigInteger fr_6f68, StringRange fr_47yy, String[] fr_gh3o, String[] fr_fbba, String fr_hhzp, String single_text1, Long offChainVersion, String commandId, String requesterId) {
            MainFormEventId eventId = new MainFormEventId(getState().getSignerAddress(), null);
            AbstractMainFormEvent.MainFormCreated e = new AbstractMainFormEvent.MainFormCreated();

            e.setFr_5pqi(fr_5pqi);
            e.setFr_duif(fr_duif);
            e.setFr_6i34(fr_6i34);
            e.setFr_8xjs(fr_8xjs);
            e.setFr_9c3f(fr_9c3f);
            e.setFr_4ok6(fr_4ok6);
            e.setFr_b3ub(fr_b3ub);
            e.setFr_1z7o(fr_1z7o);
            e.setFr_d8rw(fr_d8rw);
            e.setFr_dy3l(fr_dy3l);
            e.setFr_6f68(fr_6f68);
            e.setFr_47yy(fr_47yy);
            e.setFr_gh3o(fr_gh3o);
            e.setFr_fbba(fr_fbba);
            e.setFr_hhzp(fr_hhzp);
            e.setSingle_text1(single_text1);
            e.setAptosEventVersion(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventSequenceNumber(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventType(null); // todo Need to update 'verify' method to return event properties.
            e.setAptosEventGuid(null); // todo Need to update 'verify' method to return event properties.
            e.setStatus(null); // todo Need to update 'verify' method to return event properties.

            e.setCommandId(commandId);
            e.setCreatedBy(requesterId);
            e.setCreatedAt((java.util.Date)ApplicationContext.current.getTimestampService().now(java.util.Date.class));

            e.setMainFormEventId(eventId);
            return e;
        }

    }

}

