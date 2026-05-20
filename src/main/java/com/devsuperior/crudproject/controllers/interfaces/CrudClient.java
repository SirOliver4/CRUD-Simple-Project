package com.devsuperior.crudproject.controllers.interfaces;

import com.devsuperior.crudproject.dto.ClientDTO;

import java.util.Set;

public interface CrudClient {
    public ClientDTO insert(ClientDTO client);
    public void delete(Long id);
    public ClientDTO findById(Long id);
    public Set<ClientDTO> findAll();
    public ClientDTO update(Long id, ClientDTO client);

}
