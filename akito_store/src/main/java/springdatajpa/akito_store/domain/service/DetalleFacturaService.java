package springdatajpa.akito_store.domain.service;

import springdatajpa.akito_store.persistence.entity.DetalleFactura;

import java.util.List;

public interface DetalleFacturaService {

    List<DetalleFactura> getAllDetalleFacturas();

    DetalleFactura getDetalleFacturaById(Long detalleFacturaId);

    DetalleFactura saveDetalleFactura(DetalleFactura detalleFactura);

    void deleteDetalleFactura(Long detalleFacturaId);
}
