package com.fe.fepaes.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateClienteDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;

    private String observacao;

}
