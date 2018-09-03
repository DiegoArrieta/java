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
public class EjemploCicloFor 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        byte numero,i;
        short ac=0;
        for(i=1;i<=50;i++)
        {
            System.out.println("Ingrese el Numero");
            numero=Byte.parseByte(x.readLine());
            ac=(short) (ac+numero);
        }
        System.out.println("Suma: "+ac);
    }
}
