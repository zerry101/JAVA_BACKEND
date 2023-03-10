//package com.example.model;
package com.example.demo.entity;

//import java.io.Serializable;
//import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
//import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
//import jdk.jfr.Description;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author maconx`x`
 * 
 * 
 */


//interface productData{
//   String HSNString
//   String DescString
//   String
//          
//
//}


@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "transportantionMode")
    private String transportantionMode;

    @Column(name = "vehicleNumber")
    private String vehicleNumber;

    @Column(name = "dateOfSupply")
    private String dateOfSupply;

    @Column(name = "placeOfSupply")
    private String placeOfSupply;
    
    @Column(name = "shippedTo")
    private String shippedTo;
    
    @Column(name = "productData")
    private   String productData;
    
    
//    @Column(name = "first_name")
//    private String firstname;
//    @Column(name = "email_id")
//    private String emailid;
   

//    public Employee(String , String firstname, String emailid) {
//        super();
//        this.name = name;
//        this.address=address;
//        this.transportantionMode=transportantionMode,
//        this.vehicleNumber=vehicleNumber,
//        

    public Employee(long id, String name, String address, String transportantionMode, String vehicleNumber, String dateOfSupply, String placeOfSupply, String shippedTo, String productData) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.transportantionMode = transportantionMode;
        this.vehicleNumber = vehicleNumber;
        this.dateOfSupply = dateOfSupply;
        this.placeOfSupply = placeOfSupply;
        this.shippedTo = shippedTo;
        this.productData = productData;
    }

//    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTransportantionMode(String transportantionMode) {
        this.transportantionMode = transportantionMode;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setDateOfSupply(String dateOfSupply) {
        this.dateOfSupply = dateOfSupply;
    }

    public void setPlaceOfSupply(String placeOfSupply) {
        this.placeOfSupply = placeOfSupply;
    }

    public void setShippedTo(String shippedTo) {
        this.shippedTo = shippedTo;
    }
    
    public void setProductData(String productData) {
        this.productData = productData;
    }

    public String getTransportantionMode() {
        
        return transportantionMode;
        
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getDateOfSupply() {
        return dateOfSupply;
    }

    public String getPlaceOfSupply() {
        return placeOfSupply;
    }

    public String getShippedTo() {
        return shippedTo;
    }

    public  String getProductData() {
        return productData; 
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }

//    public void setemailid(String emailid) {
//        this.emailid = emailid;
//    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    

//    public String getFirstname() {
//        return firstname;
//    }
//    public String getemailid() {
//        return emailid;
//    }
}


//class productInfo{
//    public String Description;
//
//    public Number HSN;
//    
//    public  String Quantity;
//    
//    public Number Rate;
//    
//    public String Per;
//    
//    public Number  Amount; 
//
//    public productInfo(Number  Amount,String Description,Number HSN,String Quantity,Number Rate,String Per) {
//        this.Amount=Amount;
//        this.Description=Description;
//        this.HSN=HSN;
//        this.Quantity=Quantity;
//        this.Rate=Rate;
//        this.Per=Per;
//    }

    
    
     
