package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Essa anotação avisa o Spring: "Esta classe vai receber requisições HTTP"
@RestController
public class HelloController {

    // Essa anotação diz que requisições GET na rota "/api/ola" devem rodar este método
    @GetMapping("/api/ola")
    public String dizerOla() {
        return "Olá! Meu primeiro backend em Spring Boot está funcionando.";
    }
}