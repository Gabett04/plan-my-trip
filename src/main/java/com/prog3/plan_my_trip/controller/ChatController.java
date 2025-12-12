//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.controller;

import com.prog3.plan_my_trip.dto.request.ChatMensajeRequest;
import com.prog3.plan_my_trip.dto.response.ChatMensajeResponse;
import com.prog3.plan_my_trip.service.ChatService;
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
@RequestMapping({"/api/chat"})
@Tag(
        name = "Chat",
        description = "Chat de itinerarios"
)
@SecurityRequirement(
        name = "bearerAuth"
)
@CrossOrigin(
        origins = {"*"}
)
public class ChatController {
    private final ChatService chatService;

    @PostMapping({"/itinerario/{itinerarioId}"})
    @Operation(
            summary = "Enviar mensaje al chat del itinerario"
    )
    public ResponseEntity<ChatMensajeResponse> enviar(@PathVariable Long itinerarioId, @RequestBody @Valid ChatMensajeRequest request, Authentication authentication) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.chatService.enviar(itinerarioId, request, authentication.getName()));
    }

    @GetMapping({"/itinerario/{itinerarioId}"})
    @Operation(
            summary = "Listar mensajes del chat del itinerario"
    )
    public ResponseEntity<List<ChatMensajeResponse>> listar(@PathVariable Long itinerarioId, Authentication authentication) {
        return ResponseEntity.ok(this.chatService.listarPorItinerario(itinerarioId, authentication.getName()));
    }

    @Generated
    public ChatController(final ChatService chatService) {
        this.chatService = chatService;
    }
}
