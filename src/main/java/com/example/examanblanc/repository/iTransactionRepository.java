package com.example.examanblanc.repository;

import com.example.examanblanc.entities.Transaction;
import com.example.examanblanc.entities.TypeTransaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface iTransactionRepository extends CrudRepository<Transaction,Long> {




    @Query("select Transaction from Transaction t join Compte c where c.type =: COURANT")
    Transaction findTransaction(TypeTransaction type);

    List<Transaction>findAllByDateTransaction();


@Query("select  Transaction FROM Transaction t join Compte c JOIN Bank b where b.idbank =:idBank")
    List<Transaction> getTransactionByComptes(long idBank);

@Query("select  Transaction FROM Transaction t join Compte c JOIN Bank b where t.type =:type and c.idCompte =:idCompte")
    List<Transaction> getAllTransactionByTypeAndCompte(TypeTransaction type, long idCompte);
}
