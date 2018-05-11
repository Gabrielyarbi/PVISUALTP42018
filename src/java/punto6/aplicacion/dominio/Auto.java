/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion.dominio;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Auto implements Serializable{
      private String Patente ,Color,Modelo ;
    private String TipoCombustible,Marca ;
    private String ID;
    
    public Auto(String Patente, String Color, String Modelo, String TipoCombustible, String Marca,String ID) {
        this.Patente = Patente;
        this.Color = Color;
        this.Modelo = Modelo;
        this.TipoCombustible = TipoCombustible;
        this.Marca = Marca;
        this.ID=ID;
    }
    
    

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
