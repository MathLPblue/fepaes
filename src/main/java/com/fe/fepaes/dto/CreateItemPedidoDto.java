package com.fe.fepaes.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemPedidoDto {
    @NotNull
    private UUID produtoId;
    private int quantidade;

}
