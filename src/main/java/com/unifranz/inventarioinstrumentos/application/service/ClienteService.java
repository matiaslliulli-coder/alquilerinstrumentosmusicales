package com.unifranz.inventarioinstrumentos.application.service;

import com.unifranz.inventarioinstrumentos.domain.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listarTodos();
    Cliente guardar(Cliente cliente);
}
