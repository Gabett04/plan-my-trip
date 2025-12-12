package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Generated;

public class ChatMensajeRequest {
    private @NotBlank(
            message = "El mensaje es obligatorio"
    ) @Size(
            max = 5000
    ) String mensaje;
    private @Pattern(
            regexp = "TEXTO|ARCHIVO|SISTEMA"
    ) String tipo;

    @Generated
    public String getMensaje() {
        return this.mensaje;
    }

    @Generated
    public String getTipo() {
        return this.tipo;
    }

    @Generated
    public void setMensaje(final String mensaje) {
        this.mensaje = mensaje;
    }

    @Generated
    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    @Generated
    public ChatMensajeRequest() {
    }

    @Generated
    public ChatMensajeRequest(final String mensaje, final String tipo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
    }
}
