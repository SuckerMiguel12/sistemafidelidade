package com.fidelidade.sistemafidelidade.service;

import com.fidelidade.sistemafidelidade.model.Cliente;
import com.fidelidade.sistemafidelidade.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente criarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Cliente> buscarPorCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    public Optional<Cliente> adicionarPontos(String cpf, int pontos) {
        Optional<Cliente> clienteOpt = repository.findByCpf(cpf);
        clienteOpt.ifPresent(cliente -> {
            cliente.setPontos(cliente.getPontos() + pontos);
            repository.save(cliente);
        });
        return clienteOpt;
    }

    public Optional<Cliente> resgatarPontos(String cpf, int pontos) {
        Optional<Cliente> clienteOpt = repository.findByCpf(cpf);
        clienteOpt.ifPresent(cliente -> {
            if (cliente.getPontos() >= pontos) {
                cliente.setPontos(cliente.getPontos() - pontos);
                repository.save(cliente);
            }
        });
        return clienteOpt;
    }
}
