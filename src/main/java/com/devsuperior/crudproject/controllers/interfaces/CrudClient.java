package com.devsuperior.crudproject.controllers.interfaces;

import com.devsuperior.crudproject.dto.ClientDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Set;

public interface CrudClient {
    public ClientDTO insert(ClientDTO client);
    public void delete(Long id);
    public ClientDTO findById(Long id);
    public Page<ClientDTO> findAll(Pageable pageable);
    public ClientDTO update(Long id, ClientDTO client);

}
