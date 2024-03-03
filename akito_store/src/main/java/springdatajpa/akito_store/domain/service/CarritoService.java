package springdatajpa.akito_store.domain.service;

import springdatajpa.akito_store.persistence.entity.Carrito;

import java.util.List;

public interface CarritoService {

    List<Carrito> getAllCarritos();

    Carrito getCarritoById(Long carritoId);

    Carrito saveCarrito(Carrito carrito);

    void deleteCarrito(Long carritoId);
}
