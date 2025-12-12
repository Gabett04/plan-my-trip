//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.time.LocalDateTime;
import lombok.Generated;

public class InvitacionResponse {
    private Long id;
    private Long itinerarioId;
    private String emailInvitado;
    private LocalDateTime fechaInvitacion;
    private LocalDateTime fechaExpiracion;
    private String estado;
    private LocalDateTime createdAt;

    @Generated
    public static InvitacionResponseBuilder builder() {
        return new InvitacionResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getItinerarioId() {
        return this.itinerarioId;
    }

    @Generated
    public String getEmailInvitado() {
        return this.emailInvitado;
    }

    @Generated
    public LocalDateTime getFechaInvitacion() {
        return this.fechaInvitacion;
    }

    @Generated
    public LocalDateTime getFechaExpiracion() {
        return this.fechaExpiracion;
    }

    @Generated
    public String getEstado() {
        return this.estado;
    }

    @Generated
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setItinerarioId(final Long itinerarioId) {
        this.itinerarioId = itinerarioId;
    }

    @Generated
    public void setEmailInvitado(final String emailInvitado) {
        this.emailInvitado = emailInvitado;
    }

    @Generated
    public void setFechaInvitacion(final LocalDateTime fechaInvitacion) {
        this.fechaInvitacion = fechaInvitacion;
    }

    @Generated
    public void setFechaExpiracion(final LocalDateTime fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Generated
    public void setEstado(final String estado) {
        this.estado = estado;
    }

    @Generated
    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Generated
    public InvitacionResponse() {
    }

    @Generated
    public InvitacionResponse(final Long id, final Long itinerarioId, final String emailInvitado, final LocalDateTime fechaInvitacion, final LocalDateTime fechaExpiracion, final String estado, final LocalDateTime createdAt) {
        this.id = id;
        this.itinerarioId = itinerarioId;
        this.emailInvitado = emailInvitado;
        this.fechaInvitacion = fechaInvitacion;
        this.fechaExpiracion = fechaExpiracion;
        this.estado = estado;
        this.createdAt = createdAt;
    }

    @Generated
    public static class InvitacionResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private Long itinerarioId;
        @Generated
        private String emailInvitado;
        @Generated
        private LocalDateTime fechaInvitacion;
        @Generated
        private LocalDateTime fechaExpiracion;
        @Generated
        private String estado;
        @Generated
        private LocalDateTime createdAt;

        @Generated
        InvitacionResponseBuilder() {
        }

        @Generated
        public InvitacionResponseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public InvitacionResponseBuilder itinerarioId(final Long itinerarioId) {
            this.itinerarioId = itinerarioId;
            return this;
        }

        @Generated
        public InvitacionResponseBuilder emailInvitado(final String emailInvitado) {
            this.emailInvitado = emailInvitado;
            return this;
        }

        @Generated
        public InvitacionResponseBuilder fechaInvitacion(final LocalDateTime fechaInvitacion) {
            this.fechaInvitacion = fechaInvitacion;
            return this;
        }

        @Generated
        public InvitacionResponseBuilder fechaExpiracion(final LocalDateTime fechaExpiracion) {
            this.fechaExpiracion = fechaExpiracion;
            return this;
        }

        @Generated
        public InvitacionResponseBuilder estado(final String estado) {
            this.estado = estado;
            return this;
        }

        @Generated
        public InvitacionResponseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Generated
        public InvitacionResponse build() {
            return new InvitacionResponse(this.id, this.itinerarioId, this.emailInvitado, this.fechaInvitacion, this.fechaExpiracion, this.estado, this.createdAt);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "InvitacionResponse.InvitacionResponseBuilder(id=" + var10000 + ", itinerarioId=" + this.itinerarioId + ", emailInvitado=" + this.emailInvitado + ", fechaInvitacion=" + String.valueOf(this.fechaInvitacion) + ", fechaExpiracion=" + String.valueOf(this.fechaExpiracion) + ", estado=" + this.estado + ", createdAt=" + String.valueOf(this.createdAt) + ")";
        }
    }
}
