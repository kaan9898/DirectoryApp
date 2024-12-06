package com.example.DirectoryApp.src.application.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer personID;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private Integer age;

    @OneToMany
    @JoinColumn(name = "person_id", insertable = false,updatable = false)
    private List<Address> addresses;
    @OneToMany
    @JoinColumn(name = "person_id",insertable = false,updatable = false)
    private List<Phone> phones;
    @OneToMany
    @JoinColumn(name = "person_id",insertable = false,updatable = false)
    private List<Email> emails;
}
