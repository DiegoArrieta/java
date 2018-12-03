/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad5_clase26112018;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zeuss
 */
public class Conexion {
    public static void connect(){
    String url = "org.apache.derby.jdbc.ClientDriver";
    String user = "alumno704";
    String pass = "12345";
    System.out.println("Conectando...");
    try(Connection connection = DriverManager.getConnection(url, user,pass)){
    System.out.println("Conectado!!");

    }catch(SQLException e){
    System.out.println(e.getMessage());
    }
    
    }
    
}
