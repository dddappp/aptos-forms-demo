// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.*;
import java.math.*;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.formdefinition.FormDefinitionEvent.*;

public abstract class AbstractFormDefinitionState implements FormDefinitionState.SqlFormDefinitionState, Saveable {

    private Long formSequenceId;

    public Long getFormSequenceId() {
        return this.formSequenceId;
    }

    public void setFormSequenceId(Long formSequenceId) {
        this.formSequenceId = formSequenceId;
    }

    private String formId;

    public String getFormId() {
        return this.formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    private String contractAddress;

    public String getContractAddress() {
        return this.contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    private String storeAccountAddress;

    public String getStoreAccountAddress() {
        return this.storeAccountAddress;
    }

    public void setStoreAccountAddress(String storeAccountAddress) {
        this.storeAccountAddress = storeAccountAddress;
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

    public boolean isStateUnsaved() {
        return this.getOffChainVersion() == null;
    }

    private Set<FormPageDefinitionState> protectedPageDefinitions = new HashSet<>();

    protected Set<FormPageDefinitionState> getProtectedPageDefinitions() {
        return this.protectedPageDefinitions;
    }

    protected void setProtectedPageDefinitions(Set<FormPageDefinitionState> protectedPageDefinitions) {
        this.protectedPageDefinitions = protectedPageDefinitions;
    }

    private EntityStateCollection<Integer, FormPageDefinitionState> pageDefinitions;

    public EntityStateCollection<Integer, FormPageDefinitionState> getPageDefinitions() {
        return this.pageDefinitions;
    }

    public void setPageDefinitions(EntityStateCollection<Integer, FormPageDefinitionState> pageDefinitions) {
        this.pageDefinitions = pageDefinitions;
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

    public AbstractFormDefinitionState(List<Event> events) {
        initializeForReapplying();
        if (events != null && events.size() > 0) {
            this.setFormSequenceId(((FormDefinitionEvent.SqlFormDefinitionEvent) events.get(0)).getFormDefinitionEventId().getFormSequenceId());
            for (Event e : events) {
                mutate(e);
                this.setOffChainVersion((this.getOffChainVersion() == null ? FormDefinitionState.VERSION_NULL : this.getOffChainVersion()) + 1);
            }
        }
    }


    public AbstractFormDefinitionState() {
        initializeProperties();
    }

    protected void initializeForReapplying() {
        this.forReapplying = true;

        initializeProperties();
    }
    
    protected void initializeProperties() {
        pageDefinitions = new SimpleFormPageDefinitionStateCollection();
    }

    @Override
    public int hashCode() {
        return getFormSequenceId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj instanceof FormDefinitionState) {
            return Objects.equals(this.getFormSequenceId(), ((FormDefinitionState)obj).getFormSequenceId());
        }
        return false;
    }


    public void mutate(Event e) {
        setStateReadOnly(false);
        if (e instanceof FormDefinitionStateCreated) {
            when((FormDefinitionStateCreated) e);
        } else if (e instanceof FormDefinitionStateMergePatched) {
            when((FormDefinitionStateMergePatched) e);
        } else if (e instanceof FormDefinitionStateDeleted) {
            when((FormDefinitionStateDeleted) e);
        } else if (e instanceof AbstractFormDefinitionEvent.FormWithFirstPageDefined) {
            when((AbstractFormDefinitionEvent.FormWithFirstPageDefined)e);
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported event type: %1$s", e.getClass().getName()));
        }
    }

    public void when(FormDefinitionStateCreated e) {
        throwOnWrongEvent(e);

        this.setFormId(e.getFormId());
        this.setContractAddress(e.getContractAddress());
        this.setStoreAccountAddress(e.getStoreAccountAddress());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (FormPageDefinitionEvent.FormPageDefinitionStateCreated innerEvent : e.getFormPageDefinitionEvents()) {
            FormPageDefinitionState innerState = ((EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>)this.getPageDefinitions()).getOrAdd(((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)innerEvent).getFormPageDefinitionEventId().getPageNumber());
            ((FormPageDefinitionState.SqlFormPageDefinitionState)innerState).mutate(innerEvent);
        }
    }

    protected void merge(FormDefinitionState s) {
        if (s == this) {
            return;
        }
        this.setFormId(s.getFormId());
        this.setContractAddress(s.getContractAddress());
        this.setStoreAccountAddress(s.getStoreAccountAddress());
        this.setActive(s.getActive());

        if (s.getPageDefinitions() != null) {
            Iterable<FormPageDefinitionState> iterable;
            if (s.getPageDefinitions().isLazy()) {
                iterable = s.getPageDefinitions().getLoadedStates();
            } else {
                iterable = s.getPageDefinitions();
            }
            if (iterable != null) {
                for (FormPageDefinitionState ss : iterable) {
                    FormPageDefinitionState thisInnerState = ((EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>)this.getPageDefinitions()).getOrAdd(ss.getPageNumber());
                    ((AbstractFormPageDefinitionState) thisInnerState).merge(ss);
                }
            }
        }
        if (s.getPageDefinitions() != null) {
            if (s.getPageDefinitions() instanceof EntityStateCollection.ModifiableEntityStateCollection) {
                if (((EntityStateCollection.ModifiableEntityStateCollection)s.getPageDefinitions()).getRemovedStates() != null) {
                    for (FormPageDefinitionState ss : ((EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>)s.getPageDefinitions()).getRemovedStates()) {
                        FormPageDefinitionState thisInnerState = ((EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>)this.getPageDefinitions()).getOrAdd(ss.getPageNumber());
                        this.getPageDefinitions().remove(thisInnerState);
                    }
                }
            } else {
                if (s.getPageDefinitions().isAllLoaded()) {
                    Set<Integer> removedStateIds = new HashSet<>(this.getPageDefinitions().stream().map(i -> i.getPageNumber()).collect(java.util.stream.Collectors.toList()));
                    s.getPageDefinitions().forEach(i -> removedStateIds.remove(i.getPageNumber()));
                    for (Integer i : removedStateIds) {
                        FormPageDefinitionState thisInnerState = ((EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>)this.getPageDefinitions()).getOrAdd(i);
                        this.getPageDefinitions().remove(thisInnerState);
                    }
                }
            }
        }
    }

    public void when(FormDefinitionStateMergePatched e) {
        throwOnWrongEvent(e);

        if (e.getFormId() == null) {
            if (e.getIsPropertyFormIdRemoved() != null && e.getIsPropertyFormIdRemoved()) {
                this.setFormId(null);
            }
        } else {
            this.setFormId(e.getFormId());
        }
        if (e.getContractAddress() == null) {
            if (e.getIsPropertyContractAddressRemoved() != null && e.getIsPropertyContractAddressRemoved()) {
                this.setContractAddress(null);
            }
        } else {
            this.setContractAddress(e.getContractAddress());
        }
        if (e.getStoreAccountAddress() == null) {
            if (e.getIsPropertyStoreAccountAddressRemoved() != null && e.getIsPropertyStoreAccountAddressRemoved()) {
                this.setStoreAccountAddress(null);
            }
        } else {
            this.setStoreAccountAddress(e.getStoreAccountAddress());
        }
        if (e.getActive() == null) {
            if (e.getIsPropertyActiveRemoved() != null && e.getIsPropertyActiveRemoved()) {
                this.setActive(null);
            }
        } else {
            this.setActive(e.getActive());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (FormPageDefinitionEvent innerEvent : e.getFormPageDefinitionEvents()) {
            FormPageDefinitionState innerState = ((EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState>)this.getPageDefinitions()).getOrAdd(((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)innerEvent).getFormPageDefinitionEventId().getPageNumber());
            ((FormPageDefinitionState.SqlFormPageDefinitionState)innerState).mutate(innerEvent);
            if (innerEvent instanceof FormPageDefinitionEvent.FormPageDefinitionStateRemoved) {
                //FormPageDefinitionEvent.FormPageDefinitionStateRemoved removed = (FormPageDefinitionEvent.FormPageDefinitionStateRemoved)innerEvent;
                this.getPageDefinitions().remove(innerState);
            }
        }
    }

    public void when(FormDefinitionStateDeleted e) {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (FormPageDefinitionState innerState : this.getPageDefinitions()) {
            this.getPageDefinitions().remove(innerState);
        
            FormPageDefinitionEvent.FormPageDefinitionStateRemoved innerE = e.newFormPageDefinitionStateRemoved(innerState.getPageNumber());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            ((FormPageDefinitionState.MutableFormPageDefinitionState)innerState).mutate(innerE);
            //e.addFormPageDefinitionEvent(innerE);
        }
    }

    public void when(AbstractFormDefinitionEvent.FormWithFirstPageDefined e) {
        throwOnWrongEvent(e);

        String formId = e.getFormId();
        String FormId = formId;
        String contractAddress = e.getContractAddress();
        String ContractAddress = contractAddress;
        String storeAccountAddress = e.getStoreAccountAddress();
        String StoreAccountAddress = storeAccountAddress;
        String pageName = e.getPageName();
        String PageName = pageName;
        String moveStateTableFieldName = e.getMoveStateTableFieldName();
        String MoveStateTableFieldName = moveStateTableFieldName;
        String moveStateStructName = e.getMoveStateStructName();
        String MoveStateStructName = moveStateStructName;
        String moveSubmitEventHandleFieldName = e.getMoveSubmitEventHandleFieldName();
        String MoveSubmitEventHandleFieldName = moveSubmitEventHandleFieldName;
        String moveUpdateEventHandleFieldName = e.getMoveUpdateEventHandleFieldName();
        String MoveUpdateEventHandleFieldName = moveUpdateEventHandleFieldName;
        String moveSubmitEventStructName = e.getMoveSubmitEventStructName();
        String MoveSubmitEventStructName = moveSubmitEventStructName;
        String moveUpdateEventStructName = e.getMoveUpdateEventStructName();
        String MoveUpdateEventStructName = moveUpdateEventStructName;

        if (this.getCreatedBy() == null){
            this.setCreatedBy(e.getCreatedBy());
        }
        if (this.getCreatedAt() == null){
            this.setCreatedAt(e.getCreatedAt());
        }
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        FormDefinitionState updatedFormDefinitionState = (FormDefinitionState) ReflectUtils.invokeStaticMethod(
                    "org.test.aptosformsdemo.domain.formdefinition.DefineFormWithFirstPageLogic",
                    "mutate",
                    new Class[]{FormDefinitionState.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, formId, contractAddress, storeAccountAddress, pageName, moveStateTableFieldName, moveStateStructName, moveSubmitEventHandleFieldName, moveUpdateEventHandleFieldName, moveSubmitEventStructName, moveUpdateEventStructName, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.aptosformsdemo.domain.formdefinition;
//
//public class DefineFormWithFirstPageLogic {
//    public static FormDefinitionState mutate(FormDefinitionState formDefinitionState, String formId, String contractAddress, String storeAccountAddress, String pageName, String moveStateTableFieldName, String moveStateStructName, String moveSubmitEventHandleFieldName, String moveUpdateEventHandleFieldName, String moveSubmitEventStructName, String moveUpdateEventStructName, MutationContext<FormDefinitionState, FormDefinitionState.MutableFormDefinitionState> mutationContext) {
//    }
//}

        if (this != updatedFormDefinitionState) { merge(updatedFormDefinitionState); } //else do nothing

    }

    public void save() {
        if (pageDefinitions instanceof Saveable) {
            ((Saveable)pageDefinitions).save();
        }
    }

    protected void throwOnWrongEvent(FormDefinitionEvent event) {
        Long stateEntityId = this.getFormSequenceId(); // Aggregate Id
        Long eventEntityId = ((FormDefinitionEvent.SqlFormDefinitionEvent)event).getFormDefinitionEventId().getFormSequenceId(); // EntityBase.Aggregate.GetEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId)) {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }


        Long stateVersion = this.getOffChainVersion();
        Long eventVersion = ((FormDefinitionEvent.SqlFormDefinitionEvent)event).getFormDefinitionEventId().getOffChainVersion();// Event Version
        if (eventVersion == null) {
            throw new NullPointerException("event.getFormDefinitionEventId().getOffChainVersion() == null");
        }
        if (!(stateVersion == null && eventVersion.equals(FormDefinitionState.VERSION_NULL)) && !eventVersion.equals(stateVersion)) {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }


    public static class SimpleFormDefinitionState extends AbstractFormDefinitionState {

        public SimpleFormDefinitionState() {
        }

        public SimpleFormDefinitionState(List<Event> events) {
            super(events);
        }

        public static SimpleFormDefinitionState newForReapplying() {
            SimpleFormDefinitionState s = new SimpleFormDefinitionState();
            s.initializeForReapplying();
            return s;
        }

    }


    class SimpleFormPageDefinitionStateCollection implements EntityStateCollection.ModifiableEntityStateCollection<Integer, FormPageDefinitionState> {

        @Override
        public FormPageDefinitionState get(Integer pageNumber) {
            return protectedPageDefinitions.stream().filter(
                            e -> e.getPageNumber().equals(pageNumber))
                    .findFirst().orElse(null);
        }

        @Override
        public boolean isLazy() {
            return false;
        }

        @Override
        public boolean isAllLoaded() {
            return true;
        }

        @Override
        public Collection<FormPageDefinitionState> getLoadedStates() {
            return protectedPageDefinitions;
        }

        @Override
        public Collection<FormPageDefinitionState> getRemovedStates() {
            return null;
        }

        @Override
        public FormPageDefinitionState getOrAdd(Integer pageNumber) {
            FormPageDefinitionState s = get(pageNumber);
            if (s == null) {
                FormDefinitionFormPageDefinitionId globalId = new FormDefinitionFormPageDefinitionId(getFormSequenceId(), pageNumber);
                AbstractFormPageDefinitionState state = new AbstractFormPageDefinitionState.SimpleFormPageDefinitionState();
                state.setFormDefinitionFormPageDefinitionId(globalId);
                add(state);
                s = state;
            }
            return s;
        }

        @Override
        public int size() {
            return protectedPageDefinitions.size();
        }

        @Override
        public boolean isEmpty() {
            return protectedPageDefinitions.isEmpty();
        }

        @Override
        public boolean contains(Object o) {
            return protectedPageDefinitions.contains(o);
        }

        @Override
        public Iterator<FormPageDefinitionState> iterator() {
            return protectedPageDefinitions.iterator();
        }

        @Override
        public Object[] toArray() {
            return protectedPageDefinitions.toArray();
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return protectedPageDefinitions.toArray(a);
        }

        @Override
        public boolean add(FormPageDefinitionState s) {
            if (s instanceof AbstractFormPageDefinitionState) {
                AbstractFormPageDefinitionState state = (AbstractFormPageDefinitionState) s;
                state.setProtectedFormDefinitionState(AbstractFormDefinitionState.this);
            }
            return protectedPageDefinitions.add(s);
        }

        @Override
        public boolean remove(Object o) {
            if (o instanceof AbstractFormPageDefinitionState) {
                AbstractFormPageDefinitionState s = (AbstractFormPageDefinitionState) o;
                s.setProtectedFormDefinitionState(null);
            }
            return protectedPageDefinitions.remove(o);
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return protectedPageDefinitions.contains(c);
        }

        @Override
        public boolean addAll(Collection<? extends FormPageDefinitionState> c) {
            return protectedPageDefinitions.addAll(c);
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return protectedPageDefinitions.removeAll(c);
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return protectedPageDefinitions.retainAll(c);
        }

        @Override
        public void clear() {
            protectedPageDefinitions.clear();
        }
    }


}

