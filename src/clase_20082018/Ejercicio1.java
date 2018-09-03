/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_20082018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 15481567-8
 */
public class Ejercicio1 
{
    public static void main(String[] args) throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        byte edad = 0, calculo;
        short cont=1;
        do
        {
            System.out.println("Ingrese Nombre: ");
            nombre=x.readLine();
            System.out.println("Ingrese año nacimiento: ");
            edad=(byte) Short.parseShort(x.readLine());
            calculo = (byte) (2018-edad);
            System.out.println(nombre+" tu edad es: "+calculo);
            cont++;
        }
        while(cont<=500);
        
    }
}
