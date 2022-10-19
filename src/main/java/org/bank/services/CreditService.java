package org.bank.services;

import org.bank.domain.Credit;
import org.bank.exception.CreditException;
import org.bank.repositories.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditService {
    @Autowired
    private CreditRepository repository;
    public List<Credit> getAllCredits(){
        return repository.findAll();
    }
    public Credit getCreditById(int id){
        return repository.findById(id).orElseThrow(() -> new CreditException("Credit with id" + id + " was not found"));
    }
}
