/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseSabado24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zeuss
 */
public class Metodos {
    public void conectar() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection cn;
        DriverManager.getConnection("jdbc:derby://localhost:1527/bd2704", "alumno704", "12345");
    }
    
}
