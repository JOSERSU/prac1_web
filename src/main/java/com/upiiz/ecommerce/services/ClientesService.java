package com.upiiz.ecommerce.services;

import com.upiiz.ecommerce.models.Cliente;
import com.upiiz.ecommerce.repositories.ClientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {
    ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public List<Cliente> getAllClientes(){
        return clientesRepository.obtenerClientes();
    }

    public Cliente getClienteById(Long id){
        return clientesRepository.obntenerClienteById(id);
    }

    public Cliente createCliente(Cliente cliente){
        return clientesRepository.guardarCliente(cliente);
    }

    public Cliente updateCliente(Cliente cliente){
        return clientesRepository.actualizarCliente(cliente);
    }

    public void deleteCliente(Long id){
        clientesRepository.eliminarCliente(id);
    }
}
