package com.project.Akito.domain.service;

import com.project.Akito.domain.repository.CarritoRepository;
import com.project.Akito.persintence.entity.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

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
