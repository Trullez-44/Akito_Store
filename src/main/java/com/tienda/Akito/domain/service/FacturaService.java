package com.tienda.Akito.domain.service;

import com.tienda.Akito.persistence.entity.Factura;

import java.util.List;

public interface FacturaService {

    List<Factura> getAllFacturas();

    Factura getFacturaById(Long facturaId);

    Factura saveFactura(Factura factura);

    void deleteFactura(Long facturaId);
}
