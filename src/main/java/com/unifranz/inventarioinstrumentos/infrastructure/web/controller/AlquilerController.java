package com.unifranz.inventarioinstrumentos.infrastructure.web.controller;

import com.unifranz.inventarioinstrumentos.application.service.AlquilerService;
import com.unifranz.inventarioinstrumentos.domain.Alquiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/alquileres")
public class AlquilerController {

    @Autowired
    private AlquilerService alquilerService;

    @GetMapping
    public List<Alquiler> listar() {
        return alquilerService.listarTodos();
    }

    @PostMapping
    public Alquiler crear(@RequestBody AlquilerRequest request) {
        return alquilerService.crearAlquiler(
                request.instrumentoId,
                request.clienteId,
                LocalDate.parse(request.fechaInicio),
                LocalDate.parse(request.fechaFin));
    }

    static class AlquilerRequest {
        public Long instrumentoId;
        public Long clienteId;
        public String fechaInicio; // formato: 2026-09-10
        public String fechaFin;
    }
}
