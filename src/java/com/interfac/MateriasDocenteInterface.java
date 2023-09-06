package com.interfac;
import com.modelo.entity.MateriasDocente;
import java.util.List;

public interface MateriasDocenteInterface {
    
    public List<MateriasDocente> listMateriasDocente();
    public MateriasDocente getMateriasDocente(int id);
    public void deleteMateriasDocente(int id);
    public void updateMateriasDocente(int id);
    
}
