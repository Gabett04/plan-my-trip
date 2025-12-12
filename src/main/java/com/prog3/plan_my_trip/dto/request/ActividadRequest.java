package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Generated;

public class ActividadRequest {
    private @NotNull(
            message = "El tipo de actividad es obligatorio"
    ) @Pattern(
            regexp = "TRANSPORTE|ALOJAMIENTO|COMIDA|TURISMO|COMPRAS|OTROS"
    ) String tipoActividad;
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
    ) LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private @Size(
            max = 255
    ) String ubicacion;
    private @DecimalMin(
            value = "0.0",
            inclusive = true
    ) BigDecimal costo;
    private @Size(
            max = 3
    ) String moneda;
    private @Size(
            max = 5000
    ) String notas;

    @Generated
    public String getTipoActividad() {
        return this.tipoActividad;
    }

    @Generated
    public String getTitulo() {
        return this.titulo;
    }

    @Generated
    public String getDescripcion() {
        return this.descripcion;
    }

    @Generated
    public LocalDateTime getFechaHoraInicio() {
        return this.fechaHoraInicio;
    }

    @Generated
    public LocalDateTime getFechaHoraFin() {
        return this.fechaHoraFin;
    }

    @Generated
    public String getUbicacion() {
        return this.ubicacion;
    }

    @Generated
    public BigDecimal getCosto() {
        return this.costo;
    }

    @Generated
    public String getMoneda() {
        return this.moneda;
    }

    @Generated
    public String getNotas() {
        return this.notas;
    }

    @Generated
    public void setTipoActividad(final String tipoActividad) {
        this.tipoActividad = tipoActividad;
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
    public void setFechaHoraInicio(final LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    @Generated
    public void setFechaHoraFin(final LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    @Generated
    public void setUbicacion(final String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Generated
    public void setCosto(final BigDecimal costo) {
        this.costo = costo;
    }

    @Generated
    public void setMoneda(final String moneda) {
        this.moneda = moneda;
    }

    @Generated
    public void setNotas(final String notas) {
        this.notas = notas;
    }

    @Generated
    public ActividadRequest() {
    }

    @Generated
    public ActividadRequest(final String tipoActividad, final String titulo, final String descripcion, final LocalDateTime fechaHoraInicio, final LocalDateTime fechaHoraFin, final String ubicacion, final BigDecimal costo, final String moneda, final String notas) {
        this.tipoActividad = tipoActividad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.ubicacion = ubicacion;
        this.costo = costo;
        this.moneda = moneda;
        this.notas = notas;
    }
}
