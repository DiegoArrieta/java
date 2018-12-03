/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio22102018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author zeuss
 * ¿Cuantos Asignaturas>Alumnos?
 * ¿Cuantos Alumnos>Asignatura?
 * 
 */

public class Asignatura 
{
    private int codigo;
    private String nombre;
    private int horas;
    private ArrayList<Alumno> lstAlumno;

    public ArrayList<Alumno> getLstAlumno() {
        return lstAlumno;
    }

    public void setLstAlumno(ArrayList<Alumno> lstAlumno) {
        this.lstAlumno = lstAlumno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void ingreso(ArrayList<Asignatura> lstAsignatura) throws IOException
    {
        String resp;
        Asignatura asig=new Asignatura();
        ArrayList<Alumno> lstAlum=new ArrayList<>();
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Codigo");
        asig.setCodigo(Integer.parseInt(x.readLine()));
        System.out.println("Ingrese Nombre:");
        asig.setNombre(x.readLine());
        System.out.println("Horas");
        asig.setHoras(Integer.parseInt(x.readLine()));  
        do
        {
            Alumno alum=new Alumno();
            System.out.println("ingrese rut");
            alum.setRut(x.readLine());
            System.out.println("ingrese nombre");
            alum.setNombre(x.readLine());
            System.out.println("ingrese apellido");
            alum.setApellido(x.readLine());
            lstAlum.add(alum);
            System.out.println("Quedan mas alumnos? si/no");
            resp = x.readLine();    
        }
        while(resp.equals("si"));
        asig.setLstAlumno(lstAlumno);
        lstAsignatura.add(asig);
        
    }
    public void mostrar(ArrayList<Asignatura> asig)
    {
        System.out.println("Entramos");
        for(Asignatura i:asig)
        {
            System.out.println("Codigo: "+i.getCodigo()+"Nombre: "+i.getNombre()+" Horas: "+i.getHoras());
            ArrayList<Alumno> lstAlum=i.getLstAlumno();
            for(Alumno w:lstAlum)
            {
                System.out.println("rut: "+w.getRut()+"Nombre: "+w.getNombre()+" Apellido: "+w.getApellido());
            }
        }
    }    
}
