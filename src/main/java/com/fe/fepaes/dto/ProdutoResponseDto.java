package com.fe.fepaes.dto;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponseDto {
    private UUID id;
    private String nome;
    private BigDecimal precoVenda;
    private boolean ativo;
    private String observacao;
    
    
}
