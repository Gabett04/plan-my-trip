package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.request.ItinerarioRequest;
import com.prog3.plan_my_trip.dto.response.ItinerarioResponse;
import com.prog3.plan_my_trip.service.ItinerarioService;
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
@RequestMapping({"/api/itinerarios"})
@Tag(
        name = "Itinerarios",
        description = "Gestión de itinerarios de viaje"
)
@SecurityRequirement(
        name = "bearerAuth"
)
@CrossOrigin(
        origins = {"*"}
)
public class ItinerarioController {
    private final ItinerarioService itinerarioService;

    @PostMapping
    @Operation(
            summary = "Crear nuevo itinerario"
    )
    public ResponseEntity<ItinerarioResponse> crear(@RequestBody @Valid ItinerarioRequest request, Authentication authentication) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.itinerarioService.crear(request, authentication.getName()));
    }

    @GetMapping
    @Operation(
            summary = "Listar itinerarios del usuario"
    )
    public ResponseEntity<List<ItinerarioResponse>> listar(Authentication authentication) {
        return ResponseEntity.ok(this.itinerarioService.listarPorUsuario(authentication.getName()));
    }

    @GetMapping({"/{id}"})
    @Operation(
            summary = "Obtener itinerario por ID"
    )
    public ResponseEntity<ItinerarioResponse> obtener(@PathVariable Long id, Authentication authentication) {
        return ResponseEntity.ok(this.itinerarioService.obtenerPorId(id, authentication.getName()));
    }

    @PutMapping({"/{id}"})
    @Operation(
            summary = "Actualizar itinerario"
    )
    public ResponseEntity<ItinerarioResponse> actualizar(@PathVariable Long id, @RequestBody @Valid ItinerarioRequest request, Authentication authentication) {
        return ResponseEntity.ok(this.itinerarioService.actualizar(id, request, authentication.getName()));
    }

    @DeleteMapping({"/{id}"})
    @Operation(
            summary = "Eliminar itinerario"
    )
    public ResponseEntity<Void> eliminar(@PathVariable Long id, Authentication authentication) {
        this.itinerarioService.eliminar(id, authentication.getName());
        return ResponseEntity.noContent().build();
    }

    @Generated
    public ItinerarioController(final ItinerarioService itinerarioService) {
        this.itinerarioService = itinerarioService;
    }
}