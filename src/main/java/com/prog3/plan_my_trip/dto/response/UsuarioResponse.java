//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Generated;

public class UsuarioResponse {
    private Long id;
    private String nombreCompleto;
    private String email;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String rol;
    private Boolean activo;
    private LocalDateTime createdAt;

    @Generated
    public static UsuarioResponseBuilder builder() {
        return new UsuarioResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    @Generated
    public String getTelefono() {
        return this.telefono;
    }

    @Generated
    public String getRol() {
        return this.rol;
    }

    @Generated
    public Boolean getActivo() {
        return this.activo;
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
    public void setNombreCompleto(final String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Generated
    public void setEmail(final String email) {
        this.email = email;
    }

    @Generated
    public void setFechaNacimiento(final LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Generated
    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    @Generated
    public void setRol(final String rol) {
        this.rol = rol;
    }

    @Generated
    public void setActivo(final Boolean activo) {
        this.activo = activo;
    }

    @Generated
    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Generated
    public UsuarioResponse() {
    }

    @Generated
    public UsuarioResponse(final Long id, final String nombreCompleto, final String email, final LocalDate fechaNacimiento, final String telefono, final String rol, final Boolean activo, final LocalDateTime createdAt) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rol = rol;
        this.activo = activo;
        this.createdAt = createdAt;
    }

    @Generated
    public static class UsuarioResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private String nombreCompleto;
        @Generated
        private String email;
        @Generated
        private LocalDate fechaNacimiento;
        @Generated
        private String telefono;
        @Generated
        private String rol;
        @Generated
        private Boolean activo;
        @Generated
        private LocalDateTime createdAt;

        @Generated
        UsuarioResponseBuilder() {
        }

        @Generated
        public UsuarioResponseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public UsuarioResponseBuilder nombreCompleto(final String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
            return this;
        }

        @Generated
        public UsuarioResponseBuilder email(final String email) {
            this.email = email;
            return this;
        }

        @Generated
        public UsuarioResponseBuilder fechaNacimiento(final LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        @Generated
        public UsuarioResponseBuilder telefono(final String telefono) {
            this.telefono = telefono;
            return this;
        }

        @Generated
        public UsuarioResponseBuilder rol(final String rol) {
            this.rol = rol;
            return this;
        }

        @Generated
        public UsuarioResponseBuilder activo(final Boolean activo) {
            this.activo = activo;
            return this;
        }

        @Generated
        public UsuarioResponseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Generated
        public UsuarioResponse build() {
            return new UsuarioResponse(this.id, this.nombreCompleto, this.email, this.fechaNacimiento, this.telefono, this.rol, this.activo, this.createdAt);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "UsuarioResponse.UsuarioResponseBuilder(id=" + var10000 + ", nombreCompleto=" + this.nombreCompleto + ", email=" + this.email + ", fechaNacimiento=" + String.valueOf(this.fechaNacimiento) + ", telefono=" + this.telefono + ", rol=" + this.rol + ", activo=" + this.activo + ", createdAt=" + String.valueOf(this.createdAt) + ")";
        }
    }
}
