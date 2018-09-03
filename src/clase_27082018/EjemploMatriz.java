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
public class EjemploMatriz 
{
    public static void main(String[] args) throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        byte tamFil=5, tamCol=3,f,c,promNeg, numMayor;
     
        short acumNeg=0, contNeg=0, contMayor=0;
        float m[][]=new float[tamFil][tamCol];
        for(f=0;f<tamFil;f++)
        {
            for(c=0;c<tamCol;c++)
            {
                System.out.println("Ingrese un nº en la fila "+f+" columna "+c);
                m[f][c]=Float.parseFloat(x.readLine());
            }
        }
        //Promedio de negativos
        for(f=0;f<tamFil;f++)
        {
            for(c=0;c<tamCol;c++)
            {
                if(m[f][c]<0)
                {
                    acumNeg= (short) (acumNeg+m[f][c]);
                    contNeg=(short)(contNeg+1);
                }
            }
        }
        if(contNeg!=0)
        {
            promNeg=(byte) (acumNeg/contNeg);
            System.out.println("Q de Neg: "+contNeg+" promedio: "+promNeg);
        }
        else
        {
            System.out.println("No hay numeros negativos.");
        }
        
        //Numero Mayor
        numMayor=(byte) m[0][0];
        for(f=0;f<tamFil;f++)
        {
            for(c=0;c<tamCol;c++)
            {
                if(m[f][c]>numMayor)
                {
                    numMayor=(byte) m[f][c];
                }
            }
        }
        //Contar numero mayor
        for(f=0;f<tamFil;f++)
        {
            for(c=0;c<tamCol;c++)
            {
                if(numMayor==m[f][c])
                {
                    contMayor=(short)(contMayor+1);
                }
            }
        }
        System.out.println("El numero mayor es: "+numMayor+" aparece "+contMayor+" veces.");
        
    }
}
