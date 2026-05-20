package com.devsuperior.crudproject.services;

import com.devsuperior.crudproject.repositorys.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;
}
