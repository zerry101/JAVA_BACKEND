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

    @Column(name = "Name")
    private String Name;

    @Column(name = "Address", columnDefinition = "TEXT")
    private String Address;

    @Column(name = "ContactNo")
    private String ContactNo;

    @Column(name = "TransportationMode")
    private String TransportationMode;

    @Column(name = "VehicleNumber")
    private String VehicleNumber;

    @Column(name = "DateOfSupply")
    private String DateOfSupply;

    @Column(name = "PlaceOfSupply", columnDefinition = "TEXT")
    private String PlaceOfSupply;

    @Column(name = "ShippedTo", columnDefinition = "TEXT")
    private String ShippedTo;

    @Column(name = "productData", columnDefinition = "TEXT")
    private String productData;

    @Column(name = "GrandTotal")
    private String GrandTotal;

//    @Column(name = "first_name")
//    private String firstname;
//    @Column(name = "email_id")
//    private String emailid;
    public Employee() {
    }

//    public Employee(String , String firstname, String emailid) {
//        super();
//        this.name = name;
//        this.address=address;
//        this.transportantionMode=transportantionMode,
//        this.vehicleNumber=vehicleNumber,
//        
    public Employee(long id, String Name, String Address, String ContactNo, String TransportationMode, String VehicleNumber, String DateOfSupply, String PlaceOfSupply, String ShippedTo, String productData,String GrandTotal) {
        this.id = id;
        this.Name = Name;
        this.Address = Address;
        this.ContactNo = ContactNo;
        this.TransportationMode = TransportationMode;
        this.VehicleNumber = VehicleNumber;
        this.DateOfSupply = DateOfSupply;
        this.PlaceOfSupply = PlaceOfSupply;
        this.ShippedTo = ShippedTo;
        this.productData = productData;
        this.GrandTotal=GrandTotal;
    }

//    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setTransportationMode(String TransportationMode) {
        this.TransportationMode = TransportationMode;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public void setDateOfSupply(String DateOfSupply) {
        this.DateOfSupply = DateOfSupply;
    }

    public void setPlaceOfSupply(String PlaceOfSupply) {
        this.PlaceOfSupply = PlaceOfSupply;
    }

    public void setShippedTo(String ShippedTo) {
        this.ShippedTo = ShippedTo;
    }

    public void setProductData(String productData) {
        this.productData = productData;
    }

    public String getTransportationMode() {

        return TransportationMode;

    }

    public void setGrandTotal(String GrandTotal) {
        this.GrandTotal = GrandTotal;
    }

    public String getGrandTotal() {
        return GrandTotal;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public String getDateOfSupply() {
        return DateOfSupply;
    }

    public String getPlaceOfSupply() {
        return PlaceOfSupply;
    }

    public String getShippedTo() {
        return ShippedTo;
    }

    public String getProductData() {
        return productData;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
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
        return Name;
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

