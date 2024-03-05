package com.project.Akito.domain.repository;

import com.project.Akito.persintence.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    // Buscar categoría por nombre
    Categoria findByNombreCategoria(String nombreCategoria);

    // Contar cuántas categorías existen
    Long countAll();

    // Eliminar categoría por nombre
    void deleteByNombreCategoria(String nombreCategoria);

    // Verificar si existe una categoría por nombre
    Boolean existsByNombreCategoria(String nombreCategoria);

    // Buscar todas las categorías
    List<Categoria> findAll();

}
