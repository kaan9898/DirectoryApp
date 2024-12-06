package com.example.DirectoryApp.src.application.business.Abstract;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;

import java.util.List;

public interface CityManager {
    List<City> getAllCities();
    City getCitiesByLicencePlateID(Integer licencePlateID);
    City updateCity(City cName2);
    void updateCitiesWith2Parameter(String cityName, Integer plate_number);
    List<City> getAllPersonDataByCityName(String cityName);
}
