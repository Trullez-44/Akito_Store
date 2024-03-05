package com.project.Akito.web.controller;

import com.project.Akito.domain.service.DetalleFacturaService;
import com.project.Akito.persintence.entity.DetalleFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle-facturas")
public class DetalleFacturaController {

    @Autowired
    private DetalleFacturaService detalleFacturaService;

    @GetMapping
    public ResponseEntity<List<DetalleFactura>> getAllDetalleFacturas() {
        List<DetalleFactura> detalleFacturas = detalleFacturaService.getAll();
        return new ResponseEntity<>(detalleFacturas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleFactura> getDetalleFacturaById(@PathVariable Integer id) {
        DetalleFactura detalleFactura = detalleFacturaService.getById(id);
        return new ResponseEntity<>(detalleFactura, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DetalleFactura> createDetalleFactura(@RequestBody DetalleFactura detalleFactura) {
        DetalleFactura createdDetalleFactura = detalleFacturaService.saveDetalleFactura(detalleFactura);
        return new ResponseEntity<>(createdDetalleFactura, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleFactura> updateDetalleFactura(@PathVariable Integer id, @RequestBody DetalleFactura detalleFactura) {
        DetalleFactura updatedDetalleFactura = detalleFacturaService.updateDetalleFactura(id, detalleFactura);
        return new ResponseEntity<>(updatedDetalleFactura, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetalleFactura(@PathVariable Integer id) {
        detalleFacturaService.deleteDetalleFactura(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}