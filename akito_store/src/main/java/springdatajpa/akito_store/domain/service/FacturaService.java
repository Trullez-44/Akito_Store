package springdatajpa.akito_store.domain.service;

import springdatajpa.akito_store.persistence.entity.Factura;

import java.util.List;

public interface FacturaService {

    List<Factura> getAllFacturas();

    Factura getFacturaById(Long facturaId);

    Factura saveFactura(Factura factura);

    void deleteFactura(Long facturaId);
}
