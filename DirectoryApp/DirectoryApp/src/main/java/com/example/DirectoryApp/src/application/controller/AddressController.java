package com.example.DirectoryApp.src.application.controller;
import com.example.DirectoryApp.src.application.business.Abstract.AddressManager;
import com.example.DirectoryApp.src.application.business.congrete.AddressService;
import com.example.DirectoryApp.src.application.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AddressController {
    private final AddressManager addressManager;
    @Autowired
    public AddressController(AddressService addressManager) {
        this.addressManager = addressManager;
    }
    @GetMapping("getAllAddress")
    public List<Address> getAllAddress() {
        return addressManager.getAllAddress();
    }

    @GetMapping("getAllData")
    public void getAllData(@RequestBody Address address){
        addressManager.getAllDataFromAllTables(address.getAddressID(), address.getAddressLine(), address.getPersonID(), address.getLicencePlateID());
    }
}