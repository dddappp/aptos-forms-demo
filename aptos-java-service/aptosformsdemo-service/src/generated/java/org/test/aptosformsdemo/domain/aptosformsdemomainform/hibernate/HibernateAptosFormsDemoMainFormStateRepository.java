// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemomainform.hibernate;

import java.util.*;
import java.math.BigInteger;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Criteria;
//import org.hibernate.criterion.Order;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.SessionFactory;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.specialization.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateAptosFormsDemoMainFormStateRepository implements AptosFormsDemoMainFormStateRepository {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    private static final Set<String> readOnlyPropertyPascalCaseNames = new HashSet<String>(Arrays.asList("SignerAddress", "Fr_5pqi", "Fr_duif", "Fr_6i34", "Fr_8xjs", "Fr_9c3f", "Fr_4ok6", "Fr_b3ub", "Fr_1z7o", "Fr_d8rw", "Fr_dy3l", "Fr_6f68", "Fr_47yy", "Fr_gh3o", "Fr_fbba", "Fr_hhzp", "Single_text1", "Version", "OffChainVersion", "CreatedBy", "CreatedAt", "UpdatedBy", "UpdatedAt", "Active", "Deleted"));
    
    private ReadOnlyProxyGenerator readOnlyProxyGenerator;
    
    public ReadOnlyProxyGenerator getReadOnlyProxyGenerator() {
        return readOnlyProxyGenerator;
    }

    public void setReadOnlyProxyGenerator(ReadOnlyProxyGenerator readOnlyProxyGenerator) {
        this.readOnlyProxyGenerator = readOnlyProxyGenerator;
    }

    @Transactional(readOnly = true)
    public AptosFormsDemoMainFormState get(String id, boolean nullAllowed) {
        AptosFormsDemoMainFormState.SqlAptosFormsDemoMainFormState state = (AptosFormsDemoMainFormState.SqlAptosFormsDemoMainFormState)getCurrentSession().get(AbstractAptosFormsDemoMainFormState.SimpleAptosFormsDemoMainFormState.class, id);
        if (!nullAllowed && state == null) {
            state = new AbstractAptosFormsDemoMainFormState.SimpleAptosFormsDemoMainFormState();
            state.setSignerAddress(id);
        }
        if (getReadOnlyProxyGenerator() != null && state != null) {
            return (AptosFormsDemoMainFormState) getReadOnlyProxyGenerator().createProxy(state, new Class[]{AptosFormsDemoMainFormState.SqlAptosFormsDemoMainFormState.class}, "getStateReadOnly", readOnlyPropertyPascalCaseNames);
        }
        return state;
    }

    public void save(AptosFormsDemoMainFormState state) {
        AptosFormsDemoMainFormState s = state;
        if (getReadOnlyProxyGenerator() != null) {
            s = (AptosFormsDemoMainFormState) getReadOnlyProxyGenerator().getTarget(state);
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

    public void merge(AptosFormsDemoMainFormState detached) {
        AptosFormsDemoMainFormState persistent = getCurrentSession().get(AbstractAptosFormsDemoMainFormState.SimpleAptosFormsDemoMainFormState.class, detached.getSignerAddress());
        if (persistent != null) {
            merge(persistent, detached);
            getCurrentSession().merge(detached);
        } else {
            getCurrentSession().save(detached);
        }
        getCurrentSession().flush();
    }

    private void merge(AptosFormsDemoMainFormState persistent, AptosFormsDemoMainFormState detached) {
        ((AptosFormsDemoMainFormState.MutableAptosFormsDemoMainFormState) detached).setOffChainVersion(persistent.getOffChainVersion());
    }

}
