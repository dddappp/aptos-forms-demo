// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.hibernate;

import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.hibernate.Session;
import org.hibernate.Criteria;
//import org.hibernate.criterion.Order;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.SessionFactory;
import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.specialization.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateAptosFormsDemoCoin_claimer_1StateRepository implements AptosFormsDemoCoin_claimer_1StateRepository {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    private static final Set<String> readOnlyPropertyPascalCaseNames = new HashSet<String>(Arrays.asList("FormPageAndSignerAddress", "Version", "OffChainVersion", "CreatedBy", "CreatedAt", "UpdatedBy", "UpdatedAt", "Active", "Deleted"));
    
    private ReadOnlyProxyGenerator readOnlyProxyGenerator;
    
    public ReadOnlyProxyGenerator getReadOnlyProxyGenerator() {
        return readOnlyProxyGenerator;
    }

    public void setReadOnlyProxyGenerator(ReadOnlyProxyGenerator readOnlyProxyGenerator) {
        this.readOnlyProxyGenerator = readOnlyProxyGenerator;
    }

    @Transactional(readOnly = true)
    public AptosFormsDemoCoin_claimer_1State get(FormPageAndAddress id, boolean nullAllowed) {
        AptosFormsDemoCoin_claimer_1State.SqlAptosFormsDemoCoin_claimer_1State state = (AptosFormsDemoCoin_claimer_1State.SqlAptosFormsDemoCoin_claimer_1State)getCurrentSession().get(AbstractAptosFormsDemoCoin_claimer_1State.SimpleAptosFormsDemoCoin_claimer_1State.class, id);
        if (!nullAllowed && state == null) {
            state = new AbstractAptosFormsDemoCoin_claimer_1State.SimpleAptosFormsDemoCoin_claimer_1State();
            state.setFormPageAndSignerAddress(id);
        }
        if (getReadOnlyProxyGenerator() != null && state != null) {
            return (AptosFormsDemoCoin_claimer_1State) getReadOnlyProxyGenerator().createProxy(state, new Class[]{AptosFormsDemoCoin_claimer_1State.SqlAptosFormsDemoCoin_claimer_1State.class}, "getStateReadOnly", readOnlyPropertyPascalCaseNames);
        }
        return state;
    }

    public void save(AptosFormsDemoCoin_claimer_1State state) {
        AptosFormsDemoCoin_claimer_1State s = state;
        if (getReadOnlyProxyGenerator() != null) {
            s = (AptosFormsDemoCoin_claimer_1State) getReadOnlyProxyGenerator().getTarget(state);
        }
        if(s.getOffChainVersion() == null) {
            getCurrentSession().save(s);
        } else {
            getCurrentSession().update(s);
        }

        if (s instanceof Saveable)
        {
            Saveable saveable = (Saveable) s;
            saveable.save();
        }
        getCurrentSession().flush();
    }

    public void merge(AptosFormsDemoCoin_claimer_1State detached) {
        AptosFormsDemoCoin_claimer_1State persistent = getCurrentSession().get(AbstractAptosFormsDemoCoin_claimer_1State.SimpleAptosFormsDemoCoin_claimer_1State.class, detached.getFormPageAndSignerAddress());
        if (persistent != null) {
            merge(persistent, detached);
            getCurrentSession().save(persistent);
        } else {
            getCurrentSession().save(detached);
        }
        getCurrentSession().flush();
    }

    private void merge(AptosFormsDemoCoin_claimer_1State persistent, AptosFormsDemoCoin_claimer_1State detached) {
        ((AbstractAptosFormsDemoCoin_claimer_1State) persistent).merge(detached);
    }

}

