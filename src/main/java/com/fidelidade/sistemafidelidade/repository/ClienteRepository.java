package com.fidelidade.sistemafidelidade.repository;

import com.fidelidade.sistemafidelidade.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
