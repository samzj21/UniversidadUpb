package com.modelo.entity;
import java.util.Date;

public class Matricula {
    
    private int id;
    private int fk_id_empleado;
    private int fk_id_aulas;
    private int fk_id_estudiantes;
    private int fk_id_profesion;
    private Date fechaInicial_mstricula;
    private Date fechaFinal_matricula;
    private double costoMatricula;

    public Matricula() {
    }

    public Matricula(int id, int fk_id_empleado, int fk_id_aulas, int fk_id_estudiantes, int fk_id_profesion, Date fechaInicial_mstricula, Date fechaFinal_matricula, double costoMatricula) {
        this.id = id;
        this.fk_id_empleado = fk_id_empleado;
        this.fk_id_aulas = fk_id_aulas;
        this.fk_id_estudiantes = fk_id_estudiantes;
        this.fk_id_profesion = fk_id_profesion;
        this.fechaInicial_mstricula = fechaInicial_mstricula;
        this.fechaFinal_matricula = fechaFinal_matricula;
        this.costoMatricula = costoMatricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_id_empleado() {
        return fk_id_empleado;
    }

    public void setFk_id_empleado(int fk_id_empleado) {
        this.fk_id_empleado = fk_id_empleado;
    }

    public int getFk_id_aulas() {
        return fk_id_aulas;
    }

    public void setFk_id_aulas(int fk_id_aulas) {
        this.fk_id_aulas = fk_id_aulas;
    }

    public int getFk_id_estudiantes() {
        return fk_id_estudiantes;
    }

    public void setFk_id_estudiantes(int fk_id_estudiantes) {
        this.fk_id_estudiantes = fk_id_estudiantes;
    }

    public int getFk_id_profesion() {
        return fk_id_profesion;
    }

    public void setFk_id_profesion(int fk_id_profesion) {
        this.fk_id_profesion = fk_id_profesion;
    }

    public Date getFechaInicial_mstricula() {
        return fechaInicial_mstricula;
    }

    public void setFechaInicial_mstricula(Date fechaInicial_mstricula) {
        this.fechaInicial_mstricula = fechaInicial_mstricula;
    }

    public Date getFechaFinal_matricula() {
        return fechaFinal_matricula;
    }

    public void setFechaFinal_matricula(Date fechaFinal_matricula) {
        this.fechaFinal_matricula = fechaFinal_matricula;
    }

    public double getCostoMatricula() {
        return costoMatricula;
    }

    public void setCostoMatricula(double costoMatricula) {
        this.costoMatricula = costoMatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" + "id=" + id + ", fk_id_empleado=" + fk_id_empleado + ", fk_id_aulas=" + fk_id_aulas + ", fk_id_estudiantes=" + fk_id_estudiantes + ", fk_id_profesion=" + fk_id_profesion + ", fechaInicial_mstricula=" + fechaInicial_mstricula + ", fechaFinal_matricula=" + fechaFinal_matricula + ", costoMatricula=" + costoMatricula + '}';
    }
    
    
    
}
