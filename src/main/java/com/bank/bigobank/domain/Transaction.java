package com.bank.bigobank.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    LocalDate tansactionDate;
    private String type;
    private double  ammount;
    private double balance;
    @ManyToOne()
    private Account account;

}
