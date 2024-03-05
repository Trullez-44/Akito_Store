package com.project.Akito.domain.service;

import com.project.Akito.persintence.entity.Categoria;
import com.project.Akito.domain.repository.CategoriaRepository;
import com.project.Akito.persintence.entity.Producto;
import org.springframework.beans.BeanUtils;
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

    public Categoria updateCategoria(Integer id, Categoria nuevaCategoria) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);

        if (categoriaOptional.isPresent()) {
            Categoria categoriaExistente = categoriaOptional.get();

            // Copiar propiedades no nulas de nuevaCategoria a categoriaExistente
            BeanUtils.copyProperties(nuevaCategoria, categoriaExistente, "categoriaId", "productos");

            return categoriaRepository.save(categoriaExistente);
        }

        return null; // Devuelve null si no se encuentra la categoría con el ID proporcionado
    }


}
