package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrito_id")
    private Integer carritoId;
    @Column(name = "cliente_Id", nullable = false)
    private Integer clienteId;

    @ManyToMany(mappedBy ="carritos")
    List<Producto> productos;

    public Integer getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(Integer carritoId) {
        this.carritoId = carritoId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "carritoId=" + carritoId +
                ", clienteId=" + clienteId +
                ", productos=" + productos +
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
