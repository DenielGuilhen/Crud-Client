package com.Clientes.CRUD.repositories;

import com.Clientes.CRUD.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
