//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Generated;

public class ItinerarioRequest {
    private @NotBlank(
            message = "El título es obligatorio"
    ) @Size(
            max = 255
    ) String titulo;
    private @Size(
            max = 5000
    ) String descripcion;
    private @NotNull(
            message = "La fecha de inicio es obligatoria"
    ) @FutureOrPresent(
            message = "La fecha de inicio no puede ser en el pasado"
    ) LocalDate fechaInicio;
    private @NotNull(
            message = "La fecha de fin es obligatoria"
    ) LocalDate fechaFin;
    private @DecimalMin(
            value = "0.0",
            inclusive = true
    ) BigDecimal presupuestoTotal;
    private @Pattern(
            regexp = "PUBLICO|PRIVADO"
    ) String visibilidad;

    @Generated
    public String getTitulo() {
        return this.titulo;
    }

    @Generated
    public String getDescripcion() {
        return this.descripcion;
    }

    @Generated
    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    @Generated
    public LocalDate getFechaFin() {
        return this.fechaFin;
    }

    @Generated
    public BigDecimal getPresupuestoTotal() {
        return this.presupuestoTotal;
    }

    @Generated
    public String getVisibilidad() {
        return this.visibilidad;
    }

    @Generated
    public void setTitulo(final String titulo) {
        this.titulo = titulo;
    }

    @Generated
    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    @Generated
    public void setFechaInicio(final LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Generated
    public void setFechaFin(final LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Generated
    public void setPresupuestoTotal(final BigDecimal presupuestoTotal) {
        this.presupuestoTotal = presupuestoTotal;
    }

    @Generated
    public void setVisibilidad(final String visibilidad) {
        this.visibilidad = visibilidad;
    }

    @Generated
    public ItinerarioRequest() {
    }

    @Generated
    public ItinerarioRequest(final String titulo, final String descripcion, final LocalDate fechaInicio, final LocalDate fechaFin, final BigDecimal presupuestoTotal, final String visibilidad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.presupuestoTotal = presupuestoTotal;
        this.visibilidad = visibilidad;
    }
}
