package com.techlab.ecommerce.service;

import com.techlab.ecommerce.model.Categoria;
import com.techlab.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Obtener todas las categorías
    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }

    // Obtener una categoría por ID
    public Optional<Categoria> obtenerPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    // Guardar una nueva categoría
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Eliminar una categoría por ID
    public void eliminar(Integer id) {
        categoriaRepository.deleteById(id);
    }
}