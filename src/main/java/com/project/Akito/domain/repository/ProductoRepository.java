package com.project.Akito.domain.repository;

import com.project.Akito.persintence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

//    // Buscar producto por nombre
//    Producto findByNombreProducto(String nombreProducto);
//
//    // Contar cuántos productos existen
//    Long countAll();
//
//    // Eliminar producto por nombre
//    void deleteByNombreProducto(String nombreProducto);
//
//    // Verificar si existe un producto por nombre
//    Boolean existsByNombreProducto(String nombreProducto);
//
//    // Buscar todos los productos
//    List<Producto> findAll();
}

