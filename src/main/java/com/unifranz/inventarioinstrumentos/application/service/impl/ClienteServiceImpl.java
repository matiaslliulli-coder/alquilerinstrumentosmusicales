package com.unifranz.inventarioinstrumentos.application.service.impl;

import com.unifranz.inventarioinstrumentos.application.service.ClienteService;
import com.unifranz.inventarioinstrumentos.domain.Cliente;
import com.unifranz.inventarioinstrumentos.infrastructure.persistence.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
