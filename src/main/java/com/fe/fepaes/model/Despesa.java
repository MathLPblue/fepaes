package com.fe.fepaes.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

import org.springframework.cglib.core.Local;

import com.fe.fepaes.enums.Periodo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    public Periodo perido;
    
    

    private String nome;
    private String categoria;
    private BigDecimal valor;
    private LocalDate data;
    private String observacao;
    private boolean ativo;


}
