package com.app.hsbc.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="customer_id ")
    private Customers customers;

    @Column(columnDefinition = "ENUM('SAVINGS','SALARY','CURRENT','FIXEDDEPOSIT')")
    @Enumerated(EnumType.STRING)


    private AccountType accountType;
    private double balance;
}
