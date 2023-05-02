package com.example.spring_mvc2.service;

import com.example.spring_mvc2.model.Customer1;
import com.example.spring_mvc2.repository.Cust_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

@Service
public class CustomerServiceImpl implements Cust_Service {

    @Autowired
    Cust_Repo custRepo;

    @Override
    public List<Customer1> getAll() {
        System.out.println("Executing after Login!!");
        return custRepo.findAll();

    }

    @Override
    public Customer1 save(Customer1 customer1) {
        return custRepo.save(customer1);
    }

    @Override
    public Customer1 getCustomerById(int id) {
        return custRepo.findById(id).orElse(null);
    }
    @Override
    public void deleteCustomer(int id) {
        custRepo.deleteById(id);
    }

    @Override
    public Customer1 updateCustomer(Customer1 customer) {
        return custRepo.save(customer);
    }


}
