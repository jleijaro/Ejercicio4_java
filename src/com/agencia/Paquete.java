package com.agencia;

import java.util.Collection;

public class Paquete extends Producto{
    Collection productos;
    float descuentos;

    public Paquete(int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
    }
}
