package com.techlab.ecommerce.service;

import com.techlab.ecommerce.model.Producto;
import com.techlab.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Obtener todos los productos
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    // Obtener un producto por ID
    public Optional<Producto> obtenerPorId(Integer id) {
        return productoRepository.findById(id);
    }

    // Guardar o actualizar un producto
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    // Eliminar un producto por ID
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}