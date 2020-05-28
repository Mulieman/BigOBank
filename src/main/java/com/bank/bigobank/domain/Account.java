package com.bank.bigobank.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="account_type",
        discriminatorType=DiscriminatorType.STRING)
public  abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String accountNumber;
    private double amount;
    @ManyToOne()
    private User user;
    @OneToMany(mappedBy = "account")

    private List<Transaction> transactionList;


}
