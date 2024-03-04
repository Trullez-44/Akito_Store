package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.ProductoRepository;
import com.project.Akito.persintence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    public Producto getById(Integer id ){
        return productoRepository.findById(id).orElse(null);
    }

    public Producto saveProducto(Producto producto) {

        return productoRepository.save(producto);
    }

    public void deleteProducto(Integer id) {

        productoRepository.deleteById(id);
    }

}
