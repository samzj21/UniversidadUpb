package com.modelo.entity;

public class Profesiones {
    
    private int id;
    private String nombre_profesion;
    private int duracion;
    private int fk_id_materias;

    public Profesiones() {
    }

    public Profesiones(int id, String nombre_profesion, int duracion, int fk_id_materias) {
        this.id = id;
        this.nombre_profesion = nombre_profesion;
        this.duracion = duracion;
        this.fk_id_materias = fk_id_materias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_profesion() {
        return nombre_profesion;
    }

    public void setNombre_profesion(String nombre_profesion) {
        this.nombre_profesion = nombre_profesion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFk_id_materias() {
        return fk_id_materias;
    }

    public void setFk_id_materias(int fk_id_materias) {
        this.fk_id_materias = fk_id_materias;
    }

    @Override
    public String toString() {
        return "Profesiones{" + "id=" + id + ", nombre_profesion=" + nombre_profesion + ", duracion=" + duracion + ", fk_id_materias=" + fk_id_materias + '}';
    }
    
}
