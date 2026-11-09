package com.guarderia2.guarderia2.controller;

import com.guarderia2.guarderia2.entity.Grupos;
import com.guarderia2.guarderia2.service.GruposService;
import jakarta.validation.Valid;
import lombok.Value;
import org.apache.coyote.BadRequestException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@RequestMapping("/api/grupos")
public class GruposController {
    private final GruposService service;

    public GruposController(GruposService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<Grupos> listar() {
        return service.listar();
    }

    @PostMapping
    public Grupos guardarGrupo(@Valid @RequestBody Grupos grupos) {
        return service.guardarGrupo(grupos);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        if (service.eliminarGrupo(id)) {
            return ResponseEntity.ok("Niño eliminado");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Niño no encontrado");
    }
}
