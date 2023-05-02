package com.example.spring_mvc2.controller;


import com.example.spring_mvc2.model.Customer1;
import com.example.spring_mvc2.service.Cust_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    Cust_Service custService;
    //http://localhost:8081/test
    @GetMapping("/test")
    public String test()
    {
        return "Inside cust controller";
    }

    //http://localhost:8081/getcust
    @GetMapping("/getcust")
    List<Customer1> getCust(){
        return custService.getAll();
    }

    //http://localhost:8081/addcust
    @PostMapping("/addcust")
    Customer1 addCust(@RequestBody Customer1 customer1)
    {
        System.out.println(customer1);
        return custService.save(customer1);
    }

    //http://localhost:8081/getbyid/1
    @GetMapping("getbyid/{id}")
    public Customer1 getCustomerById(@PathVariable int id) {
        return custService.getCustomerById(id);
    }

    //http://localhost:8081/delbyid/1
    @DeleteMapping("delbyid/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable int id) {
        Customer1 existingCustomer = custService.getCustomerById(id);
        if (existingCustomer == null) {
            throw new ResourceNotFoundException("Customer with id " + id + " not found.");
        }
        custService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }


    //http://localhost:8081/updatecust/1
    @PutMapping("updatecust/{id}")
    public Customer1 updateCust(@PathVariable int id, @RequestBody Customer1 customer) {
        Customer1 existingCustomer = custService.getCustomerById(id);
        if (existingCustomer == null) {
            throw new ResourceNotFoundException("Customer with id " + id + " not found.");
        }
        existingCustomer.setCustName(customer.getCustName());
        existingCustomer.setCity(customer.getCity());
        existingCustomer.setPhone(customer.getPhone());
        existingCustomer.setEmail(customer.getEmail());
        return custService.updateCustomer(existingCustomer);
    }
    /*
    ResponseEntity is a class in Spring Framework's that represents the entire HTTP response,
    including the status code, headers, and body.
    It's commonly used in web applications to customize the response that's sent back to the client.
    In the context of JPA and Spring Data JPA, ResponseEntity can be used to customize the response
    returned by the server when performing CRUD operations on a database.
     */
}

