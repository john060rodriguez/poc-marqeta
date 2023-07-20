package com.accelerator.authorization.service;

import com.accelerator.authorization.model.Account;
import com.accelerator.authorization.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getListAccounts() {
        return accountRepository.findAll();
    }
    
}
