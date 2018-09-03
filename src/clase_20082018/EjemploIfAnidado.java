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
public class EjemploIfAnidado 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int numero;
        System.out.println("Ingrese un N°:");
        numero=Integer.parseInt(obj.readLine());
        if(numero==0)
        {
            System.out.println(numero+" El Numero es neutro");
        }
        else if(numero<0)
        {
            System.out.println(numero+" El Numero es negativo");
        }
        else
        {
            System.out.println(numero+" El Numero es positivo");
        }
    }
}
