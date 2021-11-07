package com.agencia;

import java.util.Collection;

public class Cliente {
    int dni;
    String nombre;
    String telefono;
    String mail;
    Collection ventas;

    public Cliente(int dni, String nombre, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
