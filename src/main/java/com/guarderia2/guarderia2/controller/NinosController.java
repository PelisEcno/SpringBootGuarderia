package com.guarderia2.guarderia2.controller;

import com.guarderia2.guarderia2.entity.Ninos;
import com.guarderia2.guarderia2.service.NinosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ninos")
public class NinosController {
    private final NinosService service;

    public NinosController(NinosService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<Ninos> listar() {
        return service.listar();
    }

    @GetMapping("/buscar/{id}")
    public Optional<Ninos> buscarPorID(@PathVariable Integer id) {
        return service.BuscarPoriD(id);
    }

    @PostMapping
    public Ninos guardarNino(@RequestBody Ninos nino) {
        return service.guardarNino(nino);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarNinoPorId(@PathVariable Integer id) {
        if (service.eliminarNinoPorID(id)) {
            return ResponseEntity.ok("Niño eliminado exitosamente");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Niño no encontrado");
    }
}
