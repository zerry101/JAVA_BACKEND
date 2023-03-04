/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

/**
 *
 * @author macon
 */
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author macon
 */
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    
    private EmployeeRepository employeeRepository;
    
//    get all Employees

    /**
     *
     * @return
     */
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
        
    }
    
//    @Autowired
//    private EmployeeRepository employeeRepository;
    
}
