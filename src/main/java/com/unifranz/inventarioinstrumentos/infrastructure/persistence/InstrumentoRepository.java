package com.unifranz.inventarioinstrumentos.infrastructure.persistence;

import com.unifranz.inventarioinstrumentos.domain.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentoRepository extends JpaRepository<Instrumento, Long> {
}
