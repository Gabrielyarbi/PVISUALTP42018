/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.aplicacion.dominio;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Profesor implements Serializable{
    
    private int legajo,edad;
    private String apellido,nombre,materia;
    private String correo;

    public Profesor(int legajo, int edad, String apellido, String nombre, String materia, String correo) {
        this.legajo = legajo;
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materia = materia;
        this.correo = correo;
    }

   
    public Profesor() {
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
    
}
