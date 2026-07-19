package com.techlab.ecommerce.controller;

import com.techlab.ecommerce.model.Producto;
import com.techlab.ecommerce.model.Categoria;
import com.techlab.ecommerce.service.ProductoService;
import com.techlab.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    // GET: Listar todos los productos
    @GetMapping
    public List<Producto> listarTodos() {
        return productoService.obtenerTodos();
    }

    // POST: Crear un nuevo producto asociándolo a una categoría por ID
    @PostMapping("/categoria/{categoriaId}")
    public ResponseEntity<?> crear(@PathVariable Integer categoriaId, @RequestBody Producto producto) {
        Optional<Categoria> categoriaOpt = categoriaService.obtenerPorId(categoriaId);
        
        if (categoriaOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Error: La categoría con ID " + categoriaId + " no existe.");
        }
        
        producto.setCategoria(categoriaOpt.get());
        Producto nuevoProducto = productoService.guardar(producto);
        return ResponseEntity.ok(nuevoProducto);
    }
}