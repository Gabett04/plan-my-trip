package com.prog3.plan_my_trip.service.impl;

import com.prog3.plan_my_trip.dto.request.ItinerarioRequest;
import com.prog3.plan_my_trip.dto.response.ItinerarioResponse;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.entity.Usuario;
import com.prog3.plan_my_trip.exception.BadRequestException;
import com.prog3.plan_my_trip.exception.ResourceNotFoundException;
import com.prog3.plan_my_trip.mapper.ItinerarioMapper;
import com.prog3.plan_my_trip.repository.ItinerarioRepository;
import com.prog3.plan_my_trip.repository.UsuarioRepository;
import com.prog3.plan_my_trip.service.ItinerarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItinerarioServiceImpl implements ItinerarioService {

    private final UsuarioRepository usuarioRepository;
    private final ItinerarioRepository itinerarioRepository;
    private final ItinerarioMapper itinerarioMapper;

    @Override
    @Transactional
    public ItinerarioResponse crear(ItinerarioRequest request, String emailUsuario) {

        Usuario usuario = usuarioRepository.findByEmail(emailUsuario)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado: " + emailUsuario));

        Itinerario itinerario = itinerarioMapper.toEntity(request, usuario);
        itinerario = itinerarioRepository.save(itinerario);

        return itinerarioMapper.toResponse(itinerario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ItinerarioResponse> listarPorUsuario(String emailUsuario) {
        Usuario usuario = usuarioRepository.findByEmail(emailUsuario)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado: " + emailUsuario));

        List<Itinerario> itinerarios = itinerarioRepository.findByUsuarioId(usuario.getId());

        return itinerarios.stream()
                .map(itinerarioMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public ItinerarioResponse obtenerPorId(Long id, String emailUsuario) {

        Itinerario itinerario = validarPropietario(id, emailUsuario);

        return itinerarioMapper.toResponse(itinerario);
    }

    @Override
    @Transactional
    public ItinerarioResponse actualizar(Long id, ItinerarioRequest request, String emailUsuario) {

        Itinerario itinerario = validarPropietario(id, emailUsuario);

        itinerario.setTitulo(request.getTitulo());
        itinerario.setDescripcion(request.getDescripcion());
        itinerario.setFechaInicio(request.getFechaInicio());
        itinerario.setFechaFin(request.getFechaFin());
        itinerario.setPresupuestoTotal(request.getPresupuestoTotal());

        if (request.getVisibilidad() != null) {
            itinerario.setVisibilidad(Itinerario.Visibilidad.valueOf(request.getVisibilidad()));
        }

        itinerarioRepository.save(itinerario);

        return itinerarioMapper.toResponse(itinerario);
    }

    @Override
    @Transactional
    public void eliminar(Long id, String emailUsuario) {

        Itinerario itinerario = validarPropietario(id, emailUsuario);

        itinerarioRepository.delete(itinerario);
    }

    // =======================================================================
    // Métodos de soporte
    // =======================================================================

    private Itinerario validarPropietario(Long id, String emailUsuario) {

        Itinerario itinerario = itinerarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado: " + id));

        if (!itinerario.getUsuario().getEmail().equals(emailUsuario)) {
            throw new BadRequestException("No tiene permisos para acceder a este itinerario");
        }

        return itinerario;
    }
}
