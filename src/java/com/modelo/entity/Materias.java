package com.modelo.entity;

public class Materias {
    
    private int id;
    private String nombre_materia;

    public Materias() {
    }

    public Materias(int id, String nombre_materia) {
        this.id = id;
        this.nombre_materia = nombre_materia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nombre_materia=" + nombre_materia + '}';
    }
    
}
