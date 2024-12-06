package com.example.DirectoryApp.src.application.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "email")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Integer emailId;
    @Column(name = "email_address")
    private String emailAddress;
}