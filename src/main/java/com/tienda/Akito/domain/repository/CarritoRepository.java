package com.tienda.Akito.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.Akito.persistence.entity.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}
