package com.guarderia2.guarderia2.service;

import com.guarderia2.guarderia2.entity.RegistroMedico;
import com.guarderia2.guarderia2.repository.RegistroMedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroMedicoService {

    private final RegistroMedicoRepository repository;

    public RegistroMedicoService(RegistroMedicoRepository repository) {
        this.repository = repository;
    }

    public List<RegistroMedico> listar() {
        return repository.findAll();
    }

}
