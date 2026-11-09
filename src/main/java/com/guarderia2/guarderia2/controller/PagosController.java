package com.guarderia2.guarderia2.controller;

import com.guarderia2.guarderia2.entity.Pagos;
import com.guarderia2.guarderia2.service.PagosService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagosController {
    private final PagosService service;

    public PagosController(PagosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pagos> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<String> guardarPago(@Valid @RequestBody Pagos pago) {
        service.guardarPago(pago);
        return ResponseEntity.status(HttpStatus.OK).body("Pago registrado correctamente.");
    }

    @DeleteMapping
    public ResponseEntity<String> eliminarPago(@PathVariable Integer id) {
        service.eliminarPago(id);
        return ResponseEntity.status(HttpStatus.OK).body("Pago eliminado correctamente.");
    }
}
