//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import lombok.Generated;

public class InvitacionRequest {
    private @NotBlank(
            message = "El email del invitado es obligatorio"
    ) @Email(
            message = "Formato de email inválido"
    ) String emailInvitado;
    private @NotNull(
            message = "La fecha de expiración es obligatoria"
    ) @Future(
            message = "La fecha de expiración debe ser futura"
    ) LocalDateTime fechaExpiracion;

    @Generated
    public String getEmailInvitado() {
        return this.emailInvitado;
    }

    @Generated
    public LocalDateTime getFechaExpiracion() {
        return this.fechaExpiracion;
    }

    @Generated
    public void setEmailInvitado(final String emailInvitado) {
        this.emailInvitado = emailInvitado;
    }

    @Generated
    public void setFechaExpiracion(final LocalDateTime fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Generated
    public InvitacionRequest() {
    }

    @Generated
    public InvitacionRequest(final String emailInvitado, final LocalDateTime fechaExpiracion) {
        this.emailInvitado = emailInvitado;
        this.fechaExpiracion = fechaExpiracion;
    }
}
