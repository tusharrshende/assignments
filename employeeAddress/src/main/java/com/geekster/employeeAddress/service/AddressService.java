package com.geekster.employeeAddress.service;

import com.geekster.employeeAddress.model.Address;
import com.geekster.employeeAddress.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addNewAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "added";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String deleteById(Long id) {
        addressRepo.deleteById(id);
        return "deleted";
    }

    public String updateAddressById(Long id, Address newAddress) {
        Address address = addressRepo.findById(id).get();
        address.setStreet(newAddress.getStreet());
        address.setState(newAddress.getState());
        address.setZipCode(newAddress.getZipCode());
        addressRepo.save(address);
        return "updated";
    }
}
