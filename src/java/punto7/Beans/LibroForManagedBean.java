/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import punto7.aplicacion.dominio.Autor;
import punto7.aplicacion.dominio.Libro;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class LibroForManagedBean implements Serializable{
private Libro libro;
private List<Libro>libros;
private List<Autor>autores;
private Autor autor;
    /**
     * Creates a new instance of LibroForManagedBean
     */
    public LibroForManagedBean() {
        libros=new ArrayList<>();
        autores=new ArrayList<>();
        libro=new Libro(1, 500, "Codigo limpio", new Autor("Martin", "Robert"));
        autores.add(libro.getAutor());
        libros.add(libro);
        libro=new Libro(2, 300, "No me hagas pensar", new Autor("Steve", "Krug"));
        autores.add(libro.getAutor());
        libros.add(libro);
        libro=new Libro(3, 350, "El libro negro del programador", new Autor("Rafael", "Gomes"));
        autores.add(libro.getAutor());
        libros.add(libro);  
        libro=new Libro(4, 800, "Romeo y Julieta", new Autor("William", "Sheakespeare"));
        autores.add(libro.getAutor());
        libros.add(libro);  
        libro=new Libro(5, 700, "Los hombres que no amaban a las mujeres", new Autor("Larsson", "Stieg"));
        autores.add(libro.getAutor());
        libros.add(libro);
        libro=new Libro();
    autor=new Autor();
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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
      int acum=0;
       for (Libro a :this.libros){
       if(this.libro.getIsbn()==a.getIsbn()){
     acum++;
       
       }
       }
       if (acum==0){
           this.libro.setAutor(autor);
   this.libros.add(libro);
   libro=new Libro();
       }else{mostrarMensaje();}
   } 
public void mostrarMensaje(){
        
        FacesContext context = FacesContext.getCurrentInstance();
      context.addMessage(null, new FacesMessage("Libro ya existe "));
}

}