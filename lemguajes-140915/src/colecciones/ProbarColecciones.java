
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;


public class ProbarColecciones {
    public static void main(String [] args){
       PersistenciaUsuarios p=new PersistenciaUsuarios();
        System.out.println(p.obtenerUsuario() .size());
        
        int []algo={1,34,22,-40};
        for (int i:algo){
            System.out.println(i);
          }  
        //(i) es la variable que hace 
        
        
        for(Usuario u: p.obtenerUsuario()){
            System.out.println("El login es:"+u.getLogin()+" Y vive en la calle;"+u.getDireccion().getCalle());
            //invocar un metodo (METODO USUARIO)<USUARIO>
            //LA U da el regreso
            //getLogin muestra el LOGIN 
            //Get DIRECCION METODO Y LA CALLE ES SU ATRIBUTO
          }
  
       }
    }









