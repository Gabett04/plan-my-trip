//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.time.LocalDateTime;
import lombok.Generated;

public class ComentarioResponse {
    private Long id;
    private Long actividadId;
    private Long usuarioId;
    private String nombreUsuario;
    private String comentario;
    private LocalDateTime createdAt;

    @Generated
    public static ComentarioResponseBuilder builder() {
        return new ComentarioResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getActividadId() {
        return this.actividadId;
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
    public String getComentario() {
        return this.comentario;
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
    public void setActividadId(final Long actividadId) {
        this.actividadId = actividadId;
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
    public void setComentario(final String comentario) {
        this.comentario = comentario;
    }

    @Generated
    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Generated
    public ComentarioResponse() {
    }

    @Generated
    public ComentarioResponse(final Long id, final Long actividadId, final Long usuarioId, final String nombreUsuario, final String comentario, final LocalDateTime createdAt) {
        this.id = id;
        this.actividadId = actividadId;
        this.usuarioId = usuarioId;
        this.nombreUsuario = nombreUsuario;
        this.comentario = comentario;
        this.createdAt = createdAt;
    }

    @Generated
    public static class ComentarioResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private Long actividadId;
        @Generated
        private Long usuarioId;
        @Generated
        private String nombreUsuario;
        @Generated
        private String comentario;
        @Generated
        private LocalDateTime createdAt;

        @Generated
        ComentarioResponseBuilder() {
        }

        @Generated
        public ComentarioResponseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ComentarioResponseBuilder actividadId(final Long actividadId) {
            this.actividadId = actividadId;
            return this;
        }

        @Generated
        public ComentarioResponseBuilder usuarioId(final Long usuarioId) {
            this.usuarioId = usuarioId;
            return this;
        }

        @Generated
        public ComentarioResponseBuilder nombreUsuario(final String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
            return this;
        }

        @Generated
        public ComentarioResponseBuilder comentario(final String comentario) {
            this.comentario = comentario;
            return this;
        }

        @Generated
        public ComentarioResponseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Generated
        public ComentarioResponse build() {
            return new ComentarioResponse(this.id, this.actividadId, this.usuarioId, this.nombreUsuario, this.comentario, this.createdAt);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "ComentarioResponse.ComentarioResponseBuilder(id=" + var10000 + ", actividadId=" + this.actividadId + ", usuarioId=" + this.usuarioId + ", nombreUsuario=" + this.nombreUsuario + ", comentario=" + this.comentario + ", createdAt=" + String.valueOf(this.createdAt) + ")";
        }
    }
}
