//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.time.LocalDateTime;
import lombok.Generated;

public class DestinoResponse {
    private Long id;
    private String nombre;
    private String pais;
    private String ciudad;
    private String descripcion;
    private LocalDateTime createdAt;
    private Integer orden;

    @Generated
    public static DestinoResponseBuilder builder() {
        return new DestinoResponseBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getNombre() {
        return this.nombre;
    }

    @Generated
    public String getPais() {
        return this.pais;
    }

    @Generated
    public String getCiudad() {
        return this.ciudad;
    }

    @Generated
    public String getDescripcion() {
        return this.descripcion;
    }

    @Generated
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Generated
    public Integer getOrden() {
        return this.orden;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    @Generated
    public void setPais(final String pais) {
        this.pais = pais;
    }

    @Generated
    public void setCiudad(final String ciudad) {
        this.ciudad = ciudad;
    }

    @Generated
    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    @Generated
    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Generated
    public void setOrden(final Integer orden) {
        this.orden = orden;
    }

    @Generated
    public DestinoResponse() {
    }

    @Generated
    public DestinoResponse(final Long id, final String nombre, final String pais, final String ciudad, final String descripcion, final LocalDateTime createdAt, final Integer orden) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.createdAt = createdAt;
        this.orden = orden;
    }

    @Generated
    public static class DestinoResponseBuilder {
        @Generated
        private Long id;
        @Generated
        private String nombre;
        @Generated
        private String pais;
        @Generated
        private String ciudad;
        @Generated
        private String descripcion;
        @Generated
        private LocalDateTime createdAt;
        @Generated
        private Integer orden;

        @Generated
        DestinoResponseBuilder() {
        }

        @Generated
        public DestinoResponseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public DestinoResponseBuilder nombre(final String nombre) {
            this.nombre = nombre;
            return this;
        }

        @Generated
        public DestinoResponseBuilder pais(final String pais) {
            this.pais = pais;
            return this;
        }

        @Generated
        public DestinoResponseBuilder ciudad(final String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        @Generated
        public DestinoResponseBuilder descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        @Generated
        public DestinoResponseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Generated
        public DestinoResponseBuilder orden(final Integer orden) {
            this.orden = orden;
            return this;
        }

        @Generated
        public DestinoResponse build() {
            return new DestinoResponse(this.id, this.nombre, this.pais, this.ciudad, this.descripcion, this.createdAt, this.orden);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "DestinoResponse.DestinoResponseBuilder(id=" + var10000 + ", nombre=" + this.nombre + ", pais=" + this.pais + ", ciudad=" + this.ciudad + ", descripcion=" + this.descripcion + ", createdAt=" + String.valueOf(this.createdAt) + ", orden=" + this.orden + ")";
        }
    }
}
