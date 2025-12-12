//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.time.LocalDateTime;
import lombok.Generated;

public class ChatMensajeResponse {
    private Long id;
    private Long itinerarioId;
    private Long usuarioId;
    private String nombreUsuario;
    private String mensaje;
    private String tipo;
    private LocalDateTime createdAt;

    @Generated
    public static ChatMensajeResponseBuilder builder() {
        return new ChatMensajeResponseBuilder();
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
    public Long getUsuarioId() {
        return this.usuarioId;
    }

    @Generated
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    @Generated
    public String getMensaje() {
        return this.mensaje;
    }

    @Generated
    public String getTipo() {
        return this.tipo;
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
    public void setUsuarioId(final Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Generated
    public void setNombreUsuario(final String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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
    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Generated
    public ChatMensajeResponse() {
    }

    @Generated
    public ChatMensajeResponse(final Long id, final Long itinerarioId, final Long usuarioId, final String nombreUsuario, final String mensaje, final String tipo, final LocalDateTime createdAt) {
        this.id = id;
        this.itinerarioId = itinerarioId;
        this.usuarioId = usuarioId;
        this.nombreUsuario = nombreUsuario;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.createdAt = createdAt;
    }

    @Generated
    public static class ChatMensajeResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private Long itinerarioId;
        @Generated
        private Long usuarioId;
        @Generated
        private String nombreUsuario;
        @Generated
        private String mensaje;
        @Generated
        private String tipo;
        @Generated
        private LocalDateTime createdAt;

        @Generated
        ChatMensajeResponseBuilder() {
        }

        @Generated
        public ChatMensajeResponseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ChatMensajeResponseBuilder itinerarioId(final Long itinerarioId) {
            this.itinerarioId = itinerarioId;
            return this;
        }

        @Generated
        public ChatMensajeResponseBuilder usuarioId(final Long usuarioId) {
            this.usuarioId = usuarioId;
            return this;
        }

        @Generated
        public ChatMensajeResponseBuilder nombreUsuario(final String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
            return this;
        }

        @Generated
        public ChatMensajeResponseBuilder mensaje(final String mensaje) {
            this.mensaje = mensaje;
            return this;
        }

        @Generated
        public ChatMensajeResponseBuilder tipo(final String tipo) {
            this.tipo = tipo;
            return this;
        }

        @Generated
        public ChatMensajeResponseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Generated
        public ChatMensajeResponse build() {
            return new ChatMensajeResponse(this.id, this.itinerarioId, this.usuarioId, this.nombreUsuario, this.mensaje, this.tipo, this.createdAt);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "ChatMensajeResponse.ChatMensajeResponseBuilder(id=" + var10000 + ", itinerarioId=" + this.itinerarioId + ", usuarioId=" + this.usuarioId + ", nombreUsuario=" + this.nombreUsuario + ", mensaje=" + this.mensaje + ", tipo=" + this.tipo + ", createdAt=" + String.valueOf(this.createdAt) + ")";
        }
    }
}
