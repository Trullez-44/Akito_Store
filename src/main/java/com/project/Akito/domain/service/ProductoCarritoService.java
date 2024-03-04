package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.ProductoCarritoRepository;
import com.project.Akito.persintence.entity.ProductoCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoCarritoService {

    @Autowired
    private ProductoCarritoRepository productoCarritoRepository;

    public List<ProductoCarrito> getAll() {
        return productoCarritoRepository.findAll();
    }

    public ProductoCarrito getById(Integer id ){
        return productoCarritoRepository.findById(id).orElse(null);
    }

    public ProductoCarrito saveProducto(ProductoCarrito producto) {

        return productoCarritoRepository.save(producto);
    }

    public void deleteProducto(Integer id) {

        productoCarritoRepository.deleteById(id);
    }

}
