package com.interfac;
import com.modelo.entity.Docentes;
import java.util.List;


public interface DocentesInterface {
    
    public List<Docentes> listDocentes();
    public Docentes getDocentes(int id);
    public void deleteDocentes(int id);
    public void updateDocentes(int id);
    
}
