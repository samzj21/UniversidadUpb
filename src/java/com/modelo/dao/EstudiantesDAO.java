package com.modelo.dao;

import com.configuracion.Conexion;
import com.modelo.entity.Estudiantes;
import com.interfac.EstudiantesInterface;
import java.util.List;
import java.sql.*;
import java.util.logging.*;

public class EstudiantesDAO implements EstudiantesInterface {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    @Override
    public Estudiantes getEstudiantes(int id) {
        Estudiantes estudiantes = new Estudiantes();
        try {

            String sqlQuery = "SELECT * FROM estudiantes WHERE id=?";
            con = conexion.getConexion();
            preparedStatement = con.prepareStatement( sqlQuery );
        preparedStatement.setInt(id, 1);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                estudiantes.setId(resultSet.getInt("id"));
                estudiantes.setNombre_estudiante( resultSet.getString(""));
                estudiantes.setCedula_estudiante(resultSet.getString("cedula_estudiante"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstudiantesDAO.class.getName()).log(Level.SEVERE, null, ex);
        
            return estudiantes;

        }
        return null;
    }

    @Override
    public List<Estudiantes> listEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEstudiantes(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEstudiantes(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
