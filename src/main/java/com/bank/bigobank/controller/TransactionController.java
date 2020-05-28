package com.bank.bigobank.controller;

import com.bank.bigobank.domain.Transaction;
import com.bank.bigobank.serviceImpl.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController
{
    @Autowired
    TransactionService transactionService;

    @PostMapping("/gettransactions")
    public List<Transaction> getTransactions(@RequestParam int acc_id)
    {
        return transactionService.getTransactions(acc_id);
    }





}
