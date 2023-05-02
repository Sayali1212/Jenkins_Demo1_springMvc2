package com.example.spring_mvc2.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before(value = "execution( * com.example.spring_mvc2.service.CustomerServiceImpl.getAll())")
    public void doBefore() {
        // login code
        System.out.println("Login Successful!!!");

    }

    @After(value = "execution( * com.example.spring_mvc2.service.CustomerServiceImpl.getAll())")
    public void doAfter() {
        // login code
        System.out.println("Logout Successful!!!");
    }

}
/*
        'Advice' : is a 'Action' taken by 'Aspect_class'
        @ particular 'JoinPoint'
     */
