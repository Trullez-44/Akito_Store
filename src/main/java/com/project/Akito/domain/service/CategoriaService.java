package com.project.Akito.domain.service;

import com.project.Akito.persintence.entity.Categoria;
import com.project.Akito.domain.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void deleteCategoria(Integer id) {

        categoriaRepository.deleteById(id);
    }

}
