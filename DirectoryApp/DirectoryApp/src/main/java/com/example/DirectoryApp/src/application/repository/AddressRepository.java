package com.example.DirectoryApp.src.application.repository;
import com.example.DirectoryApp.src.application.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface AddressRepository extends JpaRepository<Address, String> {
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "SELECT * FROM Address " )
    void getAllDataFromAllTables(@Param("person_id") Integer personID,
                                 @Param("address_id") Integer addressID,
                                 @Param("address_line")String addressLine,
                                 @Param("licence_plate") Integer licencePlateID
    );
}