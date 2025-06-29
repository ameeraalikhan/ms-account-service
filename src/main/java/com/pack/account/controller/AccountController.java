package com.pack.account.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.account.entity.Account;
//AccountController
@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    private List<Account> accounts = new ArrayList<>();
    
    public AccountController() {
        // Initialize with dummy data
        accounts.add(new Account("A1001", "C1001", "Savings", "BR1001"));
        accounts.add(new Account("A1002", "C1002", "Current", "BR1002"));
        accounts.add(new Account("A1003", "C1003", "Savings", "BR1001"));
    }
    
    @GetMapping
    public List<Account> getAllAccounts() {
        return accounts;
    }
    
    @GetMapping("/{accountId}")
    public Account getAccountById(@PathVariable String accountId) {
        return accounts.stream()
                .filter(account -> account.getAccountId().equals(accountId))
                .findFirst()
                .orElse(null);
    }
    
    
    
}
