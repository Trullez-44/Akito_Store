package com.project.Akito.persintence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
>>>>>>> 8b94da54e0f7ab981ced5197e31ff93c4e5f4f8b
import jakarta.persistence.*;
import jdk.jfr.Timespan;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table (name = "Factura")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "facturaId")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id")
    private Integer facturaId;

//    @Column(name = "cliente_Id", nullable = false)
//    private Integer clienteId;
    @Timespan
    @Column(name = "fecha_Factura", nullable = false)
    private LocalDate fechaFactura;
    @Column(name = "total_Factura", nullable = false)
    private double totalFactura;
<<<<<<< HEAD

    @JsonBackReference
    @ManyToOne
=======
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
>>>>>>> 8b94da54e0f7ab981ced5197e31ff93c4e5f4f8b
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFactura> detallesFactura;

    public Integer getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "facturaId=" + facturaId +
                ", fechaFactura=" + fechaFactura +
                ", totalFactura=" + totalFactura +
                ", cliente=" + cliente +
                ", detallesFactura=" + detallesFactura +
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
