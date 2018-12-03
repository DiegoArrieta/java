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
 */
public class Alumno 
{
    private String rut;
    private String nombre;
    private String apellido;
    private ArrayList<Asignatura> lstAsignatura;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

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

    public ArrayList<Asignatura> getLstAsignatura() {
        return lstAsignatura;
    }

    public void setLstAsignatura(ArrayList<Asignatura> lstAsignatura) {
        this.lstAsignatura = lstAsignatura;
    }
    public void ingresar(ArrayList<Alumno> alumno) throws IOException
    {
        String resp;
        Alumno alum=new Alumno();
        ArrayList<Asignatura> lstAsig=new ArrayList<>();
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese rut");
        alum.setRut(x.readLine());
        System.out.println("ingrese nombre");
        alum.setNombre(x.readLine());
        System.out.println("ingrese apellido");
        alum.setApellido(x.readLine());
        do
        {
            Asignatura asig=new Asignatura();
            System.out.println("Codigo Asignatura");
            asig.setCodigo(Integer.parseInt(x.readLine()));
            System.out.println("Nombre Asig: ");
            asig.setNombre(x.readLine());
            System.out.println("Horas");
            asig.setCodigo(Integer.parseInt(x.readLine()));
            lstAsig.add(asig);
            System.out.println("Quedan mas asignaturas? si/no");
            resp=x.readLine();
        }
        while(resp.equals("si"));
        alum.setLstAsignatura(lstAsig);
        alumno.add(alum);    
    }
    public void mostrar(ArrayList<Alumno> alumno)
    {
        for(Alumno i:alumno)
        {
            System.out.println("rut: "+i.getRut()+"Nombre: "+i.getNombre()+" Apellido: "+i.getApellido());
            ArrayList<Asignatura> lstAsig=i.getLstAsignatura();
            for(Asignatura w:lstAsig)
            {
                System.out.println("codigo"+w.getCodigo()+" nombre "+w.getNombre()+ " horas: "+w.getHoras());
            }
        }
    } 
}
