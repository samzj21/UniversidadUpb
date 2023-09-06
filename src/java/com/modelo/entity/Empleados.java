package com.modelo.entity;

public class Empleados {
    
    private int id;
    private String nombre_empleado;
    private String cedula_empleado;
    private String direccion_empleado;
    private String correo_empleado;
    private int fk_id_areas;

    public Empleados() {
    }

    public Empleados(int id, String nombre_empleado, String cedula_empleado, String direccion_empleado, String correo_empleado, int fk_id_areas) {
        this.id = id;
        this.nombre_empleado = nombre_empleado;
        this.cedula_empleado = cedula_empleado;
        this.direccion_empleado = direccion_empleado;
        this.correo_empleado = correo_empleado;
        this.fk_id_areas = fk_id_areas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getCedula_empleado() {
        return cedula_empleado;
    }

    public void setCedula_empleado(String cedula_empleado) {
        this.cedula_empleado = cedula_empleado;
    }

    public String getDireccion_empleado() {
        return direccion_empleado;
    }

    public void setDireccion_empleado(String direccion_empleado) {
        this.direccion_empleado = direccion_empleado;
    }

    public String getCorreo_empleado() {
        return correo_empleado;
    }

    public void setCorreo_empleado(String correo_empleado) {
        this.correo_empleado = correo_empleado;
    }

    public int getFk_id_areas() {
        return fk_id_areas;
    }

    public void setFk_id_areas(int fk_id_areas) {
        this.fk_id_areas = fk_id_areas;
    }

    @Override
    public String toString() {
        return "Empleados{" + "id=" + id + ", nombre_empleado=" + nombre_empleado + ", cedula_empleado=" + cedula_empleado + ", direccion_empleado=" + direccion_empleado + ", correo_empleado=" + correo_empleado + ", fk_id_areas=" + fk_id_areas + '}';
    }
 
}
