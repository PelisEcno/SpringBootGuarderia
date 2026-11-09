package com.guarderia2.guarderia2.controller;

import com.guarderia2.guarderia2.entity.TipoDocumento;
import com.guarderia2.guarderia2.service.TipoDocumentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-documento")
public class TipoDocumentoController {

    private final TipoDocumentoService service;

    public TipoDocumentoController(TipoDocumentoService service) {
        this.service = service;
    }

    @GetMapping("/{listar}")
    public List<TipoDocumento> listar() {
        return service.listar();
    }

    @PostMapping
    public TipoDocumento guardar(@RequestBody TipoDocumento tipo) {
        return service.guardar(tipo);
    }

}
