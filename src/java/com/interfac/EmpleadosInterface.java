package com.interfac;
import com.modelo.entity.Empleados;
import java.util.List;

public interface EmpleadosInterface {
    
    public List<Empleados> listEmpleados();
    public Empleados getEmpleados(int id);
    public void deleteDocentes(int id);
    public void updateDocentes(int id);
    
}
