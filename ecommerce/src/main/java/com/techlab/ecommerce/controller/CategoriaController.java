package com.techlab.ecommerce.controller;

import com.techlab.ecommerce.model.Categoria;
import com.techlab.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    // GET: Obtener todas las categorías
    @GetMapping
    public List<Categoria> listarTodas() {
        return categoriaService.obtenerTodas();
    }

    // POST: Crear una nueva categoría
    @PostMapping
    public ResponseEntity<Categoria> crear(@RequestBody Categoria categoria) {
        Categoria nuevaCategoria = categoriaService.guardar(categoria);
        return ResponseEntity.ok(nuevaCategoria);
    }
}