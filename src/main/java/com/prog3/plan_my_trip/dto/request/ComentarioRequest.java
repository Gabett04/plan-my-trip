package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Generated;

public class ComentarioRequest {
    private @NotBlank(
            message = "El comentario es obligatorio"
    ) @Size(
            max = 5000
    ) String comentario;

    @Generated
    public String getComentario() {
        return this.comentario;
    }

    @Generated
    public void setComentario(final String comentario) {
        this.comentario = comentario;
    }

    @Generated
    public ComentarioRequest() {
    }

    @Generated
    public ComentarioRequest(final String comentario) {
        this.comentario = comentario;
    }
}
