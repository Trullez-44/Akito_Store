package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrito_id")
    private Integer carritoId;

    private Integer clienteId;

    public Integer getCarritoId() {

        return carritoId;
    }
    public void setCarritoId(int carritoId) {

        this.carritoId = carritoId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "carritoId=" + carritoId +
                ", clienteId=" + clienteId +
                '}';
    }
}
