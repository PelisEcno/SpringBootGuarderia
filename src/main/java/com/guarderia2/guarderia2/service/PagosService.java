package com.guarderia2.guarderia2.service;

import com.guarderia2.guarderia2.entity.Pagos;
import com.guarderia2.guarderia2.repository.PagosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagosService {
    private final PagosRepository repository;

    public PagosService(PagosRepository repository) {
        this.repository = repository;
    }

    public List<Pagos> listar() {
        return repository.findAll();
    }

    public Pagos guardarPago(Pagos pago) {
        return repository.save(pago);
    }

    public boolean eliminarPago(Integer id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }

}
