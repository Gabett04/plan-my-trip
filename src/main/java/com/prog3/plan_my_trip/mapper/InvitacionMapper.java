
package com.prog3.plan_my_trip.mapper;

import com.prog3.plan_my_trip.dto.request.InvitacionRequest;
import com.prog3.plan_my_trip.dto.response.InvitacionResponse;
import com.prog3.plan_my_trip.entity.InvitacionItinerario;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.entity.InvitacionItinerario.Estado;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class InvitacionMapper {
    public InvitacionItinerario toEntity(InvitacionRequest request, Itinerario itinerario) {
        return InvitacionItinerario.builder().itinerario(itinerario).emailInvitado(request.getEmailInvitado()).tokenAcceso(UUID.randomUUID().toString()).fechaExpiracion(request.getFechaExpiracion()).estado(Estado.PENDIENTE).build();
    }

    public InvitacionResponse toResponse(InvitacionItinerario invitacion) {
        return InvitacionResponse.builder().id(invitacion.getId()).itinerarioId(invitacion.getItinerario().getId()).emailInvitado(invitacion.getEmailInvitado()).fechaInvitacion(invitacion.getFechaInvitacion()).fechaExpiracion(invitacion.getFechaExpiracion()).estado(invitacion.getEstado().name()).createdAt(invitacion.getCreatedAt()).build();
    }
}
