package com.example.examanblanc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idTransaction;
    Double montant;
    TypeTransaction type;
    Date dateTransaction;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Compte> comptes;
}
