/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.io.*;
/**
 *
 * @author T-107
 */
public class ProbarSerealizacion {
    
    public static void main(String[] args) {
        Direccion d1=new Direccion();
        d1.setCalle("Calle 13");
        d1.getColonia("Colonia Samborns");
        d1.setCp(55800);
        d1.setMunicipio("ECATEPUNK");
        
        Usuario u=new Usuario();
        u.setDireccion(d1);
        u.setLogin("campitos");
        u.setPasword("yo homero");
        
        //Ahora fijense bien como usamos la clase Persistencia 
        PersistenciaUsuario2  p2=new PersistenciaUsuario2();
           try {  
               p2.guardar(u);
               System.out.println(" Este Usuario se guardo con exito: ");
           
           }catch(Exception e){
               
               System.out.println(e.getMessage());
           
           }                   
        
       
                
    }
}

    

