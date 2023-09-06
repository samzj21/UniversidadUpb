package com.interfac;
import com.modelo.entity.Facultad;
import java.util.List;

public interface FacultadInterface {
    
    public List<Facultad> listFacultad();
    public Facultad getFacultad(int id);
    public void deteleFacultad(int id);
    public void updateFacultad(int id);
    
}
