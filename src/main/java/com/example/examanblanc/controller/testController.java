package com.example.examanblanc.controller;


import com.example.examanblanc.entities.Bank;
import com.example.examanblanc.entities.Compte;
import com.example.examanblanc.entities.Transaction;
import com.example.examanblanc.entities.TypeTransaction;
import com.example.examanblanc.services.iTestService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RequestMapping("test")
@Slf4j
public class testController {


    private  final iTestService testService;
    @PostMapping("/ajouter")
    public Bank ajouterBank(@RequestBody Bank b) {
        return testService.ajouterBank(b);
    }


    @PutMapping("/ajouterComte")
    public Compte ajouterCompteEtAffecterAAgence(@RequestBody Compte compte, @RequestParam String agenceBank) {
return testService.ajouterCompteEtAffecterAAgence(compte,agenceBank);
    }


    @GetMapping("/allTransaction/{id}")


    public List<Transaction> getAllTransacion(@RequestParam  Long id) {
        return testService.getAllTransactionByBankId(id);
    }


    @GetMapping("/allTransactionff/{id}")


    public List<Transaction> getAllTransacion(@RequestBody TypeTransaction type, @RequestParam long idCompte) {
        return testService.getAllTransactionByTypeAndCompte(type,idCompte);
    }
}

