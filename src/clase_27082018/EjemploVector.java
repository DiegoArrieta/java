/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_27082018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zeuss
 */
public class EjemploVector 
{
    public static void main(String[] args) throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        byte tam=2, i, prom, edadMenor;
        String nom[]=new String[tam];
        byte edad[]=new byte[tam];
        short ac=0;
        //llenado de los vectores
        for(i=0;i<tam;i++)
        {
            System.out.println("Ingrese Nombre");
            nom[i]=x.readLine();
            System.out.println("Ingrese Edad");
            edad[i]=Byte.parseByte(x.readLine());
        }
        //Calculo del Promedio
        for(i=0;i<edad.length;i++)
        {
            ac=(short) (ac+edad[i]);
        }
        prom=(byte) (ac/tam);
        System.out.println("Promedio de edad es: "+prom);
        //Busqueda del menor
        edadMenor = edad[0];
        for(i=0;i<tam;i++)
        {
            if(edad[i]<edadMenor)
            {
                edadMenor=edad[i];
            }
        }
        for(i=0;i<tam;i++)
        {
            if(edad[i]==edadMenor)
            {
                System.out.println("La persona: "+nom[i]+" tiene la edad menor: "+edadMenor);
            }
        }
        
    }
   
}
