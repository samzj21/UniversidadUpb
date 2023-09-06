package com.modelo.entity;

public class MateriasDocente {
    
    private int id;
    private int fk_id_materia;
    private int fk_id_docentes;

    public MateriasDocente() {
    }

    public MateriasDocente(int id, int fk_id_materia, int fk_id_docentes) {
        this.id = id;
        this.fk_id_materia = fk_id_materia;
        this.fk_id_docentes = fk_id_docentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_id_materia() {
        return fk_id_materia;
    }

    public void setFk_id_materia(int fk_id_materia) {
        this.fk_id_materia = fk_id_materia;
    }

    public int getFk_id_docentes() {
        return fk_id_docentes;
    }

    public void setFk_id_docentes(int fk_id_docentes) {
        this.fk_id_docentes = fk_id_docentes;
    }

    @Override
    public String toString() {
        return "MateriasDocente{" + "id=" + id + ", fk_id_materia=" + fk_id_materia + ", fk_id_docentes=" + fk_id_docentes + '}';
    }

}
