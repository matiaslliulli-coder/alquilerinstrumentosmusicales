package com.unifranz.inventarioinstrumentos.infrastructure.web.controller;

import com.unifranz.inventarioinstrumentos.application.service.InstrumentoService;
import com.unifranz.inventarioinstrumentos.domain.Instrumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/instrumentos")
public class InstrumentoController {

    @Autowired
    private InstrumentoService instrumentoService;

    @GetMapping
    public List<Instrumento> listar() {
        return instrumentoService.listarTodos();
    }

    @PostMapping
    public Instrumento crear(@RequestBody Instrumento instrumento) {
        return instrumentoService.guardar(instrumento);
    }

    @GetMapping("/{id}")
    public Instrumento buscar(@PathVariable Long id) {
        return instrumentoService.buscarPorId(id);
    }
}
