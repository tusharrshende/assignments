package com.geekster.employeeAddress.service;

import com.geekster.employeeAddress.model.Employee;
import com.geekster.employeeAddress.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    public String addNewEmployee(Employee newEmployee) {
        employeeRepo.save(newEmployee);
        return "added";
    }

    public List<Employee> getAllEmployee() {
      return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElseThrow();
    }

    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "deleted";
    }

    public String updateEmployeeById(Long id, Employee newEmployee) {
        Employee employee = employeeRepo.findById(id).get();
        employee.setFirstName(newEmployee.getFirstName());
        employee.setLastName(newEmployee.getLastName());
        employeeRepo.save(employee);
        return "updated";
    }
}
