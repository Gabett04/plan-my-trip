//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.Generated;

public class UsuarioRegistroRequest {
    private @NotBlank(
            message = "El nombre completo es obligatorio"
    ) @Size(
            max = 255,
            message = "El nombre no puede exceder 255 caracteres"
    ) String nombreCompleto;
    private @NotBlank(
            message = "El email es obligatorio"
    ) @Email(
            message = "Formato de email inválido"
    ) @Size(
            max = 255
    ) String email;
    private @NotBlank(
            message = "La contraseña es obligatoria"
    ) @Size(
            min = 6,
            message = "La contraseña debe tener al menos 6 caracteres"
    ) String password;
    private @Past(
            message = "La fecha de nacimiento debe ser en el pasado"
    ) LocalDate fechaNacimiento;
    private @Pattern(
            regexp = "^[0-9+\\-\\s()]*$",
            message = "Formato de teléfono inválido"
    ) @Size(
            max = 20
    ) String telefono;

    @Generated
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public String getPassword() {
        return this.password;
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
    public void setNombreCompleto(final String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
    public void setFechaNacimiento(final LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Generated
    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    @Generated
    public UsuarioRegistroRequest() {
    }

    @Generated
    public UsuarioRegistroRequest(final String nombreCompleto, final String email, final String password, final LocalDate fechaNacimiento, final String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }
}
