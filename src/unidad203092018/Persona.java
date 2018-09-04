/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad203092018;

/**
 * Clase de ejemplo para crear la estructura
 * de una persona
 * @author zeuss
 */
public class Persona 
{
    private String nombre;
    private String apellido;
    private byte edad;

    public Persona() 
    {
    }

    public Persona(String nombre, String apellido, byte edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    
}
