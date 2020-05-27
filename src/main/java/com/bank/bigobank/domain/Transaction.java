package com.bank.bigobank.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    LocalDate tansactionDate;
    private String type;
    private   String accountNumber;
     private double  ammount;
     private double balance;
     @ManyToOne()
     private Account account;

}
