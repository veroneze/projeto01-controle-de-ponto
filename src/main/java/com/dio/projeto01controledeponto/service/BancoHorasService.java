package com.dio.projeto01controledeponto.service;

import com.dio.projeto01controledeponto.model.BancoHoras;
import com.dio.projeto01controledeponto.model.BancoHorasId;
import com.dio.projeto01controledeponto.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras save(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public BancoHoras update(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(BancoHorasId idBancoHoras) {
        return bancoHorasRepository.findById(idBancoHoras);
    }

    public void delete(BancoHorasId idBancoHoras) {
        bancoHorasRepository.deleteById(idBancoHoras);
    }
}
