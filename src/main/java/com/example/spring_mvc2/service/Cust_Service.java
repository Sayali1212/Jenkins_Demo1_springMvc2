package com.example.spring_mvc2.service;

import com.example.spring_mvc2.model.Customer1;

import java.util.List;

public interface Cust_Service {
    public List<Customer1> getAll();
    Customer1 save (Customer1 customer1);
    Customer1 getCustomerById(int id);
    void deleteCustomer(int id);
    Customer1 updateCustomer(Customer1 customer);
}
