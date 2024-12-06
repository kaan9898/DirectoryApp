package com.example.DirectoryApp.src.application.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "address")
@Builder
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id")
    private Integer addressID;
    @Column(name = "address_line")
    private String addressLine;
    @Column(name = "person_id")
    private Integer personID;
    @Column(name = "licence_plate")
    private Integer licencePlateID;
    @OneToOne
    @JoinColumn(name = "licence_plate", insertable = false, updatable = false)
    private City city;
}
