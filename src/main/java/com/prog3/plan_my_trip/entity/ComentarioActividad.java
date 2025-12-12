//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
        name = "comentario_actividad"
)
public class ComentarioActividad {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "actividad_id",
            nullable = false
    )
    private Actividad actividad;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "user_id",
            nullable = false
    )
    private Usuario usuario;
    @Column(
            columnDefinition = "TEXT",
            nullable = false
    )
    private String comentario;
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
    private static LocalDateTime $default$createdAt() {
        return LocalDateTime.now();
    }

    @Generated
    private static LocalDateTime $default$updatedAt() {
        return LocalDateTime.now();
    }

    @Generated
    public static ComentarioActividadBuilder builder() {
        return new ComentarioActividadBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Actividad getActividad() {
        return this.actividad;
    }

    @Generated
    public Usuario getUsuario() {
        return this.usuario;
    }

    @Generated
    public String getComentario() {
        return this.comentario;
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
    public void setActividad(final Actividad actividad) {
        this.actividad = actividad;
    }

    @Generated
    public void setUsuario(final Usuario usuario) {
        this.usuario = usuario;
    }

    @Generated
    public void setComentario(final String comentario) {
        this.comentario = comentario;
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
    public ComentarioActividad() {
        this.createdAt = $default$createdAt();
        this.updatedAt = $default$updatedAt();
    }

    @Generated
    public ComentarioActividad(final Long id, final Actividad actividad, final Usuario usuario, final String comentario, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.actividad = actividad;
        this.usuario = usuario;
        this.comentario = comentario;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Generated
    public static class ComentarioActividadBuilder {
        @Generated
        private Long id;
        @Generated
        private Actividad actividad;
        @Generated
        private Usuario usuario;
        @Generated
        private String comentario;
        @Generated
        private boolean createdAt$set;
        @Generated
        private LocalDateTime createdAt$value;
        @Generated
        private boolean updatedAt$set;
        @Generated
        private LocalDateTime updatedAt$value;

        @Generated
        ComentarioActividadBuilder() {
        }

        @Generated
        public ComentarioActividadBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ComentarioActividadBuilder actividad(final Actividad actividad) {
            this.actividad = actividad;
            return this;
        }

        @Generated
        public ComentarioActividadBuilder usuario(final Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

        @Generated
        public ComentarioActividadBuilder comentario(final String comentario) {
            this.comentario = comentario;
            return this;
        }

        @Generated
        public ComentarioActividadBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt$value = createdAt;
            this.createdAt$set = true;
            return this;
        }

        @Generated
        public ComentarioActividadBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt$value = updatedAt;
            this.updatedAt$set = true;
            return this;
        }

        @Generated
        public ComentarioActividad build() {
            LocalDateTime createdAt$value = this.createdAt$value;
            if (!this.createdAt$set) {
                createdAt$value = ComentarioActividad.$default$createdAt();
            }

            LocalDateTime updatedAt$value = this.updatedAt$value;
            if (!this.updatedAt$set) {
                updatedAt$value = ComentarioActividad.$default$updatedAt();
            }

            return new ComentarioActividad(this.id, this.actividad, this.usuario, this.comentario, createdAt$value, updatedAt$value);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "ComentarioActividad.ComentarioActividadBuilder(id=" + var10000 + ", actividad=" + String.valueOf(this.actividad) + ", usuario=" + String.valueOf(this.usuario) + ", comentario=" + this.comentario + ", createdAt$value=" + String.valueOf(this.createdAt$value) + ", updatedAt$value=" + String.valueOf(this.updatedAt$value) + ")";
        }
    }
}
