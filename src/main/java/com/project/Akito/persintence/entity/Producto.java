package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    private Integer producoId;

    private String nombreProducto;
    private String tipo;
    private double precio;
    private int stockDisponible;
    private int categoriaId;

    public Integer getProducoId() {
        return producoId;
    }

    public void setProducoId(Integer producoId) {
        this.producoId = producoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "producoId=" + producoId +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", stockDisponible=" + stockDisponible +
                ", categoriaId=" + categoriaId +
                '}';
    }
}
