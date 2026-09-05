package com.unifranz.inventarioinstrumentos.infrastructure.persistence;

import com.unifranz.inventarioinstrumentos.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
