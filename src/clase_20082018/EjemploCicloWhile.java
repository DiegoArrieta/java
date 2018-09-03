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
public class EjemploCicloWhile 
{
    public static void main(String[] args) throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        byte nIng, cont=1;
        short ac=0;
        while(cont<= 4)
        {
            System.out.println("Ingrese un numero");
            nIng=Byte.parseByte(x.readLine());
            ac=(short) (ac+nIng);
            cont++;  
        }
        System.out.println("Total: "+ac);
        
    }
}
