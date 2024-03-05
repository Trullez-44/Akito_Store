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

//    public List<Cliente> findByNombreAndApellido(String nombre, String apellido) {
//        return clienteRepository.findByNombreAndApellido(nombre, apellido);
//    }
//
//    public Long countClientes() {
//        return clienteRepository.countClientes();
//    }
//
//    public List<Cliente> findClientesConFacturasPendientes() {
//        return clienteRepository.findClientesConFacturasPendientes();
//    }
//
//    public List<Cliente> findByDireccion(String direccion) {
//        return clienteRepository.findByDireccion(direccion);
//    }
//
//    public List<Cliente> findClientesConCarritoVacio() {
//        return clienteRepository.findClientesConCarritoVacio();
//    }

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
    public Cliente updateCliente(Cliente cliente) {
        Cliente existingCliente = clienteRepository.findById(cliente.getClienteId()).orElse(null);
        if (existingCliente != null) {
            existingCliente.setNombre(cliente.getNombre());
            existingCliente.setApellido(cliente.getApellido());
            // Aquí puedes agregar más campos del cliente que quieras actualizar
            return clienteRepository.save(existingCliente);
        } else {
            return null;
        }
    }
}
