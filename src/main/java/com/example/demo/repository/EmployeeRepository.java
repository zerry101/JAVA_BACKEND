/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

/**
 *
 * @author macon
 */
import com.example.demo.entity.Employee;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macon
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {

//    @Query("SELECT e FROM Employee e WHERE "
//            + "LOWER(e.name) LIKE LOWER(CONCAT('%', :query, '%')) OR "
//            + "LOWER(e.address) LIKE LOWER(CONCAT('%', :query, '%')) OR "
//            + "e.contactno LIKE CONCAT('%', :query, '%') OR "
//            + "LOWER(e.transportationmode) LIKE LOWER(CONCAT('%', :query, '%')) OR "
//            + "LOWER(e.vehiclenumber) LIKE LOWER(CONCAT('%', :query, '%')) OR "
//            + "e.dateofsupply LIKE CONCAT('%', :query, '%') OR "
//            + "LOWER(e.placeofsupply) LIKE LOWER(CONCAT('%', :query, '%')) OR "
//            + "LOWER(e.shippedto) LIKE LOWER(CONCAT('%', :query, '%')) OR "
//            + "LOWER(e.productdata) LIKE LOWER(CONCAT('%', :query, '%')) OR "
//            + "e.grandtotal LIKE CONCAT('%', :query, '%') OR "
//            + "LOWER(CONCAT(e.id, '')) LIKE LOWER(CONCAT('%', :query, '%'))")
//    List<Employee> search(@Param("query") String query);
    @Query("SELECT e FROM Employee e WHERE "
            + "LOWER(e.name) LIKE LOWER(CONCAT('%', :query, '%')) OR "
            + "LOWER(e.address) LIKE LOWER(CONCAT('%', :query, '%')) OR "
            + "e.contactno LIKE CONCAT('%', :query, '%') OR "
            + "LOWER(e.transportationmode) LIKE LOWER(CONCAT('%', :query, '%')) OR "
            + "LOWER(e.vehiclenumber) LIKE LOWER(CONCAT('%', :query, '%')) OR "
            + "e.dateofsupply LIKE CONCAT('%', STR_TO_DATE(:query, '%d/%m/%Y'), '%') OR "
            + "LOWER(e.placeofsupply) LIKE LOWER(CONCAT('%', :query, '%')) OR "
            + "LOWER(e.shippedto) LIKE LOWER(CONCAT('%', :query, '%')) OR "
            + "LOWER(e.productdata) LIKE LOWER(CONCAT('%', :query, '%')) OR "
            + "e.grandtotal LIKE CONCAT('%', :query, '%') OR "
            + "LOWER(CONCAT(e.id, '')) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<Employee> search(@Param("query") String query);

    public Optional<Employee> findBycontactno(long contactno);


    public List<Employee> findBycontactnoContaining(long contactno);


}
