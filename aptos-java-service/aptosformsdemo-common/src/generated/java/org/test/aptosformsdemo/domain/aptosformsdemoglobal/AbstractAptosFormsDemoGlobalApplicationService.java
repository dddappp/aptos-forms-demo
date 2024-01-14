// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import java.math.BigInteger;
import org.test.aptosformsdemo.specialization.*;

public abstract class AbstractAptosFormsDemoGlobalApplicationService implements AptosFormsDemoGlobalApplicationService {

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AptosFormsDemoGlobalStateRepository stateRepository;

    protected AptosFormsDemoGlobalStateRepository getStateRepository() {
        return stateRepository;
    }

    private AptosFormsDemoGlobalStateQueryRepository stateQueryRepository;

    protected AptosFormsDemoGlobalStateQueryRepository getStateQueryRepository() {
        return stateQueryRepository;
    }

    private AggregateEventListener<AptosFormsDemoGlobalAggregate, AptosFormsDemoGlobalState> aggregateEventListener;

    public AggregateEventListener<AptosFormsDemoGlobalAggregate, AptosFormsDemoGlobalState> getAggregateEventListener() {
        return aggregateEventListener;
    }

    public void setAggregateEventListener(AggregateEventListener<AptosFormsDemoGlobalAggregate, AptosFormsDemoGlobalState> eventListener) {
        this.aggregateEventListener = eventListener;
    }

    public AbstractAptosFormsDemoGlobalApplicationService(EventStore eventStore, AptosFormsDemoGlobalStateRepository stateRepository, AptosFormsDemoGlobalStateQueryRepository stateQueryRepository) {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
        this.stateQueryRepository = stateQueryRepository;
    }

    public void when(AptosFormsDemoGlobalCommands.AdminWithdrawPayment_123_Vault c) {
        update(c, ar -> ar.adminWithdrawPayment_123_Vault(c.getAmount(), c.getOffChainVersion(), c.getCommandId(), c.getRequesterId(), c));
    }

    public void when(AptosFormsDemoGlobalCommands.DepositCoin_claimer_1_Vault c) {
        update(c, ar -> ar.depositCoin_claimer_1_Vault(c.getAmount(), c.getOffChainVersion(), c.getCommandId(), c.getRequesterId(), c));
    }

    public void when(AptosFormsDemoGlobalCommands.AdminWithdrawCoin_claimer_1_Vault c) {
        update(c, ar -> ar.adminWithdrawCoin_claimer_1_Vault(c.getAmount(), c.getOffChainVersion(), c.getCommandId(), c.getRequesterId(), c));
    }

    public AptosFormsDemoGlobalState get(FormAndAddress id) {
        AptosFormsDemoGlobalState state = getStateRepository().get(id, true);
        return state;
    }

    public Iterable<AptosFormsDemoGlobalState> getAll(Integer firstResult, Integer maxResults) {
        return getStateQueryRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AptosFormsDemoGlobalState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateQueryRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AptosFormsDemoGlobalState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateQueryRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AptosFormsDemoGlobalState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateQueryRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateQueryRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateQueryRepository().getCount(filter);
    }

    public AptosFormsDemoGlobalEvent getEvent(FormAndAddress formAndAccountAddress, long version) {
        AptosFormsDemoGlobalEvent e = (AptosFormsDemoGlobalEvent)getEventStore().getEvent(toEventStoreAggregateId(formAndAccountAddress), version);
        if (e != null) {
            ((AptosFormsDemoGlobalEvent.SqlAptosFormsDemoGlobalEvent)e).setEventReadOnly(true); 
        } else if (version == -1) {
            return getEvent(formAndAccountAddress, 0);
        }
        return e;
    }

    public AptosFormsDemoGlobalState getHistoryState(FormAndAddress formAndAccountAddress, long version) {
        EventStream eventStream = getEventStore().loadEventStream(AbstractAptosFormsDemoGlobalEvent.class, toEventStoreAggregateId(formAndAccountAddress), version - 1);
        return new AbstractAptosFormsDemoGlobalState.SimpleAptosFormsDemoGlobalState(eventStream.getEvents());
    }


    public AptosFormsDemoGlobalAggregate getAptosFormsDemoGlobalAggregate(AptosFormsDemoGlobalState state) {
        return new AbstractAptosFormsDemoGlobalAggregate.SimpleAptosFormsDemoGlobalAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(FormAndAddress aggregateId) {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AptosFormsDemoGlobalCommand c, Consumer<AptosFormsDemoGlobalAggregate> action) {
        FormAndAddress aggregateId = c.getFormAndAccountAddress();
        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);
        AptosFormsDemoGlobalState state = getStateRepository().get(aggregateId, false);
        boolean duplicate = isDuplicateCommand(c, eventStoreAggregateId, state);
        if (duplicate) { return; }

        AptosFormsDemoGlobalAggregate aggregate = getAptosFormsDemoGlobalAggregate(state);
        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        persist(eventStoreAggregateId, c.getOffChainVersion() == null ? AptosFormsDemoGlobalState.VERSION_NULL : c.getOffChainVersion(), aggregate, state); // State version may be null!

    }

    private void persist(EventStoreAggregateId eventStoreAggregateId, long version, AptosFormsDemoGlobalAggregate aggregate, AptosFormsDemoGlobalState state) {
        getEventStore().appendEvents(eventStoreAggregateId, version, 
            aggregate.getChanges(), (events) -> { 
                getStateRepository().save(state); 
            });
        if (aggregateEventListener != null) {
            aggregateEventListener.eventAppended(new AggregateEvent<>(aggregate, state, aggregate.getChanges()));
        }
    }

    protected boolean isDuplicateCommand(AptosFormsDemoGlobalCommand command, EventStoreAggregateId eventStoreAggregateId, AptosFormsDemoGlobalState state) {
        boolean duplicate = false;
        if (command.getOffChainVersion() == null) { command.setOffChainVersion(AptosFormsDemoGlobalState.VERSION_NULL); }
        if (state.getOffChainVersion() != null && state.getOffChainVersion() > command.getOffChainVersion()) {
            Event lastEvent = getEventStore().getEvent(AbstractAptosFormsDemoGlobalEvent.class, eventStoreAggregateId, command.getOffChainVersion());
            if (lastEvent != null && lastEvent instanceof AbstractEvent
               && command.getCommandId() != null && command.getCommandId().equals(((AbstractEvent) lastEvent).getCommandId())) {
                duplicate = true;
            }
        }
        return duplicate;
    }

    public static class SimpleAptosFormsDemoGlobalApplicationService extends AbstractAptosFormsDemoGlobalApplicationService {
        public SimpleAptosFormsDemoGlobalApplicationService(EventStore eventStore, AptosFormsDemoGlobalStateRepository stateRepository, AptosFormsDemoGlobalStateQueryRepository stateQueryRepository)
        {
            super(eventStore, stateRepository, stateQueryRepository);
        }
    }

}

