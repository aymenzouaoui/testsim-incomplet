package com.example.examanblanc.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idbank;
    String nom;
    String agence;
    String adress;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Compte> comptes;
}
