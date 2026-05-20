package com.devsuperior.crudproject.controllers;

import com.devsuperior.crudproject.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientService service;
}
