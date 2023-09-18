package com.wwsa.woodworksmartap.dtos;

public class FurnitureDesignmaxDTO {
    private String nombre;
    private int CantidadTipoMueble;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadTipoMueble() {
        return CantidadTipoMueble;
    }

    public void setCantidadTipoMueble(int cantidadTipoMueble) {
        CantidadTipoMueble = cantidadTipoMueble;
    }
}
