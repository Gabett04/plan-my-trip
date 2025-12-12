package com.prog3.plan_my_trip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Generated;

@Entity
@Table(
        name = "itinerario_destino"
)
@IdClass(ItinerarioDestinoId.class)
public class ItinerarioDestino {
    @Id
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "itinerario_id"
    )
    private Itinerario itinerario;
    @Id
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "destino_id"
    )
    private Destino destino;
    @Column(
            nullable = false
    )
    private Integer orden;

    @Generated
    public static ItinerarioDestinoBuilder builder() {
        return new ItinerarioDestinoBuilder();
    }

    @Generated
    public Itinerario getItinerario() {
        return this.itinerario;
    }

    @Generated
    public Destino getDestino() {
        return this.destino;
    }

    @Generated
    public Integer getOrden() {
        return this.orden;
    }

    @Generated
    public void setItinerario(final Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    @Generated
    public void setDestino(final Destino destino) {
        this.destino = destino;
    }

    @Generated
    public void setOrden(final Integer orden) {
        this.orden = orden;
    }

    @Generated
    public ItinerarioDestino() {
    }

    @Generated
    public ItinerarioDestino(final Itinerario itinerario, final Destino destino, final Integer orden) {
        this.itinerario = itinerario;
        this.destino = destino;
        this.orden = orden;
    }

    @Generated
    public static class ItinerarioDestinoBuilder {
        @Generated
        private Itinerario itinerario;
        @Generated
        private Destino destino;
        @Generated
        private Integer orden;

        @Generated
        ItinerarioDestinoBuilder() {
        }

        @Generated
        public ItinerarioDestinoBuilder itinerario(final Itinerario itinerario) {
            this.itinerario = itinerario;
            return this;
        }

        @Generated
        public ItinerarioDestinoBuilder destino(final Destino destino) {
            this.destino = destino;
            return this;
        }

        @Generated
        public ItinerarioDestinoBuilder orden(final Integer orden) {
            this.orden = orden;
            return this;
        }

        @Generated
        public ItinerarioDestino build() {
            return new ItinerarioDestino(this.itinerario, this.destino, this.orden);
        }

        @Generated
        public String toString() {
            String var10000 = String.valueOf(this.itinerario);
            return "ItinerarioDestino.ItinerarioDestinoBuilder(itinerario=" + var10000 + ", destino=" + String.valueOf(this.destino) + ", orden=" + this.orden + ")";
        }
    }
}
