/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity.bidirektional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author trainer
 */
@Data
@Entity
public class Addresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    
  
    
    private String city;
    private String street;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person", referencedColumnName = "persId")
    private Person person;

    public Addresse() {
    }
    
    

    public Addresse(String city, String street) {
        this.city = city;
        this.street = street;
    }
    
    @Override
    public String toString(){
        return "street="+street + " " +"city="+city + "firstname="+" "+person.getFirstname() +" "+ "lastname="+person.getLastname();
    } 
    
}
