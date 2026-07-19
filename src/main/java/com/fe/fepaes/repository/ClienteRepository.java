package com.fe.fepaes.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fe.fepaes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, UUID>{
    Cliente findByTelefone(String telefone);
    List<Cliente> findByNomeContainingIgnoreCase(String nome);

}
