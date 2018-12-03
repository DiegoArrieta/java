/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploGrafico;

/**
 *
 * @author zeuss
 */
public class Metodos {
    public byte calcularEdad(short aNacimiento)
    {
        short calculo;
        calculo = (short) (2018-aNacimiento);
        return (byte) calculo;
    }
    
    
}
