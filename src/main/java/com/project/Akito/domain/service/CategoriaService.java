package com.project.Akito.domain.service;

import com.project.Akito.persintence.entity.Categoria;
import com.project.Akito.domain.repository.CategoriaRepository;
import com.project.Akito.persintence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    public Categoria getById(Integer id ){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria saveCategoria(Categoria categoria) {

        return categoriaRepository.save(categoria);
    }

    public boolean deleteCategoria(Integer id) {

        categoriaRepository.deleteById(id);
        return false;
    }
//    public Optional<Categoria> updateCategoria(Integer id, Categoria nuevaCategoria) {
//        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
//        if (categoriaOptional.isPresent()) {
//            Categoria categoriaExistente = categoriaOptional.get();
//            categoriaExistente.setNombreCategoria(nuevaCategoria.getNombreCategoria());
//            // Puedes agregar más actualizaciones según tus necesidades
//
//            return Optional.of(categoriaRepository.save(categoriaExistente));
//        }
//        return Optional.empty();
//    }
//    public Categoria updateNombreCategoria(Integer id, String nuevoNombre) {
//        Categoria categoria = categoriaRepository.findById(id).orElse(null);
//        if (categoria != null) {
//            categoria.setNombreCategoria(nuevoNombre);
//            return categoriaRepository.save(categoria);
//        }
//        return null;
//    }
//
//    public Categoria agregarProductoACategoria(Integer idCategoria, Producto producto) {
//        Categoria categoria = categoriaRepository.findById(idCategoria).orElse(null);
//        if (categoria != null) {
//            categoria.getProductos().add(producto);
//            return categoriaRepository.save(categoria);
//        }
//        return null;
//    }

}
