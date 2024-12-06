package com.example.DirectoryApp.src.application.business.congrete;
import com.example.DirectoryApp.src.application.business.Abstract.CityManager;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;
import com.example.DirectoryApp.src.application.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityService implements CityManager {

    private final CityRepository cityRepository;
    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City getCitiesByLicencePlateID(Integer licencePlateID) { return cityRepository.getCitiesByLicencePlate(licencePlateID);}

    @Override
    public City updateCity(City cName2) {
        return cityRepository.saveAndFlush(cName2);
    }

    @Override
    public void updateCitiesWith2Parameter(String cityName, Integer plate_number) {
         cityRepository.updateCitiesWith2Parameter(cityName,plate_number);
    }
    @Override
    public List<City> getAllPersonDataByCityName(String cityName) {
        return cityRepository.getAllPersonDataByGivingCity(cityName);
    }
}
