package com.project.Akito.web.controller;

import com.project.Akito.domain.service.ClienteService;
import com.project.Akito.persintence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> MostrarClientes() {
        return clienteService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CrearCliente(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente BuscarCliente(@PathVariable Integer id) {
        return clienteService.getById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> BorrarCliente(@PathVariable Integer id) {
        clienteService.deleteCliente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> ActualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        Cliente existingCliente = clienteService.getById(id);
        if (existingCliente != null) {
            cliente.setClienteId(id); // Asegúrate de que el cliente a actualizar tenga el ID correcto
            Cliente updatedCliente = clienteService.updateCliente(cliente);
            return new ResponseEntity<>(updatedCliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
