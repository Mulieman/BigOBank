package com.bank.bigobank.controller;

import com.bank.bigobank.domain.Transaction;
import com.bank.bigobank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController
{
    @Autowired
    TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getTransactions(@RequestParam int acc_id)
    {
        return ResponseEntity.ok().body(transactionService.getTransactions(acc_id));
    }





}
