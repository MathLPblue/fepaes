package com.fe.fepaes.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.cglib.core.Local;

import com.fe.fepaes.enums.StatusPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    public StatusPedido statuspedido;
    
    
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    private String observacao;
    



}
