package com.prog3.plan_my_trip.service;

import com.prog3.plan_my_trip.dto.request.ActividadRequest;
import com.prog3.plan_my_trip.dto.response.ActividadResponse;
import java.util.List;

public interface ActividadService {

    ActividadResponse crear(Long itinerarioId, ActividadRequest request, String userEmail);

    List<ActividadResponse> listarPorItinerario(Long itinerarioId, String userEmail);

    ActividadResponse obtenerPorId(Long id, String userEmail);

    ActividadResponse actualizar(Long id, ActividadRequest request, String userEmail);

    void eliminar(Long id, String userEmail);
}
