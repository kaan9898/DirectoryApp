package com.example.DirectoryApp.src.application.business.Abstract;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;
import java.util.List;

public interface PersonManager {
      List<Person> getAllPersonDataByID(Integer personID);
      Person editAllData(Person personID);

}
