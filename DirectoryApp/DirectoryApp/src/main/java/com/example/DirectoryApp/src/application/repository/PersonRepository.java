package com.example.DirectoryApp.src.application.repository;
import com.example.DirectoryApp.src.application.domain.City;
import com.example.DirectoryApp.src.application.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM Person WHERE person_id = :personID")
    List<Person> getAllPersonDataByID(@Param("personID") Integer person_id);
}