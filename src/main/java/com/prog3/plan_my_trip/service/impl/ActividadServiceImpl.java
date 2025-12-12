// ActividadServiceImpl.java
package com.prog3.plan_my_trip.service.impl;

import com.prog3.plan_my_trip.dto.request.ActividadRequest;
import com.prog3.plan_my_trip.dto.response.ActividadResponse;
import com.prog3.plan_my_trip.entity.Actividad;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.exception.BadRequestException;
import com.prog3.plan_my_trip.exception.ResourceNotFoundException;
import com.prog3.plan_my_trip.mapper.ActividadMapper;
import com.prog3.plan_my_trip.repository.ActividadRepository;
import com.prog3.plan_my_trip.repository.ItinerarioRepository;
import com.prog3.plan_my_trip.service.ActividadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActividadServiceImpl implements ActividadService {

    private final ActividadRepository actividadRepository;
    private final ItinerarioRepository itinerarioRepository;
    private final ActividadMapper actividadMapper;

    @Override
    @Transactional
    public ActividadResponse crear(Long itinerarioId, ActividadRequest request, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para agregar actividades a este itinerario");
        }

        Actividad actividad = actividadMapper.toEntity(request, itinerario);
        Actividad saved = actividadRepository.save(actividad);

        return actividadMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ActividadResponse> listarPorItinerario(Long itinerarioId, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para ver este itinerario");
        }

        return actividadRepository.findByItinerarioIdOrderByFechaHoraInicio(itinerarioId)
                .stream()
                .map(actividadMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ActividadResponse obtenerPorId(Long id, String userEmail) {
        Actividad actividad = actividadRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Actividad no encontrada"));

        if (!actividad.getItinerario().getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para ver esta actividad");
        }

        return actividadMapper.toResponse(actividad);
    }

    @Override
    @Transactional
    public ActividadResponse actualizar(Long id, ActividadRequest request, String userEmail) {
        Actividad actividad = actividadRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Actividad no encontrada"));

        if (!actividad.getItinerario().getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para editar esta actividad");
        }

        actividad.setTipoActividad(Actividad.TipoActividad.valueOf(request.getTipoActividad()));
        actividad.setTitulo(request.getTitulo());
        actividad.setDescripcion(request.getDescripcion());
        actividad.setFechaHoraInicio(request.getFechaHoraInicio());
        actividad.setFechaHoraFin(request.getFechaHoraFin());
        actividad.setUbicacion(request.getUbicacion());
        actividad.setCosto(request.getCosto());
        actividad.setMoneda(request.getMoneda());
        actividad.setNotas(request.getNotas());

        Actividad updated = actividadRepository.save(actividad);
        return actividadMapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void eliminar(Long id, String userEmail) {
        Actividad actividad = actividadRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Actividad no encontrada"));

        if (!actividad.getItinerario().getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para eliminar esta actividad");
        }

        actividadRepository.delete(actividad);
    }
}