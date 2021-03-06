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
    
    private String calle;
    private String colonia;
    private String municipio;
    
/**
 *  ESTE CONSTRUCTOR SIRVE PARA CREAR UNA DIRECCION
 * @param calle EL PRIMER PARAMETRO ES EL VALOR DE LA CALLE
 * @param colonia  EL SEGUNDO PARAETRO ES EL VALOR DE LA COLONIA
 * @param municipio  ESTE PARAMETRO ES EL VALOR DEL MUNICIPIO
 */
    public Direccion(String calle, String colonia, String municipio) {
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
    }
    
    

    public Direccion() {
    }
    
   
 
    /**
     * @return Este metodo te regresa el valor que tiene 
     * el atributo calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle en este metodo debes de poner dentro del parentesis
     * el valor que desees que tenga la calle 
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}