package com.example.DirectoryApp.src.application.business.Abstract;
import com.example.DirectoryApp.src.application.domain.Address;
import java.util.List;

public interface AddressManager {
    String editAddress();
    List<Address> getAllAddress();
    void getAllDataFromAllTables(Integer addressID, String addressLine, Integer personID, Integer licencePlateID);
}