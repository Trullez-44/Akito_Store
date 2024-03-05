package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.CarritoRepository;
import com.project.Akito.persintence.entity.Carrito;
import com.project.Akito.persintence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;
//
//    public List<Carrito> getAllCarritosByClienteId(Integer clienteId) {
//        return carritoRepository.findAllByClienteId(clienteId);
//    }
//
//    public Long countProductosInCarrito(Integer carritoId) {
//        return carritoRepository.countProductosInCarrito(carritoId);
//    }
//
//    public List<Producto> getAllProductosInCarrito(Integer carritoId) {
//        return carritoRepository.findAllProductosInCarrito(carritoId);
//    }
//
//    public Carrito findLatestCarritoByClienteId(Integer clienteId) {
//        return carritoRepository.findLatestCarritoByClienteId(clienteId);
//    }
//
//    public boolean isProductoInAnyCarrito(Long productoId) {
//        return carritoRepository.isProductoInAnyCarrito(productoId) > 0;
//    }

    public List<Carrito> getAll() {
        return carritoRepository.findAll();
    }

    public Carrito getById(Integer id ){
        return carritoRepository.findById(id).orElse(null);
    }

    public Carrito saveCarrito(Carrito carrito) {

        return carritoRepository.save(carrito);
    }

    public void deleteCarrito(Integer id) {

        carritoRepository.deleteById(id);
    }

}
