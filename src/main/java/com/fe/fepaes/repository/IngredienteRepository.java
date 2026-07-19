package com.fe.fepaes.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fe.fepaes.model.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, UUID>{
    List<Ingrediente> findByNomeContainingIgnoreCase(String nome);

}
