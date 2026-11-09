package com.guarderia2.guarderia2.controller;

import com.guarderia2.guarderia2.entity.RegistroMedico;
import com.guarderia2.guarderia2.service.RegistroMedicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/registro-medico")
public class RegistroMedicoController {

    private final RegistroMedicoService service;

    public RegistroMedicoController(RegistroMedicoService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<RegistroMedico> listar() {
        return service.listar();
    }

}
