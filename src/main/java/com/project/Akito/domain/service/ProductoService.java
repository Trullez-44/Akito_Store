package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.ProductoRepository;
import com.project.Akito.persintence.entity.Producto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Producto updateProducto(Integer id, Producto producto) {
        Optional<Producto> existingProductoOptional = productoRepository.findById(id);

        if (existingProductoOptional.isPresent()) {
            Producto existingProducto = existingProductoOptional.get();

            // Copiar propiedades no nulas de producto a existingProducto
            BeanUtils.copyProperties(producto, existingProducto, "producoId");

            return productoRepository.save(existingProducto);
        }

        return null; // Devuelve null si no se encuentra el producto con el ID proporcionado
    }



}
