//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.entity;

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
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Generated;

@Entity
@Table(
        name = "invitacion_itinerario"
)
public class InvitacionItinerario {
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
    @Column(
            nullable = false
    )
    private String emailInvitado;
    @Column(
            unique = true,
            nullable = false
    )
    private String tokenAcceso;
    @Column(
            nullable = false
    )
    private LocalDateTime fechaInvitacion;
    @Column(
            nullable = false
    )
    private LocalDateTime fechaExpiracion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime createdAt;
    @Column(
            nullable = false
    )
    private LocalDateTime updatedAt;

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    @Generated
    private static LocalDateTime $default$fechaInvitacion() {
        return LocalDateTime.now();
    }

    @Generated
    private static Estado $default$estado() {
        return InvitacionItinerario.Estado.PENDIENTE;
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
    public static InvitacionItinerarioBuilder builder() {
        return new InvitacionItinerarioBuilder();
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
    public String getEmailInvitado() {
        return this.emailInvitado;
    }

    @Generated
    public String getTokenAcceso() {
        return this.tokenAcceso;
    }

    @Generated
    public LocalDateTime getFechaInvitacion() {
        return this.fechaInvitacion;
    }

    @Generated
    public LocalDateTime getFechaExpiracion() {
        return this.fechaExpiracion;
    }

    @Generated
    public Estado getEstado() {
        return this.estado;
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
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setItinerario(final Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    @Generated
    public void setEmailInvitado(final String emailInvitado) {
        this.emailInvitado = emailInvitado;
    }

    @Generated
    public void setTokenAcceso(final String tokenAcceso) {
        this.tokenAcceso = tokenAcceso;
    }

    @Generated
    public void setFechaInvitacion(final LocalDateTime fechaInvitacion) {
        this.fechaInvitacion = fechaInvitacion;
    }

    @Generated
    public void setFechaExpiracion(final LocalDateTime fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Generated
    public void setEstado(final Estado estado) {
        this.estado = estado;
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
    public InvitacionItinerario() {
        this.fechaInvitacion = $default$fechaInvitacion();
        this.estado = $default$estado();
        this.createdAt = $default$createdAt();
        this.updatedAt = $default$updatedAt();
    }

    @Generated
    public InvitacionItinerario(final Long id, final Itinerario itinerario, final String emailInvitado, final String tokenAcceso, final LocalDateTime fechaInvitacion, final LocalDateTime fechaExpiracion, final Estado estado, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.itinerario = itinerario;
        this.emailInvitado = emailInvitado;
        this.tokenAcceso = tokenAcceso;
        this.fechaInvitacion = fechaInvitacion;
        this.fechaExpiracion = fechaExpiracion;
        this.estado = estado;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Generated
    public static class InvitacionItinerarioBuilder {
        @Generated
        private Long id;
        @Generated
        private Itinerario itinerario;
        @Generated
        private String emailInvitado;
        @Generated
        private String tokenAcceso;
        @Generated
        private boolean fechaInvitacion$set;
        @Generated
        private LocalDateTime fechaInvitacion$value;
        @Generated
        private LocalDateTime fechaExpiracion;
        @Generated
        private boolean estado$set;
        @Generated
        private Estado estado$value;
        @Generated
        private boolean createdAt$set;
        @Generated
        private LocalDateTime createdAt$value;
        @Generated
        private boolean updatedAt$set;
        @Generated
        private LocalDateTime updatedAt$value;

        @Generated
        InvitacionItinerarioBuilder() {
        }

        @Generated
        public InvitacionItinerarioBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder itinerario(final Itinerario itinerario) {
            this.itinerario = itinerario;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder emailInvitado(final String emailInvitado) {
            this.emailInvitado = emailInvitado;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder tokenAcceso(final String tokenAcceso) {
            this.tokenAcceso = tokenAcceso;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder fechaInvitacion(final LocalDateTime fechaInvitacion) {
            this.fechaInvitacion$value = fechaInvitacion;
            this.fechaInvitacion$set = true;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder fechaExpiracion(final LocalDateTime fechaExpiracion) {
            this.fechaExpiracion = fechaExpiracion;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder estado(final Estado estado) {
            this.estado$value = estado;
            this.estado$set = true;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt$value = createdAt;
            this.createdAt$set = true;
            return this;
        }

        @Generated
        public InvitacionItinerarioBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt$value = updatedAt;
            this.updatedAt$set = true;
            return this;
        }

        @Generated
        public InvitacionItinerario build() {
            LocalDateTime fechaInvitacion$value = this.fechaInvitacion$value;
            if (!this.fechaInvitacion$set) {
                fechaInvitacion$value = InvitacionItinerario.$default$fechaInvitacion();
            }

            Estado estado$value = this.estado$value;
            if (!this.estado$set) {
                estado$value = InvitacionItinerario.$default$estado();
            }

            LocalDateTime createdAt$value = this.createdAt$value;
            if (!this.createdAt$set) {
                createdAt$value = InvitacionItinerario.$default$createdAt();
            }

            LocalDateTime updatedAt$value = this.updatedAt$value;
            if (!this.updatedAt$set) {
                updatedAt$value = InvitacionItinerario.$default$updatedAt();
            }

            return new InvitacionItinerario(this.id, this.itinerario, this.emailInvitado, this.tokenAcceso, fechaInvitacion$value, this.fechaExpiracion, estado$value, createdAt$value, updatedAt$value);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "InvitacionItinerario.InvitacionItinerarioBuilder(id=" + var10000 + ", itinerario=" + String.valueOf(this.itinerario) + ", emailInvitado=" + this.emailInvitado + ", tokenAcceso=" + this.tokenAcceso + ", fechaInvitacion$value=" + String.valueOf(this.fechaInvitacion$value) + ", fechaExpiracion=" + String.valueOf(this.fechaExpiracion) + ", estado$value=" + String.valueOf(this.estado$value) + ", createdAt$value=" + String.valueOf(this.createdAt$value) + ", updatedAt$value=" + String.valueOf(this.updatedAt$value) + ")";
        }
    }

    public static enum Estado {
        PENDIENTE,
        ACEPTADA,
        EXPIRADA,
        RECHAZADA;
    }
}
