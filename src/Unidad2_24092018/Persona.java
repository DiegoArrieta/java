/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2_24092018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zeuss
 */
public class Persona 
{
    private String nombre;
    private String apellido;
    private byte edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    public void ingreso(Persona[] p) throws IOException
    {
        byte i;
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        
        for(i=0;i<p.length;i++)
        {
            Persona a=new Persona();
            System.out.println("ingrese nombe");
            a.setNombre(x.readLine());
            System.out.println("ingrese apellido");
            a.setApellido(x.readLine());
            System.out.println("ingrese edad");
            a.setEdad(Byte.parseByte(x.readLine()));
            p[i]=a;
        }
    }
    
    public void mostrar(Persona[] p1)
    {
        byte i;
        for(i=0;i<p1.length;i++)
        {
            System.out.println("Nombre "+p1[i].getNombre()+" Apellido: "+p1[i].getApellido()+" Edad: "+p1[i].getEdad()+"");
        }
    }
    
    public byte contarMayoresEdad(Persona[] p1)
    {
        byte i,cont=0;
        for(i=0;i<p1.length;i++)
        {
            if(p1[i].getEdad()>=18)
            {
                cont=(byte) (cont+1);
            }
        }
        return cont;
    }
    
    public void mostrar(byte contarMayoresEdad)
    {
        System.out.println("Mayores de Edad: "+contarMayoresEdad);
    }
    
    public byte contarMenorEdad(Persona[] p1)
    {
        byte i, menor;
        menor=p1[0].getEdad();
        for(i=1;i<p1.length;i++)
        {
            if(p1[i].getEdad()<menor)
            {
                menor=p1[i].getEdad();
            }
        }
        return menor;
    }
    
    

    
}
