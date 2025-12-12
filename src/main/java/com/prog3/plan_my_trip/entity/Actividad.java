//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

@Entity
@Table(
        name = "actividades"
)
public class Actividad {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "itinerario_id",
            nullable = false
    )
    private Itinerario itinerario;
    @Enumerated(EnumType.STRING)
    @Column(
            nullable = false
    )
    private TipoActividad tipoActividad;
    @Column(
            nullable = false
    )
    private String titulo;
    @Column(
            columnDefinition = "TEXT"
    )
    private String descripcion;
    @Column(
            nullable = false
    )
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String ubicacion;
    @Column(
            precision = 10,
            scale = 2
    )
    private BigDecimal costo;
    @Column(
            length = 3
    )
    private String moneda;
    @Column(
            columnDefinition = "TEXT"
    )
    private String notas;
    @Column(
            columnDefinition = "JSON"
    )
    private String archivosAdjuntos;
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
            mappedBy = "actividad",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<ComentarioActividad> comentarios;

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    @Generated
    private static BigDecimal $default$costo() {
        return BigDecimal.ZERO;
    }

    @Generated
    private static String $default$moneda() {
        return "USD";
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
    private static List<ComentarioActividad> $default$comentarios() {
        return new ArrayList();
    }

    @Generated
    public static ActividadBuilder builder() {
        return new ActividadBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Itinerario getItinerario() {
        return this.itinerario;
    }

    @Generated
    public TipoActividad getTipoActividad() {
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
    public String getArchivosAdjuntos() {
        return this.archivosAdjuntos;
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
    public List<ComentarioActividad> getComentarios() {
        return this.comentarios;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setItinerario(final Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    @Generated
    public void setTipoActividad(final TipoActividad tipoActividad) {
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
    public void setArchivosAdjuntos(final String archivosAdjuntos) {
        this.archivosAdjuntos = archivosAdjuntos;
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
    public void setComentarios(final List<ComentarioActividad> comentarios) {
        this.comentarios = comentarios;
    }

    @Generated
    public Actividad() {
        this.costo = $default$costo();
        this.moneda = $default$moneda();
        this.createdAt = $default$createdAt();
        this.updatedAt = $default$updatedAt();
        this.comentarios = $default$comentarios();
    }

    @Generated
    public Actividad(final Long id, final Itinerario itinerario, final TipoActividad tipoActividad, final String titulo, final String descripcion, final LocalDateTime fechaHoraInicio, final LocalDateTime fechaHoraFin, final String ubicacion, final BigDecimal costo, final String moneda, final String notas, final String archivosAdjuntos, final LocalDateTime createdAt, final LocalDateTime updatedAt, final List<ComentarioActividad> comentarios) {
        this.id = id;
        this.itinerario = itinerario;
        this.tipoActividad = tipoActividad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.ubicacion = ubicacion;
        this.costo = costo;
        this.moneda = moneda;
        this.notas = notas;
        this.archivosAdjuntos = archivosAdjuntos;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.comentarios = comentarios;
    }

    @Generated
    public static class ActividadBuilder {
        @Generated
        private Long id;
        @Generated
        private Itinerario itinerario;
        @Generated
        private TipoActividad tipoActividad;
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
        private boolean costo$set;
        @Generated
        private BigDecimal costo$value;
        @Generated
        private boolean moneda$set;
        @Generated
        private String moneda$value;
        @Generated
        private String notas;
        @Generated
        private String archivosAdjuntos;
        @Generated
        private boolean createdAt$set;
        @Generated
        private LocalDateTime createdAt$value;
        @Generated
        private boolean updatedAt$set;
        @Generated
        private LocalDateTime updatedAt$value;
        @Generated
        private boolean comentarios$set;
        @Generated
        private List<ComentarioActividad> comentarios$value;

        @Generated
        ActividadBuilder() {
        }

        @Generated
        public ActividadBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ActividadBuilder itinerario(final Itinerario itinerario) {
            this.itinerario = itinerario;
            return this;
        }

        @Generated
        public ActividadBuilder tipoActividad(final TipoActividad tipoActividad) {
            this.tipoActividad = tipoActividad;
            return this;
        }

        @Generated
        public ActividadBuilder titulo(final String titulo) {
            this.titulo = titulo;
            return this;
        }

        @Generated
        public ActividadBuilder descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        @Generated
        public ActividadBuilder fechaHoraInicio(final LocalDateTime fechaHoraInicio) {
            this.fechaHoraInicio = fechaHoraInicio;
            return this;
        }

        @Generated
        public ActividadBuilder fechaHoraFin(final LocalDateTime fechaHoraFin) {
            this.fechaHoraFin = fechaHoraFin;
            return this;
        }

        @Generated
        public ActividadBuilder ubicacion(final String ubicacion) {
            this.ubicacion = ubicacion;
            return this;
        }

        @Generated
        public ActividadBuilder costo(final BigDecimal costo) {
            this.costo$value = costo;
            this.costo$set = true;
            return this;
        }

        @Generated
        public ActividadBuilder moneda(final String moneda) {
            this.moneda$value = moneda;
            this.moneda$set = true;
            return this;
        }

        @Generated
        public ActividadBuilder notas(final String notas) {
            this.notas = notas;
            return this;
        }

        @Generated
        public ActividadBuilder archivosAdjuntos(final String archivosAdjuntos) {
            this.archivosAdjuntos = archivosAdjuntos;
            return this;
        }

        @Generated
        public ActividadBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt$value = createdAt;
            this.createdAt$set = true;
            return this;
        }

        @Generated
        public ActividadBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt$value = updatedAt;
            this.updatedAt$set = true;
            return this;
        }

        @Generated
        public ActividadBuilder comentarios(final List<ComentarioActividad> comentarios) {
            this.comentarios$value = comentarios;
            this.comentarios$set = true;
            return this;
        }

        @Generated
        public Actividad build() {
            BigDecimal costo$value = this.costo$value;
            if (!this.costo$set) {
                costo$value = Actividad.$default$costo();
            }

            String moneda$value = this.moneda$value;
            if (!this.moneda$set) {
                moneda$value = Actividad.$default$moneda();
            }

            LocalDateTime createdAt$value = this.createdAt$value;
            if (!this.createdAt$set) {
                createdAt$value = Actividad.$default$createdAt();
            }

            LocalDateTime updatedAt$value = this.updatedAt$value;
            if (!this.updatedAt$set) {
                updatedAt$value = Actividad.$default$updatedAt();
            }

            List<ComentarioActividad> comentarios$value = this.comentarios$value;
            if (!this.comentarios$set) {
                comentarios$value = Actividad.$default$comentarios();
            }

            return new Actividad(this.id, this.itinerario, this.tipoActividad, this.titulo, this.descripcion, this.fechaHoraInicio, this.fechaHoraFin, this.ubicacion, costo$value, moneda$value, this.notas, this.archivosAdjuntos, createdAt$value, updatedAt$value, comentarios$value);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "Actividad.ActividadBuilder(id=" + var10000 + ", itinerario=" + String.valueOf(this.itinerario) + ", tipoActividad=" + String.valueOf(this.tipoActividad) + ", titulo=" + this.titulo + ", descripcion=" + this.descripcion + ", fechaHoraInicio=" + String.valueOf(this.fechaHoraInicio) + ", fechaHoraFin=" + String.valueOf(this.fechaHoraFin) + ", ubicacion=" + this.ubicacion + ", costo$value=" + String.valueOf(this.costo$value) + ", moneda$value=" + this.moneda$value + ", notas=" + this.notas + ", archivosAdjuntos=" + this.archivosAdjuntos + ", createdAt$value=" + String.valueOf(this.createdAt$value) + ", updatedAt$value=" + String.valueOf(this.updatedAt$value) + ", comentarios$value=" + String.valueOf(this.comentarios$value) + ")";
        }
    }

    public static enum TipoActividad {
        TRANSPORTE,
        ALOJAMIENTO,
        COMIDA,
        TURISMO,
        COMPRAS,
        OTROS;
    }
}
