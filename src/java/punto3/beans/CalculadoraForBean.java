/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import punto3.aplicacion.dominio.Numero;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class CalculadoraForBean {
private Numero numero;
private List<String> operaciones;
private String operacion;
    /**
     * Creates a new instance of CalculadoraForBean
     */
    public CalculadoraForBean() {
    numero = new Numero();
    operaciones = new ArrayList<>();
    operaciones.add("Suma");
    operaciones.add("Resta");
    operaciones.add("Multiplicacion");
    operaciones.add("Division");
    operaciones.add("Potencia");
    }

    public Numero getNumero() {
        return  numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public List<String> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(List<String> operaciones) {
        this.operaciones = operaciones;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    
    public double calcularNumeros(){
    double resultado=0;
   int numOperacion=this.getOperaciones().indexOf(this.getOperacion());
   switch(numOperacion){
   
       case 0 : {resultado= this.numero.getValor1()+this.numero.getValor2();
       }break;
       case 1 : {resultado= this.numero.getValor1()-this.numero.getValor2();
       }break;
       case 2 :{resultado= this.numero.getValor1()*this.numero.getValor2();
       }break;
       case 3 :{resultado= this.numero.getValor1()/this.numero.getValor2();
       }break;
       case 4 :{resultado=Math.pow(this.numero.getValor1(), this.numero.getValor2());
       }break;
   } 
   
    return resultado;
    }
    
}
