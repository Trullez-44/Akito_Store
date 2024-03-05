package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.DetalleFacturaRepository;
import com.project.Akito.persintence.entity.DetalleFactura;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public DetalleFactura updateDetalleFactura(Integer id, DetalleFactura detalleFactura) {
        Optional<DetalleFactura> existingDetalleFacturaOptional = detalleFacturaRepository.findById(id);

        if (existingDetalleFacturaOptional.isPresent()) {
            DetalleFactura existingDetalleFactura = existingDetalleFacturaOptional.get();
            // Copia las propiedades de la entidad existente a la nueva
            BeanUtils.copyProperties(detalleFactura, existingDetalleFactura, "detalleFacturaId");
            return detalleFacturaRepository.save(existingDetalleFactura);
        } else {
            return null; // O lanza una excepción indicando que no se encontró el detalleFactura
        }
    }
}
