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
        name = "chat_itinerario"
)
public class ChatItinerario {
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
    private String mensaje;
    @Enumerated(EnumType.STRING)
    private TipoMensaje tipo;
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
    private static TipoMensaje $default$tipo() {
        return ChatItinerario.TipoMensaje.TEXTO;
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
    public static ChatItinerarioBuilder builder() {
        return new ChatItinerarioBuilder();
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
    public Usuario getUsuario() {
        return this.usuario;
    }

    @Generated
    public String getMensaje() {
        return this.mensaje;
    }

    @Generated
    public TipoMensaje getTipo() {
        return this.tipo;
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
    public void setUsuario(final Usuario usuario) {
        this.usuario = usuario;
    }

    @Generated
    public void setMensaje(final String mensaje) {
        this.mensaje = mensaje;
    }

    @Generated
    public void setTipo(final TipoMensaje tipo) {
        this.tipo = tipo;
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
    public ChatItinerario() {
        this.tipo = $default$tipo();
        this.createdAt = $default$createdAt();
        this.updatedAt = $default$updatedAt();
    }

    @Generated
    public ChatItinerario(final Long id, final Itinerario itinerario, final Usuario usuario, final String mensaje, final TipoMensaje tipo, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.itinerario = itinerario;
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Generated
    public static class ChatItinerarioBuilder {
        @Generated
        private Long id;
        @Generated
        private Itinerario itinerario;
        @Generated
        private Usuario usuario;
        @Generated
        private String mensaje;
        @Generated
        private boolean tipo$set;
        @Generated
        private TipoMensaje tipo$value;
        @Generated
        private boolean createdAt$set;
        @Generated
        private LocalDateTime createdAt$value;
        @Generated
        private boolean updatedAt$set;
        @Generated
        private LocalDateTime updatedAt$value;

        @Generated
        ChatItinerarioBuilder() {
        }

        @Generated
        public ChatItinerarioBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        @Generated
        public ChatItinerarioBuilder itinerario(final Itinerario itinerario) {
            this.itinerario = itinerario;
            return this;
        }

        @Generated
        public ChatItinerarioBuilder usuario(final Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

        @Generated
        public ChatItinerarioBuilder mensaje(final String mensaje) {
            this.mensaje = mensaje;
            return this;
        }

        @Generated
        public ChatItinerarioBuilder tipo(final TipoMensaje tipo) {
            this.tipo$value = tipo;
            this.tipo$set = true;
            return this;
        }

        @Generated
        public ChatItinerarioBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt$value = createdAt;
            this.createdAt$set = true;
            return this;
        }

        @Generated
        public ChatItinerarioBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt$value = updatedAt;
            this.updatedAt$set = true;
            return this;
        }

        @Generated
        public ChatItinerario build() {
            TipoMensaje tipo$value = this.tipo$value;
            if (!this.tipo$set) {
                tipo$value = ChatItinerario.$default$tipo();
            }

            LocalDateTime createdAt$value = this.createdAt$value;
            if (!this.createdAt$set) {
                createdAt$value = ChatItinerario.$default$createdAt();
            }

            LocalDateTime updatedAt$value = this.updatedAt$value;
            if (!this.updatedAt$set) {
                updatedAt$value = ChatItinerario.$default$updatedAt();
            }

            return new ChatItinerario(this.id, this.itinerario, this.usuario, this.mensaje, tipo$value, createdAt$value, updatedAt$value);
        }

        @Generated
        public String toString() {
            Long var10000 = this.id;
            return "ChatItinerario.ChatItinerarioBuilder(id=" + var10000 + ", itinerario=" + String.valueOf(this.itinerario) + ", usuario=" + String.valueOf(this.usuario) + ", mensaje=" + this.mensaje + ", tipo$value=" + String.valueOf(this.tipo$value) + ", createdAt$value=" + String.valueOf(this.createdAt$value) + ", updatedAt$value=" + String.valueOf(this.updatedAt$value) + ")";
        }
    }

    public static enum TipoMensaje {
        TEXTO,
        ARCHIVO,
        SISTEMA;
    }
}
