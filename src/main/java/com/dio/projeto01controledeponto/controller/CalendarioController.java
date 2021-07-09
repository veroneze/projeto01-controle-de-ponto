package com.dio.projeto01controledeponto.controller;

import com.dio.projeto01controledeponto.model.Calendario;
import com.dio.projeto01controledeponto.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

    CalendarioService calendarioService;

    @Autowired
    public CalendarioController(CalendarioService calendarioService) {
        this.calendarioService = calendarioService;
    }

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }

    @GetMapping
    public List<Calendario> getCalendarioList(){
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioById(@PathVariable("idCalendario") Long idCalendario) throws Exception {
        return ResponseEntity.ok(calendarioService.getById(idCalendario).orElseThrow(() -> new NoSuchElementException("Calendario not found.")));
    }

    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }

    @DeleteMapping("/{idCalendario}")
    public void deleteCalendario(@PathVariable("idCalendario") Long idCalendario){
        calendarioService.delete(idCalendario);
    }
}
