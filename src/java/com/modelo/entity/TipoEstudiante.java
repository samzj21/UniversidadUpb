package com.modelo.entity;

public class TipoEstudiante {
    
    private int id;
    private String nombre_tipoestudiante;

    public TipoEstudiante() {
    }

    public TipoEstudiante(int id, String nombre_tipoestudiante) {
        this.id = id;
        this.nombre_tipoestudiante = nombre_tipoestudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_tipoestudiante() {
        return nombre_tipoestudiante;
    }

    public void setNombre_tipoestudiante(String nombre_tipoestudiante) {
        this.nombre_tipoestudiante = nombre_tipoestudiante;
    }

    @Override
    public String toString() {
        return "TipoEstudiante{" + "id=" + id + ", nombre_tipoestudiante=" + nombre_tipoestudiante + '}';
    }
    
}
