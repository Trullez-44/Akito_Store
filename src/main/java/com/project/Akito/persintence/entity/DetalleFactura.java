package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

@Entity
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalle_factura_id")
    private Integer detalleFacturaId;
//    @Column(name = "factura_Id", nullable = false)
//    private Integer facturaId;
    @Column(name = "cantidad_Producto", nullable = false)
    private int cantidadProducto;
    @Column(name = "precio_Unitario", nullable = false)
    private double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getDetalleFacturaId() {
        return detalleFacturaId;
    }

    public void setDetalleFacturaId(Integer detalleFacturaId) {
        this.detalleFacturaId = detalleFacturaId;
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

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" +
                "detalleFacturaId=" + detalleFacturaId +
                ", cantidadProducto=" + cantidadProducto +
                ", precioUnitario=" + precioUnitario +
                ", factura=" + factura +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
