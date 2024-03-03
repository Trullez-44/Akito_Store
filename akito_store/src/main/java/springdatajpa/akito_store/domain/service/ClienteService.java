package springdatajpa.akito_store.domain.service;

import springdatajpa.akito_store.persistence.entity.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> getAllClientes();

    Cliente getClienteById(Long clienteId);

    Cliente saveCliente(Cliente cliente);

    void deleteCliente(Long clienteId);
}
