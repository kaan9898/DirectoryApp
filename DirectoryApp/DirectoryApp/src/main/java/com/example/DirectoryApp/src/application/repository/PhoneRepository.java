package com.example.DirectoryApp.src.application.repository;

import com.example.DirectoryApp.src.application.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {}
