package org.test.aptosformsdemo.aptos.contract.repository;

import org.test.aptosformsdemo.aptos.contract.AptosAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AptosAccountRepository extends JpaRepository<AptosAccount, String> {
    
}
