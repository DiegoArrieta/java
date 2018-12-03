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
public class Metodos {
    private int acum=0;
    
    public int calc_total(int a, int b)
    {
        return a*b;
    }
    public int obtiene_suma()
    {
        return acum;
    }
    public void sumando(int a)
    {
        acum = acum+a;
    }
    
    
}
