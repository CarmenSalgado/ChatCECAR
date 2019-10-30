package edu.cecar.vista;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class VistaChatController implements Initializable {
    
    @FXML private JFXButton btnEnviar;
    @FXML private JFXTextArea areaConversacion;
    @FXML private JFXTextField txtMensaje;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
