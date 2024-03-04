package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.DetalleFacturaRepository;
import com.project.Akito.persintence.entity.DetalleFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetalleFacturaService {

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    public List<DetalleFactura> getAll() {
        return detalleFacturaRepository.findAll();
    }

    public DetalleFactura getById(Integer id ){
        return detalleFacturaRepository.findById(id).orElse(null);
    }

    public DetalleFactura saveDetalleFactura(DetalleFactura detalleFactura) {

        return detalleFacturaRepository.save(detalleFactura);
    }

    public void deleteDetalleFactura(Integer id) {

        detalleFacturaRepository.deleteById(id);
    }
}
