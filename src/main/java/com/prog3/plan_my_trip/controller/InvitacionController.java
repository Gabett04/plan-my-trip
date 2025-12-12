//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.request.InvitacionRequest;
import com.prog3.plan_my_trip.dto.response.InvitacionResponse;
import com.prog3.plan_my_trip.service.InvitacionService;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/invitaciones"})
@Tag(
        name = "Invitaciones",
        description = "Gestión de invitaciones a itinerarios"
)
@SecurityRequirement(
        name = "bearerAuth"
)
@CrossOrigin(
        origins = {"*"}
)
public class InvitacionController {
    private final InvitacionService invitacionService;

    @PostMapping({"/itinerario/{itinerarioId}"})
    @Operation(
            summary = "Crear nueva invitación"
    )
    public ResponseEntity<InvitacionResponse> crear(@PathVariable Long itinerarioId, @RequestBody @Valid InvitacionRequest request, Authentication authentication) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.invitacionService.crear(itinerarioId, request, authentication.getName()));
    }

    @GetMapping({"/itinerario/{itinerarioId}"})
    @Operation(
            summary = "Listar invitaciones de un itinerario"
    )
    public ResponseEntity<List<InvitacionResponse>> listar(@PathVariable Long itinerarioId, Authentication authentication) {
        return ResponseEntity.ok(this.invitacionService.listarPorItinerario(itinerarioId, authentication.getName()));
    }

    @GetMapping({"/token/{token}"})
    @Operation(
            summary = "Obtener invitación por token"
    )
    public ResponseEntity<InvitacionResponse> obtenerPorToken(@PathVariable String token) {
        return ResponseEntity.ok(this.invitacionService.obtenerPorToken(token));
    }

    @PostMapping({"/aceptar/{token}"})
    @Operation(
            summary = "Aceptar invitación"
    )
    public ResponseEntity<Void> aceptar(@PathVariable String token, Authentication authentication) {
        this.invitacionService.aceptarInvitacion(token, authentication.getName());
        return ResponseEntity.ok().build();
    }

    @PostMapping({"/rechazar/{token}"})
    @Operation(
            summary = "Rechazar invitación"
    )
    public ResponseEntity<Void> rechazar(@PathVariable String token, Authentication authentication) {
        this.invitacionService.rechazarInvitacion(token, authentication.getName());
        return ResponseEntity.ok().build();
    }

    @Generated
    public InvitacionController(final InvitacionService invitacionService) {
        this.invitacionService = invitacionService;
    }
}
