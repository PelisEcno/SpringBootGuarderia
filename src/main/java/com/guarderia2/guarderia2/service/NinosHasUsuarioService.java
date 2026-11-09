package com.guarderia2.guarderia2.service;

import com.guarderia2.guarderia2.entity.NinosHasUsuario;
import com.guarderia2.guarderia2.repository.NinosHasUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinosHasUsuarioService {

    private final NinosHasUsuarioRepository repository;

    public NinosHasUsuarioService(NinosHasUsuarioRepository repository){
        this.repository = repository;
    }

    public List<NinosHasUsuario> listar(){
        return repository.findAll();
    }

    public NinosHasUsuario guardar(NinosHasUsuario usuario) {
        return repository.save(usuario);
    }

}
