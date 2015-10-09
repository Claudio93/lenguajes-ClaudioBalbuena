/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivaldo;

/**
 *
 * @author T-107
 */

  import java.io.*;
   //paquetes para este archivo lo genera 





public class InterfazDeUsuario {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //primero generamos el archivo a guardar
        //throws aventar 
        //Exception
        
        File file=new File("sucio.xxx");
        //indicar si vamos a leer o guardar algo en este archivo
        // para que apararesca en d File file=new File("D:\\sucio.xxx");
        
     
       FileOutputStream fos=new FileOutputStream(file);
        // fos=(FileOutStream) encadenamiento por 
       //trous no 
               //PONEMOS ALGO EN EL ARCHIVALDO
       String mensajito="Es es un mensajito muy basico";
       
      ObjectOutputStream oos=new  ObjectOutputStream(fos);
      //GUARDAMOS 
        
        oos.writeObject(mensajito);
        System.out.println("Se guardo tu mensajito");
    }
}
