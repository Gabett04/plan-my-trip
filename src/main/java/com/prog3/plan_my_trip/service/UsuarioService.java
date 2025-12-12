package com.prog3.plan_my_trip.service;

import com.prog3.plan_my_trip.dto.request.LoginRequest;
import com.prog3.plan_my_trip.dto.request.UsuarioRegistroRequest;
import com.prog3.plan_my_trip.dto.response.LoginResponse;
import com.prog3.plan_my_trip.dto.response.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse registrar(UsuarioRegistroRequest request);
    LoginResponse login(LoginRequest request);
    UsuarioResponse obtenerPorId(Long id);
    UsuarioResponse obtenerPorEmail(String email);
}