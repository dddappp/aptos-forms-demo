// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform;

import java.util.*;
import java.math.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.AptosFormsDemoMainFormEvent.*;

public abstract class AbstractAptosFormsDemoMainFormState implements AptosFormsDemoMainFormState.SqlAptosFormsDemoMainFormState {

    private FormPageAndAddress formPageAndSignerAddress;

    public FormPageAndAddress getFormPageAndSignerAddress() {
        return this.formPageAndSignerAddress;
    }

    public void setFormPageAndSignerAddress(FormPageAndAddress formPageAndSignerAddress) {
        this.formPageAndSignerAddress = formPageAndSignerAddress;
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

    private OffsetDateTime createdAt;

    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    private OffsetDateTime updatedAt;

    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
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

    private Map<String, Object> dynamicProperties = new HashMap<>();

    public Map<String, Object> getDynamicProperties() {
        return this.dynamicProperties;
    }

    public void setDynamicProperties(Map<String, Object> dynamicProperties) {
        this.dynamicProperties = dynamicProperties;
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

    public AbstractAptosFormsDemoMainFormState(List<Event> events) {
        initializeForReapplying();
        if (events != null && events.size() > 0) {
            this.setFormPageAndSignerAddress(((AptosFormsDemoMainFormEvent.SqlAptosFormsDemoMainFormEvent) events.get(0)).getAptosFormsDemoMainFormEventId().getFormPageAndSignerAddress());
            for (Event e : events) {
                //mutate(e);
                this.setOffChainVersion((this.getOffChainVersion() == null ? AptosFormsDemoMainFormState.VERSION_NULL : this.getOffChainVersion()) + 1);
            }
        }
    }


    public AbstractAptosFormsDemoMainFormState() {
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
        return getFormPageAndSignerAddress().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj instanceof AptosFormsDemoMainFormState) {
            return Objects.equals(this.getFormPageAndSignerAddress(), ((AptosFormsDemoMainFormState)obj).getFormPageAndSignerAddress());
        }
        return false;
    }

    public void merge(AptosFormsDemoMainFormState s) {
        if (s == this) {
            return;
        }
        this.setDynamicProperties(s.getDynamicProperties());
        this.setVersion(s.getVersion());
        this.setActive(s.getActive());
    }

    public void save() {
    }

    protected void throwOnWrongEvent(AptosFormsDemoMainFormEvent event) {
        FormPageAndAddress stateEntityId = this.getFormPageAndSignerAddress(); // Aggregate Id
        FormPageAndAddress eventEntityId = ((AptosFormsDemoMainFormEvent.SqlAptosFormsDemoMainFormEvent)event).getAptosFormsDemoMainFormEventId().getFormPageAndSignerAddress(); // EntityBase.Aggregate.GetEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId)) {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }


        Long stateVersion = this.getOffChainVersion();

    }


    public static class SimpleAptosFormsDemoMainFormState extends AbstractAptosFormsDemoMainFormState {

        public SimpleAptosFormsDemoMainFormState() {
        }

        public SimpleAptosFormsDemoMainFormState(List<Event> events) {
            super(events);
        }

        public static SimpleAptosFormsDemoMainFormState newForReapplying() {
            SimpleAptosFormsDemoMainFormState s = new SimpleAptosFormsDemoMainFormState();
            s.initializeForReapplying();
            return s;
        }

    }



}

