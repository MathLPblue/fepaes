package com.fe.fepaes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fe.fepaes.model.VendaDiaria;

public interface VendaDiariaRepository extends JpaRepository<VendaDiaria, UUID>{

}
