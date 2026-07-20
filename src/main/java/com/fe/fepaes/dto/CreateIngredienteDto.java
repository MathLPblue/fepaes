package com.fe.fepaes.dto;

import java.math.BigDecimal;

import com.fe.fepaes.enums.Unidade;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateIngredienteDto {
    @NotBlank
    private Unidade unidade;
    @NotBlank
    private String nome;
    
    private BigDecimal estoque;
    private BigDecimal custo;
}
