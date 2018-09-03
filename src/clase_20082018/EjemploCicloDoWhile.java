/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_20082018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import jdk.management.resource.ResourceType;

/**
 *
 * @author 15481567-8
 */
public class EjemploCicloDoWhile 
{
    public static void main(String[] args) throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        byte n, c=1;
        short ac = 0;
        do
        {
            System.out.println("Ingrese un N° ");
            n=Byte.parseByte(x.readLine());
            ac=(short) (ac+n);
            c++;
        }
        while(c<=50);
        System.out.println("Suma: "+ac);
        
    }
            
}
