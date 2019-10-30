package edu.cecar.vista;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import edu.cecar.controlador.ControladorServidor;
import edu.cecar.modelo.Mensaje;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class VistaChatController implements Initializable {
    
 private ControladorServidor controladorServidor;
     
  public VistaChatController() {
          
   controladorServidor = new ControladorServidor(9788);
   
       
  }
    
    
    @FXML private JFXButton btnEnviar;
    @FXML private JFXTextArea areaConversacion;
    @FXML private JFXTextField txtMensaje;
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
    }  
    
    public void handle(ActionEvent e) throws IOException{
        
     Mensaje mensaje = new  Mensaje(null,areaConversacion.getText());
     
     controladorServidor.enviarMensaje(mensaje); 
    
    }
    //});
    
}
