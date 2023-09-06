package com.interfac;
import com.modelo.entity.Estudiantes;
import java.util.List;

public interface EstudiantesInterface {
    
    public List<Estudiantes> listEstudiantes();
    public Estudiantes getEstudiantes(int id);
    public void deleteEstudiantes(int id);
    public void updateEstudiantes(int id);
    
}
