package com.example.DirectoryApp.src.application.controller;
import com.example.DirectoryApp.src.application.business.Abstract.PersonManager;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PersonController {
    private final PersonManager personManager;
    @Autowired
    public PersonController(PersonManager personManager) {
        this.personManager = personManager;
    }

    @PostMapping("getAllPersonDataByID")
    public List<Person> getAllPerson(@RequestBody Person person) {
     return personManager.getAllPersonDataByID(person.getPersonID());
    }
    @PutMapping("editAllData")
    public Person editAllData(@RequestBody Person person) {
        return personManager.editAllData(person);
    }
}
