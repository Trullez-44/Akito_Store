package com.tienda.Akito.domain.service;

import com.tienda.Akito.persistence.entity.DetalleFactura;

import java.util.List;

public interface DetalleFacturaService {

    List<DetalleFactura> getAllDetalleFacturas();

    DetalleFactura getDetalleFacturaById(Long detalleFacturaId);

    DetalleFactura saveDetalleFactura(DetalleFactura detalleFactura);

    void deleteDetalleFactura(Long detalleFacturaId);
}
