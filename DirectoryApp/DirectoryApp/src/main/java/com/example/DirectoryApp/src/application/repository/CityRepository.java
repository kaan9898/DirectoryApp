package com.example.DirectoryApp.src.application.repository;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CityRepository extends JpaRepository<City, String> {
   @Query(nativeQuery = true, value = "SELECT * FROM City c WHERE c.licence_plate = :id ")
    City getCitiesByLicencePlate(@Param("id") Integer licencePlateID);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE city  SET city_name = :cityName WHERE license_plate = :plate_number ")
    void updateCitiesWith2Parameter(@Param("cityName") String cityName ,@Param("plate_number") Integer plate_number);

    @Query(nativeQuery = true, value = "SELECT * FROM City WHERE city_name = :cityName" )
    List<City> getAllPersonDataByGivingCity(@Param("cityName") String city_name);
}