package com.bank.bigobank.repository;

import com.bank.bigobank.domain.Account;
import com.bank.bigobank.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    List<Transaction> findByAccount(Account acc);


}
