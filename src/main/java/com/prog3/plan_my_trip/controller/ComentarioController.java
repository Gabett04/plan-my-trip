package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.request.ComentarioRequest;
import com.prog3.plan_my_trip.dto.response.ComentarioResponse;
import com.prog3.plan_my_trip.service.ComentarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import lombok.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/comentarios"})
@Tag(
        name = "Comentarios",
        description = "Gestión de comentarios en actividades"
)
@SecurityRequirement(
        name = "bearerAuth"
)
@CrossOrigin(
        origins = {"*"}
)
public class ComentarioController {
    private final ComentarioService comentarioService;

    @PostMapping({"/actividad/{actividadId}"})
    @Operation(
            summary = "Crear nuevo comentario en una actividad"
    )
    public ResponseEntity<ComentarioResponse> crear(@PathVariable Long actividadId, @RequestBody @Valid ComentarioRequest request, Authentication authentication) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.comentarioService.crear(actividadId, request, authentication.getName()));
    }

    @GetMapping({"/actividad/{actividadId}"})
    @Operation(
            summary = "Listar comentarios de una actividad"
    )
    public ResponseEntity<List<ComentarioResponse>> listar(@PathVariable Long actividadId, Authentication authentication) {
        return ResponseEntity.ok(this.comentarioService.listarPorActividad(actividadId, authentication.getName()));
    }

    @DeleteMapping({"/{id}"})
    @Operation(
            summary = "Eliminar comentario"
    )
    public ResponseEntity<Void> eliminar(@PathVariable Long id, Authentication authentication) {
        this.comentarioService.eliminar(id, authentication.getName());
        return ResponseEntity.noContent().build();
    }

    @Generated
    public ComentarioController(final ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }
}
