
package edu.cecar.controlador;

import edu.cecar.comunicaciones.ServerSocketObjeto;
import edu.cecar.comunicaciones.SocketObjeto;
import edu.cecar.modelo.Mensaje;
import java.io.IOException;

/**
*
* @author 1104427192
*/
public class ControladorCliente {
    
 String direccionIP; int puerto;
 
 private SocketObjeto socketObjeto;

    public ControladorCliente(String direccionIP, int puerto) {
        this.direccionIP = direccionIP;
        this.puerto = puerto;
        
     socketObjeto = new SocketObjeto(direccionIP, puerto);
     
    }

    
    
 
   
   
   public Mensaje recibirMensaje(Mensaje mensaje) throws IOException, ClassNotFoundException{
       
    Object object = socketObjeto.getEntrada().readObject();
    
     return (Mensaje)object;
       
   }
   
   public void enviarMensaje(Mensaje mensaje) throws IOException{
       
    socketObjeto.getSalida().writeObject(mensaje);
       
   }
   
}