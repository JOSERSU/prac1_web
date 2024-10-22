package com.upiiz.ecommerce.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes/{clienteId}/ordenes")
public class OrdenesClientesController {
    // GET - Obtener todas las ordenes de un cliente
    @GetMapping
    public String listarFacturasDeCliente(@PathVariable Long clienteId) {
        return "Muestra todas las facturas del cliente con ID: " + clienteId;
    }

    // GET - Obtener una orden específica de un cliente
    @GetMapping("/{orden_id}")
    public String listarFacturaDeCliente(@PathVariable Long clienteId, @PathVariable Long orden_id) {
        return "Muestra la orden con ID: " + orden_id + " del cliente con ID: " + clienteId;
    }
}

