package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    // O Spring injeta essa dependência automaticamente para nós
    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    // Rota GET: Retorna um SELECT * FROM usuario;
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    // Rota POST: Faz um INSERT INTO usuario;
    // O @RequestBody converte o JSON da requisição para o objeto Usuario
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    // Rota PUT: Atualiza um usuário existente pelo ID
    // O @PathVariable captura o ID vindo na URL (ex: /api/usuarios/1)
    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        return repository.findById(id)
                .map(usuarioExistente -> {
                    // Se o usuário existir, atualiza o nome dele
                    usuarioExistente.setNome(usuarioAtualizado.getNome());
                    return repository.save(usuarioExistente);
                })
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o id: " + id));
    }

    // Rota DELETE: Apaga um usuário do banco pelo ID
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Usuário não encontrado com o id: " + id);
        }
    }
}