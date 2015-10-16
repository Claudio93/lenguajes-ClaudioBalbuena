/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.io.*;
// import io incluir las clases inpout 

import java.util.ArrayList;
public class PersistenciaUsuarios2 {
    
    
    ArrayList<Usuario> usuarios; //tributo usuario
    
    public PersistenciaUsuarios2(){
    //se crea constructor 
      usuarios=new ArrayList<Usuario>();
    }
    
   // este archivo se va invocar y se guardara un usuario  
    public void guardar(Usuario u)throws Exception{
        
        
        
        
    }
    
    public ArrayList<Usuario> buscartodos()throws Exception{
        //aqui va toda la tarea 
    
        return usuarios;
    }
    public Usuario buscarUno(Usuario u)throws Exception{
        //aqui va tu otra tarea 
        // String password paraque lo muestre en el (usuario u)
        
        return u;
    }
    
}


