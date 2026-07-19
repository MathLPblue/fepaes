package com.fe.fepaes.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fe.fepaes.model.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, UUID>{
    List<Receita> findByNomeContainingIgnoreCase(String nome);

}
