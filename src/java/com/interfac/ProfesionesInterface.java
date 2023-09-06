package com.interfac;
import com.modelo.entity.Profesiones;
import java.util.List;

public interface ProfesionesInterface {
    
    public List<Profesiones> listProfesiones();
    public Profesiones getProfesiones(int id);
    public void deleteProfesiones(int id);
    public void updateProfesiones(int id);
    
}
