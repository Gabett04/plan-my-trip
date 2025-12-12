//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Generated;

public class LoginRequest {
    private @NotBlank(
            message = "El email es obligatorio"
    ) @Email(
            message = "Formato de email inválido"
    ) String email;
    private @NotBlank(
            message = "La contraseña es obligatoria"
    ) String password;

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public String getPassword() {
        return this.password;
    }

    @Generated
    public void setEmail(final String email) {
        this.email = email;
    }

    @Generated
    public void setPassword(final String password) {
        this.password = password;
    }

    @Generated
    public LoginRequest() {
    }

    @Generated
    public LoginRequest(final String email, final String password) {
        this.email = email;
        this.password = password;
    }
}
