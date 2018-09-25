/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2_24092018;

import java.io.IOException;

/**
 *
 * @author zeuss
 */
public class EjemploPersonaVector 
{
    public static void main(String[] args) throws IOException 
    {
        byte tam=2, mEdad;
        Persona per[]=new Persona[tam];
        Persona al=new Persona();
        al.ingreso(per);
        al.mostrar(per);  
        al.contarMayoresEdad(per);
        al.mostrar(al.contarMayoresEdad(per));
        System.out.println("Menor edad: "+al.contarMenorEdad(per));
    }
}
