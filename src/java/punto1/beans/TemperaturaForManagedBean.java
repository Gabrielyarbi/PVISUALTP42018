/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto1.aplicacion.dominio.Temperatura;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class TemperaturaForManagedBean implements Serializable {

    private Temperatura temperatura;
    private String origen, destino;
    private List<String> tipotemp;

    public TemperaturaForManagedBean() {
        temperatura = new Temperatura();
        tipotemp = new ArrayList<>();
        tipotemp.add("Celcius");
        tipotemp.add("Kelvin");
        tipotemp.add("Fahrenheit");

    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperaura) {
        this.temperatura = temperaura;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<String> getTipotemp() {
        return tipotemp;
    }

    public void setTipotemp(List<String> tipotemp) {
        this.tipotemp = tipotemp;
    }

    public double convertirA() {
        int conv = this.getTipotemp().indexOf(this.origen);
        int dest = this.getTipotemp().indexOf(this.destino);
        double resultado = 0;

        if (conv == 0) {

            switch (dest) {
                case 1: {
                    resultado = this.temperatura.getValor() + 273.15;
                }
                break;
                case 2: {
                    resultado = 9 / 5 * this.temperatura.getValor() + 32;
                }
                break;
            }
        } else {
            if (conv == 1) {

                switch (dest) {
                    case 0: {
                        resultado = this.temperatura.getValor() - 273.15;
                    }
                    break;
                    case 2: {
                        resultado = (this.temperatura.getValor() - 273.15) * 1.8000 + 32.00;
                    }
                    break;
                }
            } else {

                switch (dest) {
                    case 0: {
                        resultado = (this.temperatura.getValor() - 32) * (0.5555555);
                    }
                    break;
                    case 1: {
                        resultado = (this.temperatura.getValor() + 459.67) * (0.5555555);
                    }
                    break;
                }

            }
        }
        if(conv==dest){resultado=this.temperatura.getValor();}
        return resultado;
    }

}
