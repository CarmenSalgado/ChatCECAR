package edu.cecar.controlador;

import edu.cecar.comunicaciones.ServerSocketObjeto;
import edu.cecar.modelo.Mensaje;
import java.io.IOException;
import java.net.ServerSocket;


/**
*
* @author 1104427192
*/





 public class ControladorServidor {

  int puerto;
  private ServerSocketObjeto serverSocketObjeto;

    public ControladorServidor(int puerto) {
        this.puerto = puerto;
        serverSocketObjeto= new ServerSocketObjeto(puerto);
    }

    
 
        
    
     
     
   
   
   public Mensaje recibirMensaje() throws IOException, ClassNotFoundException{
       
    Object object = serverSocketObjeto.getEntrada().readObject();
    
     return (Mensaje)object;  
   }
   
   public void enviarMensaje(Mensaje mensaje) throws IOException{
       
    serverSocketObjeto.getSalida().writeObject(mensaje); 
       
   }
   
}
   