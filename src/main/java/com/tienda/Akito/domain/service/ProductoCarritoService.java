package com.tienda.Akito.domain.service;

import com.tienda.Akito.persistence.entity.ProductoCarrito;
//import com.tienda.Akito.persistence.entity.ProductoCarritoId;
//REVISAR ARCHIVO

import java.util.List;

public interface ProductoCarritoService {

    List<ProductoCarrito> getAllProductoCarritos();

//    ProductoCarrito getProductoCarritoById(ProductoCarritoId productoCarritoId);

    ProductoCarrito saveProductoCarrito(ProductoCarrito productoCarrito);

//    void deleteProductoCarrito(ProductoCarritoId productoCarritoId);
}
