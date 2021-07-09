package com.dio.projeto01controledeponto.repository;

import com.dio.projeto01controledeponto.model.Movimentacao;
import com.dio.projeto01controledeponto.model.MovimentacaoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, MovimentacaoId> {
}