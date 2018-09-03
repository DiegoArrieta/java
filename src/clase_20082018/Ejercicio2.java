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
public class Ejercicio2 
{
    public static void main(String[] args) throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int Num, cont = 1, pos = 0, neg = 0, neu = 0, par = 0, impar = 0, imparn = 0, menor=0, aux;
        float prom; 
        do
        {
            System.out.println("Ingrese Numero: ");
            Num=Integer.parseInt(x.readLine());
            if(Num % 2 == 0)
            {
                par++;
            }
            else
            {
                if(Num % 2 == 1)
                {
                    impar++;
                }
                else
                {
                    imparn++;
                }
            }
            if(menor==0)
            {
                menor=Num;
            }
            else
            {
                if(menor>=Num)
                {
                    menor=Num;
                }
                
            }
            
            if(Num>0)
            {
                pos++;
            }
            else
            {
                if(Num<0)
                {
                    neg++;
                }
                else
                {
                    neu++;
                }
            }
            cont++;
        }   
        while(cont<=3);
        System.out.println("+="+pos+"\n-="+neg+"\n0="+neu);
        System.out.println("Par: "+par+"\n-="+impar+"\n0="+neu);
        System.out.println("Numero Menor: "+menor);
//System.out.println("Ingrese Numero: ");
    }
}
