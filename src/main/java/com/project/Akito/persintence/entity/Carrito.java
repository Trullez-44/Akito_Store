package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrito_id")
    private Integer carritoId;
//    @Column(name = "cliente_Id", nullable = false)
//    private Integer clienteId;

    @ManyToMany(mappedBy ="carritos")
    List<Producto> productos;

    @OneToOne
    @JoinColumn(name = "cliente_id", unique = true)
    private Cliente cliente;

    public Integer getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(Integer carritoId) {
        this.carritoId = carritoId;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "carritoId=" + carritoId +
                ", productos=" + productos +
                ", cliente=" + cliente +
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
