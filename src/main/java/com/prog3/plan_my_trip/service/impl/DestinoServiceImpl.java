// DestinoServiceImpl.java
package com.prog3.plan_my_trip.service.impl;

import com.prog3.plan_my_trip.dto.request.DestinoOrderRequest;
import com.prog3.plan_my_trip.dto.request.DestinoRequest;
import com.prog3.plan_my_trip.dto.response.DestinoResponse;
import com.prog3.plan_my_trip.entity.Destino;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.entity.ItinerarioDestino;
import com.prog3.plan_my_trip.exception.BadRequestException;
import com.prog3.plan_my_trip.exception.ResourceNotFoundException;
import com.prog3.plan_my_trip.mapper.DestinoMapper;
import com.prog3.plan_my_trip.repository.DestinoRepository;
import com.prog3.plan_my_trip.repository.ItinerarioRepository;
import com.prog3.plan_my_trip.service.DestinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DestinoServiceImpl implements DestinoService {

    private final DestinoRepository destinoRepository;
    private final ItinerarioRepository itinerarioRepository;
    private final DestinoMapper destinoMapper;

    @Override
    @Transactional
    public DestinoResponse crear(DestinoRequest request) {
        Destino destino = destinoMapper.toEntity(request);
        Destino saved = destinoRepository.save(destino);
        return destinoMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DestinoResponse> listarTodos() {
        return destinoRepository.findAll()
                .stream()
                .map(destinoMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public DestinoResponse obtenerPorId(Long id) {
        Destino destino = destinoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Destino no encontrado"));
        return destinoMapper.toResponse(destino);
    }

    @Override
    @Transactional
    public DestinoResponse actualizar(Long id, DestinoRequest request) {
        Destino destino = destinoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Destino no encontrado"));

        destino.setNombre(request.getNombre());
        destino.setPais(request.getPais());
        destino.setCiudad(request.getCiudad());
        destino.setDescripcion(request.getDescripcion());

        Destino updated = destinoRepository.save(destino);
        return destinoMapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void eliminar(Long id) {
        Destino destino = destinoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Destino no encontrado"));
        destinoRepository.delete(destino);
    }

    @Override
    @Transactional
    public void agregarDestinoAItinerario(Long itinerarioId, Long destinoId, Integer orden, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para modificar este itinerario");
        }

        Destino destino = destinoRepository.findById(destinoId)
                .orElseThrow(() -> new ResourceNotFoundException("Destino no encontrado"));

        ItinerarioDestino itinerarioDestino = ItinerarioDestino.builder()
                .itinerario(itinerario)
                .destino(destino)
                .orden(orden)
                .build();

        itinerario.getDestinos().add(itinerarioDestino);
        itinerarioRepository.save(itinerario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DestinoResponse> listarPorItinerario(Long itinerarioId, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para ver los destinos");
        }

        return itinerario.getDestinos().stream()
                .sorted(Comparator.comparing(ItinerarioDestino::getOrden))
                .map(id -> destinoMapper.toResponse(id.getDestino()))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void quitarDestinoDeItinerario(Long itinerarioId, Long destinoId, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para modificar este itinerario");
        }

        // buscar el ItinerarioDestino a eliminar
        ItinerarioDestino found = itinerario.getDestinos().stream()
                .filter(d -> d.getDestino().getId().equals(destinoId))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Destino no asociado al itinerario"));

        itinerario.getDestinos().remove(found);
        itinerarioRepository.save(itinerario);
    }

    @Override
    @Transactional
    public void reordenarDestinos(Long itinerarioId, List<DestinoOrderRequest> ordenes, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para modificar este itinerario");
        }

        Map<Long, Integer> mapOrden = ordenes.stream()
                .collect(Collectors.toMap(DestinoOrderRequest::getDestinoId, DestinoOrderRequest::getOrden));

        for (ItinerarioDestino id : itinerario.getDestinos()) {
            Integer nuevo = mapOrden.get(id.getDestino().getId());
            if (nuevo != null) {
                id.setOrden(nuevo);
            }
        }

        // opcional: normalizar ordenes ascendentes si hay duplicados
        List<ItinerarioDestino> sorted = itinerario.getDestinos().stream()
                .sorted(Comparator.comparing(ItinerarioDestino::getOrden))
                .collect(Collectors.toList());

        for (int i = 0; i < sorted.size(); i++) {
            sorted.get(i).setOrden(i + 1);
        }

        itinerarioRepository.save(itinerario);
    }
}