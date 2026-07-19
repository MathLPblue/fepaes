package com.fe.fepaes.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fe.fepaes.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, UUID>{

    List<Despesa> findByNomeContainingIgnoreCase(String nome);
    //List<Despesa> findByValorGreaterThan(BigDecimal valor);
    //List<Despesa> findByAtivo(boolean ativo); implementar depois
    
    
}
