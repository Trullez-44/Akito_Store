package com.tienda.Akito.domain.service;

import com.tienda.Akito.persistence.entity.Carrito;

import java.util.List;

public interface CarritoService {

    List<Carrito> getAllCarritos();

    Carrito getCarritoById(Long carritoId);

    Carrito saveCarrito(Carrito carrito);

    void deleteCarrito(Long carritoId);
}
