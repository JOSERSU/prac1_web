package com.upiiz.ecommerce.repositories;

import com.upiiz.ecommerce.models.Categoria;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CategoriasRepository {
    private List<Categoria> categorias = new ArrayList<Categoria>();//Evitar el null pointer exception
    private AtomicLong id = new AtomicLong();

    public List<Categoria> obtenerCategorias() {
        return categorias;
    }

    public Categoria obntenerCategoriaById(Long id){
        return categorias.stream().filter(categoria -> categoria.getId().equals(id)).findFirst().orElse(null);
    }

    public Categoria guardarCategoria(Categoria categoria){
        categoria.setId(id.incrementAndGet());
        categorias.add(categoria);
        return categoria;
    }

    public void eliminarCategoria(Long id){
        categorias.removeIf(categoria -> categoria.getId().equals(id));
    }

    public Categoria actualizarCategoria(Categoria categoria){
        eliminarCategoria(categoria.getId());
        categorias.add(categoria);
        return categoria;
    }
}
