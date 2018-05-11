/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion.dominio;

/**
 *
 * @author Gabriel
 */
public class Libro {
    private int isbn,precio;
    private String titulo,autor;

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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro(int isbn, int precio, String titulo, String autor) {
        this.isbn = isbn;
        this.precio = precio;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro() {
    }
    
    
    
    
}
