package org.bank.services;

import org.bank.domain.Client;
import org.bank.exception.PersonNotFoundException;
import org.bank.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> getAllClients(){
        return repository.findAll();
    }

    public Client getClientById(int id)  {
        return repository.findById(id).get();
    }
}
