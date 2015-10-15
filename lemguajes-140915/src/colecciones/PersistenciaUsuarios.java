

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

//import java util lleva los conections 
//
import java.util.*;
public class PersistenciaUsuarios {
    
    public ArrayList<Usuario> obtenerUsuario(){
   ArrayList<Usuario> usuarios=new ArrayList<Usuario>(); //<-- retrono usuario
    //Empezamos a llenar el arraylist generico a la clase usuario
    //arraylist de usuarios-->json 
   //arreglo variable
   Direccion d1=new Direccion();
                d1.setCalle("Av.Mexico");
                d1.setColonia("Jardines cerro gordo");
                d1.setCp(55100);
                d1.setMunicipio("Ecatepec");
   
       Usuario u1=new Usuario();
                u1.setDireccion(d1);
                u1.setLogin("Juan");
                u1.setPasword("algo");
                
                usuarios.add(u1);
                //u1 todas las propiedades 
                
                Direccion d2=new Direccion();
                            d2.setCalle("Calle de la Viga");
                            d2.setColonia("JALA");
                            d2.setCp(55123);
                            d2.setMunicipio("Ecatepec");
                            
                            Usuario u2=new Usuario();
                            u2.setDireccion(d2);
                            u2.setLogin("ana");
                            u2.setPasword("bien");
                            
                            usuarios.add(u2);
                            
                            
                            
                  Direccion d3=new Direccion();
                   
                            d3.setCalle("Sur 44");
                            d3.setColonia("Vicente Villada");
                            d3.setCp(50900);
                            d3.setMunicipio("Neza");
                            
                            Usuario u3=new Usuario();
                            u3.setDireccion(d3);
                            u3.setLogin("pedro");
                            u3.setPasword("nose");
                            
                            usuarios.add(u3);
                
  return usuarios;
   
    }
}


