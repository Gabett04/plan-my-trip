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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

@Entity
@Table(
        name = "itinerarios"
)
public class Itinerario {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "user_id",
            nullable = false
    )
    private Usuario usuario;
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
    private LocalDate fechaInicio;
    @Column(
            nullable = false
    )
    private LocalDate fechaFin;
    @Column(
            precision = 10,
            scale = 2
    )
    private BigDecimal presupuestoTotal;
    @Enumerated(EnumType.STRING)
    private Visibilidad visibilidad;
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
            mappedBy = "itinerario",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<Actividad> actividades;
    @OneToMany(
            mappedBy = "itinerario",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<ItinerarioDestino> destinos;
    @OneToMany(
            mappedBy = "itinerario",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<InvitacionItinerario> invitaciones;
    @OneToMany(
            mappedBy = "itinerario",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<ChatItinerario> mensajes;

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    @Generated
    private static BigDecimal $default$presupuestoTotal() {
        return BigDecimal.ZERO;
    }

    @Generated
    private static Visibilidad $default$visibilidad() {
        return Itinerario.Visibilidad.PRIVADO;
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
    private static List<Actividad> $default$actividades() {
        return new ArrayList();
    }

    @Generated
    private static List<ItinerarioDestino> $default$destinos() {
        return new ArrayList();
    }

    @Generated
    private static List<InvitacionItinerario> $default$invitaciones() {
        return new ArrayList();
    }

    @Generated
    private static List<ChatItinerario> $default$mensajes() {
        return new ArrayList();
    }

    @Generated
    public static ItinerarioBuilder builder() {
        return new ItinerarioBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Usuario getUsuario() {
        return this.usuario;
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
    public Visibilidad getVisibilidad() {
        return this.visibilidad;
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
    public List<Actividad> getActividades() {
        return this.actividades;
    }

    @Generated
    public List<ItinerarioDestino> getDestinos() {
        return this.destinos;
    }

    @Generated
    public List<InvitacionItinerario> getInvitaciones() {
        return this.invitaciones;
    }

    @Generated
    public List<ChatItinerario> getMensajes() {
        return this.mensajes;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setUsuario(final Usuario usuario) {
        this.usuario = usuario;
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
    public void setVisibilidad(final Visibilidad visibilidad) {
        this.visibilidad = visibilidad;
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
    public void setActividades(final List<Actividad> actividades) {
        this.actividades = actividades;
    }

    @Generated
    public void setDestinos(final List<ItinerarioDestino> destinos) {
        this.destinos = destinos;
    }

    @Generated
    public void setInvitaciones(final List<InvitacionItinerario> invitaciones) {
        this.invitaciones = invitaciones;
    }

    @Generated
    public void setMensajes(final List<ChatItinerario> mensajes) {
        this.mensajes = mensajes;
    }

    @Generated
    public Itinerario() {
        this.presupuestoTotal = $default$presupuestoTotal();
        this.visibilidad = $default$visibilidad();
        this.createdAt = $default$createdAt();
        this.updatedAt = $default$updatedAt();
        this.actividades = $default$actividades();
        this.destinos = $default$destinos();
        this.invitaciones = $default$invitaciones();
        this.mensajes = $default$mensajes();
    }

    @Generated
    public Itinerario(final Long id, final Usuario usuario, final String titulo, final String descripcion, final LocalDate fechaInicio, final LocalDate fechaFin, final BigDecimal presupuestoTotal, final Visibilidad visibilidad, final LocalDateTime createdAt, final LocalDateTime updatedAt, final List<Actividad> actividades, final List<ItinerarioDestino> destinos, final List<InvitacionItinerario> invitaciones, final List<ChatItinerario> mensajes) {
        this.id = id;
        this.usuario = usuario;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.presupuestoTotal = presupuestoTotal;
        this.visibilidad = visibilidad;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.actividades = actividades;
        this.destinos = destinos;
        this.invitaciones = invitaciones;
        this.mensajes = mensajes;
    }

    @Generated
    public static class ItinerarioBuilder {
        @Generated
        private Long id;
        @Generated
        private Usuario usuario;
        @Generated
        private String titulo;
        @Generated
        private String descripcion;
        @Generated
        private LocalDate fechaInicio;
        @Generated
        private LocalDate fechaFin;
        @Generated
        private boolean presupuestoTotal$set;
        @Generated
        private BigDecimal presupuestoTotal$value;
        @Generated
        private boolean visibilidad$set;
        @Generated
        private Visibilidad visibilidad$value;
        @Generated
        private boolean createdAt$set;
        @Generated
        private LocalDateTime createdAt$value;
        @Generated
        private boolean updatedAt$set;
        @Generated
        private LocalDateTime updatedAt$value;
        @Generated
        private boolean actividades$set;
        @Generated
        private List<Actividad> actividades$value;
        @Generated
        private boolean destinos$set;
        @Generated
        private List<ItinerarioDestino> destinos$value;
        @Generated
        private boolean invitaciones$set;
        @Generated
        private List<InvitacionItinerario> invitaciones$value;
        @Generated
        private boolean mensajes$set;
        @Generated
        private List<ChatItinerario> mensajes$value;

        @Generated
        ItinerarioBuilder() {
        }

        @Generated
        public ItinerarioBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ItinerarioBuilder usuario(final Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

        @Generated
        public ItinerarioBuilder titulo(final String titulo) {
            this.titulo = titulo;
            return this;
        }

        @Generated
        public ItinerarioBuilder descripcion(final String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        @Generated
        public ItinerarioBuilder fechaInicio(final LocalDate fechaInicio) {
            this.fechaInicio = fechaInicio;
            return this;
        }

        @Generated
        public ItinerarioBuilder fechaFin(final LocalDate fechaFin) {
            this.fechaFin = fechaFin;
            return this;
        }

        @Generated
        public ItinerarioBuilder presupuestoTotal(final BigDecimal presupuestoTotal) {
            this.presupuestoTotal$value = presupuestoTotal;
            this.presupuestoTotal$set = true;
            return this;
        }

        @Generated
        public ItinerarioBuilder visibilidad(final Visibilidad visibilidad) {
            this.visibilidad$value = visibilidad;
            this.visibilidad$set = true;
            return this;
        }

        @Generated
        public ItinerarioBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt$value = createdAt;
            this.createdAt$set = true;
            return this;
        }

        @Generated
        public ItinerarioBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt$value = updatedAt;
            this.updatedAt$set = true;
            return this;
        }

        @Generated
        public ItinerarioBuilder actividades(final List<Actividad> actividades) {
            this.actividades$value = actividades;
            this.actividades$set = true;
            return this;
        }

        @Generated
        public ItinerarioBuilder destinos(final List<ItinerarioDestino> destinos) {
            this.destinos$value = destinos;
            this.destinos$set = true;
            return this;
        }

        @Generated
        public ItinerarioBuilder invitaciones(final List<InvitacionItinerario> invitaciones) {
            this.invitaciones$value = invitaciones;
            this.invitaciones$set = true;
            return this;
        }

        @Generated
        public ItinerarioBuilder mensajes(final List<ChatItinerario> mensajes) {
            this.mensajes$value = mensajes;
            this.mensajes$set = true;
            return this;
        }

        @Generated
        public Itinerario build() {
            BigDecimal presupuestoTotal$value = this.presupuestoTotal$value;
            if (!this.presupuestoTotal$set) {
                presupuestoTotal$value = Itinerario.$default$presupuestoTotal();
            }

            Visibilidad visibilidad$value = this.visibilidad$value;
            if (!this.visibilidad$set) {
                visibilidad$value = Itinerario.$default$visibilidad();
            }

            LocalDateTime createdAt$value = this.createdAt$value;
            if (!this.createdAt$set) {
                createdAt$value = Itinerario.$default$createdAt();
            }

            LocalDateTime updatedAt$value = this.updatedAt$value;
            if (!this.updatedAt$set) {
                updatedAt$value = Itinerario.$default$updatedAt();
            }

            List<Actividad> actividades$value = this.actividades$value;
            if (!this.actividades$set) {
                actividades$value = Itinerario.$default$actividades();
            }

            List<ItinerarioDestino> destinos$value = this.destinos$value;
            if (!this.destinos$set) {
                destinos$value = Itinerario.$default$destinos();
            }

            List<InvitacionItinerario> invitaciones$value = this.invitaciones$value;
            if (!this.invitaciones$set) {
                invitaciones$value = Itinerario.$default$invitaciones();
            }

            List<ChatItinerario> mensajes$value = this.mensajes$value;
            if (!this.mensajes$set) {
                mensajes$value = Itinerario.$default$mensajes();
            }

            return new Itinerario(this.id, this.usuario, this.titulo, this.descripcion, this.fechaInicio, this.fechaFin, presupuestoTotal$value, visibilidad$value, createdAt$value, updatedAt$value, actividades$value, destinos$value, invitaciones$value, mensajes$value);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "Itinerario.ItinerarioBuilder(id=" + var10000 + ", usuario=" + String.valueOf(this.usuario) + ", titulo=" + this.titulo + ", descripcion=" + this.descripcion + ", fechaInicio=" + String.valueOf(this.fechaInicio) + ", fechaFin=" + String.valueOf(this.fechaFin) + ", presupuestoTotal$value=" + String.valueOf(this.presupuestoTotal$value) + ", visibilidad$value=" + String.valueOf(this.visibilidad$value) + ", createdAt$value=" + String.valueOf(this.createdAt$value) + ", updatedAt$value=" + String.valueOf(this.updatedAt$value) + ", actividades$value=" + String.valueOf(this.actividades$value) + ", destinos$value=" + String.valueOf(this.destinos$value) + ", invitaciones$value=" + String.valueOf(this.invitaciones$value) + ", mensajes$value=" + String.valueOf(this.mensajes$value) + ")";
        }
    }

    public static enum Visibilidad {
        PUBLICO,
        PRIVADO;
    }
}
