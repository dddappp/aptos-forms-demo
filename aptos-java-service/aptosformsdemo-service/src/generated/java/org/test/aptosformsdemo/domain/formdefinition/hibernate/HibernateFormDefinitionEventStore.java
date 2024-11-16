// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition.hibernate;

import java.io.Serializable;
import java.util.*;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.specialization.hibernate.AbstractHibernateEventStore;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.springframework.transaction.annotation.Transactional;
import org.test.aptosformsdemo.domain.formdefinition.*;

public class HibernateFormDefinitionEventStore extends AbstractHibernateEventStore {
    @Override
    protected Serializable getEventId(EventStoreAggregateId eventStoreAggregateId, long version)
    {
        return new FormDefinitionEventId((Long) eventStoreAggregateId.getId(), Long.valueOf(version));
    }

    @Override
    protected Class getSupportedEventType()
    {
        return AbstractFormDefinitionEvent.class;
    }

    @Transactional(readOnly = true)
    @Override
    public EventStream loadEventStream(Class eventType, EventStoreAggregateId eventStoreAggregateId, long version) {
        Class supportedEventType = AbstractFormDefinitionEvent.class;
        if (!eventType.isAssignableFrom(supportedEventType)) {
            throw new UnsupportedOperationException();
        }
        Long idObj = (Long) eventStoreAggregateId.getId();
        Criteria criteria = getCurrentSession().createCriteria(AbstractFormDefinitionEvent.class);
        criteria.add(Restrictions.eq("formDefinitionEventId.formSequenceId", idObj));
        criteria.add(Restrictions.le("formDefinitionEventId.offChainVersion", version));
        criteria.addOrder(Order.asc("formDefinitionEventId.offChainVersion"));
        List es = criteria.list();
        for (Object e : es) {
            ((AbstractFormDefinitionEvent) e).setEventReadOnly(true);
        }
        EventStream eventStream = new EventStream();
        if (es.size() > 0) {
            eventStream.setSteamVersion(((AbstractFormDefinitionEvent) es.get(es.size() - 1)).getFormDefinitionEventId().getOffChainVersion());
        } else {
        }
        eventStream.setEvents(es);
        return eventStream;
    }

}

