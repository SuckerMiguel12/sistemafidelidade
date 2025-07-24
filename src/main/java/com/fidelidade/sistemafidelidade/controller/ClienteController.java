package com.fidelidade.sistemafidelidade.controller;

import com.fidelidade.sistemafidelidade.model.Cliente;
import com.fidelidade.sistemafidelidade.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

// Swagger
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

@Tag(name = "Clientes", description = "Gerenciamento dos clientes e seus pontos de fidelidade")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Operation(summary = "Listar todos os clientes", description = "Retorna todos os clientes cadastrados")
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Aqui você pode adicionar os outros endpoints (POST, PUT, DELETE)
}
