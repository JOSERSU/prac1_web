package com.upiiz.ecommerce.repositories;

import com.upiiz.ecommerce.models.Orden;
import com.upiiz.ecommerce.models.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class OrdenesRepository {
    private List<Orden> ordenes = new ArrayList<Orden>(); // Evitar el null pointer exception
    private AtomicLong id = new AtomicLong();

    public List<Orden> obtenerOrdenes() {
        return ordenes;
    }

    public Orden obtenerOrdenById(Long id) {
        return ordenes.stream().filter(orden -> orden.getId().equals(id)).findFirst().orElse(null);
    }

    public Orden guardarOrden(Orden orden) {
        orden.setId(id.incrementAndGet());
        ordenes.add(orden);
        return orden;
    }

    public void eliminarOrden(Long id) {
        ordenes.removeIf(orden -> orden.getId().equals(id));
    }

    public Orden actualizarOrden(Orden orden) {
        eliminarOrden(orden.getId());
        ordenes.add(orden);
        return orden;
    }
}
