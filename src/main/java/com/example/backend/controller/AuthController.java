package com.example.backend.controller;

import com.example.backend.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsuarioDTO usuarioDTO) {
            // Simulação de login com dados fixos para fins de exemplo e testes
            // Aqui você deve implementar a lógica de autenticação real, como verificar o banco de dados
            if(
                ("admin@email.com".equals(usuarioDTO.getCpfOuEmail()) || "admin123".equals(usuarioDTO.getCpfOuEmail())) &&
                "admin".equals(usuarioDTO.getSenha())
            ) {
                return ResponseEntity.ok("Login realizado com sucesso!");
            } else {
                return ResponseEntity.status(401).body("Credenciais inválidas");
            }
    }
    
}
