/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad5_clase26112018;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zeuss
 */
public class Conexion {
    
    public Connection conectar(){
        Connection cn=null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn = DriverManager.getConnection("jdbc:derby://localhost:1527/bd2704", "alumno704", "12345");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return cn;
        }
    
}
