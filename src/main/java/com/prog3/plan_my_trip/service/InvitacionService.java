package com.prog3.plan_my_trip.service;

import com.prog3.plan_my_trip.dto.request.InvitacionRequest;
import com.prog3.plan_my_trip.dto.response.InvitacionResponse;
import java.util.List;

public interface InvitacionService {

    InvitacionResponse crear(Long itinerarioId, InvitacionRequest request, String userEmail);

    List<InvitacionResponse> listarPorItinerario(Long itinerarioId, String userEmail);

    InvitacionResponse obtenerPorToken(String token);

    void aceptarInvitacion(String token, String userEmail);

    void rechazarInvitacion(String token, String userEmail);
}
