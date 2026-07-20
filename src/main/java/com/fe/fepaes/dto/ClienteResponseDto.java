package com.fe.fepaes.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponseDto {

    private UUID id;
    private String nome;
    private String telefone;
    private String observacao;

}
