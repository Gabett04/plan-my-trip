// ChatServiceImpl.java
package com.prog3.plan_my_trip.service.impl;

import com.prog3.plan_my_trip.dto.request.ChatMensajeRequest;
import com.prog3.plan_my_trip.dto.response.ChatMensajeResponse;
import com.prog3.plan_my_trip.entity.ChatItinerario;
import com.prog3.plan_my_trip.entity.Itinerario;
import com.prog3.plan_my_trip.entity.Usuario;
import com.prog3.plan_my_trip.exception.BadRequestException;
import com.prog3.plan_my_trip.exception.ResourceNotFoundException;
import com.prog3.plan_my_trip.mapper.ChatMapper;
import com.prog3.plan_my_trip.repository.ChatRepository;
import com.prog3.plan_my_trip.repository.ItinerarioRepository;
import com.prog3.plan_my_trip.repository.UsuarioRepository;
import com.prog3.plan_my_trip.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;
    private final ItinerarioRepository itinerarioRepository;
    private final UsuarioRepository usuarioRepository;
    private final ChatMapper chatMapper;

    @Override
    @Transactional
    public ChatMensajeResponse enviar(Long itinerarioId, ChatMensajeRequest request, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        Usuario usuario = usuarioRepository.findByEmail(userEmail)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));

        ChatItinerario chat = chatMapper.toEntity(request, itinerario, usuario);
        ChatItinerario saved = chatRepository.save(chat);

        return chatMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ChatMensajeResponse> listarPorItinerario(Long itinerarioId, String userEmail) {
        Itinerario itinerario = itinerarioRepository.findById(itinerarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado"));

        if (!itinerario.getUsuario().getEmail().equals(userEmail)) {
            throw new BadRequestException("No tienes permiso para ver este chat");
        }

        return chatRepository.findByItinerarioIdOrderByCreatedAtDesc(itinerarioId)
                .stream()
                .map(chatMapper::toResponse)
                .collect(Collectors.toList());
    }
}