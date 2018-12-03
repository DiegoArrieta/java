/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad203092018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author zeuss
 */
public class EjemploUsoClasePersona 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        Persona p1=new Persona();
        Persona p2=new Persona("elba", "lazo", (byte)25);
        System.out.println("nombre "+p1.getNombre()+" "+p1.getApellido()+" "+p1.getEdad());
        System.out.println("nombre "+p2.getNombre()+" "+p2.getApellido()+" "+p2.getEdad());
        p1.setNombre("armando");
        p1.setEdad((byte)50);
        System.out.println("nombre "+p1.getNombre()+" "+p1.getApellido()+" "+p1.getEdad());
        System.out.println("");
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nombre");
        p2.setNombre(x.readLine());
        System.out.println("Apellido");
        p2.setApellido(x.readLine());
        System.out.println("Edad");
        
        p2.setEdad((byte) Integer.parseInt(x.readLine()));
        System.out.println("nombre: "+p2.getNombre()+" Apellido: "+p2.getApellido()+" Edad: "+p2.getEdad());
        
    }

    
}
/**
 *      visibilidad TipoDatoRetorno nombreMetodo(Lista_Parametros)
 *         {
 * 
 * }
 * Visibilidad
 * public
 * private
 * protected
 * 
 * tipo de dato de retorno
 * primitivos o cualquier otro
 * char
 * Byte
 * Short
 * Int
 * Long
 * Float
 * Double
 * String
 * Boolean
 * void 
 */