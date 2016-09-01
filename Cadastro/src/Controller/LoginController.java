/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import Main.Login;
import Main.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class LoginController implements Initializable {
        
          @FXML private Button btsair;
          @FXML private Button btentrar;
          @FXML private TextField textuser;
          @FXML private PasswordField textsenha;

    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
    
        btsair.setOnMouseClicked(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent e) {
            Login.getStage().close();
                    
           }

        });
        btentrar.setOnMouseClicked((MouseEvent e)->{
            if (textuser.getText().equals("user")&&textsenha.getText().equals("user123")){
        
        Principal Principal = new Principal();
        try{
            Principal.start(new Stage());

        }   catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            } else{
                Alert erro = new Alert(Alert.AlertType.ERROR);
                erro.setHeaderText("VASSOUREI HAHAHA");
                erro.show();
            }
        
        });
    }           
}
