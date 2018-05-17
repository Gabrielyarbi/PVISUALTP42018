/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import punto5.aplicacion.dominio.Profesor;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class ProfesoForManagedBean implements Serializable{
    
    private Profesor profesor;
    private List<Profesor> profesores;
    private Profesor profesorSeleccionado;
    
     
    public ProfesoForManagedBean() {
    profesor=new Profesor(1, 30, "Apaza", "Carolina", "Programacion visual","prfapaza@gmail.com.ar");
    
    profesores = new ArrayList<>();
    profesores.add(profesor);
    
    profesor=new Profesor(2, 30, "Vega", "Alejandro", "Programacion visual","prfvega@gmail.com.ar");
    profesores.add(profesor); 
    
    profesor=new Profesor();
    }
    
     public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Profesor getProfesorSeleccionado() {
        return profesorSeleccionado;
    }

    public void setProfesorSeleccionado(Profesor profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }
    

      
    public void agregarProfesores(){
        int mayor;
         mayor=0;
        for(Profesor a :this.profesores){
       
            if (mayor<a.getLegajo()){
            mayor=a.getLegajo();
            }
        }
         for(Profesor a :this.profesores)   
        if(this.profesor.getLegajo()==a.getLegajo() ){
        this.profesor.setLegajo(mayor+1);
         FacesContext context = FacesContext.getCurrentInstance();
      context.addMessage(null, new FacesMessage("Atencion", "Se cambio el legajo por que ya se encontraba un legajo igual") );
        }
            
     this.profesores.add(profesor);
       
     profesor = new Profesor();
     
    }
    public void seleccionarProfe(Profesor profesor){
 
    this.profesorSeleccionado=profesor;
        
    
    }
    
}


