//package com.example.model;


package com.example.demo.entity;


//import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macon
 */
@Entity
@Table(name = "employees")
public class Employee  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "last_name")
    private String lastname;
    
    @Column(name = "first_name")
    private String firstname;
    
    @Column(name = "email_id")
    private String emailid;

    public Employee() {
    }

    public Employee(String lastname, String firstname, String emailid) {
        super();
        this.lastname = lastname;
        this.firstname = firstname;
        this.emailid = emailid;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setemailid(String emailid) {
        this.emailid = emailid;
    }

    public long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getemailid() {
        return emailid;
    }
}
