//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

@Entity
@Table(
        name = "destinos"
)
public class Destino {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            nullable = false
    )
    private String nombre;
    @Column(
            nullable = false,
            length = 100
    )
    private String pais;
    @Column(
            nullable = false,
            length = 100
    )
    private String ciudad;
    @Column(
            columnDefinition = "TEXT"
    )
    private String descripcion;
    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime createdAt;
    @Column(
            nullable = false
    )
    private LocalDateTime updatedAt;
    @OneToMany(
            mappedBy = "destino",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<ItinerarioDestino> itinerarios;

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    @Generated
    private static LocalDateTime $default$createdAt() {
        return LocalDateTime.now();
    }

    @Generated
    private static LocalDateTime $default$updatedAt() {
        return LocalDateTime.now();
    }

    @Generated
    private static List<ItinerarioDestino> $default$itinerarios() {
        return new ArrayList();
    }

    @Generated
    public static DestinoBuilder builder() {
        return new DestinoBuilder();
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
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Generated
    public List<ItinerarioDestino> getItinerarios() {
        return this.itinerarios;
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
    public void setUpdatedAt(final LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Generated
    public void setItinerarios(final List<ItinerarioDestino> itinerarios) {
        this.itinerarios = itinerarios;
    }

    @Generated
    public Destino() {
        this.createdAt = $default$createdAt();
        this.updatedAt = $default$updatedAt();
        this.itinerarios = $default$itinerarios();
    }

    @Generated
    public Destino(final Long id, final String nombre, final String pais, final String ciudad, final String descripcion, final LocalDateTime createdAt, final LocalDateTime updatedAt, final List<ItinerarioDestino> itinerarios) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.itinerarios = itinerarios;
    }

    @Generated
    public static class DestinoBuilder {
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
        private boolean createdAt$set;
        @Generated
        private LocalDateTime createdAt$value;
        @Generated
        private boolean updatedAt$set;
        @Generated
        private LocalDateTime updatedAt$value;
        @Generated
        private boolean itinerarios$set;
        @Generated
        private List<ItinerarioDestino> itinerarios$value;

        @Generated
        DestinoBuilder() {
        }

        @Generated
        public DestinoBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public DestinoBuilder nombre(final String nombre) {
            this.nombre = nombre;
            return this;
        }

        @Generated
        public DestinoBuilder pais(final String pais) {
            this.pais = pais;
            return this;
        }

        @Generated
        public DestinoBuilder ciudad(final String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        @Generated
        public DestinoBuilder descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        @Generated
        public DestinoBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt$value = createdAt;
            this.createdAt$set = true;
            return this;
        }

        @Generated
        public DestinoBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt$value = updatedAt;
            this.updatedAt$set = true;
            return this;
        }

        @Generated
        public DestinoBuilder itinerarios(final List<ItinerarioDestino> itinerarios) {
            this.itinerarios$value = itinerarios;
            this.itinerarios$set = true;
            return this;
        }

        @Generated
        public Destino build() {
            LocalDateTime createdAt$value = this.createdAt$value;
            if (!this.createdAt$set) {
                createdAt$value = Destino.$default$createdAt();
            }

            LocalDateTime updatedAt$value = this.updatedAt$value;
            if (!this.updatedAt$set) {
                updatedAt$value = Destino.$default$updatedAt();
            }

            List<ItinerarioDestino> itinerarios$value = this.itinerarios$value;
            if (!this.itinerarios$set) {
                itinerarios$value = Destino.$default$itinerarios();
            }

            return new Destino(this.id, this.nombre, this.pais, this.ciudad, this.descripcion, createdAt$value, updatedAt$value, itinerarios$value);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "Destino.DestinoBuilder(id=" + var10000 + ", nombre=" + this.nombre + ", pais=" + this.pais + ", ciudad=" + this.ciudad + ", descripcion=" + this.descripcion + ", createdAt$value=" + String.valueOf(this.createdAt$value) + ", updatedAt$value=" + String.valueOf(this.updatedAt$value) + ", itinerarios$value=" + String.valueOf(this.itinerarios$value) + ")";
        }
    }
}
