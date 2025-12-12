package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.request.ActividadRequest;
import com.prog3.plan_my_trip.dto.response.ActividadResponse;
import com.prog3.plan_my_trip.service.ActividadService;
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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/actividades"})
@Tag(
        name = "Actividades",
        description = "Gestión de actividades de itinerarios"
)
@SecurityRequirement(
        name = "bearerAuth"
)
@CrossOrigin(
        origins = {"*"}
)
public class ActividadController {
    private final ActividadService actividadService;

    @PostMapping({"/itinerario/{itinerarioId}"})
    @Operation(
            summary = "Crear nueva actividad en un itinerario"
    )
    public ResponseEntity<ActividadResponse> crear(@PathVariable Long itinerarioId, @RequestBody @Valid ActividadRequest request, Authentication authentication) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.actividadService.crear(itinerarioId, request, authentication.getName()));
    }

    @GetMapping({"/itinerario/{itinerarioId}"})
    @Operation(
            summary = "Listar actividades de un itinerario"
    )
    public ResponseEntity<List<ActividadResponse>> listarPorItinerario(@PathVariable Long itinerarioId, Authentication authentication) {
        return ResponseEntity.ok(this.actividadService.listarPorItinerario(itinerarioId, authentication.getName()));
    }

    @GetMapping({"/{id}"})
    @Operation(
            summary = "Obtener actividad por ID"
    )
    public ResponseEntity<ActividadResponse> obtener(@PathVariable Long id, Authentication authentication) {
        return ResponseEntity.ok(this.actividadService.obtenerPorId(id, authentication.getName()));
    }

    @PutMapping({"/{id}"})
    @Operation(
            summary = "Actualizar actividad"
    )
    public ResponseEntity<ActividadResponse> actualizar(@PathVariable Long id, @RequestBody @Valid ActividadRequest request, Authentication authentication) {
        return ResponseEntity.ok(this.actividadService.actualizar(id, request, authentication.getName()));
    }

    @DeleteMapping({"/{id}"})
    @Operation(
            summary = "Eliminar actividad"
    )
    public ResponseEntity<Void> eliminar(@PathVariable Long id, Authentication authentication) {
        this.actividadService.eliminar(id, authentication.getName());
        return ResponseEntity.noContent().build();
    }

    @Generated
    public ActividadController(final ActividadService actividadService) {
        this.actividadService = actividadService;
    }
}
