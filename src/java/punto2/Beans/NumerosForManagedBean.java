/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto2.aplicacion.dominio.Numero;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class NumerosForManagedBean implements Serializable {

    private List<Numero> numeros;
    private Numero num;

    public NumerosForManagedBean() {
        num = new Numero();
        numeros = new ArrayList<>();

    }

    public List<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }

    public Numero getNum() {
        return num;
    }

    public void setNum(Numero num) {
        this.num = num;
    }

    

    public void agregarNum() {

        this.numeros.add(num);
        num = new Numero();
        

    }

    public int determinarMayor() {
        int mayor;
        mayor = 0;
        for (Numero n : this.getNumeros()) {
            if (mayor > n.getValor()) {
                mayor = mayor;
            } else {
                mayor = n.getValor();
            }

        }
        return mayor;
    }

    public int determinarMenor() {

        int menor;
        menor = 9999999;
        for (Numero n : this.getNumeros()) {
            if (menor < n.getValor()) {
                menor = menor;
            } else {
                menor = n.getValor();
            }

        }
        return menor;
    }

    public double determinarPromedio() {
        double promedio;
        double acumulador, contador;
        contador = 0;
        acumulador = 0;
        promedio = 0;
        for (Numero x : this.getNumeros()) {
            acumulador = acumulador + x.getValor();
            contador++;
        }
        if (contador != 0) {
            promedio = acumulador / contador;
        }
        return promedio;
    }
}
