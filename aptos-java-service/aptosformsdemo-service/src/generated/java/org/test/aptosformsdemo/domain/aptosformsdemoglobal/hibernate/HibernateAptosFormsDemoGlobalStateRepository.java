// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal.hibernate;

import java.util.*;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import java.math.BigInteger;
import org.hibernate.Session;
import org.hibernate.Criteria;
//import org.hibernate.criterion.Order;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.SessionFactory;
import org.test.aptosformsdemo.domain.aptosformsdemoglobal.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.specialization.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateAptosFormsDemoGlobalStateRepository implements AptosFormsDemoGlobalStateRepository {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    private static final Set<String> readOnlyPropertyPascalCaseNames = new HashSet<String>(Arrays.asList("FormPageAndAccountAddress", "Payment_123_Vault", "OffChainVersion", "CreatedBy", "CreatedAt", "UpdatedBy", "UpdatedAt", "Active", "Deleted", "Version"));
    
    private ReadOnlyProxyGenerator readOnlyProxyGenerator;
    
    public ReadOnlyProxyGenerator getReadOnlyProxyGenerator() {
        return readOnlyProxyGenerator;
    }

    public void setReadOnlyProxyGenerator(ReadOnlyProxyGenerator readOnlyProxyGenerator) {
        this.readOnlyProxyGenerator = readOnlyProxyGenerator;
    }

    @Transactional(readOnly = true)
    public AptosFormsDemoGlobalState get(FormPageAndAddress id, boolean nullAllowed) {
        AptosFormsDemoGlobalState.SqlAptosFormsDemoGlobalState state = (AptosFormsDemoGlobalState.SqlAptosFormsDemoGlobalState)getCurrentSession().get(AbstractAptosFormsDemoGlobalState.SimpleAptosFormsDemoGlobalState.class, id);
        if (!nullAllowed && state == null) {
            state = new AbstractAptosFormsDemoGlobalState.SimpleAptosFormsDemoGlobalState();
            state.setFormPageAndAccountAddress(id);
        }
        if (getReadOnlyProxyGenerator() != null && state != null) {
            return (AptosFormsDemoGlobalState) getReadOnlyProxyGenerator().createProxy(state, new Class[]{AptosFormsDemoGlobalState.SqlAptosFormsDemoGlobalState.class}, "getStateReadOnly", readOnlyPropertyPascalCaseNames);
        }
        return state;
    }

    public void save(AptosFormsDemoGlobalState state) {
        AptosFormsDemoGlobalState s = state;
        if (getReadOnlyProxyGenerator() != null) {
            s = (AptosFormsDemoGlobalState) getReadOnlyProxyGenerator().getTarget(state);
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

    public void merge(AptosFormsDemoGlobalState detached) {
        AptosFormsDemoGlobalState persistent = getCurrentSession().get(AbstractAptosFormsDemoGlobalState.SimpleAptosFormsDemoGlobalState.class, detached.getFormPageAndAccountAddress());
        if (persistent != null) {
            merge(persistent, detached);
            getCurrentSession().merge(detached);
        } else {
            getCurrentSession().save(detached);
        }
        getCurrentSession().flush();
    }

    private void merge(AptosFormsDemoGlobalState persistent, AptosFormsDemoGlobalState detached) {
        ((AptosFormsDemoGlobalState.MutableAptosFormsDemoGlobalState) detached).setOffChainVersion(persistent.getOffChainVersion());
    }

}

