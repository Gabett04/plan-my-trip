//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Generated;

public class DestinoRequest {
    private @NotBlank(
            message = "El nombre es obligatorio"
    ) @Size(
            max = 255
    ) String nombre;
    private @NotBlank(
            message = "El país es obligatorio"
    ) @Size(
            max = 100
    ) String pais;
    private @NotBlank(
            message = "La ciudad es obligatoria"
    ) @Size(
            max = 100
    ) String ciudad;
    private @Size(
            max = 5000
    ) String descripcion;

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
    public DestinoRequest() {
    }

    @Generated
    public DestinoRequest(final String nombre, final String pais, final String ciudad, final String descripcion) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
    }
}
