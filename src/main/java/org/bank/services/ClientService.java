package org.bank.services;

import org.bank.domain.Client;
import org.bank.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> getAllClients(){
        return repository.findAll();
    }

    public void addNewClient(Client client){
        repository.save(client);
    }
    public void updateClient(int id, Client client){
        Client oldClient = repository.getReferenceById(id);
        oldClient.setLastname(client.getLastname());
        repository.save(oldClient);
    }

    public Client getClientById(int id){
        return repository.findById(id).get();
    }
    public void deleteClient(int id){
        repository.deleteById(id);
    }

}