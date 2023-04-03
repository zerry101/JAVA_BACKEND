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
import java.util.List;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macon
 */
@Repository
public interface EmployeeRepository extends  JpaRepository<Employee, Long>{

    /**
     *
     * @param pageable
     * @return
     */
//    public List<Employee> findAllEmployees(Pageable pageable);
}
