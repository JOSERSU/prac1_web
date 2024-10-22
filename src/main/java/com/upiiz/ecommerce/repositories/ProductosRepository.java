package com.upiiz.ecommerce.repositories;

import com.upiiz.ecommerce.models.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductosRepository {
    private List<Producto> productos = new ArrayList<Producto>(); // Evitar el null pointer exception
    private AtomicLong id = new AtomicLong();

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public Producto obtenerProductoById(Long id) {
        return productos.stream().filter(producto -> producto.getId().equals(id)).findFirst().orElse(null);
    }

    public Producto guardarProducto(Producto producto) {
        producto.setId(id.incrementAndGet());
        productos.add(producto);
        return producto;
    }

    public void eliminarProducto(Long id) {
        productos.removeIf(producto -> producto.getId().equals(id));
    }

    public Producto actualizarProducto(Producto producto) {
        eliminarProducto(producto.getId());
        productos.add(producto);
        return producto;
    }
}
