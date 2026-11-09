package com.guarderia2.guarderia2.service;

import com.guarderia2.guarderia2.entity.Grupos;
import com.guarderia2.guarderia2.repository.GruposRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GruposService {
    private final GruposRepository repository;

    public GruposService(GruposRepository repository) {
        this.repository = repository;
    }

    public List<Grupos> listar() {
        return repository.findAll();
    }

    public Grupos guardarGrupo(Grupos grupo) {
        return repository.save(grupo);
    }

    public boolean eliminarGrupo(Integer id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
