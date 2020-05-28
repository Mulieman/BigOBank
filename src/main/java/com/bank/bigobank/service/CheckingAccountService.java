package com.bank.bigobank.service;

import com.bank.bigobank.domain.CheckingAccount;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CheckingAccountService extends Account{

    public Account createAccount(CheckingAccount account);
    public void Delete(Long id);
    public Account update(CheckingAccount account);
    public List<com.bank.bigobank.domain.Account> getAll();
    public Optional<com.bank.bigobank.domain.Account> getbyid(Long id);


}
