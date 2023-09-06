package com.interfac;
import com.modelo.entity.TipoEstudiante;
import java.util.List;

public interface TipoEstudianteInterface {
    
    public List<TipoEstudiante> listTipoEstudiante();
    public TipoEstudiante getTipoEstudiante(int id);
    public void deleteTipoEstudiante(int id);
    public void updateTipoEstudiante(int id);
    
}
