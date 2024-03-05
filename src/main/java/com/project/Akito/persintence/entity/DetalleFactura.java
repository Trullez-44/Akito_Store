package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

@Entity
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalle_factura_id")
    private Integer detalleFacturaId;
    @Column(name = "factura_Id", nullable = false)
    private Integer facturaId;
    @Column(name = "producto_Id", nullable = false)
    private Integer productoId;
    @Column(name = "cantidad_Producto", nullable = false)
    private int cantidadProducto;
    @Column(name = "precio_Unitario", nullable = false)
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

    @Override
    public String toString() {
        return "DetalleFactura{" +
                "detalleFacturaId=" + detalleFacturaId +
                ", facturaId=" + facturaId +
                ", productoId=" + productoId +
                ", cantidadProducto=" + cantidadProducto +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
