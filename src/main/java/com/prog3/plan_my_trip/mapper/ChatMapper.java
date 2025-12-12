
package com.prog3.plan_my_trip.mapper;

import com.prog3.plan_my_trip.dto.request.ChatMensajeRequest;
import com.prog3.plan_my_trip.dto.response.ChatMensajeResponse;
import com.prog3.plan_my_trip.entity.ChatItinerario;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.entity.Usuario;
import com.prog3.plan_my_trip.entity.ChatItinerario.TipoMensaje;
import org.springframework.stereotype.Component;

@Component
public class ChatMapper {
    public ChatItinerario toEntity(ChatMensajeRequest request, Itinerario itinerario, Usuario usuario) {
        return ChatItinerario.builder().itinerario(itinerario).usuario(usuario).mensaje(request.getMensaje()).tipo(request.getTipo() != null ? TipoMensaje.valueOf(request.getTipo()) : TipoMensaje.TEXTO).build();
    }

    public ChatMensajeResponse toResponse(ChatItinerario chat) {
        return ChatMensajeResponse.builder().id(chat.getId()).itinerarioId(chat.getItinerario().getId()).usuarioId(chat.getUsuario().getId()).nombreUsuario(chat.getUsuario().getNombreCompleto()).mensaje(chat.getMensaje()).tipo(chat.getTipo().name()).createdAt(chat.getCreatedAt()).build();
    }
}
