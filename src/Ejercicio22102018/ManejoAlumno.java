/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio22102018;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author zeuss
 */
public class ManejoAlumno 
{
    public static void main(String[] args) throws IOException 
    {
        ArrayList<Alumno> lstAlumno=new ArrayList<>();
        Alumno al=new Alumno();
        byte tam=2, i;
        for(i=0;i<tam;i++)
        {
            al.ingresar(lstAlumno);
               
        }
        al.mostrar(lstAlumno);
    } 
}
