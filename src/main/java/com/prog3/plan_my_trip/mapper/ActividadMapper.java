//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.mapper;

import com.prog3.plan_my_trip.dto.request.ActividadRequest;
import com.prog3.plan_my_trip.dto.response.ActividadResponse;
import com.prog3.plan_my_trip.entity.Actividad;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.entity.Actividad.TipoActividad;
import org.springframework.stereotype.Component;

@Component
public class ActividadMapper {
    public Actividad toEntity(ActividadRequest request, Itinerario itinerario) {
        return Actividad.builder().itinerario(itinerario).tipoActividad(TipoActividad.valueOf(request.getTipoActividad())).titulo(request.getTitulo()).descripcion(request.getDescripcion()).fechaHoraInicio(request.getFechaHoraInicio()).fechaHoraFin(request.getFechaHoraFin()).ubicacion(request.getUbicacion()).costo(request.getCosto()).moneda(request.getMoneda() != null ? request.getMoneda() : "USD").notas(request.getNotas()).build();
    }

    public ActividadResponse toResponse(Actividad actividad) {
        return ActividadResponse.builder().id(actividad.getId()).itinerarioId(actividad.getItinerario().getId()).tipoActividad(actividad.getTipoActividad().name()).titulo(actividad.getTitulo()).descripcion(actividad.getDescripcion()).fechaHoraInicio(actividad.getFechaHoraInicio()).fechaHoraFin(actividad.getFechaHoraFin()).ubicacion(actividad.getUbicacion()).costo(actividad.getCosto()).moneda(actividad.getMoneda()).notas(actividad.getNotas()).createdAt(actividad.getCreatedAt()).build();
    }
}
