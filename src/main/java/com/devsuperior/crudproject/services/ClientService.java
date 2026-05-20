package com.devsuperior.crudproject.services;

import com.devsuperior.crudproject.controllers.interfaces.CrudClient;
import com.devsuperior.crudproject.dto.ClientDTO;
import com.devsuperior.crudproject.entities.Client;
import com.devsuperior.crudproject.repositorys.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Service
public class ClientService implements CrudClient {

    @Autowired
    ClientRepository repository;


    @Override
    public ClientDTO insert(ClientDTO dto) {
        Client client = new Client();
        copyClientToClientDTO(client, dto);
        return new ClientDTO(repository.save(client));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);

    }

    @Override
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> clients = repository.findAll(pageable);
        return clients.map(x -> new ClientDTO(x));
    }

    @Transactional
    @Override
    public ClientDTO update(Long id, ClientDTO dto) {
        Client client = repository.getReferenceById(id);
        copyClientToClientDTO(client, dto);
        repository.save(client);
        return new ClientDTO(client);
    }

    private void copyClientToClientDTO(Client client, ClientDTO dto){
        client.setName(dto.getName());
        client.setChildren(dto.getChildren());
        client.setCpf(dto.getCpf());
        client.setIncome(dto.getIncome());
        client.setBirthDate(dto.getBirthDate());
    }
}
