/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion.dominio;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Libro implements Serializable{
    private int isbn,precio;
    private String titulo;
    private Autor autor;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro(int isbn, int precio, String titulo, Autor autor) {
        this.isbn = isbn;
        this.precio = precio;
        this.titulo = titulo;
        this.autor = autor;
    }

  

    public Libro() {
    }
    
    
    
    
}
