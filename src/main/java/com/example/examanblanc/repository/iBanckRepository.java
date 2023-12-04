package com.example.examanblanc.repository;

import com.example.examanblanc.entities.Bank;
import com.example.examanblanc.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface iBanckRepository extends CrudRepository<Bank,Long> {

    Bank findByAgence(String agence);


}
