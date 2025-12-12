//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.mapper;

import com.prog3.plan_my_trip.dto.request.UsuarioRegistroRequest;
import com.prog3.plan_my_trip.dto.response.UsuarioResponse;
import com.prog3.plan_my_trip.entity.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {
    public Usuario toEntity(UsuarioRegistroRequest request) {
        return Usuario.builder().nombreCompleto(request.getNombreCompleto()).email(request.getEmail()).fechaNacimiento(request.getFechaNacimiento()).telefono(request.getTelefono()).build();
    }

    public UsuarioResponse toResponse(Usuario usuario) {
        return UsuarioResponse.builder().id(usuario.getId()).nombreCompleto(usuario.getNombreCompleto()).email(usuario.getEmail()).fechaNacimiento(usuario.getFechaNacimiento()).telefono(usuario.getTelefono()).rol(usuario.getRol().name()).activo(usuario.getActivo()).createdAt(usuario.getCreatedAt()).build();
    }
}
