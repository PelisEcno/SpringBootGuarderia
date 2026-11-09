package com.guarderia2.guarderia2.service;

import com.guarderia2.guarderia2.entity.Ninos;
import com.guarderia2.guarderia2.repository.NinosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinosService {
    private final NinosRepository repository;

    public NinosService(NinosRepository repository) {
        this.repository = repository;
    }

    public List<Ninos> listar() {
        return repository.findAll();
    }

    public Optional<Ninos> BuscarPoriD(Integer id) {
        return repository.findById(id);
    }

    public Ninos guardarNino(Ninos nino) {
        return repository.save(nino);
    }

    public boolean eliminarNinoPorID(Integer id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }

}
