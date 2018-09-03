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
public class CalculoFactura 
{
    public static void main(String[] args) throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        float neto, iva=0.19f, total = 0, total_iva, total_iva2;
        System.out.println("Ingrese valor neto de la Factura: ");
        neto=Float.parseFloat(x.readLine());
        total_iva=neto*iva;
        total=total_iva+neto;
        System.out.println("Valor iva Favtura: "+total_iva);
        System.out.println("Total Factura: "+total);
    }
}
