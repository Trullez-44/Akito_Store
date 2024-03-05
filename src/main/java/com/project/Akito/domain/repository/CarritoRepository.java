package com.project.Akito.domain.repository;

import com.project.Akito.persintence.entity.Carrito;
import com.project.Akito.persintence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

//    List<Carrito> findAllByClienteId(Integer clienteId);
//
//
//    @Query("SELECT COUNT(p) FROM Carrito c JOIN c.productos p WHERE c.carritoId = :carritoId")
//    Long countProductosInCarrito(@Param("carritoId") Integer carritoId);
//
//
//    @Query("SELECT p FROM Carrito c JOIN c.productos p WHERE c.carritoId = :carritoId")
//    List<Producto> findAllProductosInCarrito(@Param("carritoId") Integer carritoId);
//
//
//    @Query("SELECT c FROM Carrito c WHERE c.cliente.id = :clienteId ORDER BY c.carritoId DESC LIMIT 1")
//    Carrito findLatestCarritoByClienteId(@Param("clienteId") Integer clienteId);
//
//
//    @Query("SELECT COUNT(c) FROM Carrito c JOIN c.productos p WHERE p.id = :productoId")
//    Long isProductoInAnyCarrito(@Param("productoId") Long productoId);


}
