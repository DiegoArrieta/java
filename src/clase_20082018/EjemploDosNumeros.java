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
public class EjemploDosNumeros 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        short num1, num2;
        System.out.println("Ingrese un N1:");
        num1=Short.parseShort(obj.readLine());
        System.out.println("Ingrese un N2:");
        num2=Short.parseShort(obj.readLine());
        if (num1>num2)
        {
            System.out.println("Los Numeros son iguales");
        }
        else  
        {
            if (num1<num2)
            {
                System.out.println("El numero: "+num2+" es mayor que "+num1);
            }
            else
            {
                System.out.println("El numero: "+num1+" es igual que "+num2);
            }
            
        }
        
        
    }
}
