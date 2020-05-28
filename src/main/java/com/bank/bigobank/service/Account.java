package com.bank.bigobank.service;

public interface Account {
    public  void deposit( double amount,Long accountId);
    public  double withDraw( double amount,Long accountId);
    public  double getBalance( Long account_id);
}
