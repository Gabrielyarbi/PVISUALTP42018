/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4.aplicacion.dominio;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Palabra implements Serializable{
    private String valor;
    private int longitud;
    private char primeraletra;

    public Palabra() {
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char getPrimeraletra() {
        return primeraletra;
    }

    public void setPrimeraletra(char primeraletra) {
        this.primeraletra = primeraletra;
    }
    
}
