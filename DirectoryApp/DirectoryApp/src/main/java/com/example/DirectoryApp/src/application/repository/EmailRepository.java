package com.example.DirectoryApp.src.application.repository;
import com.example.DirectoryApp.src.application.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Integer> {}
