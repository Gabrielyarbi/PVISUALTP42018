/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.Beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import punto7.aplicacion.dominio.Libro;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class LibroForManagedBean {
private Libro libro;
private List<Libro>libros;

    /**
     * Creates a new instance of LibroForManagedBean
     */
    public LibroForManagedBean() {
        libros=new ArrayList<>();
        libro=new Libro(1, 500, "Codigo limpio", "Martin robert");
        libros.add(libro);
        libro=new Libro(2, 300, "No me hagas pensar", "Krug Steve");
        libros.add(libro);
        libro=new Libro(3, 350, "El libro negro del programador", "Gomes Rafael");
        libros.add(libro);  
        libro=new Libro(4, 800, "Romeo y Julieta", "Sheakespeare William");
        libros.add(libro);  
        libro=new Libro(5, 700, "Los hombres que no amaban a las mujeres", "Larsson Stieg");
        libros.add(libro);
        libro=new Libro();
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

   public void agregarLibro(){
       int mayor;
       mayor=0;
       for (Libro a :this.libros){
       if (mayor<a.getIsbn()){
       mayor=a.getIsbn();
       }
       }
       for (Libro a :this.libros){
       if(this.libro.getIsbn()==a.getIsbn()){
       this.libro.setIsbn(mayor+1);
       mostrarMensaje();
       }
       }
   this.libros.add(libro);
   libro=new Libro();
   
   } 
public void mostrarMensaje(){
        
        FacesContext context = FacesContext.getCurrentInstance();
      context.addMessage(null, new FacesMessage("Se modifico la isbn por que estaba repetida"));
}

}