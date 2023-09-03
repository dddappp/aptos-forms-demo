// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.mainform;

import java.util.*;
import java.math.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.mainform.MainFormEvent.*;

public abstract class AbstractMainFormState implements MainFormState.SqlMainFormState {

    private String accountAddress;

    public String getAccountAddress() {
        return this.accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    private BigInteger fr_5pqi;

    public BigInteger getFr_5pqi() {
        return this.fr_5pqi;
    }

    public void setFr_5pqi(BigInteger fr_5pqi) {
        this.fr_5pqi = fr_5pqi;
    }

    private String fr_8xjs;

    public String getFr_8xjs() {
        return this.fr_8xjs;
    }

    public void setFr_8xjs(String fr_8xjs) {
        this.fr_8xjs = fr_8xjs;
    }

    private String fr_9c3f;

    public String getFr_9c3f() {
        return this.fr_9c3f;
    }

    public void setFr_9c3f(String fr_9c3f) {
        this.fr_9c3f = fr_9c3f;
    }

    private BigInteger fr_4ok6;

    public BigInteger getFr_4ok6() {
        return this.fr_4ok6;
    }

    public void setFr_4ok6(BigInteger fr_4ok6) {
        this.fr_4ok6 = fr_4ok6;
    }

    private String fr_b3ub;

    public String getFr_b3ub() {
        return this.fr_b3ub;
    }

    public void setFr_b3ub(String fr_b3ub) {
        this.fr_b3ub = fr_b3ub;
    }

    private BigInteger fr_1z7o;

    public BigInteger getFr_1z7o() {
        return this.fr_1z7o;
    }

    public void setFr_1z7o(BigInteger fr_1z7o) {
        this.fr_1z7o = fr_1z7o;
    }

    private BigInteger fr_6f68;

    public BigInteger getFr_6f68() {
        return this.fr_6f68;
    }

    public void setFr_6f68(BigInteger fr_6f68) {
        this.fr_6f68 = fr_6f68;
    }

    private String fr_hhzp;

    public String getFr_hhzp() {
        return this.fr_hhzp;
    }

    public void setFr_hhzp(String fr_hhzp) {
        this.fr_hhzp = fr_hhzp;
    }

    private String single_text1;

    public String getSingle_text1() {
        return this.single_text1;
    }

    public void setSingle_text1(String single_text1) {
        this.single_text1 = single_text1;
    }

    private BigInteger version;

    public BigInteger getVersion() {
        return this.version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    private Long offChainVersion;

    public Long getOffChainVersion() {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion) {
        this.offChainVersion = offChainVersion;
    }

    private String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Boolean active;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private Boolean deleted;

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    private Set<String> fr_duif;

    public Set<String> getFr_duif() {
        return this.fr_duif;
    }

    public void setFr_duif(Set<String> fr_duif) {
        this.fr_duif = fr_duif;
    }

    private Set<String> fr_6i34;

    public Set<String> getFr_6i34() {
        return this.fr_6i34;
    }

    public void setFr_6i34(Set<String> fr_6i34) {
        this.fr_6i34 = fr_6i34;
    }

    private Set<String> fr_gh3o;

    public Set<String> getFr_gh3o() {
        return this.fr_gh3o;
    }

    public void setFr_gh3o(Set<String> fr_gh3o) {
        this.fr_gh3o = fr_gh3o;
    }

    private Set<String> fr_fbba;

    public Set<String> getFr_fbba() {
        return this.fr_fbba;
    }

    public void setFr_fbba(Set<String> fr_fbba) {
        this.fr_fbba = fr_fbba;
    }

    public boolean isStateUnsaved() {
        return this.getOffChainVersion() == null;
    }

    private Boolean stateReadOnly;

    public Boolean getStateReadOnly() { return this.stateReadOnly; }

    public void setStateReadOnly(Boolean readOnly) { this.stateReadOnly = readOnly; }

    private boolean forReapplying;

    public boolean getForReapplying() {
        return forReapplying;
    }

    public void setForReapplying(boolean forReapplying) {
        this.forReapplying = forReapplying;
    }

    public AbstractMainFormState(List<Event> events) {
        initializeForReapplying();
        if (events != null && events.size() > 0) {
            this.setAccountAddress(((MainFormEvent.SqlMainFormEvent) events.get(0)).getMainFormEventId().getAccountAddress());
            for (Event e : events) {
                mutate(e);
                this.setOffChainVersion((this.getOffChainVersion() == null ? MainFormState.VERSION_NULL : this.getOffChainVersion()) + 1);
            }
        }
    }


    public AbstractMainFormState() {
        initializeProperties();
    }

    protected void initializeForReapplying() {
        this.forReapplying = true;

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }

    @Override
    public int hashCode() {
        return getAccountAddress().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj instanceof MainFormState) {
            return Objects.equals(this.getAccountAddress(), ((MainFormState)obj).getAccountAddress());
        }
        return false;
    }


    public void mutate(Event e) {
        setStateReadOnly(false);
        if (false) { 
            ;
        } else if (e instanceof AbstractMainFormEvent.MainFormCreated) {
            when((AbstractMainFormEvent.MainFormCreated)e);
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported event type: %1$s", e.getClass().getName()));
        }
    }

    protected void merge(MainFormState s) {
        if (s == this) {
            return;
        }
        this.setFr_5pqi(s.getFr_5pqi());
        this.setFr_duif(s.getFr_duif());
        this.setFr_6i34(s.getFr_6i34());
        this.setFr_8xjs(s.getFr_8xjs());
        this.setFr_9c3f(s.getFr_9c3f());
        this.setFr_4ok6(s.getFr_4ok6());
        this.setFr_b3ub(s.getFr_b3ub());
        this.setFr_1z7o(s.getFr_1z7o());
        this.setFr_6f68(s.getFr_6f68());
        this.setFr_gh3o(s.getFr_gh3o());
        this.setFr_fbba(s.getFr_fbba());
        this.setFr_hhzp(s.getFr_hhzp());
        this.setSingle_text1(s.getSingle_text1());
        this.setVersion(s.getVersion());
        this.setActive(s.getActive());
    }

    public void when(AbstractMainFormEvent.MainFormCreated e) {
        throwOnWrongEvent(e);

        BigInteger fr_5pqi = e.getFr_5pqi();
        BigInteger Fr_5pqi = fr_5pqi;
        String[] fr_duif = e.getFr_duif();
        String[] Fr_duif = fr_duif;
        String[] fr_6i34 = e.getFr_6i34();
        String[] Fr_6i34 = fr_6i34;
        String fr_8xjs = e.getFr_8xjs();
        String Fr_8xjs = fr_8xjs;
        String fr_9c3f = e.getFr_9c3f();
        String Fr_9c3f = fr_9c3f;
        BigInteger fr_4ok6 = e.getFr_4ok6();
        BigInteger Fr_4ok6 = fr_4ok6;
        String fr_b3ub = e.getFr_b3ub();
        String Fr_b3ub = fr_b3ub;
        BigInteger fr_1z7o = e.getFr_1z7o();
        BigInteger Fr_1z7o = fr_1z7o;
        BigInteger fr_6f68 = e.getFr_6f68();
        BigInteger Fr_6f68 = fr_6f68;
        String[] fr_gh3o = e.getFr_gh3o();
        String[] Fr_gh3o = fr_gh3o;
        String[] fr_fbba = e.getFr_fbba();
        String[] Fr_fbba = fr_fbba;
        String fr_hhzp = e.getFr_hhzp();
        String Fr_hhzp = fr_hhzp;
        String single_text1 = e.getSingle_text1();
        String Single_text1 = single_text1;
        BigInteger aptosEventVersion = e.getAptosEventVersion();
        BigInteger AptosEventVersion = aptosEventVersion;
        BigInteger aptosEventSequenceNumber = e.getAptosEventSequenceNumber();
        BigInteger AptosEventSequenceNumber = aptosEventSequenceNumber;
        String aptosEventType = e.getAptosEventType();
        String AptosEventType = aptosEventType;
        AptosEventGuid aptosEventGuid = e.getAptosEventGuid();
        AptosEventGuid AptosEventGuid = aptosEventGuid;
        String status = e.getStatus();
        String Status = status;

        if (this.getCreatedBy() == null){
            this.setCreatedBy(e.getCreatedBy());
        }
        if (this.getCreatedAt() == null){
            this.setCreatedAt(e.getCreatedAt());
        }
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        MainFormState updatedMainFormState = (MainFormState) ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.mainform.CreateLogic",
                    "mutate",
                    new Class[]{MainFormState.class, BigInteger.class, String[].class, String[].class, String.class, String.class, BigInteger.class, String.class, BigInteger.class, BigInteger.class, String[].class, String[].class, String.class, String.class, BigInteger.class, BigInteger.class, String.class, AptosEventGuid.class, String.class, MutationContext.class},
                    new Object[]{this, fr_5pqi, fr_duif, fr_6i34, fr_8xjs, fr_9c3f, fr_4ok6, fr_b3ub, fr_1z7o, fr_6f68, fr_gh3o, fr_fbba, fr_hhzp, single_text1, aptosEventVersion, aptosEventSequenceNumber, aptosEventType, aptosEventGuid, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.aptosformsdemo.domain.mainform;
//
//public class CreateLogic {
//    public static MainFormState mutate(MainFormState mainFormState, BigInteger fr_5pqi, String[] fr_duif, String[] fr_6i34, String fr_8xjs, String fr_9c3f, BigInteger fr_4ok6, String fr_b3ub, BigInteger fr_1z7o, BigInteger fr_6f68, String[] fr_gh3o, String[] fr_fbba, String fr_hhzp, String single_text1, BigInteger aptosEventVersion, BigInteger aptosEventSequenceNumber, String aptosEventType, AptosEventGuid aptosEventGuid, String status, MutationContext<MainFormState, MainFormState.MutableMainFormState> mutationContext) {
//    }
//}

        if (this != updatedMainFormState) { merge(updatedMainFormState); } //else do nothing

    }

    public void save() {
    }

    protected void throwOnWrongEvent(MainFormEvent event) {
        String stateEntityId = this.getAccountAddress(); // Aggregate Id
        String eventEntityId = ((MainFormEvent.SqlMainFormEvent)event).getMainFormEventId().getAccountAddress(); // EntityBase.Aggregate.GetEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId)) {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }


        Long stateVersion = this.getOffChainVersion();

    }


    public static class SimpleMainFormState extends AbstractMainFormState {

        public SimpleMainFormState() {
        }

        public SimpleMainFormState(List<Event> events) {
            super(events);
        }

        public static SimpleMainFormState newForReapplying() {
            SimpleMainFormState s = new SimpleMainFormState();
            s.initializeForReapplying();
            return s;
        }

    }



}

