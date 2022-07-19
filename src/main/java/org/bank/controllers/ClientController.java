package org.bank.controllers;

import org.bank.domain.Client;
import org.bank.domain.Department;
import org.bank.dto.ClientDTO;
import org.bank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ClientDTO getClientsById(@PathVariable int id) {
        Client client = clientService.getClientById(id);
        return  client.toClientDTO();
    }

    @GetMapping("/clients/{id}/department")
    public Department getDepartmentByClientId(@PathVariable int id){
        return  clientService.getDepartmentByClientId(id);
    }

    @PostMapping("/clients")
    public String addNewClient(@RequestBody Client client){
        clientService.addNewClient(client);
        return "Ok";
    }
    @PutMapping("/clients/{id}")
    public String updateClient(@PathVariable int id, @RequestBody Client client){
        clientService.updateClient(id, client);
        return "Ok";
    }
    @DeleteMapping("/clients/{id}")
    public String deleteClient(@PathVariable int id){
        clientService.deleteClient(id);
        return "Ok";
    }
}
