package com.tienda.Akito.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carritoId;

    private int clienteId;

    public Long getCarritoId() {
        return carritoId;
    }
    public void setCarritoId(Long carritoId) {
        this.carritoId = carritoId;
    }
}
