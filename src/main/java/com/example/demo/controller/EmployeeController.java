/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

/**
 *
 * @author macon
 */
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author macon
 */
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController  {

//    System.OutOfMemoryError.println("")
    @Autowired
    private EmployeeRepository employeeRepository;

//    get all Employees
    /**
     *
     * @param pageable
     * @return
     */
    @GetMapping("/employees")
    public Page<Employee> employeesPageable(@RequestParam(value = "pageNumber",defaultValue = "1",required = false) Integer pageNumber,
           @RequestParam(value = "pageSize",defaultValue = "10",required = false) Integer pageSize   ) {
        
        Pageable pageable=PageRequest.of(pageNumber, pageSize);
//        Page<Employee> pagedResult= employeeRepository.findAll(pageable);
        return  employeeRepository.findAll(pageable);
    
    }
    
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

}
