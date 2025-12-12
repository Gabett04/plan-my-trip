//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.entity;

import java.io.Serializable;
import lombok.Generated;

public class ItinerarioDestinoId implements Serializable {
    private Long itinerario;
    private Long destino;

    @Generated
    public Long getItinerario() {
        return this.itinerario;
    }

    @Generated
    public Long getDestino() {
        return this.destino;
    }

    @Generated
    public void setItinerario(final Long itinerario) {
        this.itinerario = itinerario;
    }

    @Generated
    public void setDestino(final Long destino) {
        this.destino = destino;
    }

    @Generated
    public ItinerarioDestinoId() {
    }

    @Generated
    public ItinerarioDestinoId(final Long itinerario, final Long destino) {
        this.itinerario = itinerario;
        this.destino = destino;
    }

    @Generated
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ItinerarioDestinoId)) {
            return false;
        } else {
            ItinerarioDestinoId other = (ItinerarioDestinoId)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$itinerario = this.getItinerario();
                Object other$itinerario = other.getItinerario();
                if (this$itinerario == null) {
                    if (other$itinerario != null) {
                        return false;
                    }
                } else if (!this$itinerario.equals(other$itinerario)) {
                    return false;
                }

                Object this$destino = this.getDestino();
                Object other$destino = other.getDestino();
                if (this$destino == null) {
                    if (other$destino != null) {
                        return false;
                    }
                } else if (!this$destino.equals(other$destino)) {
                    return false;
                }

                return true;
            }
        }
    }

    @Generated
    protected boolean canEqual(final Object other) {
        return other instanceof ItinerarioDestinoId;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $itinerario = this.getItinerario();
        result = result * 59 + ($itinerario == null ? 43 : $itinerario.hashCode());
        Object $destino = this.getDestino();
        result = result * 59 + ($destino == null ? 43 : $destino.hashCode());
        return result;
    }
}
