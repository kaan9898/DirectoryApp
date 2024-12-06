package com.example.DirectoryApp.src.application.business.congrete;
import com.example.DirectoryApp.src.application.business.Abstract.PersonManager;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;
import com.example.DirectoryApp.src.application.repository.CityRepository;
import com.example.DirectoryApp.src.application.repository.PersonRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonManager {
    private final PersonRepository personRepository;
    private final CityRepository cityRepository;

    @Autowired
    public PersonService(PersonRepository personRepository, CityRepository cityRepository) {
        this.personRepository = personRepository;
        this.cityRepository = cityRepository;
    }

    @Override
    public List<Person> getAllPersonDataByID(Integer personID) {
    return personRepository.getAllPersonDataByID(personID);
    }

    @Override
    public Person editAllData(Person personID) {
        return personRepository.saveAndFlush(personID);
    }

}
