package com.bank.bigobank.controller;

import com.bank.bigobank.domain.Account;
import com.bank.bigobank.serviceImple.SavingAccountServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/accounts")
@RestController
public class SavingAccountController {
    private SavingAccountServiceImpl savingAccountService;
    @PostMapping
    public void createAccount(){

    }
    @GetMapping
    public List<Account> getAccounts(){
        return  null;
    }
}
