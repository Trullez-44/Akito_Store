package com.project.Akito.web.controller;

import com.project.Akito.domain.service.FacturaService;
import com.project.Akito.persintence.entity.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    private final FacturaService facturaService;

    @Autowired
    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @GetMapping
    public ResponseEntity<List<Factura>> getAllFacturas() {
        List<Factura> facturas = facturaService.getAll();
        return new ResponseEntity<>(facturas, HttpStatus.OK);
    }

    @GetMapping("/{facturaId}")
    public ResponseEntity<Factura> getFacturaById(@PathVariable Integer facturaId) {
        Factura factura = facturaService.getById(facturaId);
        return new ResponseEntity<>(factura, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Factura> createFactura(@RequestBody Factura factura) {
        Factura createdFactura = facturaService.saveFactura(factura);
        return new ResponseEntity<>(createdFactura, HttpStatus.CREATED);
    }

    @PutMapping("/{facturaId}")
    public ResponseEntity<Factura> updateFactura(@PathVariable Integer facturaId, @RequestBody Factura factura) {
        Factura updatedFactura = facturaService.updateFactura(facturaId, factura);
        return new ResponseEntity<>(updatedFactura, HttpStatus.OK);
    }

    @DeleteMapping("/{facturaId}")
    public ResponseEntity<Void> deleteFactura(@PathVariable Integer facturaId) {
        facturaService.deleteFactura(facturaId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
