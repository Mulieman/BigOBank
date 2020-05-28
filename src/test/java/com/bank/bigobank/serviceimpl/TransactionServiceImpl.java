package com.bank.bigobank.serviceimpl;

import com.bank.bigobank.domain.Account;
import com.bank.bigobank.domain.Transaction;
import com.bank.bigobank.repository.TransactionRepository;
import com.bank.bigobank.serviceImpl.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;


    @Override
    public List<Transaction> getTransactions(int acc_id) {
        return transactionRepository.findByAccount(acc_id);
    }

    @Override
    public void saveTransaction(String type, Account acc, double amount, double balance) {
        Transaction t = new Transaction();
        t.setAccount(acc);
        t.setAmmount(amount);
        t.setBalance(balance);
        t.setType(type);
        t.setTansactionDate(LocalDate.now());
        transactionRepository.save(t);

    }
}
