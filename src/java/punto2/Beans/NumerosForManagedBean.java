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
    private Numero Num;

    public NumerosForManagedBean() {
        Num = new Numero();
        numeros = new ArrayList<>();

    }

    public List<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }

    public Numero getNum() {
        return Num;
    }

    public void setNum(Numero Num) {
        this.Num = Num;
    }

    public void agregarNum() {

        this.numeros.add(Num);
        Num = new Numero();
        

    }

    public int determinarMayor() {
        int mayor;
        mayor = 0;
        for (Numero num : this.getNumeros()) {
            if (mayor > num.getValor()) {
                mayor = mayor;
            } else {
                mayor = num.getValor();
            }

        }
        return mayor;
    }

    public int determinarMenor() {

        int menor;
        menor = 9999999;
        for (Numero num : this.getNumeros()) {
            if (menor < num.getValor()) {
                menor = menor;
            } else {
                menor = num.getValor();
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
