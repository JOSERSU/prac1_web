package com.upiiz.ecommerce.controllers;

import com.upiiz.ecommerce.models.Orden;
import com.upiiz.ecommerce.services.OrdenesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ordenes")
public class OrdenesController {
    OrdenesService ordenesService;

    public OrdenesController(OrdenesService ordenesService) {
        this.ordenesService = ordenesService;
    }

    @GetMapping
    public ResponseEntity<List<Orden>> getOrdenes() {
        return ResponseEntity.ok(ordenesService.getAllOrdenes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orden> getOrden(@PathVariable Long id) {
        return ResponseEntity.ok(ordenesService.getOrdenById(id));
    }

    @PostMapping
    public ResponseEntity<Orden> addOrden(@RequestBody Orden orden) {
        return ResponseEntity.ok(ordenesService.createOrden(orden));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orden> updateOrden(@RequestBody Orden orden, @PathVariable Long id) {
        orden.setId(id);
        return ResponseEntity.ok(ordenesService.updateOrden(orden));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrden(@PathVariable Long id) {
        ordenesService.deleteOrden(id);
        return ResponseEntity.noContent().build();
    }
}
