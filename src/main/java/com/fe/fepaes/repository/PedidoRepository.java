package com.fe.fepaes.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fe.fepaes.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, UUID>{

    List<Pedido> findByDataPedido(LocalDate dataPedido);

    List<Pedido> findByDataEntrega(LocalDate dataEntrega);

    List<Pedido> findByDataPedidoAfter(LocalDate dataPedido);

    List<Pedido> findByDataEntregaAfter(LocalDate dataEntrega);

    List<Pedido> findByDataPedidoBetween(LocalDate inicio, LocalDate fim);

    List<Pedido> findByDataEntregaBetween(LocalDate inicio, LocalDate fim);

}
