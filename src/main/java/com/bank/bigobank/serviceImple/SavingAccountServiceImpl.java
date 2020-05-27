package com.bank.bigobank.serviceImple;

import com.bank.bigobank.repository.SavingAccountRepository;
import com.bank.bigobank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class SavingAccountServiceImpl  implements SavingAccountService {
    @Autowired
    public SavingAccountRepository savingAccountRepository;


    public void deposit(double amount) {

    }

    @Override
    public void deposit(double amount, Long accountId) {

    }

    @Override
    public double withDraw(double amount) {
        return 0;
    }

    @Override
    public void getBalance(double amount) {

    }
}
