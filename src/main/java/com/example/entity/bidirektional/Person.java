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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author trainer
 */
@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer persId;
    private String lastname;
    private String firstname;
    //@OneToOne(cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Addresse> adressen;

    public Person() {
        adressen=new ArrayList<>();
    }

    public Person(String firstname, String lastname) {
        this();
        this.lastname = lastname;
        this.firstname = firstname;
    }
    
    
}
