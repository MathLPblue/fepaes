package com.fe.fepaes.dto;

import java.math.BigDecimal;
import java.util.UUID;

import com.fe.fepaes.enums.Unidade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredienteResponseDto {
    private UUID id;
    private Unidade unidade;
    private String nome;
    private BigDecimal estoque;
    private BigDecimal custo;
    private boolean ativo;
    private String observacao;

}
