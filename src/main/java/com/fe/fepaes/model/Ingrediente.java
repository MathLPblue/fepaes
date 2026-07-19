package com.fe.fepaes.model;

import java.math.BigDecimal;
import java.util.UUID;

import com.fe.fepaes.enums.Unidade;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ingrediente{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Unidade unidade;
    
    private String nome;
    private BigDecimal estoque;
    private BigDecimal custo;
    private boolean ativo;
    private String observacao;

}