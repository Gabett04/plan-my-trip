package com.prog3.plan_my_trip.service;

import com.prog3.plan_my_trip.dto.request.ChatMensajeRequest;
import com.prog3.plan_my_trip.dto.response.ChatMensajeResponse;
import java.util.List;

public interface ChatService {

    ChatMensajeResponse enviar(Long itinerarioId, ChatMensajeRequest request, String userEmail);

    List<ChatMensajeResponse> listarPorItinerario(Long itinerarioId, String userEmail);
}
