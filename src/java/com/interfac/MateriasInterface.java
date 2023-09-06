package com.interfac;
import com.modelo.entity.Materias;
import java.util.List;

public interface MateriasInterface {
    
    public List<Materias> listMaterias();
    public Materias listMaterias(int id);
    public void deleteMaterias(int id);
    public void updateMaterias(int id);
    
}
