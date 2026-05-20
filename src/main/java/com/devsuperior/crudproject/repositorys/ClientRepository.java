package com.devsuperior.crudproject.repositorys;

import com.devsuperior.crudproject.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
