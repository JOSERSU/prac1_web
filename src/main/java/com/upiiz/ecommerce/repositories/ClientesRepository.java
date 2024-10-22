package com.upiiz.ecommerce.repositories;

import com.upiiz.ecommerce.models.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ClientesRepository {
    private List<Cliente> clientes = new ArrayList<Cliente>();//Evitar el null pointer exception
    private AtomicLong id = new AtomicLong();

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public Cliente obntenerClienteById(Long id){
        return clientes.stream().filter(cliente -> cliente.getId().equals(id)).findFirst().orElse(null);
    }

    public Cliente guardarCliente(Cliente cliente){
        cliente.setId(id.incrementAndGet());
        clientes.add(cliente);
        return cliente;
    }

    public void eliminarCliente(Long id){
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }

    public Cliente actualizarCliente(Cliente cliente){
        eliminarCliente(cliente.getId());
        clientes.add(cliente);
        return cliente;
    }
}
