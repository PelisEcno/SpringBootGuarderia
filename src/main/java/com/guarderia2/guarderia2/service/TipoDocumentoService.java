package com.guarderia2.guarderia2.service;

import com.guarderia2.guarderia2.entity.TipoDocumento;
import com.guarderia2.guarderia2.repository.TipoDocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService {

    private final TipoDocumentoRepository repository;

    public TipoDocumentoService(TipoDocumentoRepository repository) {
        this.repository = repository;
    }

    public List<TipoDocumento> listar() {
        return repository.findAll();
    }

    public TipoDocumento guardar(TipoDocumento tipo) {
        return repository.save(tipo);
    }


}
