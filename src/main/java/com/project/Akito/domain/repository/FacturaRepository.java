package com.project.Akito.domain.repository;

import com.project.Akito.persintence.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {

//    // Buscar factura por cliente_id
//    Factura findByClienteId(Integer clienteId);
//
//    // Contar cuántas facturas tiene un cliente
//    Long countByClienteId(Integer clienteId);
//
//    // Eliminar factura por cliente_id
//    void deleteByClienteId(Integer clienteId);
//
//    // Verificar si un cliente tiene facturas
//    Boolean existsByClienteId(Integer clienteId);
//
//    // Buscar todas las facturas
//    List<Factura> findAll();

}
