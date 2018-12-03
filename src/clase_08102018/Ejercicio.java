/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_08102018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author zeuss
 */
public class Ejercicio {
    private String nombre;
    private Integer sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
    public void ingreso(ArrayList lst, byte tam) throws IOException
    {
        byte i;
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //ArrayList<Ejercicio> array = new ArrayList<Ejercicio>();
        for(i=0;i<tam;i++)
        {
            Ejercicio a=new Ejercicio();
            System.out.println("Ingrese Nombre: ");
            a.setNombre(x.readLine());
            System.out.println("Ingrese Sueldo");
            a.setSueldo(Integer.parseInt(x.readLine()));
            lst.add(a);
        }
    }
    public void mostrar(ArrayList<Ejercicio> lst)
    {
        for(Ejercicio i:lst)
        {
            //Ejercicio tr=i;
            System.out.println(""+i.getNombre()+i.getSueldo());
        }
    }
    public void cantidadMayorSueldo(ArrayList<Ejercicio> lst)
    {
        System.out.println("Trabajadores con sueldo mayor a CLP $500.000");
        for(Ejercicio i:lst)
        {
            if(i.getSueldo()>=500000)
            {
                System.out.println(""+i.getNombre()+" "+i.getSueldo());
            }
        }
    }
    public int muestraMenorSueldo(ArrayList<Ejercicio> lst)
    {
        menor = lst.;
        for(Ejercicio i:lst)
        {
            
        }
    }
            
        
            
            

    
}
