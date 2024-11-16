// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform.hibernate;

import java.io.Serializable;
import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.specialization.hibernate.AbstractHibernateEventStore;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.springframework.transaction.annotation.Transactional;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.*;

public class HibernateAptosFormsDemoMainFormEventStore extends AbstractHibernateEventStore {
    @Override
    protected Serializable getEventId(EventStoreAggregateId eventStoreAggregateId, long version)
    {
        return new AptosFormsDemoMainFormEventId((FormPageAndAddress) eventStoreAggregateId.getId(), BigInteger.valueOf(version));
    }

    @Override
    protected Class getSupportedEventType()
    {
        return AbstractAptosFormsDemoMainFormEvent.class;
    }

    @Transactional(readOnly = true)
    @Override
    public EventStream loadEventStream(Class eventType, EventStoreAggregateId eventStoreAggregateId, long version) {
        Class supportedEventType = AbstractAptosFormsDemoMainFormEvent.class;
        if (!eventType.isAssignableFrom(supportedEventType)) {
            throw new UnsupportedOperationException();
        }
        FormPageAndAddress idObj = (FormPageAndAddress) eventStoreAggregateId.getId();
        Criteria criteria = getCurrentSession().createCriteria(AbstractAptosFormsDemoMainFormEvent.class);
        criteria.add(Restrictions.eq("aptosFormsDemoMainFormEventId.formPageAndSignerAddressFormSequenceId", idObj.getFormSequenceId()));
        criteria.add(Restrictions.eq("aptosFormsDemoMainFormEventId.formPageAndSignerAddressPageNumber", idObj.getPageNumber()));
        criteria.add(Restrictions.eq("aptosFormsDemoMainFormEventId.formPageAndSignerAddressAddress", idObj.getAddress()));
        criteria.add(Restrictions.le("aptosFormsDemoMainFormEventId.offChainVersion", version));
        criteria.addOrder(Order.asc("aptosFormsDemoMainFormEventId.offChainVersion"));
        List es = criteria.list();
        for (Object e : es) {
            ((AbstractAptosFormsDemoMainFormEvent) e).setEventReadOnly(true);
        }
        EventStream eventStream = new EventStream();
        if (es.size() > 0) {
            eventStream.setSteamVersion(((AbstractAptosFormsDemoMainFormEvent) es.get(es.size() - 1)).getAptosFormsDemoMainFormEventId().getVersion().longValue());
        } else {
        }
        eventStream.setEvents(es);
        return eventStream;
    }

}

