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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
//interface productdata{
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

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "contactno")
    private long contactno;

    @Column(name = "transportationmode")
    private String transportationmode;

    @Column(name = "vehiclenumber")
    private String vehiclenumber;

    @Column(name = "dateofsupply",columnDefinition = "TEXT")
    private Date dateofsupply;

    @Column(name = "placeofsupply", columnDefinition = "TEXT")
    private String placeofsupply;

    @Column(name = "shippedto", columnDefinition = "TEXT")
    private String shippedto;

    @Column(name = "productdata", columnDefinition = "TEXT")
    private String productdata;

    @Column(name = "grandtotal")
    private double grandtotal;

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
    public Employee(long id, String name, String address, long contactno, String transportationmode, String vehiclenumber, Date dateofsupply, String placeofsupply, String shippedto, String productdata,double grandtotal) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactno = contactno;
        this.transportationmode = transportationmode;
        this.vehiclenumber = vehiclenumber;
        this.dateofsupply = dateofsupply;
        this.placeofsupply = placeofsupply;
        this.shippedto = shippedto;
        this.productdata = productdata;
        this.grandtotal=grandtotal;
    }

//    }
    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void settransportationmode(String transportationmode) {
        this.transportationmode = transportationmode;
    }

    public void setcontactno(long contactno) {
        this.contactno = contactno;
    }

    public void setvehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public void setdateofsupply(Date dateofsupply) {
        this.dateofsupply = dateofsupply;
    }

    public void setplaceofsupply(String placeofsupply) {
        this.placeofsupply = placeofsupply;
    }

    public void setshippedto(String shippedto) {
        this.shippedto = shippedto;
    }

    public void setProductData(String productdata) {
        this.productdata = productdata;
    }

    public String gettransportationmode() {

        return transportationmode;

    }

    public void setgrandtotal(double grandtotal) {
        this.grandtotal = grandtotal;
    }

    public double getgrandtotal() {
        return grandtotal;
    }

    public long getcontactno() {
        return contactno;
    }

    public String getvehiclenumber() {
        return vehiclenumber;
    }

    public Date getdateofsupply() {
//        Date =new SimpleDateFormat("dd/mm/yyyy").parse(DateOfSupply);
        return dateofsupply;
    }

    public String getplaceofsupply() {
        return placeofsupply;
    }

    public String getshippedto() {
        return shippedto;
    }

    public String getProductData() {
        return productdata;
    }

    public void setid(long id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//    public void setemailid(String emailid) {  
//        this.emailid = emailid;
//    }
    public long getid() {
        return id;
    }

    public String getname() {
        return name;
    }

//    public String getFirstname() {
//        return firstname;
//    }
//    public String getemailid() {
//        return emailid;
//    }

    public void setid(String searchParam) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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

