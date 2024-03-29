package org.example.service;

import org.example.model.Cliente;
import org.example.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private ClientesRepository repository;
    @Autowired
    public ClientesService (ClientesRepository clientesRepository) {
        repository = clientesRepository;
    }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        repository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente){

    }
}
