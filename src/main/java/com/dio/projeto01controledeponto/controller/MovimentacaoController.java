package com.dio.projeto01controledeponto.controller;

import com.dio.projeto01controledeponto.model.Movimentacao;
import com.dio.projeto01controledeponto.model.MovimentacaoId;
import com.dio.projeto01controledeponto.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getMovimentacaoById(@PathVariable("idMovimentacao") MovimentacaoId idMovimentacao) throws Exception {
        return ResponseEntity.ok(movimentacaoService.getById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("Movimentacao not found.")));
    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public void deleteMovimentacao(@PathVariable("idMovimentacao") MovimentacaoId idMovimentacao){
        movimentacaoService.delete(idMovimentacao);
    }
}
