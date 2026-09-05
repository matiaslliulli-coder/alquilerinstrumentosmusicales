package com.unifranz.inventarioinstrumentos.application.service;

import com.unifranz.inventarioinstrumentos.domain.Alquiler;
import java.time.LocalDate;
import java.util.List;

public interface AlquilerService {
    List<Alquiler> listarTodos();
    Alquiler crearAlquiler(Long instrumentoId, Long clienteId,
                           LocalDate fechaInicio, LocalDate fechaFin);
}
