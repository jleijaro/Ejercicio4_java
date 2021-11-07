package com.agencia;

public class Alojamiento extends Producto{
    String nombreAlojamiento;

    public Alojamiento(int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
    }

    public Alojamiento(int codigo, String descripcion, float precio, String nombreAlojamiento) {
        super(codigo, descripcion, precio);
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }
}
