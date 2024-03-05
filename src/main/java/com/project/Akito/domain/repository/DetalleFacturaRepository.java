package com.project.Akito.domain.repository;
import com.project.Akito.persintence.entity.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Integer> {

    // Buscar detalles de factura por factura_id
    List<DetalleFactura> findByFacturaId(Integer facturaId);

    // Contar cuántos detalles tiene una factura
    Long countByFacturaId(Integer facturaId);

    // Eliminar detalles de una factura por factura_id
    void deleteByFacturaId(Integer facturaId);

    // Verificar si una factura tiene detalles
    Boolean existsByFacturaId(Integer facturaId);

    // Buscar todos los detalles de todas las facturas
    List<DetalleFactura> findAll();
}
