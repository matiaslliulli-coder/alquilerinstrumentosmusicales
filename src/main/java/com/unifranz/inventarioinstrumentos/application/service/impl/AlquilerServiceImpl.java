package com.unifranz.inventarioinstrumentos.application.service.impl;

import com.unifranz.inventarioinstrumentos.application.service.AlquilerService;
import com.unifranz.inventarioinstrumentos.domain.*;
import com.unifranz.inventarioinstrumentos.infrastructure.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class AlquilerServiceImpl implements AlquilerService {

    @Autowired
    private AlquilerRepository alquilerRepository;
    @Autowired
    private InstrumentoRepository instrumentoRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Alquiler> listarTodos() {
        return alquilerRepository.findAll();
    }

    @Override
    public Alquiler crearAlquiler(Long instrumentoId, Long clienteId,
                                  LocalDate fechaInicio, LocalDate fechaFin) {

        Instrumento instrumento = instrumentoRepository.findById(instrumentoId)
                .orElseThrow(() -> new RuntimeException("Instrumento no encontrado"));
        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        if (!instrumento.isDisponible()) {
            throw new RuntimeException("El instrumento no esta disponible");
        }

        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        if (dias <= 0) dias = 1;
        double montoTotal = dias * instrumento.getPrecioPorDia();

        instrumento.setDisponible(false);
        instrumentoRepository.save(instrumento);

        Alquiler alquiler = new Alquiler(instrumento, cliente, fechaInicio, fechaFin, montoTotal);
        return alquilerRepository.save(alquiler);
    }
}
