package com.bank.bigobank.repository;

import com.bank.bigobank.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    List<Transaction> findByAccount(int acc_id);


}
