/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author T-107
 */
public class Direccion {
    
    String calle;
    String colonia;
    String municipio;
    

   public String getCalle(){
   return calle;
   } 
   
    public String getColonia(){
    return colonia;
    }
    
    public String getMunicipio(){
    return municipio;
    }
    
    public void setCalle(String calle){  
       calle=calle;
      }
        
    
}