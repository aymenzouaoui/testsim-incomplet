package com.example.examanblanc.services;


import com.example.examanblanc.entities.Bank;
import com.example.examanblanc.entities.Compte;
import com.example.examanblanc.entities.Transaction;
import com.example.examanblanc.entities.TypeTransaction;
import com.example.examanblanc.repository.iBanckRepository;
import com.example.examanblanc.repository.iCompteRepository;
import com.example.examanblanc.repository.iTransactionRepository;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class TestService implements iTestService{

    private final iBanckRepository banckRepository;
private final iCompteRepository compteRepository;
private final iTransactionRepository transactionRepository;

    @Override
    public Bank ajouterBank(Bank bank) {
        return banckRepository.save(bank);
    }

    @Override
    public Compte ajouterCompteEtAffecterAAgence(Compte compte, String agenceBank) {
        Bank b =banckRepository.findByAgence(agenceBank);


        Compte c =compteRepository.save(compte);
        b.setComptes((List<Compte>) c);
        banckRepository.save(b);
         return c;
    }

    @Override
    public String ajouterVirement(Transaction transaction) {

        return null;
    }

    @Override
    public String ajouterRetrait(Transaction transaction) {
        return null;
    }

    @Override
    public String ajouterVersement(Transaction transaction) {
        return null;
    }



    @Override
    public List<Transaction> getAllTransactionByBankId(long idBank) {
        return    transactionRepository.getTransactionByComptes(idBank);

    }

    @Override
    public List<Transaction> getAllTransactionByTypeAndCompte(TypeTransaction type, long idCompte) {
        return    transactionRepository.getAllTransactionByTypeAndCompte(type,idCompte);
    }






    @Scheduled(cron = "*/30 * * * * *")

    public void afficherListeTransaction() {
        System.out.println("Liste Transaction :");
        List<Transaction> Transactions = transactionRepository.findAllByDateTransaction();
        for (Transaction transaction : Transactions) {
            if(Objects.equals(transaction.getDateTransaction(), Date.from(Instant.from(LocalDate.of(LocalDate.now().getYear(), 9, 1))))){
                System.out.println( transaction);

            }
        }
    }
}
