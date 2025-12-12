package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.response.UsuarioResponse;
import com.prog3.plan_my_trip.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Generated;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/usuarios"})
@Tag(
        name = "Usuarios",
        description = "Gestión de usuarios"
)
@SecurityRequirement(
        name = "bearerAuth"
)
@CrossOrigin(
        origins = {"*"}
)
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping({"/me"})
    @Operation(
            summary = "Obtener perfil del usuario actual"
    )
    public ResponseEntity<UsuarioResponse> obtenerPerfil(Authentication authentication) {
        return ResponseEntity.ok(this.usuarioService.obtenerPorEmail(authentication.getName()));
    }

    @GetMapping({"/{id}"})
    @Operation(
            summary = "Obtener usuario por ID"
    )
    public ResponseEntity<UsuarioResponse> obtener(@PathVariable Long id) {
        return ResponseEntity.ok(this.usuarioService.obtenerPorId(id));
    }

    @Generated
    public UsuarioController(final UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
