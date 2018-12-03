/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2_24092018.ejercicio;

import java.io.IOException;

/**
 *
 * @author zeuss
 */
public class EjemploUsoClaseAlumno 
{
    public static void main(String[] args) throws IOException 
    {
        byte tam=2;
        Alumno al[]=new Alumno[tam];
        Alumno alum=new Alumno();
        alum.ingreso(al);
        alum.mostrar(al);
        
    }
    
            
}
