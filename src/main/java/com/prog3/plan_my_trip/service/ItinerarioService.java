package com.prog3.plan_my_trip.service;

import com.prog3.plan_my_trip.dto.request.ItinerarioRequest;
import com.prog3.plan_my_trip.dto.response.ItinerarioResponse;

import java.util.List;

public interface ItinerarioService {

    ItinerarioResponse crear(ItinerarioRequest request, String emailUsuario);

    List<ItinerarioResponse> listarPorUsuario(String emailUsuario);

    ItinerarioResponse obtenerPorId(Long id, String emailUsuario);

    ItinerarioResponse actualizar(Long id, ItinerarioRequest request, String emailUsuario);

    void eliminar(Long id, String emailUsuario);
}
