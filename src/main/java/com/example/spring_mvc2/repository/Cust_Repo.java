package com.example.spring_mvc2.repository;

import com.example.spring_mvc2.model.Customer1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Cust_Repo extends JpaRepository<Customer1, Integer> {
    @Override
    public List<Customer1> findAll();
}
