//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Generated;

public class ItinerarioResponse {
    private Long id;
    private Long usuarioId;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private BigDecimal presupuestoTotal;
    private String visibilidad;
    private LocalDateTime createdAt;
    private Integer cantidadActividades;

    @Generated
    public static ItinerarioResponseBuilder builder() {
        return new ItinerarioResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getUsuarioId() {
        return this.usuarioId;
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
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Generated
    public Integer getCantidadActividades() {
        return this.cantidadActividades;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setUsuarioId(final Long usuarioId) {
        this.usuarioId = usuarioId;
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
    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Generated
    public void setCantidadActividades(final Integer cantidadActividades) {
        this.cantidadActividades = cantidadActividades;
    }

    @Generated
    public ItinerarioResponse() {
    }

    @Generated
    public ItinerarioResponse(final Long id, final Long usuarioId, final String titulo, final String descripcion, final LocalDate fechaInicio, final LocalDate fechaFin, final BigDecimal presupuestoTotal, final String visibilidad, final LocalDateTime createdAt, final Integer cantidadActividades) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.presupuestoTotal = presupuestoTotal;
        this.visibilidad = visibilidad;
        this.createdAt = createdAt;
        this.cantidadActividades = cantidadActividades;
    }

    @Generated
    public static class ItinerarioResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private Long usuarioId;
        @Generated
        private String titulo;
        @Generated
        private String descripcion;
        @Generated
        private LocalDate fechaInicio;
        @Generated
        private LocalDate fechaFin;
        @Generated
        private BigDecimal presupuestoTotal;
        @Generated
        private String visibilidad;
        @Generated
        private LocalDateTime createdAt;
        @Generated
        private Integer cantidadActividades;

        @Generated
        ItinerarioResponseBuilder() {
        }

        @Generated
        public ItinerarioResponseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder usuarioId(final Long usuarioId) {
            this.usuarioId = usuarioId;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder titulo(final String titulo) {
            this.titulo = titulo;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder fechaInicio(final LocalDate fechaInicio) {
            this.fechaInicio = fechaInicio;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder fechaFin(final LocalDate fechaFin) {
            this.fechaFin = fechaFin;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder presupuestoTotal(final BigDecimal presupuestoTotal) {
            this.presupuestoTotal = presupuestoTotal;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder visibilidad(final String visibilidad) {
            this.visibilidad = visibilidad;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Generated
        public ItinerarioResponseBuilder cantidadActividades(final Integer cantidadActividades) {
            this.cantidadActividades = cantidadActividades;
            return this;
        }

        @Generated
        public ItinerarioResponse build() {
            return new ItinerarioResponse(this.id, this.usuarioId, this.titulo, this.descripcion, this.fechaInicio, this.fechaFin, this.presupuestoTotal, this.visibilidad, this.createdAt, this.cantidadActividades);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "ItinerarioResponse.ItinerarioResponseBuilder(id=" + var10000 + ", usuarioId=" + this.usuarioId + ", titulo=" + this.titulo + ", descripcion=" + this.descripcion + ", fechaInicio=" + String.valueOf(this.fechaInicio) + ", fechaFin=" + String.valueOf(this.fechaFin) + ", presupuestoTotal=" + String.valueOf(this.presupuestoTotal) + ", visibilidad=" + this.visibilidad + ", createdAt=" + String.valueOf(this.createdAt) + ", cantidadActividades=" + this.cantidadActividades + ")";
        }
    }
}
