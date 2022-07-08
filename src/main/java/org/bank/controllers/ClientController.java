package org.bank.controllers;

import org.bank.domain.Client;
import org.bank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @GetMapping("/clients")
    public List<Client> getClients() {
        return  clientService.getAllClients();
    }
    @GetMapping("/clients/{id}")
    public Client getClientsById(@PathVariable int id) {

        return  clientService.getClientById(id);
    }
}
