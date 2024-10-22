package com.upiiz.ecommerce.services;

import com.upiiz.ecommerce.models.Orden;
import com.upiiz.ecommerce.repositories.OrdenesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenesService {
    OrdenesRepository ordenesRepository;

    public OrdenesService(OrdenesRepository ordenesRepository) {
        this.ordenesRepository = ordenesRepository;
    }

    public List<Orden> getAllOrdenes() {
        return ordenesRepository.obtenerOrdenes();
    }

    public Orden getOrdenById(Long id) {
        return ordenesRepository.obtenerOrdenById(id);
    }

    public Orden createOrden(Orden orden) {
        return ordenesRepository.guardarOrden(orden);
    }

    public Orden updateOrden(Orden orden) {
        return ordenesRepository.actualizarOrden(orden);
    }

    public void deleteOrden(Long id) {
        ordenesRepository.eliminarOrden(id);
    }
}
