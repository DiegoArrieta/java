/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_08102018;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author zeuss
 */
public class Programa {
    public static void main(String[] args) throws IOException {
        ArrayList<Ejercicio> listatrabajadores = new ArrayList<Ejercicio>();
        Ejercicio t=new Ejercicio();
        byte cantidad=2;
        t.ingreso(listatrabajadores, cantidad);
        t.mostrar(listatrabajadores);
        t.cantidadMayorSueldo(listatrabajadores);
                
    }
}
