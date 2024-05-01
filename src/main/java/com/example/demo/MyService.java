/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;


import com.example.entity.bidirektional.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author trainer
 */
@Service
public class MyService {
    
   @Bean
    public Person initPerson(){
        return new Person("Hans","Mustermann");
    }
    
}
