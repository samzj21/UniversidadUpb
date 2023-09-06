package com.modelo.entity;

public class Areas {
    
   private int id;
   private String nombre_area;

    public Areas() {
    }

    public Areas(int id, String nombre_area) {
        this.id = id;
        this.nombre_area = nombre_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }

    @Override
    public String toString() {
        return "Areas{" + "id=" + id + ", nombre_area=" + nombre_area + '}';
    }
   
   
}
