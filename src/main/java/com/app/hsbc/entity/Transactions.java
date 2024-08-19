package com.app.hsbc.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_number")
    private Accounts account;


    @Column(columnDefinition = "ENUM('DEPOSIT','WITHDRAWAL')")
    @Enumerated(value = EnumType.STRING)
    private TransactionType transactionType;

    private Double  amount;

    private Date transactionDate ;

}
