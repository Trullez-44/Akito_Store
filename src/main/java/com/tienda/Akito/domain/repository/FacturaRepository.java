package com.tienda.Akito.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.Akito.persistence.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
