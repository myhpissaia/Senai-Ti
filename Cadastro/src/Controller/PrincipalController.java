/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Principal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import Main.CadastroPessoas;


/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class PrincipalController implements Initializable {

    @FXML private Button btpe;
    @FXML private Button btcemp;
    @FXML private Button btlpes;
    @FXML private Button btlemp;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        btpe.setOnMouseClicked((MouseEvent e)->{
           CadastroPessoas CadastroPessoas = new CadastroPessoas();
           try{
               CadastroPessoas.start (new Stage());
               
           } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        });
    }     
}
