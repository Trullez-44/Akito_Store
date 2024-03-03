package com.tienda.Akito.domain.service;

import com.tienda.Akito.persistence.entity.Categoria;

import java.util.List;

public interface CategoriaService {

    List<Categoria> getAllCategorias();

    Categoria getCategoriaById(Long categoria_id);

    Categoria saveCategoria(Categoria categoria);

    void deleteCategoria(Long categoria_id);
}
