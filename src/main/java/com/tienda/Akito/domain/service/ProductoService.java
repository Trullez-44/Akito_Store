package com.tienda.Akito.domain.service;

import com.tienda.Akito.persistence.entity.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> getAllProductos();

    Producto getProductoById(Long productoId);

    Producto saveProducto(Producto producto);

    void deleteProducto(Long productoId);
}
