package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.FacturaRepository;
import com.project.Akito.persintence.entity.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> getAll() {
        return facturaRepository.findAll();
    }

    public Factura getById(Integer id ){
        return facturaRepository.findById(id).orElse(null);
    }

    public Factura saveFactura(Factura factura) {

        return facturaRepository.save(factura);
    }

    public void deleteFactura(Integer id) {

        facturaRepository.deleteById(id);
    }

}
