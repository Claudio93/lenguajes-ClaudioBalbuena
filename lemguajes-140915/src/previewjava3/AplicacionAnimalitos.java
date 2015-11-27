/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package previewjava3;

/**
 *
 * @author T-107
 */
public class AplicacionAnimalitos {
    public static void main(String[] args) {
        ComportaminetoRuido r= new Vaca();
        
        
        
        
        
        
        System.out.println(botonSonido(r));
        //Aqui el niño seleccionara el listado de un animalito
        //por ejemplo el raton
        
        
        
    }
    
    public static String botonSonido(ComportaminetoRuido r){
        return r.hacerRuido();
   }
}   
    


