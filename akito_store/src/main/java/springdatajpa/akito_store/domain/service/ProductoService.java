package springdatajpa.akito_store.domain.service;

import springdatajpa.akito_store.persistence.entity.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> getAllProductos();

    Producto getProductoById(Long productoId);

    Producto saveProducto(Producto producto);

    void deleteProducto(Long productoId);
}
