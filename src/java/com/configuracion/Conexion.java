package com.configuracion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    public Connection getConexion(){
        String dataBase = "databaseuniversidad";
        String url = "jdbc:mysql://:3306/".concat(dataBase);
        String user = "root";
        String password = "kohewang";
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
            
        } catch (SQLException|ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
