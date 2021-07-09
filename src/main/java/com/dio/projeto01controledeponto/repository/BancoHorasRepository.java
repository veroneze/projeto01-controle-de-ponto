package com.dio.projeto01controledeponto.repository;

import com.dio.projeto01controledeponto.model.BancoHoras;
import com.dio.projeto01controledeponto.model.BancoHorasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, BancoHorasId> {
}