package com.prog3.plan_my_trip.service;

import com.prog3.plan_my_trip.dto.request.DestinoOrderRequest;
import com.prog3.plan_my_trip.dto.request.DestinoRequest;
import com.prog3.plan_my_trip.dto.response.DestinoResponse;
import java.util.List;

public interface DestinoService {

    DestinoResponse crear(DestinoRequest request);

    List<DestinoResponse> listarTodos();

    DestinoResponse obtenerPorId(Long id);

    DestinoResponse actualizar(Long id, DestinoRequest request);

    void eliminar(Long id);

    void agregarDestinoAItinerario(Long itinerarioId, Long destinoId, Integer orden, String userEmail);

    List<DestinoResponse> listarPorItinerario(Long itinerarioId, String userEmail);
    void quitarDestinoDeItinerario(Long itinerarioId, Long destinoId, String userEmail);
    void reordenarDestinos(Long itinerarioId, List<DestinoOrderRequest> ordenes, String userEmail);
}
