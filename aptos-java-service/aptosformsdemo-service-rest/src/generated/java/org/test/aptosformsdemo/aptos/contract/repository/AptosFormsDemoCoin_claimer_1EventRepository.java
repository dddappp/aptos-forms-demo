// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract.repository;

import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface AptosFormsDemoCoin_claimer_1EventRepository extends JpaRepository<AbstractAptosFormsDemoCoin_claimer_1Event, AptosFormsDemoCoin_claimer_1EventId> {

    AbstractAptosFormsDemoCoin_claimer_1Event findFirstByEventStatusIsNull();

    List<AbstractAptosFormsDemoCoin_claimer_1Event> findByEventStatusIsNull();

    AbstractAptosFormsDemoCoin_claimer_1Event.AptosFormsDemoCoin_claimer_1_Claimed findFirstAptosFormsDemoCoin_claimer_1_ClaimedByOrderByAptosEventSequenceNumber();

}
