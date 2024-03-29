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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
public class EmployeeController {

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
    public Page<Employee> employeesPageable(@RequestParam(value = "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        Sort sort = Sort.by(Sort.Direction.DESC, "dateofsupply");
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
//        Page<Employee> pagedResult= employeeRepository.findAll(pageable);
        return employeeRepository.findAll(pageable);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/search")
    public List<Employee> searchEmployees(@RequestParam String query) {
        List<Employee> results = new ArrayList<>();
//        

        if (query.matches("\\d+")) {

//            long contactno = Long.parseLong(query);
//            Optional<Employee> employee = employeeRepository.findBycontactno(contactno);
//            employee.ifPresent(results::add);
            long contactno = Long.parseLong(query);
            Optional<Employee> employee = employeeRepository.findBycontactno(contactno);
            if (employee.isPresent()) {
                results.add(employee.get());
            } else {
                results.addAll(employeeRepository.search(query));
            }

//            
        } else {
            // Search by all other fields
            results.addAll(employeeRepository.search(query));
        }

        return results;
    }

    @PutMapping("/employees/update/{employeeId}")
    public Optional<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable("employeeId") long employeeId) {

        return employeeRepository.findById(employeeId).map(target -> {
            target.setid(employee.getid());
            target.setname(employee.getname());
            target.setProductData(employee.getProductData());
            target.setaddress(employee.getaddress());
            target.setcontactno(employee.getcontactno());
            target.setdateofsupply(employee.getdateofsupply());
            target.setshippedto(employee.getshippedto());
            target.setplaceofsupply(employee.getplaceofsupply());
            target.settransportationmode(employee.gettransportationmode());
            target.setvehiclenumber(employee.getvehiclenumber());
            target.setgrandtotal(employee.getgrandtotal());
            employeeRepository.save(employee);

            return target;
        });

    }

        @DeleteMapping("/employees/delete/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") long Id) {
        Optional<Employee> employee = employeeRepository.findById(Id);
        employeeRepository.delete(employee.get());
    }
}
