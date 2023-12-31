// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.*;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.AbstractEvent;

public abstract class AbstractFormDefinitionEvent extends AbstractEvent implements FormDefinitionEvent.SqlFormDefinitionEvent {
    private FormDefinitionEventId formDefinitionEventId = new FormDefinitionEventId();

    public FormDefinitionEventId getFormDefinitionEventId() {
        return this.formDefinitionEventId;
    }

    public void setFormDefinitionEventId(FormDefinitionEventId eventId) {
        this.formDefinitionEventId = eventId;
    }
    
    public Long getFormSequenceId() {
        return getFormDefinitionEventId().getFormSequenceId();
    }

    public void setFormSequenceId(Long formSequenceId) {
        getFormDefinitionEventId().setFormSequenceId(formSequenceId);
    }

    private boolean eventReadOnly;

    public boolean getEventReadOnly() { return this.eventReadOnly; }

    public void setEventReadOnly(boolean readOnly) { this.eventReadOnly = readOnly; }

    public Long getOffChainVersion() {
        return getFormDefinitionEventId().getOffChainVersion();
    }
    
    public void setOffChainVersion(Long offChainVersion) {
        getFormDefinitionEventId().setOffChainVersion(offChainVersion);
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


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    private String commandType;

    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    protected AbstractFormDefinitionEvent() {
    }

    protected AbstractFormDefinitionEvent(FormDefinitionEventId eventId) {
        this.formDefinitionEventId = eventId;
    }

    protected FormPageDefinitionEventDao getFormPageDefinitionEventDao() {
        return (FormPageDefinitionEventDao)ApplicationContext.current.get("formPageDefinitionEventDao");
    }

    protected FormPageDefinitionEventId newFormPageDefinitionEventId(Integer pageNumber)
    {
        FormPageDefinitionEventId eventId = new FormPageDefinitionEventId(this.getFormDefinitionEventId().getFormSequenceId(), 
            pageNumber, 
            this.getFormDefinitionEventId().getOffChainVersion());
        return eventId;
    }

    protected void throwOnInconsistentEventIds(FormPageDefinitionEvent.SqlFormPageDefinitionEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(FormDefinitionEvent.SqlFormDefinitionEvent oe, FormPageDefinitionEvent.SqlFormPageDefinitionEvent e)
    {
        if (!oe.getFormDefinitionEventId().getFormSequenceId().equals(e.getFormPageDefinitionEventId().getFormDefinitionFormSequenceId()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id FormSequenceId %1$s but inner id FormDefinitionFormSequenceId %2$s", 
                oe.getFormDefinitionEventId().getFormSequenceId(), e.getFormPageDefinitionEventId().getFormDefinitionFormSequenceId());
        }
    }

    public FormPageDefinitionEvent.FormPageDefinitionStateCreated newFormPageDefinitionStateCreated(Integer pageNumber) {
        return new AbstractFormPageDefinitionEvent.SimpleFormPageDefinitionStateCreated(newFormPageDefinitionEventId(pageNumber));
    }

    public FormPageDefinitionEvent.FormPageDefinitionStateMergePatched newFormPageDefinitionStateMergePatched(Integer pageNumber) {
        return new AbstractFormPageDefinitionEvent.SimpleFormPageDefinitionStateMergePatched(newFormPageDefinitionEventId(pageNumber));
    }

    public FormPageDefinitionEvent.FormPageDefinitionStateRemoved newFormPageDefinitionStateRemoved(Integer pageNumber) {
        return new AbstractFormPageDefinitionEvent.SimpleFormPageDefinitionStateRemoved(newFormPageDefinitionEventId(pageNumber));
    }


    public abstract String getEventClass();

    public static class FormDefinitionLobEvent extends AbstractFormDefinitionEvent {

        public Map<String, Object> getDynamicProperties() {
            return dynamicProperties;
        }

        public void setDynamicProperties(Map<String, Object> dynamicProperties) {
            if (dynamicProperties == null) {
                throw new IllegalArgumentException("dynamicProperties is null.");
            }
            this.dynamicProperties = dynamicProperties;
        }

        private Map<String, Object> dynamicProperties = new HashMap<>();

        @Override
        public String getEventClass() {
            return "FormDefinitionLobEvent";
        }

    }

    public static class FormWithFirstPageDefined extends FormDefinitionLobEvent implements FormDefinitionEvent.FormWithFirstPageDefined {

        @Override
        public String getEventClass() {
            return "FormWithFirstPageDefined";
        }

        public String getFormId() {
            Object val = getDynamicProperties().get("formId");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setFormId(String value) {
            getDynamicProperties().put("formId", value);
        }

        public String getContractAddress() {
            Object val = getDynamicProperties().get("contractAddress");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setContractAddress(String value) {
            getDynamicProperties().put("contractAddress", value);
        }

        public String getStoreAccountAddress() {
            Object val = getDynamicProperties().get("storeAccountAddress");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setStoreAccountAddress(String value) {
            getDynamicProperties().put("storeAccountAddress", value);
        }

        public String getPageName() {
            Object val = getDynamicProperties().get("pageName");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setPageName(String value) {
            getDynamicProperties().put("pageName", value);
        }

        public String getMoveStateTableFieldName() {
            Object val = getDynamicProperties().get("moveStateTableFieldName");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setMoveStateTableFieldName(String value) {
            getDynamicProperties().put("moveStateTableFieldName", value);
        }

        public String getMoveStateStructName() {
            Object val = getDynamicProperties().get("moveStateStructName");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setMoveStateStructName(String value) {
            getDynamicProperties().put("moveStateStructName", value);
        }

        public String getMoveSubmitEventHandleFieldName() {
            Object val = getDynamicProperties().get("moveSubmitEventHandleFieldName");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setMoveSubmitEventHandleFieldName(String value) {
            getDynamicProperties().put("moveSubmitEventHandleFieldName", value);
        }

        public String getMoveUpdateEventHandleFieldName() {
            Object val = getDynamicProperties().get("moveUpdateEventHandleFieldName");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setMoveUpdateEventHandleFieldName(String value) {
            getDynamicProperties().put("moveUpdateEventHandleFieldName", value);
        }

        public String getMoveSubmitEventStructName() {
            Object val = getDynamicProperties().get("moveSubmitEventStructName");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setMoveSubmitEventStructName(String value) {
            getDynamicProperties().put("moveSubmitEventStructName", value);
        }

        public String getMoveUpdateEventStructName() {
            Object val = getDynamicProperties().get("moveUpdateEventStructName");
            if (val instanceof String) {
                return (String) val;
            }
            return ApplicationContext.current.getTypeConverter().convertValue(val, String.class);
        }

        public void setMoveUpdateEventStructName(String value) {
            getDynamicProperties().put("moveUpdateEventStructName", value);
        }

    }


    public static abstract class AbstractFormDefinitionStateEvent extends AbstractFormDefinitionEvent implements FormDefinitionEvent.FormDefinitionStateEvent {
        private String formId;

        public String getFormId()
        {
            return this.formId;
        }

        public void setFormId(String formId)
        {
            this.formId = formId;
        }

        private String contractAddress;

        public String getContractAddress()
        {
            return this.contractAddress;
        }

        public void setContractAddress(String contractAddress)
        {
            this.contractAddress = contractAddress;
        }

        private String storeAccountAddress;

        public String getStoreAccountAddress()
        {
            return this.storeAccountAddress;
        }

        public void setStoreAccountAddress(String storeAccountAddress)
        {
            this.storeAccountAddress = storeAccountAddress;
        }

        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

        protected AbstractFormDefinitionStateEvent(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

    public static abstract class AbstractFormDefinitionStateCreated extends AbstractFormDefinitionStateEvent implements FormDefinitionEvent.FormDefinitionStateCreated, Saveable
    {
        public AbstractFormDefinitionStateCreated() {
            this(new FormDefinitionEventId());
        }

        public AbstractFormDefinitionStateCreated(FormDefinitionEventId eventId) {
            super(eventId);
        }

        public String getEventClass() {
            return StateEventType.CREATED;
        }

        private Map<FormPageDefinitionEventId, FormPageDefinitionEvent.FormPageDefinitionStateCreated> formPageDefinitionEvents = new HashMap<FormPageDefinitionEventId, FormPageDefinitionEvent.FormPageDefinitionStateCreated>();
        
        private Iterable<FormPageDefinitionEvent.FormPageDefinitionStateCreated> readOnlyFormPageDefinitionEvents;

        public Iterable<FormPageDefinitionEvent.FormPageDefinitionStateCreated> getFormPageDefinitionEvents()
        {
            if (!getEventReadOnly())
            {
                return this.formPageDefinitionEvents.values();
            }
            else
            {
                if (readOnlyFormPageDefinitionEvents != null) { return readOnlyFormPageDefinitionEvents; }
                FormPageDefinitionEventDao eventDao = getFormPageDefinitionEventDao();
                List<FormPageDefinitionEvent.FormPageDefinitionStateCreated> eL = new ArrayList<FormPageDefinitionEvent.FormPageDefinitionStateCreated>();
                for (FormPageDefinitionEvent e : eventDao.findByFormDefinitionEventId(this.getFormDefinitionEventId()))
                {
                    ((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e).setEventReadOnly(true);
                    eL.add((FormPageDefinitionEvent.FormPageDefinitionStateCreated)e);
                }
                return (readOnlyFormPageDefinitionEvents = eL);
            }
        }

        public void setFormPageDefinitionEvents(Iterable<FormPageDefinitionEvent.FormPageDefinitionStateCreated> es)
        {
            if (es != null)
            {
                for (FormPageDefinitionEvent.FormPageDefinitionStateCreated e : es)
                {
                    addFormPageDefinitionEvent(e);
                }
            }
            else { this.formPageDefinitionEvents.clear(); }
        }
        
        public void addFormPageDefinitionEvent(FormPageDefinitionEvent.FormPageDefinitionStateCreated e)
        {
            throwOnInconsistentEventIds((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e);
            this.formPageDefinitionEvents.put(((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e).getFormPageDefinitionEventId(), e);
        }

        public void save()
        {
            for (FormPageDefinitionEvent.FormPageDefinitionStateCreated e : this.getFormPageDefinitionEvents()) {
                getFormPageDefinitionEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractFormDefinitionStateMergePatched extends AbstractFormDefinitionStateEvent implements FormDefinitionEvent.FormDefinitionStateMergePatched, Saveable
    {
        public AbstractFormDefinitionStateMergePatched() {
            this(new FormDefinitionEventId());
        }

        public AbstractFormDefinitionStateMergePatched(FormDefinitionEventId eventId) {
            super(eventId);
        }

        public String getEventClass() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyFormIdRemoved;

        public Boolean getIsPropertyFormIdRemoved() {
            return this.isPropertyFormIdRemoved;
        }

        public void setIsPropertyFormIdRemoved(Boolean removed) {
            this.isPropertyFormIdRemoved = removed;
        }

        private Boolean isPropertyContractAddressRemoved;

        public Boolean getIsPropertyContractAddressRemoved() {
            return this.isPropertyContractAddressRemoved;
        }

        public void setIsPropertyContractAddressRemoved(Boolean removed) {
            this.isPropertyContractAddressRemoved = removed;
        }

        private Boolean isPropertyStoreAccountAddressRemoved;

        public Boolean getIsPropertyStoreAccountAddressRemoved() {
            return this.isPropertyStoreAccountAddressRemoved;
        }

        public void setIsPropertyStoreAccountAddressRemoved(Boolean removed) {
            this.isPropertyStoreAccountAddressRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }


        private Map<FormPageDefinitionEventId, FormPageDefinitionEvent> formPageDefinitionEvents = new HashMap<FormPageDefinitionEventId, FormPageDefinitionEvent>();
        
        private Iterable<FormPageDefinitionEvent> readOnlyFormPageDefinitionEvents;

        public Iterable<FormPageDefinitionEvent> getFormPageDefinitionEvents()
        {
            if (!getEventReadOnly())
            {
                return this.formPageDefinitionEvents.values();
            }
            else
            {
                if (readOnlyFormPageDefinitionEvents != null) { return readOnlyFormPageDefinitionEvents; }
                FormPageDefinitionEventDao eventDao = getFormPageDefinitionEventDao();
                List<FormPageDefinitionEvent> eL = new ArrayList<FormPageDefinitionEvent>();
                for (FormPageDefinitionEvent e : eventDao.findByFormDefinitionEventId(this.getFormDefinitionEventId()))
                {
                    ((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e).setEventReadOnly(true);
                    eL.add((FormPageDefinitionEvent)e);
                }
                return (readOnlyFormPageDefinitionEvents = eL);
            }
        }

        public void setFormPageDefinitionEvents(Iterable<FormPageDefinitionEvent> es)
        {
            if (es != null)
            {
                for (FormPageDefinitionEvent e : es)
                {
                    addFormPageDefinitionEvent(e);
                }
            }
            else { this.formPageDefinitionEvents.clear(); }
        }
        
        public void addFormPageDefinitionEvent(FormPageDefinitionEvent e)
        {
            throwOnInconsistentEventIds((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e);
            this.formPageDefinitionEvents.put(((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e).getFormPageDefinitionEventId(), e);
        }

        public void save()
        {
            for (FormPageDefinitionEvent e : this.getFormPageDefinitionEvents()) {
                getFormPageDefinitionEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractFormDefinitionStateDeleted extends AbstractFormDefinitionStateEvent implements FormDefinitionEvent.FormDefinitionStateDeleted, Saveable
    {
        public AbstractFormDefinitionStateDeleted() {
            this(new FormDefinitionEventId());
        }

        public AbstractFormDefinitionStateDeleted(FormDefinitionEventId eventId) {
            super(eventId);
        }

        public String getEventClass() {
            return StateEventType.DELETED;
        }

        
        private Map<FormPageDefinitionEventId, FormPageDefinitionEvent.FormPageDefinitionStateRemoved> formPageDefinitionEvents = new HashMap<FormPageDefinitionEventId, FormPageDefinitionEvent.FormPageDefinitionStateRemoved>();
        
        private Iterable<FormPageDefinitionEvent.FormPageDefinitionStateRemoved> readOnlyFormPageDefinitionEvents;

        public Iterable<FormPageDefinitionEvent.FormPageDefinitionStateRemoved> getFormPageDefinitionEvents()
        {
            if (!getEventReadOnly())
            {
                return this.formPageDefinitionEvents.values();
            }
            else
            {
                if (readOnlyFormPageDefinitionEvents != null) { return readOnlyFormPageDefinitionEvents; }
                FormPageDefinitionEventDao eventDao = getFormPageDefinitionEventDao();
                List<FormPageDefinitionEvent.FormPageDefinitionStateRemoved> eL = new ArrayList<FormPageDefinitionEvent.FormPageDefinitionStateRemoved>();
                for (FormPageDefinitionEvent e : eventDao.findByFormDefinitionEventId(this.getFormDefinitionEventId()))
                {
                    ((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e).setEventReadOnly(true);
                    eL.add((FormPageDefinitionEvent.FormPageDefinitionStateRemoved)e);
                }
                return (readOnlyFormPageDefinitionEvents = eL);
            }
        }

        public void setFormPageDefinitionEvents(Iterable<FormPageDefinitionEvent.FormPageDefinitionStateRemoved> es)
        {
            if (es != null)
            {
                for (FormPageDefinitionEvent.FormPageDefinitionStateRemoved e : es)
                {
                    addFormPageDefinitionEvent(e);
                }
            }
            else { this.formPageDefinitionEvents.clear(); }
        }
        
        public void addFormPageDefinitionEvent(FormPageDefinitionEvent.FormPageDefinitionStateRemoved e)
        {
            throwOnInconsistentEventIds((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e);
            this.formPageDefinitionEvents.put(((FormPageDefinitionEvent.SqlFormPageDefinitionEvent)e).getFormPageDefinitionEventId(), e);
        }

        public void save()
        {
            for (FormPageDefinitionEvent.FormPageDefinitionStateRemoved e : this.getFormPageDefinitionEvents()) {
                getFormPageDefinitionEventDao().save(e);
            }
        }
    }

    public static class SimpleFormDefinitionStateCreated extends AbstractFormDefinitionStateCreated
    {
        public SimpleFormDefinitionStateCreated() {
        }

        public SimpleFormDefinitionStateCreated(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

    public static class SimpleFormDefinitionStateMergePatched extends AbstractFormDefinitionStateMergePatched
    {
        public SimpleFormDefinitionStateMergePatched() {
        }

        public SimpleFormDefinitionStateMergePatched(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

    public static class SimpleFormDefinitionStateDeleted extends AbstractFormDefinitionStateDeleted
    {
        public SimpleFormDefinitionStateDeleted() {
        }

        public SimpleFormDefinitionStateDeleted(FormDefinitionEventId eventId) {
            super(eventId);
        }
    }

}

