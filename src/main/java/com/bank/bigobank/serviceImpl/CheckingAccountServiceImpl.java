package com.bank.bigobank.serviceImpl;

import com.bank.bigobank.domain.CheckingAccount;
import com.bank.bigobank.repository.CheckingAccountRepository;
import com.bank.bigobank.service.Account;
import com.bank.bigobank.service.CheckingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckingAccountServiceImpl implements CheckingAccountService {

    @Autowired
    CheckingAccountRepository repository;

    @Override
    public Account createAccount(CheckingAccount account) {
         return (Account) repository.save(account);
    }

    @Override
    public void Delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Account update(CheckingAccount account) {
        return (Account) repository.save(account);
    }

    @Override
    public List<com.bank.bigobank.domain.Account> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<com.bank.bigobank.domain.Account> getbyid(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deposit(double amount, Long accountId) {
        getbyid(accountId).ifPresent(account -> {
            account.setAmount(account.getAmount()+amount);
        });
    }

    @Override
    public double withDraw(double amount,Long accountId) {
        final double ammount;
//       getbyid(accountId).ifPresent(account -> {
//
//             return account.getAmount();
//         });
        Optional<com.bank.bigobank.domain.Account> ac = getbyid(accountId);

        if(ac.isPresent()){
             ac.get().setAmount(ac.get().getAmount()-(amount));
           return   ac.get().getAmount();
        }


        return 0;

    }



    @Override
    public double getBalance(Long account_id) {
        return getbyid(account_id).get().getAmount();
    }
}
