package com.tienda.Akito.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.Akito.persistence.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
