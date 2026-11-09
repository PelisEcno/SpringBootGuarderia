package com.guarderia2.guarderia2.controller;

import com.guarderia2.guarderia2.entity.NinosHasUsuario;
import com.guarderia2.guarderia2.service.NinosHasUsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ninos-has-usuario")
public class NinosHasUsuarioController {
    private final NinosHasUsuarioService service;

    public NinosHasUsuarioController(NinosHasUsuarioService service){
        this.service = service;
    }

    @GetMapping("/listar")
    public List<NinosHasUsuario> listar(){
        return service.listar();
    }

    @PostMapping("/guardar")
    public NinosHasUsuario guardar(NinosHasUsuario usuario){
        return service.guardar(usuario);
    }
}
