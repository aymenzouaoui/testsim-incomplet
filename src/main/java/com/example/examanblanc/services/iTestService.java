package com.example.examanblanc.services;

import com.example.examanblanc.entities.Bank;
import com.example.examanblanc.entities.Compte;
import com.example.examanblanc.entities.Transaction;
import com.example.examanblanc.entities.TypeTransaction;

import java.util.List;

public interface iTestService {
    public Bank ajouterBank(Bank bank);
    public Compte ajouterCompteEtAffecterAAgence(Compte compte, String agenceBank);



    public String ajouterVirement(Transaction transaction);
    public String ajouterRetrait(Transaction transaction);
    public String ajouterVersement(Transaction transaction);

    public List<Transaction> getAllTransactionByBankId(long idBank);
    public List<Transaction> getAllTransactionByTypeAndCompte(TypeTransaction type, long idCompte);
}
