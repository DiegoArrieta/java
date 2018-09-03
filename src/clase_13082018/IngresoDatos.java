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
public class IngresoDatos 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String valorIng;
        byte edad;
//        System.out.println("Ingrese un valor");
//        valorIng=x.readLine();
//        System.out.println("Usted Ingreso \n"+valorIng);
        System.out.println("Ingrese su Edad actual");
        edad=Byte.parseByte(x.readLine());
        System.out.println("Usted tiene "+edad+" años");
    }
}
