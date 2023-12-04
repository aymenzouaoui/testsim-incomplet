package com.example.examanblanc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idCompte;
    TypeCompte type;
    Long code;
    Double solde;
}
