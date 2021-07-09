package com.dio.projeto01controledeponto.service;

import com.dio.projeto01controledeponto.model.Empresa;
import com.dio.projeto01controledeponto.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long idEmpresa) {
        return empresaRepository.findById(idEmpresa);
    }

    public void delete(Long idEmpresa) {
        empresaRepository.deleteById(idEmpresa);
    }
}
