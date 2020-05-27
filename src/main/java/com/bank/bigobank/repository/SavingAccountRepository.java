package com.bank.bigobank.repository;

import com.bank.bigobank.domain.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingAccountRepository extends JpaRepository< SavingAccount,Long> {
}
