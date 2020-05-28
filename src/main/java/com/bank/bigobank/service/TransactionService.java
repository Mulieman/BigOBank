package com.bank.bigobank.service;

import com.bank.bigobank.domain.Account;
import com.bank.bigobank.domain.Transaction;

import java.util.List;


public interface TransactionService {

    List<Transaction> getTransactions(Long acc_id);
    void saveTransaction(String type, Account acc, double amount, double balance);

}
