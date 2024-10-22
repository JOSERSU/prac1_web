package com.upiiz.ecommerce.controllers;

import com.upiiz.ecommerce.models.Cliente;
import com.upiiz.ecommerce.services.ClientesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {
    ClientesService clientesService;

    public ClientesController(ClientesService clientesService){
        this.clientesService = clientesService;}

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes(){
        return ResponseEntity.ok(clientesService.getAllClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long id){
        return ResponseEntity.ok(clientesService.getClienteById(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clientesService.createCliente(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente, @PathVariable Long id){
        cliente.setId(id);
        return ResponseEntity.ok(clientesService.updateCliente(cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id){
        clientesService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }
}
