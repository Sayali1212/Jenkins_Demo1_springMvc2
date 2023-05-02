package com.example.spring_mvc2.model;

import jakarta.persistence.*;

@Table(name = "customer1")
@Entity
public class Customer1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int custID;
    String custName;
    String city;
    Long phone;
    String email;

    public Customer1() {
    }

    public Customer1(int custID, String custName, String city, Long phone, String email) {
        this.custID = custID;
        this.custName = custName;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer1{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
