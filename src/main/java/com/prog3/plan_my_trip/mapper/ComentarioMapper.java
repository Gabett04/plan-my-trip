
package com.prog3.plan_my_trip.mapper;

import com.prog3.plan_my_trip.dto.request.ComentarioRequest;
import com.prog3.plan_my_trip.dto.response.ComentarioResponse;
import com.prog3.plan_my_trip.entity.Actividad;
import com.prog3.plan_my_trip.entity.ComentarioActividad;
import com.prog3.plan_my_trip.entity.Usuario;
import org.springframework.stereotype.Component;

@Component
public class ComentarioMapper {
    public ComentarioActividad toEntity(ComentarioRequest request, Actividad actividad, Usuario usuario) {
        return ComentarioActividad.builder().actividad(actividad).usuario(usuario).comentario(request.getComentario()).build();
    }

    public ComentarioResponse toResponse(ComentarioActividad comentario) {
        return ComentarioResponse.builder().id(comentario.getId()).actividadId(comentario.getActividad().getId()).usuarioId(comentario.getUsuario().getId()).nombreUsuario(comentario.getUsuario().getNombreCompleto()).comentario(comentario.getComentario()).createdAt(comentario.getCreatedAt()).build();
    }
}
