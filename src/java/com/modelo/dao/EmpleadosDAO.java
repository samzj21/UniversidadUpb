package com.modelo.dao;
import com.modelo.entity.Empleados;
import com.interfac.EmpleadosInterface;
import java.util.List;

public class EmpleadosDAO implements EmpleadosInterface {

    @Override
    public List<Empleados> listEmpleados() {
        return null;    
    }

    @Override
    public Empleados getEmpleados(int id) {
        return null;
    }

    @Override
    public void deleteDocentes(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateDocentes(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
