package org.bank.controllers;

import org.bank.domain.Client;
import org.bank.domain.Credit;
import org.bank.services.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditController {
    @Autowired
    private CreditService creditService;
    @GetMapping("/credits")
    public List<Credit> getCredit(){
        return creditService.getAllCredits();
    }
    @GetMapping("/credits/{id}")
    public Credit getCreditsById(@PathVariable int id) {

        return  creditService.getCreditById(id);
    }
}
