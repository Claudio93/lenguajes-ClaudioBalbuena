/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario2 {
    
    ArrayList<Usuario> usuarios;
    
    public PersistenciaUsuario2(){
        usuarios=new ArrayList<Usuario>();
    }
    
    public void guardar(Usuario u)throws Exception{
        //ESte es el mas dificil, porque este usa el de abajo
        File f=new File("D:\\practica.xxx");
        
        if(f.exists())usuarios=buscarTodos();
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
        
        
    }
    public ArrayList<Usuario> buscarTodos()throws Exception{
        //Este es el mas facil
        File f=new File("D:\\practica.xxx");

       FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
                usuarios= (ArrayList<Usuario>) ois.readObject();
        
        return usuarios;
        
       
    }
    public Usuario buscarUno(Usuario u)throws Exception{
      
           
        //Aqui va tu otra tarea
        return u;
    }
    
}


