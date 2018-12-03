/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio22102018;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author zeuss
 */
public class ManejoAsignatura {
    public static void main(String[] args) throws IOException {
        ArrayList<Asignatura> lstAsignatura=new ArrayList<>();
        Asignatura asign=new Asignatura();
        byte tam=2, i;
        for(i=0; i<tam; i++)
        {
            asign.ingreso(lstAsignatura);
                    
            
        }
        asign.mostrar(lstAsignatura);
    }
}
