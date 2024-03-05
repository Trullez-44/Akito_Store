package com.project.Akito.domain.repository;

import com.project.Akito.persintence.entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

    // Buscar carrito por cliente
    Carrito findByClienteId(Integer clienteId);

    // Contar cuántos carritos tiene un cliente
    Long countByClienteId(Integer clienteId);

    // Eliminar carrito por cliente
    void deleteByClienteId(Integer clienteId);

    // Verificar si un cliente tiene un carrito
    Boolean existsByClienteId(Integer clienteId);

    // Buscar todos los carritos de los clientes
    List<Carrito> findAll();

    // Buscar carrito por cliente

}
