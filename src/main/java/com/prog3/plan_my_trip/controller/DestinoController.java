package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.request.DestinoOrderRequest;
import com.prog3.plan_my_trip.dto.request.DestinoRequest;
import com.prog3.plan_my_trip.dto.response.DestinoResponse;
import com.prog3.plan_my_trip.service.DestinoService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/destinos"})
@Tag(
        name = "Destinos",
        description = "Gestión de destinos turísticos"
)
@SecurityRequirement(
        name = "bearerAuth"
)
@CrossOrigin(
        origins = {"*"}
)
public class DestinoController {
    private final DestinoService destinoService;

    @PostMapping
    @Operation(
            summary = "Crear nuevo destino"
    )
    public ResponseEntity<DestinoResponse> crear(@RequestBody @Valid DestinoRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.destinoService.crear(request));
    }

    @GetMapping
    @Operation(
            summary = "Listar todos los destinos"
    )
    public ResponseEntity<List<DestinoResponse>> listar() {
        return ResponseEntity.ok(this.destinoService.listarTodos());
    }

    @GetMapping({"/{id}"})
    @Operation(
            summary = "Obtener destino por ID"
    )
    public ResponseEntity<DestinoResponse> obtener(@PathVariable Long id) {
        return ResponseEntity.ok(this.destinoService.obtenerPorId(id));
    }

    @PutMapping({"/{id}"})
    @Operation(
            summary = "Actualizar destino"
    )
    public ResponseEntity<DestinoResponse> actualizar(@PathVariable Long id, @RequestBody @Valid DestinoRequest request) {
        return ResponseEntity.ok(this.destinoService.actualizar(id, request));
    }

    @DeleteMapping({"/{id}"})
    @Operation(
            summary = "Eliminar destino"
    )
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        this.destinoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping({"/itinerario/{itinerarioId}/destino/{destinoId}"})
    @Operation(
            summary = "Agregar destino a itinerario"
    )
    public ResponseEntity<Void> agregarAItinerario(@PathVariable Long itinerarioId, @PathVariable Long destinoId, @RequestParam Integer orden, Authentication authentication) {
        this.destinoService.agregarDestinoAItinerario(itinerarioId, destinoId, orden, authentication.getName());
        return ResponseEntity.ok().build();
    }

    @GetMapping({"/itinerario/{itinerarioId}/destinos"})
    @Operation(
            summary = "Listar destinos de un itinerario"
    )
    public ResponseEntity<List<DestinoResponse>> listarPorItinerario(@PathVariable Long itinerarioId, Authentication authentication) {
        return ResponseEntity.ok(this.destinoService.listarPorItinerario(itinerarioId, authentication.getName()));
    }

    @DeleteMapping({"/itinerario/{itinerarioId}/destino/{destinoId}"})
    @Operation(
            summary = "Quitar un destino de un itinerario"
    )
    public ResponseEntity<Void> quitarDestino(@PathVariable Long itinerarioId, @PathVariable Long destinoId, Authentication authentication) {
        this.destinoService.quitarDestinoDeItinerario(itinerarioId, destinoId, authentication.getName());
        return ResponseEntity.noContent().build();
    }

    @PostMapping({"/itinerario/{itinerarioId}/destinos/reorder"})
    @Operation(
            summary = "Reordenar destinos del itinerario"
    )
    public ResponseEntity<Void> reordenar(@PathVariable Long itinerarioId, @RequestBody List<DestinoOrderRequest> ordenes, Authentication authentication) {
        this.destinoService.reordenarDestinos(itinerarioId, ordenes, authentication.getName());
        return ResponseEntity.ok().build();
    }

    @Generated
    public DestinoController(final DestinoService destinoService) {
        this.destinoService = destinoService;
    }
}