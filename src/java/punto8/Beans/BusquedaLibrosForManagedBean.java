/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.Beans;

import java.io.Serializable;
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
public class BusquedaLibrosForManagedBean implements Serializable {

    private Libro libro;
    private List<Libro> libros;
    String palabra;
    private List<Libro> librosencontrados;
    private boolean dialogo;
    private boolean dialogo2;

    /**
     * Creates a new instance of BusquedaLibrosForManagedBean
     */
    public BusquedaLibrosForManagedBean() {
        libros = new ArrayList<>();
        libro = new Libro(1, 500, "Codigo limpio", "Martin robert");
        libros.add(libro);
        libro = new Libro(2, 300, "No me hagas pensar", "Krug Steve");
        libros.add(libro);
        libro = new Libro(3, 350, "El libro negro del programador", "Gomes Rafael");
        libros.add(libro);
        libro = new Libro(4, 800, "Romeo y Julieta", "Sheakespeare William");
        libros.add(libro);
        libro = new Libro(5, 700, "Los hombres que no amaban a las mujeres", "Larsson Stieg");
        libros.add(libro);
        libro = new Libro();
        palabra = new String();
        dialogo = false;
        dialogo2 = false;
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

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public List<Libro> getLibrosencontrados() {
        return librosencontrados;
    }

    public void setLibrosencontrados(List<Libro> librosencontrados) {
        this.librosencontrados = librosencontrados;
    }

    public boolean isDialogo() {
        return dialogo;
    }

    public void setDialogo(boolean dialogo) {
        this.dialogo = dialogo;
    }

    public boolean isDialogo2() {
        return dialogo2;
    }

    public void setDialogo2(boolean dialogo2) {
        this.dialogo2 = dialogo2;
    }

    public void agregarLibro() {
        int repite=0;
        for (Libro a:this.libros){
        if(this.libro.getIsbn()==a.getIsbn()){
            repite++;}
        }
        if(repite==0){
        this.libros.add(libro);
        libro = new Libro();
        }else{mostrarMensaje();
        
        }
        }

    public void buscarLibro() {
        int t;
        t = 0;
        if (!this.palabra.isEmpty()) {
            librosencontrados = new ArrayList<>();
            for (Libro a : this.libros) {

                if (a.getAutor().toUpperCase().contains(this.palabra.toUpperCase())) {
                    this.librosencontrados.add(a);
                    mostrarDialogo();
                    t = t + 1;
                }
            }

            palabra = new String();

        } else {
            this.dialogo = false;
            this.dialogo2 = true;
        }
        if (t != 0) {
            this.dialogo2 = false;
        }
    }

    public void mostrarDialogo() {

        this.dialogo = true;
    }
public void mostrarMensaje(){
        
        FacesContext context = FacesContext.getCurrentInstance();
      context.addMessage(null, new FacesMessage("Libro ya existe "));
}
}
