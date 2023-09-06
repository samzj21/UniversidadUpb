package com.modelo.entity;

public class Docentes {
    
    private int id;
    private String nombre_docente;
    private String cedula_docente;
    private String direccion_docente;
    private String correo_docente;
    private int fk_id_facultad;

    public Docentes() {
    }

    public Docentes(int id, String nombre_docente, String cedula_docente, String direccion_docente, String correo_docente, int fk_id_facultad) {
        this.id = id;
        this.nombre_docente = nombre_docente;
        this.cedula_docente = cedula_docente;
        this.direccion_docente = direccion_docente;
        this.correo_docente = correo_docente;
        this.fk_id_facultad = fk_id_facultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public String getCedula_docente() {
        return cedula_docente;
    }

    public void setCedula_docente(String cedula_docente) {
        this.cedula_docente = cedula_docente;
    }

    public String getDireccion_docente() {
        return direccion_docente;
    }

    public void setDireccion_docente(String direccion_docente) {
        this.direccion_docente = direccion_docente;
    }

    public String getCorreo_docente() {
        return correo_docente;
    }

    public void setCorreo_docente(String correo_docente) {
        this.correo_docente = correo_docente;
    }

    public int getFk_id_facultad() {
        return fk_id_facultad;
    }

    public void setFk_id_facultad(int fk_id_facultad) {
        this.fk_id_facultad = fk_id_facultad;
    }

    @Override
    public String toString() {
        return "Docentes{" + "id=" + id + ", nombre_docente=" + nombre_docente + ", cedula_docente=" + cedula_docente + ", direccion_docente=" + direccion_docente + ", correo_docente=" + correo_docente + ", fk_id_facultad=" + fk_id_facultad + '}';
    }
    
}
