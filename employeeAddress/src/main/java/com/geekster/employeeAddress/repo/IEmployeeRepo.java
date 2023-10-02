package com.geekster.employeeAddress.repo;

import com.geekster.employeeAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
