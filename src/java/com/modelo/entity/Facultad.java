package com.modelo.entity;

public class Facultad {
    
    private int id;
    private String nombre_facultad;

    public Facultad() {
    }

    public Facultad(int id, String nombre_facultad) {
        this.id = id;
        this.nombre_facultad = nombre_facultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public void setNombre_facultad(String nombre_facultad) {
        this.nombre_facultad = nombre_facultad;
    }

    @Override
    public String toString() {
        return "Facultad{" + "id=" + id + ", nombre_facultad=" + nombre_facultad + '}';
    }

}
