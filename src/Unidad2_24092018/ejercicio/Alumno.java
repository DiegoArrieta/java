/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2_24092018.ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zeuss
 */
public class Alumno 
{
    private String nombre;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
    
    public void ingreso(Alumno[] al) throws IOException
    {
        byte i;
        float nota1,nota2,nota3;
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<al.length;i++)
        {
            Alumno a=new Alumno();
            System.out.println("Ingrese Nombre Alumno: ");
            a.setNombre(x.readLine());
            System.out.println("Ingrese Nota1: ");
            nota1 = Float.parseFloat(x.readLine());
            a.setNota1(nota1);
            System.out.println("Ingrese Nota2: ");
            nota2 = Float.parseFloat(x.readLine());
            a.setNota2(nota2);
            System.out.println("Ingrese Nota3: ");
            nota3 = Float.parseFloat(x.readLine());
            a.setNota3(nota3);
            a.setPromedio((nota1+nota2+nota3)/3);
            al[i]=a;
        }
        
    }
    public void mostrar (Alumno[] al)
    {
        byte i;
        for(i=0;i<al.length;i++)
        {
            System.out.println("Alumno: "+al[i].getNombre()+" N1: "+al[i].getNota1()+" N2: "+al[i].getNota2()+" N3: "+al[i].getNota3()+" Promedio: "+al[i].getPromedio()+"");
        }
    }
    
}
