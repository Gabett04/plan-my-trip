//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import lombok.Generated;

public class LoginResponse {
    private String token;
    private String type = "Bearer";
    private Long userId;
    private String email;
    private String nombreCompleto;
    private String rol;

    @Generated
    public static LoginResponseBuilder builder() {
        return new LoginResponseBuilder();
    }

    @Generated
    public String getToken() {
        return this.token;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    @Generated
    public String getRol() {
        return this.rol;
    }

    @Generated
    public void setToken(final String token) {
        this.token = token;
    }

    @Generated
    public void setType(final String type) {
        this.type = type;
    }

    @Generated
    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setEmail(final String email) {
        this.email = email;
    }

    @Generated
    public void setNombreCompleto(final String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Generated
    public void setRol(final String rol) {
        this.rol = rol;
    }

    @Generated
    public LoginResponse() {
    }

    @Generated
    public LoginResponse(final String token, final String type, final Long userId, final String email, final String nombreCompleto, final String rol) {
        this.token = token;
        this.type = type;
        this.userId = userId;
        this.email = email;
        this.nombreCompleto = nombreCompleto;
        this.rol = rol;
    }

    @Generated
    public static class LoginResponseBuilder {
        @Generated
        private String token;
        @Generated
        private String type;
        @Generated
        private Long userId;
        @Generated
        private String email;
        @Generated
        private String nombreCompleto;
        @Generated
        private String rol;

        @Generated
        LoginResponseBuilder() {
        }

        @Generated
        public LoginResponseBuilder token(final String token) {
            this.token = token;
            return this;
        }

        @Generated
        public LoginResponseBuilder type(final String type) {
            this.type = type;
            return this;
        }

        @Generated
        public LoginResponseBuilder userId(final Long userId) {
            this.userId = userId;
            return this;
        }

        @Generated
        public LoginResponseBuilder email(final String email) {
            this.email = email;
            return this;
        }

        @Generated
        public LoginResponseBuilder nombreCompleto(final String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
            return this;
        }

        @Generated
        public LoginResponseBuilder rol(final String rol) {
            this.rol = rol;
            return this;
        }

        @Generated
        public LoginResponse build() {
            return new LoginResponse(this.token, this.type, this.userId, this.email, this.nombreCompleto, this.rol);
        }

        @Generated
        public String toString() {
            return "LoginResponse.LoginResponseBuilder(token=" + this.token + ", type=" + this.type + ", userId=" + this.userId + ", email=" + this.email + ", nombreCompleto=" + this.nombreCompleto + ", rol=" + this.rol + ")";
        }
    }
}
