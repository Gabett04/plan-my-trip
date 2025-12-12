// ComentarioServiceImpl.java
package com.prog3.plan_my_trip.service.impl;

import com.prog3.plan_my_trip.dto.request.ComentarioRequest;
import com.prog3.plan_my_trip.dto.response.ComentarioResponse;
import com.prog3.plan_my_trip.entity.Actividad;
import com.prog3.plan_my_trip.entity.ComentarioActividad;
import com.prog3.plan_my_trip.entity.Usuario;
import com.prog3.plan_my_trip.exception.BadRequestException;
import com.prog3.plan_my_trip.exception.ResourceNotFoundException;
import com.prog3.plan_my_trip.mapper.ComentarioMapper;
import com.prog3.plan_my_trip.repository.ActividadRepository;
import com.prog3.plan_my_trip.repository.ComentarioRepository;
import com.prog3.plan_my_trip.repository.UsuarioRepository;
import com.prog3.plan_my_trip.service.ComentarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ComentarioServiceImpl implements ComentarioService {

    private final ComentarioRepository comentarioRepository;
    private final ActividadRepository actividadRepository;
    private final UsuarioRepository usuarioRepository;
    private final ComentarioMapper comentarioMapper;

    @Override
    @Transactional
    public ComentarioResponse crear(Long actividadId, ComentarioRequest request, String userEmail) {
        Actividad actividad = actividadRepository.findById(actividadId)
                .orElseThrow(() -> new ResourceNotFoundException("Actividad no encontrada"));

        Usuario usuario = usuarioRepository.findByEmail(userEmail)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));

        ComentarioActividad comentario = comentarioMapper.toEntity(request, actividad, usuario);
        ComentarioActividad saved = comentarioRepository.save(comentario);

        return comentarioMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ComentarioResponse> listarPorActividad(Long actividadId, String userEmail) {
        actividadRepository.findById(actividadId)
                .orElseThrow(() -> new ResourceNotFoundException("Actividad no encontrada"));

        return comentarioRepository.findByActividadId(actividadId)
                .stream()
                .map(comentarioMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void eliminar(Long id, String userEmail) {
        ComentarioActividad comentario = comentarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Comentario no encontrado"));

        if (!comentario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para eliminar este comentario");
        }

        comentarioRepository.delete(comentario);
    }
}