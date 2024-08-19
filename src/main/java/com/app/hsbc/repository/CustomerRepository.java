package com.app.hsbc.repository;

import com.app.hsbc.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
}
