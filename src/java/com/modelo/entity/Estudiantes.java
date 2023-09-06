package com.modelo.entity;
import java.util.Date;

public class Estudiantes {
    
    private int id;
    private String nombre_estudiante;
    private String cedula_estudiante;
    private Date fechaNacimiento_estudiante;
    private String direccion_estudiante;
    private String correo_estudiante;
    private int fk_id_estudiante;

    public Estudiantes() {
    }

    public Estudiantes(int id, String nombre_estudiante, String cedula_estudiante, Date fechaNacimiento_estudiante, String direccion_estudiante, String correo_estudiante, int fk_id_estudiante) {
        this.id = id;
        this.nombre_estudiante = nombre_estudiante;
        this.cedula_estudiante = cedula_estudiante;
        this.fechaNacimiento_estudiante = fechaNacimiento_estudiante;
        this.direccion_estudiante = direccion_estudiante;
        this.correo_estudiante = correo_estudiante;
        this.fk_id_estudiante = fk_id_estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getCedula_estudiante() {
        return cedula_estudiante;
    }

    public void setCedula_estudiante(String cedula_estudiante) {
        this.cedula_estudiante = cedula_estudiante;
    }

    public Date getFechaNacimiento_estudiante() {
        return fechaNacimiento_estudiante;
    }

    public void setFechaNacimiento_estudiante(Date fechaNacimiento_estudiante) {
        this.fechaNacimiento_estudiante = fechaNacimiento_estudiante;
    }

    public String getDireccion_estudiante() {
        return direccion_estudiante;
    }

    public void setDireccion_estudiante(String direccion_estudiante) {
        this.direccion_estudiante = direccion_estudiante;
    }

    public String getCorreo_estudiante() {
        return correo_estudiante;
    }

    public void setCorreo_estudiante(String correo_estudiante) {
        this.correo_estudiante = correo_estudiante;
    }

    public int getFk_id_estudiante() {
        return fk_id_estudiante;
    }

    public void setFk_id_estudiante(int fk_id_estudiante) {
        this.fk_id_estudiante = fk_id_estudiante;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "id=" + id + ", nombre_estudiante=" + nombre_estudiante + ", cedula_estudiante=" + cedula_estudiante + ", fechaNacimiento_estudiante=" + fechaNacimiento_estudiante + ", direccion_estudiante=" + direccion_estudiante + ", correo_estudiante=" + correo_estudiante + ", fk_id_estudiante=" + fk_id_estudiante + '}';
    }

}
