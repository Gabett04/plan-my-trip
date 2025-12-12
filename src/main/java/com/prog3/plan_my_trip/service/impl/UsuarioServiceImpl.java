package com.prog3.plan_my_trip.service.impl;

import com.prog3.plan_my_trip.dto.request.LoginRequest;
import com.prog3.plan_my_trip.dto.request.UsuarioRegistroRequest;
import com.prog3.plan_my_trip.dto.response.LoginResponse;
import com.prog3.plan_my_trip.dto.response.UsuarioResponse;
import com.prog3.plan_my_trip.entity.Usuario;
import com.prog3.plan_my_trip.exception.BadRequestException;
import com.prog3.plan_my_trip.exception.ResourceNotFoundException;
import com.prog3.plan_my_trip.exception.UnauthorizedException;
import com.prog3.plan_my_trip.mapper.UsuarioMapper;
import com.prog3.plan_my_trip.repository.UsuarioRepository;
import com.prog3.plan_my_trip.security.JwtTokenProvider;
import com.prog3.plan_my_trip.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    @Transactional
    public UsuarioResponse registrar(UsuarioRegistroRequest request) {
        if (usuarioRepository.existsByEmail(request.getEmail())) {
            throw new BadRequestException("El email ya está registrado");
        }

        Usuario usuario = usuarioMapper.toEntity(request);
        usuario.setPassword(passwordEncoder.encode(request.getPassword()));
        usuario.setRol(Usuario.Rol.USUARIO);
        usuario.setActivo(true);

        Usuario saved = usuarioRepository.save(usuario);
        return usuarioMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public LoginResponse login(LoginRequest request) {
        Usuario usuario = usuarioRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new UnauthorizedException("Credenciales inválidas"));

        if (!passwordEncoder.matches(request.getPassword(), usuario.getPassword())) {
            throw new UnauthorizedException("Credenciales inválidas");
        }

        if (!usuario.getActivo()) {
            throw new UnauthorizedException("Usuario inactivo");
        }

        String token = jwtTokenProvider.generateToken(usuario.getEmail());

        return LoginResponse.builder()
                .token(token)
                .type("Bearer")
                .userId(usuario.getId())
                .email(usuario.getEmail())
                .nombreCompleto(usuario.getNombreCompleto())
                .rol(usuario.getRol().name())
                .build();
    }

    @Override
    @Transactional(readOnly = true)
    public UsuarioResponse obtenerPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));
        return usuarioMapper.toResponse(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public UsuarioResponse obtenerPorEmail(String email) {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));
        return usuarioMapper.toResponse(usuario);
    }
}