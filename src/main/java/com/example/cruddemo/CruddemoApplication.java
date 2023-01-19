package com.example.cruddemo;

import com.example.cruddemo.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication()
public class CruddemoApplication {

    public static void main(String[] args) {

       // Employee employee = new Employee();
        SpringApplication.run(CruddemoApplication.class, args);
    }

}
