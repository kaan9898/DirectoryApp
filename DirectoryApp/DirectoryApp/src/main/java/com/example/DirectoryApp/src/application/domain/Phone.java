package com.example.DirectoryApp.src.application.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Table(name = "phone")
@NoArgsConstructor
@Builder
@Data
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id")
    private Integer phoneId;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "person_id")
    private Integer personID;

}
