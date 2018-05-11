/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto4.aplicacion.dominio.Palabra;

/**
 *
 * @author Gabriel
 */
@ManagedBean
@ViewScoped
public class AhorcadoManagedBean implements Serializable {
    private Palabra palabrainfo;
    private Palabra resultado;
    private String letra;
    private String elejida;
    private List<String> palabras;
    private int intentos;
    private List<String>palabraoculta;
    private boolean finjuego;

    /**
     * Creates a new instance of AhorcadoManagedBean
     */
    public AhorcadoManagedBean() {
        inciarJuego();
      
       
    }

    public Palabra getPalabrainfo() {
        return palabrainfo;
    }

    public void setPalabrainfo(Palabra palabrainfo) {
        this.palabrainfo = palabrainfo;
    }

    public Palabra getResultado() {
        return resultado;
    }

    public void setResultado(Palabra resultado) {
        this.resultado = resultado;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    

    public String getElejida() {
        return elejida;
    }

    public void setElejida(String elejida) {
        this.elejida = elejida;
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<String> palabras) {
        this.palabras = palabras;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean isFinjuego() {
        return finjuego;
    }

    public void setFinjuego(boolean finjuego) {
        this.finjuego = finjuego;
    }

    

    public List<String> getPalabraoculta() {
        return palabraoculta;
    }

    public void setPalabraoculta(List<String> palabraoculta) {
        this.palabraoculta = palabraoculta;
    }


    public String elegir() {
        int num = (int) ((Math.random() * 6));
        return this.palabras.get(num);

    }
    public void ocultar(){
    for(int i=1 ;i<=palabrainfo.getValor().length();i++){
    this.palabraoculta.add(" __ ");
    
    }
        System.out.println(palabraoculta.size());
     
    }
    public void comparar (){
       int correctas=0;
       
    for (int i =0;i<palabrainfo.getValor().length();i++){
        if (palabrainfo.getValor().charAt(i)== letra.charAt(0)) {
      
         palabraoculta.set(i, letra);
         
        }
    }
        if (palabrainfo.getValor().contains(letra)){
        }
        else{this.intentos--;}
    
        if (intentos==0){
            //metodo iniciador del juego e
       //    inciarJuego();
       
        this.resultado.setValor("YOU LOSE");
        this.finjuego=true;
        }
     for(String a:palabraoculta){
       if (a.equals(" __ ")){correctas=0;}else{correctas++;}
   }
      if (correctas==palabrainfo.getValor().length()){
       
      //inciarJuego();
     this.resultado.setValor("YOU WIN");
     this.finjuego=true;
     }
   letra=new String();
    }
    
   
    public void inciarJuego(){
         char letra;
        palabrainfo=new Palabra();
        finjuego=false;
        
        palabras = new ArrayList<>();
        palabras.add("PROGRAMACION");
        palabras.add("APROBAR");
        palabras.add("MURCIELAGO");
        palabras.add("PAGINA");
        palabras.add("PROMOCIONAR");
        palabras.add("DINOSAURIO");
        palabrainfo.setValor(elegir());
        info();
        palabraoculta=new ArrayList<>();
        ocultar();
          intentos=6;
        resultado=new Palabra();
        resultado.setValor(" ");
    }

    
     
    
    public void info(){
    
        this.palabrainfo.setLongitud(palabrainfo.getValor().length());
        this.palabrainfo.setPrimeraletra(palabrainfo.getValor().charAt(0));
    }
}
