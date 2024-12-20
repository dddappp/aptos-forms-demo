// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition.hibernate;

import java.util.*;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.SessionFactory;
import org.test.aptosformsdemo.domain.formdefinition.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.specialization.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateFormDefinitionStateQueryRepository implements FormDefinitionStateQueryRepository {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    private static final Set<String> readOnlyPropertyPascalCaseNames = new HashSet<String>(Arrays.asList("FormSequenceId", "FormId", "ContractAddress", "StoreAccountAddress", "PageDefinitions", "OffChainVersion", "CreatedBy", "CreatedAt", "UpdatedBy", "UpdatedAt", "Active", "Deleted"));

    private ReadOnlyProxyGenerator readOnlyProxyGenerator;

    public ReadOnlyProxyGenerator getReadOnlyProxyGenerator() {
        return readOnlyProxyGenerator;
    }

    public void setReadOnlyProxyGenerator(ReadOnlyProxyGenerator readOnlyProxyGenerator) {
        this.readOnlyProxyGenerator = readOnlyProxyGenerator;
    }

    @Transactional(readOnly = true)
    public FormDefinitionState get(Long id) {

        FormDefinitionState state = (FormDefinitionState)getCurrentSession().get(AbstractFormDefinitionState.SimpleFormDefinitionState.class, id);
        if (getReadOnlyProxyGenerator() != null && state != null) {
            return (FormDefinitionState) getReadOnlyProxyGenerator().createProxy(state, new Class[]{FormDefinitionState.SqlFormDefinitionState.class, Saveable.class}, "getStateReadOnly", readOnlyPropertyPascalCaseNames);
        }
        return state;
    }

    @Transactional(readOnly = true)
    public Iterable<FormDefinitionState> getAll(Integer firstResult, Integer maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(FormDefinitionState.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        if (firstResult != null) { criteria.setFirstResult(firstResult); }
        if (maxResults != null) { criteria.setMaxResults(maxResults); }
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<FormDefinitionState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(FormDefinitionState.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<FormDefinitionState> get(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(FormDefinitionState.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public FormDefinitionState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders) {
        List<FormDefinitionState> list = (List<FormDefinitionState>)get(filter, orders, 0, 1);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    @Transactional(readOnly = true)
    public FormDefinitionState getFirst(Map.Entry<String, Object> keyValue, List<String> orders) {
        List<Map.Entry<String, Object>> filter = new ArrayList<>();
        filter.add(keyValue);
        return getFirst(filter, orders);
    }

    @Transactional(readOnly = true)
    public Iterable<FormDefinitionState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        Map.Entry<String, Object> keyValue = new java.util.AbstractMap.SimpleEntry<String, Object> (propertyName, propertyValue);
        List<Map.Entry<String, Object>> filter = new ArrayList<Map.Entry<String, Object>>();
        filter.add(keyValue);
        return get(filter, orders, firstResult, maxResults);
    }

    @Transactional(readOnly = true)
    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        Criteria criteria = getCurrentSession().createCriteria(FormDefinitionState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null) {
            HibernateUtils.criteriaAddFilter(criteria, filter);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }

    @Transactional(readOnly = true)
    public long getCount(org.dddml.support.criterion.Criterion filter) {
        Criteria criteria = getCurrentSession().createCriteria(FormDefinitionState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null)
        {
            org.hibernate.criterion.Criterion hc = CriterionUtils.toHibernateCriterion(filter);
            criteria.add(hc);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }

    @Transactional(readOnly = true)
    public FormPageDefinitionState getFormPageDefinition(Long formDefinitionFormSequenceId, Integer pageNumber) {
        FormDefinitionFormPageDefinitionId entityId = new FormDefinitionFormPageDefinitionId(formDefinitionFormSequenceId, pageNumber);
        return (FormPageDefinitionState) getCurrentSession().get(AbstractFormPageDefinitionState.SimpleFormPageDefinitionState.class, entityId);
    }

    @Transactional(readOnly = true)
    public Iterable<FormPageDefinitionState> getFormPageDefinitions(Long formDefinitionFormSequenceId, org.dddml.support.criterion.Criterion filter, List<String> orders) {
        Criteria criteria = getCurrentSession().createCriteria(AbstractFormPageDefinitionState.SimpleFormPageDefinitionState.class);
        org.hibernate.criterion.Junction partIdCondition = org.hibernate.criterion.Restrictions.conjunction()
            .add(org.hibernate.criterion.Restrictions.eq("formDefinitionFormPageDefinitionId.formDefinitionFormSequenceId", formDefinitionFormSequenceId))
            ;
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, 0, Integer.MAX_VALUE);
        return criteria.add(partIdCondition).list();
    }


    protected static void addNotDeletedRestriction(Criteria criteria) {
        criteria.add(org.hibernate.criterion.Restrictions.or(
                org.hibernate.criterion.Restrictions.isNull("deleted"),
                org.hibernate.criterion.Restrictions.eq("deleted", false)
        ));
    }

}

