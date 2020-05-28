package com.bank.bigobank.controller;

import com.bank.bigobank.domain.Account;
import com.bank.bigobank.domain.CheckingAccount;
import com.bank.bigobank.service.CheckingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class CheckingAccountController {

    @Autowired
    CheckingAccountService checkingAccountService;

    @PostMapping("/checking")
    public ResponseEntity<Account> create(@RequestBody CheckingAccount account){
        return (ResponseEntity<Account>) checkingAccountService.createAccount(account);
    }

}
