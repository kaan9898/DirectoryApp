package com.example.DirectoryApp.src.application.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
public class City {
    @Id
    @Column(name = "license_plate")
    private Integer licencePlateID;
    @Column(name = "city_name")
    private String cityName;
}
