package com.project.Akito.domain.repository;

import com.project.Akito.persintence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
