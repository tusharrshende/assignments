package com.geekster.employeeAddress.repo;

import com.geekster.employeeAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {
}
