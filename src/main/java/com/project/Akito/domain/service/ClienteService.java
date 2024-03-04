package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.ClienteRepository;
import com.project.Akito.persintence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    public Cliente getById(Integer id ){
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente saveCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Integer id) {

        clienteRepository.deleteById(id);
    }
}
