package com.unifranz.inventarioinstrumentos.application.service.impl;

import com.unifranz.inventarioinstrumentos.application.service.InstrumentoService;
import com.unifranz.inventarioinstrumentos.domain.Instrumento;
import com.unifranz.inventarioinstrumentos.infrastructure.persistence.InstrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InstrumentoServiceImpl implements InstrumentoService {

    @Autowired
    private InstrumentoRepository instrumentoRepository;

    @Override
    public List<Instrumento> listarTodos() {
        return instrumentoRepository.findAll();
    }

    @Override
    public Instrumento guardar(Instrumento instrumento) {
        return instrumentoRepository.save(instrumento);
    }

    @Override
    public Instrumento buscarPorId(Long id) {
        return instrumentoRepository.findById(id).orElse(null);
    }
}
