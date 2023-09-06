package com.interfac;
import com.modelo.entity.Aulas;
import java.util.List;

public interface AulasInterface {
    
    public List<Aulas> listAulas();
    public Aulas getAulas(int id);
    public void deleteAulas(int id);
    public void updateAulas(int id);
    
}
