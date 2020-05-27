package com.bank.bigobank.serviceImple;

import com.bank.bigobank.domain.CheckingAccount;
import com.bank.bigobank.repository.CheckingAccountRepository;
import com.bank.bigobank.service.CheckingAccountService;
import lombok.Synchronized;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CheckingAccountServiceImpl implements CheckingAccountService {
    @Autowired
    public CheckingAccountRepository checkingAccountRepository;

    @Override
    public void deposit(double amount,Long accountId) {
        Optional<CheckingAccount> c = checkingAccountRepository.findById(accountId);
if(c.isPresent()){
    double amountt =c.get().getAmount();
    c.get().setAmount(amount+amountt);
}

    }

    @Override
    public double withDraw(double amount) {
        return 0;
    }

    @Override
    public void getBalance(double amount) {

    }
}
