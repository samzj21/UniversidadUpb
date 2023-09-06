package com.modelo.entity;

public class Aulas {
    
    private int id;
    private String nombre_aula;
    private int piso_aula;
    private int bloque_aula;

    public Aulas() {
    }

    public Aulas(int id, String nombre_aula, int piso_aula, int bloque_aula) {
        this.id = id;
        this.nombre_aula = nombre_aula;
        this.piso_aula = piso_aula;
        this.bloque_aula = bloque_aula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_aula() {
        return nombre_aula;
    }

    public void setNombre_aula(String nombre_aula) {
        this.nombre_aula = nombre_aula;
    }

    public int getPiso_aula() {
        return piso_aula;
    }

    public void setPiso_aula(int piso_aula) {
        this.piso_aula = piso_aula;
    }

    public int getBloque_aula() {
        return bloque_aula;
    }

    public void setBloque_aula(int bloque_aula) {
        this.bloque_aula = bloque_aula;
    }

    @Override
    public String toString() {
        return "Aulas{" + "id=" + id + ", nombre_aula=" + nombre_aula + ", piso_aula=" + piso_aula + ", bloque_aula=" + bloque_aula + '}';
    }
    
    
}
