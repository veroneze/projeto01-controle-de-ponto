package com.dio.projeto01controledeponto.controller;

import com.dio.projeto01controledeponto.model.BancoHoras;
import com.dio.projeto01controledeponto.model.BancoHorasId;
import com.dio.projeto01controledeponto.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bancoHoras")
public class BancoHorasController {
    BancoHorasService bancoHorasService;

    @Autowired
    public BancoHorasController(BancoHorasService bancoHorasService) {
        this.bancoHorasService = bancoHorasService;
    }

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.save(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getBancoHorasList() {
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasById(@PathVariable("idBancoHoras") BancoHorasId idBancoHoras) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(idBancoHoras).orElseThrow(() -> new NoSuchElementException("BancoHoras not found.")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.save(bancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public void deleteBancoHoras(@PathVariable("idBancoHoras") BancoHorasId idBancoHoras) {
        bancoHorasService.delete(idBancoHoras);
    }
}
