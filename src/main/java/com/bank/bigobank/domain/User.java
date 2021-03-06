package com.bank.bigobank.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_entity")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String name;
   private String password;
   @Temporal(TemporalType.DATE)
   private Date dob;
   private String userName;
   @Embedded
   private  Address address;
   @OneToMany(mappedBy = "user")
   private List<Account> acccounts;
}
