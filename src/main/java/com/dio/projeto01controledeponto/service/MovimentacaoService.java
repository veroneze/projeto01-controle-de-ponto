package com.dio.projeto01controledeponto.service;

import com.dio.projeto01controledeponto.model.Movimentacao;
import com.dio.projeto01controledeponto.model.MovimentacaoId;
import com.dio.projeto01controledeponto.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public Movimentacao save(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> getById(MovimentacaoId idMovimentacao) {
        return movimentacaoRepository.findById(idMovimentacao);
    }

    public void delete(MovimentacaoId idMovimentacao) {
        movimentacaoRepository.deleteById(idMovimentacao);
    }
}
