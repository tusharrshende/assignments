package com.geekster.employeeAddress.controller;

import com.geekster.employeeAddress.model.Employee;
import com.geekster.employeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    POST /employees - create a new employee

    @PostMapping("employee")
    public String addNewEmployee(@RequestBody Employee newEmployee) {
        return employeeService.addNewEmployee(newEmployee);
    }

    @GetMapping("employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("employee/id/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("employee/id/{id}")
    public String deleteEmployeeById(@PathVariable Long id) {
        return employeeService.deleteEmployeeById(id);
    }

    @PutMapping("employee/id/{id}")
    public String updateEmployeeById(@PathVariable  Long id, @RequestBody Employee newEmployee) {
       return employeeService.updateEmployeeById(id, newEmployee);
    }
}
