package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

@Entity
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalle_factura_id")
    private Integer detalleFacturaId;

    private Integer facturaId;
    private Integer productoId;
    private int cantidadProducto;
    private double precioUnitario;
    
    public Integer getDetalleFacturaId() {
        return detalleFacturaId;
    }
    public void setDetalleFacturaId(Integer detalleFacturaId) {
        this.detalleFacturaId = detalleFacturaId;
    }
    public Integer getFacturaId() {
        return facturaId;
    }
    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }
    public Integer getProductoId() {
        return productoId;
    }
    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }
    public int getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
 
    
}
