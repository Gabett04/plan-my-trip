//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Generated;

public class ActividadResponse {
    private Long id;
    private Long itinerarioId;
    private String tipoActividad;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String ubicacion;
    private BigDecimal costo;
    private String moneda;
    private String notas;
    private LocalDateTime createdAt;

    @Generated
    public static ActividadResponseBuilder builder() {
        return new ActividadResponseBuilder();
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
    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Generated
    public ActividadResponse() {
    }

    @Generated
    public ActividadResponse(final Long id, final Long itinerarioId, final String tipoActividad, final String titulo, final String descripcion, final LocalDateTime fechaHoraInicio, final LocalDateTime fechaHoraFin, final String ubicacion, final BigDecimal costo, final String moneda, final String notas, final LocalDateTime createdAt) {
        this.id = id;
        this.itinerarioId = itinerarioId;
        this.tipoActividad = tipoActividad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.ubicacion = ubicacion;
        this.costo = costo;
        this.moneda = moneda;
        this.notas = notas;
        this.createdAt = createdAt;
    }

    @Generated
    public static class ActividadResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private Long itinerarioId;
        @Generated
        private String tipoActividad;
        @Generated
        private String titulo;
        @Generated
        private String descripcion;
        @Generated
        private LocalDateTime fechaHoraInicio;
        @Generated
        private LocalDateTime fechaHoraFin;
        @Generated
        private String ubicacion;
        @Generated
        private BigDecimal costo;
        @Generated
        private String moneda;
        @Generated
        private String notas;
        @Generated
        private LocalDateTime createdAt;

        @Generated
        ActividadResponseBuilder() {
        }

        @Generated
        public ActividadResponseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ActividadResponseBuilder itinerarioId(final Long itinerarioId) {
            this.itinerarioId = itinerarioId;
            return this;
        }

        @Generated
        public ActividadResponseBuilder tipoActividad(final String tipoActividad) {
            this.tipoActividad = tipoActividad;
            return this;
        }

        @Generated
        public ActividadResponseBuilder titulo(final String titulo) {
            this.titulo = titulo;
            return this;
        }

        @Generated
        public ActividadResponseBuilder descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        @Generated
        public ActividadResponseBuilder fechaHoraInicio(final LocalDateTime fechaHoraInicio) {
            this.fechaHoraInicio = fechaHoraInicio;
            return this;
        }

        @Generated
        public ActividadResponseBuilder fechaHoraFin(final LocalDateTime fechaHoraFin) {
            this.fechaHoraFin = fechaHoraFin;
            return this;
        }

        @Generated
        public ActividadResponseBuilder ubicacion(final String ubicacion) {
            this.ubicacion = ubicacion;
            return this;
        }

        @Generated
        public ActividadResponseBuilder costo(final BigDecimal costo) {
            this.costo = costo;
            return this;
        }

        @Generated
        public ActividadResponseBuilder moneda(final String moneda) {
            this.moneda = moneda;
            return this;
        }

        @Generated
        public ActividadResponseBuilder notas(final String notas) {
            this.notas = notas;
            return this;
        }

        @Generated
        public ActividadResponseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Generated
        public ActividadResponse build() {
            return new ActividadResponse(this.id, this.itinerarioId, this.tipoActividad, this.titulo, this.descripcion, this.fechaHoraInicio, this.fechaHoraFin, this.ubicacion, this.costo, this.moneda, this.notas, this.createdAt);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "ActividadResponse.ActividadResponseBuilder(id=" + var10000 + ", itinerarioId=" + this.itinerarioId + ", tipoActividad=" + this.tipoActividad + ", titulo=" + this.titulo + ", descripcion=" + this.descripcion + ", fechaHoraInicio=" + String.valueOf(this.fechaHoraInicio) + ", fechaHoraFin=" + String.valueOf(this.fechaHoraFin) + ", ubicacion=" + this.ubicacion + ", costo=" + String.valueOf(this.costo) + ", moneda=" + this.moneda + ", notas=" + this.notas + ", createdAt=" + String.valueOf(this.createdAt) + ")";
        }
    }
}
