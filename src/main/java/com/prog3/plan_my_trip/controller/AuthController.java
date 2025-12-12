package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.request.LoginRequest;
import com.prog3.plan_my_trip.dto.request.UsuarioRegistroRequest;
import com.prog3.plan_my_trip.dto.response.LoginResponse;
import com.prog3.plan_my_trip.dto.response.UsuarioResponse;
import com.prog3.plan_my_trip.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/auth"})
@Tag(
        name = "Authentication",
        description = "Endpoints de autenticación"
)
@CrossOrigin(
        origins = {"*"}
)
public class AuthController {
    private final UsuarioService usuarioService;

    @PostMapping({"/register"})
    @Operation(
            summary = "Registrar nuevo usuario"
    )
    public ResponseEntity<UsuarioResponse> registrar(@RequestBody @Valid UsuarioRegistroRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.usuarioService.registrar(request));
    }

    @PostMapping({"/login"})
    @Operation(
            summary = "Iniciar sesión"
    )
    public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(this.usuarioService.login(request));
    }

    @Generated
    public AuthController(final UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
