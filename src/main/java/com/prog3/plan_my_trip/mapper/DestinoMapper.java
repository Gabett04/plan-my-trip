
package com.prog3.plan_my_trip.mapper;

import com.prog3.plan_my_trip.dto.request.DestinoRequest;
import com.prog3.plan_my_trip.dto.response.DestinoResponse;
import com.prog3.plan_my_trip.entity.Destino;
import org.springframework.stereotype.Component;

@Component
public class DestinoMapper {
    public Destino toEntity(DestinoRequest request) {
        return Destino.builder().nombre(request.getNombre()).pais(request.getPais()).ciudad(request.getCiudad()).descripcion(request.getDescripcion()).build();
    }

    public DestinoResponse toResponse(Destino destino) {
        return DestinoResponse.builder().id(destino.getId()).nombre(destino.getNombre()).pais(destino.getPais()).ciudad(destino.getCiudad()).descripcion(destino.getDescripcion()).createdAt(destino.getCreatedAt()).build();
    }
}
