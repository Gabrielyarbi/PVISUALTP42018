/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import punto6.aplicacion.dominio.Auto;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class AutosForManagedBean implements Serializable{
    private Auto auto;
    private Auto autoseleccionado; 
    private Auto autos[];
    private boolean visible;

    /**
     * Creates a new instance of AutosForManagedBean
     */
    public AutosForManagedBean() {
        autos=new Auto[3];
       auto= new Auto("cdef123", "Negro","Aveo", "Super", "Chevrolet","01");
       autos[0]=auto;
        auto =new Auto("rty123", "Azul", "Camaro", "Regular", "Chevrolet","02");
       autos[1]=auto;
        auto =new Auto("dfgh345", "Rojo", "California", "Premium", "Ferrari","03");
        autos[2]=auto;
        
        visible=false;
   }
    

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Auto[] getAutos() {
        return autos;
    }

    public void setAutos(Auto[] autos) {
        this.autos = autos;
    }

    public Auto getAutoseleccionado() {
        return autoseleccionado;
    }

    public void setAutoseleccionado(Auto autoseleccionado) {
        this.autoseleccionado = autoseleccionado;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
public void seleccionarAuto(Auto a){
this.autoseleccionado=a;
mostrarDialogo();
}
public void modificarAuto(){
for (Auto auto: this.autos){
if (this.autoseleccionado.getID().equals(auto.getID())){

auto.setColor(this.autoseleccionado.getColor());
auto.setMarca(this.autoseleccionado.getMarca());
auto.setModelo(this.autoseleccionado.getModelo());
auto.setPatente(this.autoseleccionado.getPatente());
auto.setTipoCombustible(this.autoseleccionado.getTipoCombustible());
}
}
this.visible=false;
}
public void mostrarDialogo(){
this.visible=true;
}
}

 
    

