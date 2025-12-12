// InvitacionServiceImpl.java
package com.prog3.plan_my_trip.service.impl;

import com.prog3.plan_my_trip.dto.request.InvitacionRequest;
import com.prog3.plan_my_trip.dto.response.InvitacionResponse;
import com.prog3.plan_my_trip.entity.InvitacionItinerario;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.exception.BadRequestException;
import com.prog3.plan_my_trip.exception.ResourceNotFoundException;
import com.prog3.plan_my_trip.mapper.InvitacionMapper;
import com.prog3.plan_my_trip.repository.InvitacionRepository;
import com.prog3.plan_my_trip.repository.ItinerarioRepository;
import com.prog3.plan_my_trip.service.InvitacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InvitacionServiceImpl implements InvitacionService {

    private final InvitacionRepository invitacionRepository;
    private final ItinerarioRepository itinerarioRepository;
    private final InvitacionMapper invitacionMapper;

    @Override
    @Transactional
    public InvitacionResponse crear(Long itinerarioId, InvitacionRequest request, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para invitar a este itinerario");
        }

        InvitacionItinerario invitacion = invitacionMapper.toEntity(request, itinerario);
        InvitacionItinerario saved = invitacionRepository.save(invitacion);

        return invitacionMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<InvitacionResponse> listarPorItinerario(Long itinerarioId, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para ver las invitaciones");
        }

        return invitacionRepository.findByItinerarioId(itinerarioId)
                .stream()
                .map(invitacionMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public InvitacionResponse obtenerPorToken(String token) {
        InvitacionItinerario invitacion = invitacionRepository.findByTokenAcceso(token)
                .orElseThrow(() -> new ResourceNotFoundException("Invitación no encontrada"));

        if (invitacion.getFechaExpiracion().isBefore(LocalDateTime.now())) {
            invitacion.setEstado(InvitacionItinerario.Estado.EXPIRADA);
            invitacionRepository.save(invitacion);
            throw new BadRequestException("La invitación ha expirado");
        }

        return invitacionMapper.toResponse(invitacion);
    }

    @Override
    @Transactional
    public void aceptarInvitacion(String token, String userEmail) {
        InvitacionItinerario invitacion = invitacionRepository.findByTokenAcceso(token)
                .orElseThrow(() -> new ResourceNotFoundException("Invitación no encontrada"));

        if (invitacion.getFechaExpiracion().isBefore(LocalDateTime.now())) {
            invitacion.setEstado(InvitacionItinerario.Estado.EXPIRADA);
            invitacionRepository.save(invitacion);
            throw new BadRequestException("La invitación ha expirado");
        }

        if (!invitacion.getEmailInvitado().equals(userEmail)) {
            throw new BadRequestException("Esta invitación no es para ti");
        }

        invitacion.setEstado(InvitacionItinerario.Estado.ACEPTADA);
        invitacionRepository.save(invitacion);
    }

    @Override
    @Transactional
    public void rechazarInvitacion(String token, String userEmail) {
        InvitacionItinerario invitacion = invitacionRepository.findByTokenAcceso(token)
                .orElseThrow(() -> new ResourceNotFoundException("Invitación no encontrada"));

        if (!invitacion.getEmailInvitado().equals(userEmail)) {
            throw new BadRequestException("Esta invitación no es para ti");
        }

        invitacion.setEstado(InvitacionItinerario.Estado.RECHAZADA);
        invitacionRepository.save(invitacion);
    }
}
