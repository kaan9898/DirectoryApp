package com.example.DirectoryApp.src.application.business.congrete;
import com.example.DirectoryApp.src.application.business.Abstract.AddressManager;
import com.example.DirectoryApp.src.application.domain.Address;
import com.example.DirectoryApp.src.application.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressService implements AddressManager {

    private final AddressRepository addressRepository;
    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public String editAddress() {
        return "";
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public void getAllDataFromAllTables(Integer addressID, String addressLine, Integer personID, Integer licencePlateID) {
        addressRepository.getAllDataFromAllTables(addressID,licencePlateID,addressLine,personID);
    }
}