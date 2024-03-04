package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

@Entity
public class ProductoCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_carrito_id")
    private Integer productoCarritoId;

    private Integer carritoId;
    private Integer productoId;
    private int cantidadProducto;

    public Integer getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(int carritoId) {
        this.carritoId = carritoId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "ProductoCarrito{" +
                "productoCarritoId=" + productoCarritoId +
                ", carritoId=" + carritoId +
                ", productoId=" + productoId +
                ", cantidadProducto=" + cantidadProducto +
                '}';
    }
}
