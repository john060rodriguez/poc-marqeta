package com.accelerator.authorization.repository;

import com.accelerator.authorization.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
