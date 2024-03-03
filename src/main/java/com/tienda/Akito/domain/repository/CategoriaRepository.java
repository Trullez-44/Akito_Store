package com.tienda.Akito.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.Akito.persistence.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
