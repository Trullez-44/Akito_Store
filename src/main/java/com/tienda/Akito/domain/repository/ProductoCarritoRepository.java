package com.tienda.Akito.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.Akito.persistence.entity.ProductoCarrito;
//import springdatajpa.akito_store.persistence.entity.ProductoCarritoId;
//REVISAR CÓDIGO
public interface ProductoCarritoRepository extends JpaRepository<ProductoCarrito, Long> {
}
