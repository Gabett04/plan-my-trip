package com.prog3.plan_my_trip.service;

import com.prog3.plan_my_trip.dto.request.ComentarioRequest;
import com.prog3.plan_my_trip.dto.response.ComentarioResponse;
import java.util.List;

public interface ComentarioService {

    ComentarioResponse crear(Long actividadId, ComentarioRequest request, String userEmail);

    List<ComentarioResponse> listarPorActividad(Long actividadId, String userEmail);

    void eliminar(Long id, String userEmail);
}
