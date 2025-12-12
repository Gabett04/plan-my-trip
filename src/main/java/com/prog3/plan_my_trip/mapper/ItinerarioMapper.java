//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.mapper;

import com.prog3.plan_my_trip.dto.request.ItinerarioRequest;
import com.prog3.plan_my_trip.dto.response.ItinerarioResponse;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.entity.Usuario;
import com.prog3.plan_my_trip.entity.Itinerario.Visibilidad;
import org.springframework.stereotype.Component;

@Component
public class ItinerarioMapper {
    public Itinerario toEntity(ItinerarioRequest request, Usuario usuario) {
        return Itinerario.builder().usuario(usuario).titulo(request.getTitulo()).descripcion(request.getDescripcion()).fechaInicio(request.getFechaInicio()).fechaFin(request.getFechaFin()).presupuestoTotal(request.getPresupuestoTotal()).visibilidad(request.getVisibilidad() != null ? Visibilidad.valueOf(request.getVisibilidad()) : Visibilidad.PRIVADO).build();
    }

    public ItinerarioResponse toResponse(Itinerario itinerario) {
        return ItinerarioResponse.builder().id(itinerario.getId()).usuarioId(itinerario.getUsuario().getId()).titulo(itinerario.getTitulo()).descripcion(itinerario.getDescripcion()).fechaInicio(itinerario.getFechaInicio()).fechaFin(itinerario.getFechaFin()).presupuestoTotal(itinerario.getPresupuestoTotal()).visibilidad(itinerario.getVisibilidad().name()).createdAt(itinerario.getCreatedAt()).cantidadActividades(itinerario.getActividades().size()).build();
    }
}
