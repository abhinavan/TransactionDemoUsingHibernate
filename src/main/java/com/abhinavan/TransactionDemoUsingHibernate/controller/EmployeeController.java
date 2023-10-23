package com.abhinavan.TransactionDemoUsingHibernate.controller;

import com.abhinavan.TransactionDemoUsingHibernate.models.Employee;
import com.abhinavan.TransactionDemoUsingHibernate.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/employee")
public class EmployeeController
{

    @Autowired
    private EmployeeService employeeService;

    @PutMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
    }
}
