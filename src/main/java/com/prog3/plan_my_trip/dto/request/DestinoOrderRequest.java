package com.prog3.plan_my_trip.dto.request;

import lombok.Generated;

public class DestinoOrderRequest {
    private Long destinoId;
    private Integer orden;

    @Generated
    public Long getDestinoId() {
        return this.destinoId;
    }

    @Generated
    public Integer getOrden() {
        return this.orden;
    }

    @Generated
    public void setDestinoId(final Long destinoId) {
        this.destinoId = destinoId;
    }

    @Generated
    public void setOrden(final Integer orden) {
        this.orden = orden;
    }

    @Generated
    public DestinoOrderRequest() {
    }

    @Generated
    public DestinoOrderRequest(final Long destinoId, final Integer orden) {
        this.destinoId = destinoId;
        this.orden = orden;
    }
}
