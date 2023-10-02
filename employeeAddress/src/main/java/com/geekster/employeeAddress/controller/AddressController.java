package com.geekster.employeeAddress.controller;

import com.geekster.employeeAddress.model.Address;
import com.geekster.employeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

//    POST /address - create a new address

    @PostMapping("address")
    public String addNewAddress(@RequestBody Address newAddress) {
        return addressService.addNewAddress(newAddress);
    }

    @GetMapping("address")
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }
    @GetMapping("address/id/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    @DeleteMapping("address/id/{id}")
    public String deleteById(@PathVariable Long id) {
        return addressService.deleteById(id);
    }

    @PutMapping("address/id/{id}")
    public String updateAddressById(Long id, Address newAddress) {
        return addressService.updateAddressById(id, newAddress);
    }
}
