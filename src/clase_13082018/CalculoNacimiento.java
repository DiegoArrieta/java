/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_13082018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 15481567-8
 */
public class CalculoNacimiento 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int edad, year=2018, resultado;
        System.out.println("Ingrese su año nacimiento");
        edad=Integer.parseInt(x.readLine());
        resultado=year-edad;
        System.out.println("Usted tiene "+resultado+" años");   
    }
}
