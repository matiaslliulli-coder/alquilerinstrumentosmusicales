package com.unifranz.inventarioinstrumentos.application.service;

import com.unifranz.inventarioinstrumentos.domain.Instrumento;
import java.util.List;

public interface InstrumentoService {
    List<Instrumento> listarTodos();
    Instrumento guardar(Instrumento instrumento);
    Instrumento buscarPorId(Long id);
}
