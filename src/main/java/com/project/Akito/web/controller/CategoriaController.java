package com.project.Akito.web.controller;

import com.project.Akito.domain.service.CategoriaService;
import com.project.Akito.persintence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin("*")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> getAll() {
        List<Categoria> categorias = categoriaService.getAll();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    @GetMapping("/{categoriaId}")
    public ResponseEntity<Categoria> getCategoriaById(@PathVariable Integer categoriaId) {
        Categoria categoria = categoriaService.getById(categoriaId);
        if (categoria != null) {
            return new ResponseEntity<>(categoria, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
        Categoria createdCategoria = categoriaService.saveCategoria(categoria);
        return new ResponseEntity<>(createdCategoria, HttpStatus.CREATED);
    }

//    @PutMapping("/{categoriaId}")
//    public ResponseEntity<Categoria> updateCategoria(@PathVariable Integer categoriaId, @RequestBody Categoria nuevaCategoria) {
//        Optional<Categoria> updatedCategoria = categoriaService.updateCategoria(categoriaId, nuevaCategoria);
//        if (updatedCategoria.isPresent()) {
//            return new ResponseEntity<>(updatedCategoria.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    @DeleteMapping("/{categoriaId}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Integer categoriaId) {
        boolean deleted = categoriaService.deleteCategoria(categoriaId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
