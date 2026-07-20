package com.fe.fepaes.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePedidoDto {

    @NotNull
    private UUID clienteId;

    private LocalDate dataEntrega;

    private String observacao;

    @NotEmpty
    private List<CreateItemPedidoDto> itens;
}