package com.accelerator.authorization.controller;

import com.accelerator.authorization.model.Account;
import com.accelerator.authorization.repository.AccountRepository;
import com.accelerator.authorization.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authorization")
public class AuthorizationController {

    private AccountService accountService;

    public AuthorizationController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public ResponseEntity<?> getAccounts() {
        return ResponseEntity.ok(accountService.getListAccounts());
    }
}
