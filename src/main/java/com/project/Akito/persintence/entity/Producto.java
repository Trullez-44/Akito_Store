package com.project.Akito.persintence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    private Integer producoId;
    @Column(name = "nombre_Producto", nullable = false)
    private String nombreProducto;
    @Column(name = "precio", nullable = false)
    private double precio;
    @Column(name = "stock_Disponible", nullable = false)
    private int stockDisponible;
//    @Column(name = "categoria_Id", nullable = false)
//    private int categoriaId;

    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "producto_carrito",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "carrito_id")
    )
    private List<Carrito> carritos;


    @ManyToMany(mappedBy = "productos")
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "producto")
    private List<DetalleFactura> detallesFactura;

    public List<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

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

    public List<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<Carrito> carritos) {
        this.carritos = carritos;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "producoId=" + producoId +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", stockDisponible=" + stockDisponible +
                ", carritos=" + carritos +
                ", categorias=" + categorias +
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
