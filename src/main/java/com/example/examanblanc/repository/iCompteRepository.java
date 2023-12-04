package com.example.examanblanc.repository;

import com.example.examanblanc.entities.Compte;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface iCompteRepository extends CrudRepository<Compte,Long> {


}
