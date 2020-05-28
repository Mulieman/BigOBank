package com.bank.bigobank.serviceImpl;

import com.bank.bigobank.domain.Account;
import com.bank.bigobank.domain.Transaction;

import java.util.List;


public interface TransactionService {

    List<Transaction> getTransactions(int acc_id);
    void saveTransaction(String type, Account acc, double amount, double balance);

}
