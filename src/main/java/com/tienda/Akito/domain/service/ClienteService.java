package com.tienda.Akito.domain.service;

import com.tienda.Akito.persistence.entity.Cliente;
import java.util.List;

public interface ClienteService {

    List<Cliente> getAllClientes();

    Cliente getClienteById(Long clienteId);

    Cliente saveCliente(Cliente cliente);

    void deleteCliente(Long clienteId);
}
