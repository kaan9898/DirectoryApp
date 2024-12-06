package com.example.DirectoryApp.src.application.controller;
import com.example.DirectoryApp.src.application.business.Abstract.CityManager;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class CityController {
    private final CityManager cityManager;

    @Autowired
    public CityController(CityManager cityManager) {
        this.cityManager = cityManager;
    }
    @GetMapping("getAllCities")
    public List<City> getAllCities() {
        return cityManager.getAllCities();
    }
    @GetMapping("getLicencePlateID")
    public City getPlateID(@RequestParam("licencePlateID") Integer licencePlateID) {
        return cityManager.getCitiesByLicencePlateID(licencePlateID);
    }
   @PostMapping("update")
    public City updateCity(@RequestBody City city) {
        return cityManager.updateCity(city);
    }
    @PostMapping("updateWithTwo")
    public void updateCitiesWithTwoParameter(@RequestBody City city) {
         cityManager.updateCitiesWith2Parameter(city.getCityName(), city.getLicencePlateID());
    }
    @PostMapping("getAllPersonDataByGivingCityName")
    public List<City> getAllPersonDataByGivingCityName(@RequestBody City city) {
        return cityManager.getAllPersonDataByCityName(city.getCityName());
    }
}