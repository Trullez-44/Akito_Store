package springdatajpa.akito_store.domain.service;

import springdatajpa.akito_store.persistence.entity.ProductoCarrito;
import springdatajpa.akito_store.persistence.entity.ProductoCarritoId;

import java.util.List;

public interface ProductoCarritoService {

    List<ProductoCarrito> getAllProductoCarritos();

    ProductoCarrito getProductoCarritoById(ProductoCarritoId productoCarritoId);

    ProductoCarrito saveProductoCarrito(ProductoCarrito productoCarrito);

    void deleteProductoCarrito(ProductoCarritoId productoCarritoId);
}
