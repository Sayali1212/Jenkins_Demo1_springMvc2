package com.example.spring_mvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringMvc2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringMvc2Application.class, args);
        System.out.println("Hello");
    }

}
