package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Recebe a entidade (Usuario) e o tipo da chave primária (Long)
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Só de estender JpaRepository, você ganha de graça métodos como:
    // save(), findAll(), findById(), deleteById()
}


