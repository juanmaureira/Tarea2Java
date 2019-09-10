/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author juaneduardomaureirallanos
 */
public class Taxi extends Vehiculo{
    private String numlicencia;
    
    public Taxi(){
        super();
        numlicencia=null;
    }
    
    public Taxi(String patente, String modelo, Integer potencia, String numlicencia){
        super(patente, modelo, potencia);
        this.numlicencia=numlicencia;
    }
    
    public String getNumlicencia(){
        return numlicencia;
    }
    
    
    
}
