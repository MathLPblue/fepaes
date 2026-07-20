package com.fe.fepaes.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fe.fepaes.dto.ClienteResponseDto;
import com.fe.fepaes.dto.CreateClienteDto;
import com.fe.fepaes.model.Cliente;

@Component
public class ClienteMapper {
    @Autowired
    private ModelMapper mapper;
    
    public Cliente toEntity(CreateClienteDto dto){
        Cliente entity = mapper.map(dto, Cliente.class); 
        return entity;
    } 
    
    public ClienteResponseDto toDTO(Cliente entity){
        ClienteResponseDto dto = mapper.map(entity, ClienteResponseDto.class);
        return dto;
    }

    public List<ClienteResponseDto> toDTO(List<Cliente> clientes){
        return clientes.stream()
        .map(this::toDTO)
        .toList();
    }

}
