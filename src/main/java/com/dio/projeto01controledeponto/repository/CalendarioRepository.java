package com.dio.projeto01controledeponto.repository;

import com.dio.projeto01controledeponto.model.Calendario;
import com.dio.projeto01controledeponto.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

}