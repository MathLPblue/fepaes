package com.fe.fepaes.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @OneToOne 
    @JoinColumn(name = "idproduto")
    private Produto produto;
    
    private int rendimento;
    private int tempoPreparo; 
    private int tempoRefrigeracao; 
    private String observacao;

}
