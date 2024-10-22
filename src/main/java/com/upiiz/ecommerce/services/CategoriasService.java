package com.upiiz.ecommerce.services;

import com.upiiz.ecommerce.models.Categoria;
import com.upiiz.ecommerce.repositories.CategoriasRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasService {
    CategoriasRepository categoriasRepository;

    public CategoriasService(CategoriasRepository categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }

    public List<Categoria> getAllCategorias(){
        return categoriasRepository.obtenerCategorias();
    }

    public Categoria getCategoriaById(Long id){
        return categoriasRepository.obntenerCategoriaById(id);
    }

    public Categoria createCategoria(Categoria categoria){
        return categoriasRepository.guardarCategoria(categoria);
    }

    public Categoria updateCategoria(Categoria categoria){
        return categoriasRepository.actualizarCategoria(categoria);
    }

    public void deleteCategoria(Long id){
        categoriasRepository.eliminarCategoria(id);
    }
}
