// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.config;

import org.test.aptosformsdemo.domain.formdefinition.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.domain.formdefinition.hibernate.*;
import org.test.aptosformsdemo.domain.formidregistration.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.domain.formidregistration.hibernate.*;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.domain.aptosformsdemomainform.hibernate.*;
import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.hibernate.*;
import org.test.aptosformsdemo.domain.aptosformsdemoglobal.*;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.domain.aptosformsdemoglobal.hibernate.*;
import org.test.aptosformsdemo.specialization.AggregateEventListener;
import org.test.aptosformsdemo.specialization.EventStore;
import org.test.aptosformsdemo.specialization.IdGenerator;
import org.test.aptosformsdemo.specialization.ReadOnlyProxyGenerator;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AggregatesHibernateConfig {


    @Bean
    public FormPageDefinitionEventDao formPageDefinitionEventDao(SessionFactory hibernateSessionFactory) {
        HibernateFormPageDefinitionEventDao dao = new HibernateFormPageDefinitionEventDao();
        dao.setSessionFactory(hibernateSessionFactory);
        return dao;
    }

    @Bean
    public FormDefinitionStateRepository formDefinitionStateRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateFormDefinitionStateRepository repository = new HibernateFormDefinitionStateRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public FormDefinitionStateQueryRepository formDefinitionStateQueryRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateFormDefinitionStateQueryRepository repository = new HibernateFormDefinitionStateQueryRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public HibernateFormDefinitionEventStore formDefinitionEventStore(SessionFactory hibernateSessionFactory) {
        HibernateFormDefinitionEventStore eventStore = new HibernateFormDefinitionEventStore();
        eventStore.setSessionFactory(hibernateSessionFactory);
        return eventStore;
    }

    @Bean
    public AbstractFormDefinitionApplicationService.SimpleFormDefinitionApplicationService formDefinitionApplicationService(
            @Qualifier("formDefinitionEventStore") EventStore formDefinitionEventStore,
            FormDefinitionStateRepository formDefinitionStateRepository,
            FormDefinitionStateQueryRepository formDefinitionStateQueryRepository
    ) {
        AbstractFormDefinitionApplicationService.SimpleFormDefinitionApplicationService applicationService = new AbstractFormDefinitionApplicationService.SimpleFormDefinitionApplicationService(
                formDefinitionEventStore,
                formDefinitionStateRepository,
                formDefinitionStateQueryRepository
        );
        return applicationService;
    }



    @Bean
    public FormIdRegistrationStateRepository formIdRegistrationStateRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateFormIdRegistrationStateRepository repository = new HibernateFormIdRegistrationStateRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public FormIdRegistrationStateQueryRepository formIdRegistrationStateQueryRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateFormIdRegistrationStateQueryRepository repository = new HibernateFormIdRegistrationStateQueryRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public AbstractFormIdRegistrationApplicationService.SimpleFormIdRegistrationApplicationService formIdRegistrationApplicationService(
            FormIdRegistrationStateRepository formIdRegistrationStateRepository,
            FormIdRegistrationStateQueryRepository formIdRegistrationStateQueryRepository
    ) {
        AbstractFormIdRegistrationApplicationService.SimpleFormIdRegistrationApplicationService applicationService = new AbstractFormIdRegistrationApplicationService.SimpleFormIdRegistrationApplicationService(
                formIdRegistrationStateRepository,
                formIdRegistrationStateQueryRepository
        );
        return applicationService;
    }



    @Bean
    public AptosFormsDemoMainFormStateRepository aptosFormsDemoMainFormStateRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateAptosFormsDemoMainFormStateRepository repository = new HibernateAptosFormsDemoMainFormStateRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public AptosFormsDemoMainFormStateQueryRepository aptosFormsDemoMainFormStateQueryRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateAptosFormsDemoMainFormStateQueryRepository repository = new HibernateAptosFormsDemoMainFormStateQueryRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public HibernateAptosFormsDemoMainFormEventStore aptosFormsDemoMainFormEventStore(SessionFactory hibernateSessionFactory) {
        HibernateAptosFormsDemoMainFormEventStore eventStore = new HibernateAptosFormsDemoMainFormEventStore();
        eventStore.setSessionFactory(hibernateSessionFactory);
        return eventStore;
    }

    @Bean
    public AbstractAptosFormsDemoMainFormApplicationService.SimpleAptosFormsDemoMainFormApplicationService aptosFormsDemoMainFormApplicationService(
            @Qualifier("aptosFormsDemoMainFormEventStore") EventStore aptosFormsDemoMainFormEventStore,
            AptosFormsDemoMainFormStateRepository aptosFormsDemoMainFormStateRepository,
            AptosFormsDemoMainFormStateQueryRepository aptosFormsDemoMainFormStateQueryRepository
    ) {
        AbstractAptosFormsDemoMainFormApplicationService.SimpleAptosFormsDemoMainFormApplicationService applicationService = new AbstractAptosFormsDemoMainFormApplicationService.SimpleAptosFormsDemoMainFormApplicationService(
                aptosFormsDemoMainFormEventStore,
                aptosFormsDemoMainFormStateRepository,
                aptosFormsDemoMainFormStateQueryRepository
        );
        return applicationService;
    }



    @Bean
    public AptosFormsDemoCoin_claimer_1StateRepository aptosFormsDemoCoin_claimer_1StateRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateAptosFormsDemoCoin_claimer_1StateRepository repository = new HibernateAptosFormsDemoCoin_claimer_1StateRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public AptosFormsDemoCoin_claimer_1StateQueryRepository aptosFormsDemoCoin_claimer_1StateQueryRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateAptosFormsDemoCoin_claimer_1StateQueryRepository repository = new HibernateAptosFormsDemoCoin_claimer_1StateQueryRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public HibernateAptosFormsDemoCoin_claimer_1EventStore aptosFormsDemoCoin_claimer_1EventStore(SessionFactory hibernateSessionFactory) {
        HibernateAptosFormsDemoCoin_claimer_1EventStore eventStore = new HibernateAptosFormsDemoCoin_claimer_1EventStore();
        eventStore.setSessionFactory(hibernateSessionFactory);
        return eventStore;
    }

    @Bean
    public AbstractAptosFormsDemoCoin_claimer_1ApplicationService.SimpleAptosFormsDemoCoin_claimer_1ApplicationService aptosFormsDemoCoin_claimer_1ApplicationService(
            @Qualifier("aptosFormsDemoCoin_claimer_1EventStore") EventStore aptosFormsDemoCoin_claimer_1EventStore,
            AptosFormsDemoCoin_claimer_1StateRepository aptosFormsDemoCoin_claimer_1StateRepository,
            AptosFormsDemoCoin_claimer_1StateQueryRepository aptosFormsDemoCoin_claimer_1StateQueryRepository
    ) {
        AbstractAptosFormsDemoCoin_claimer_1ApplicationService.SimpleAptosFormsDemoCoin_claimer_1ApplicationService applicationService = new AbstractAptosFormsDemoCoin_claimer_1ApplicationService.SimpleAptosFormsDemoCoin_claimer_1ApplicationService(
                aptosFormsDemoCoin_claimer_1EventStore,
                aptosFormsDemoCoin_claimer_1StateRepository,
                aptosFormsDemoCoin_claimer_1StateQueryRepository
        );
        return applicationService;
    }



    @Bean
    public AptosFormsDemoGlobalStateRepository aptosFormsDemoGlobalStateRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateAptosFormsDemoGlobalStateRepository repository = new HibernateAptosFormsDemoGlobalStateRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public AptosFormsDemoGlobalStateQueryRepository aptosFormsDemoGlobalStateQueryRepository(
            SessionFactory hibernateSessionFactory,
            ReadOnlyProxyGenerator stateReadOnlyProxyGenerator
    ) {
        HibernateAptosFormsDemoGlobalStateQueryRepository repository = new HibernateAptosFormsDemoGlobalStateQueryRepository();
        repository.setSessionFactory(hibernateSessionFactory);
        repository.setReadOnlyProxyGenerator(stateReadOnlyProxyGenerator);
        return repository;
    }

    @Bean
    public HibernateAptosFormsDemoGlobalEventStore aptosFormsDemoGlobalEventStore(SessionFactory hibernateSessionFactory) {
        HibernateAptosFormsDemoGlobalEventStore eventStore = new HibernateAptosFormsDemoGlobalEventStore();
        eventStore.setSessionFactory(hibernateSessionFactory);
        return eventStore;
    }

    @Bean
    public AbstractAptosFormsDemoGlobalApplicationService.SimpleAptosFormsDemoGlobalApplicationService aptosFormsDemoGlobalApplicationService(
            @Qualifier("aptosFormsDemoGlobalEventStore") EventStore aptosFormsDemoGlobalEventStore,
            AptosFormsDemoGlobalStateRepository aptosFormsDemoGlobalStateRepository,
            AptosFormsDemoGlobalStateQueryRepository aptosFormsDemoGlobalStateQueryRepository
    ) {
        AbstractAptosFormsDemoGlobalApplicationService.SimpleAptosFormsDemoGlobalApplicationService applicationService = new AbstractAptosFormsDemoGlobalApplicationService.SimpleAptosFormsDemoGlobalApplicationService(
                aptosFormsDemoGlobalEventStore,
                aptosFormsDemoGlobalStateRepository,
                aptosFormsDemoGlobalStateQueryRepository
        );
        return applicationService;
    }


}
