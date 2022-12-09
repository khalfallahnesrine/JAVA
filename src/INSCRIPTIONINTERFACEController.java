/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.sql.*;
import javafx.event.ActionEvent;
/**
 * FXML Controller class
 *
 * @author khalf
 */
public class INSCRIPTIONINTERFACEController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    Button buttonps;
    @FXML 
   
    Button Butonpp;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    public void GoToPP() throws IOException{
        Butonpp.getScene().getWindow().hide();
        Parent bPP = FXMLLoader.load(getClass().getResource("HOME.fxml"));
        
        Scene scenebpp = new Scene(bPP);
        Stage stagebpp=new Stage();
        stagebpp.setTitle("WIH HOME");
        stagebpp.setScene(scenebpp);
        stagebpp.show();}
    public void GoToPs(ActionEvent event) throws IOException {
        buttonps.getScene().getWindow().hide();
        Parent bPS = FXMLLoader.load(getClass().getResource("UtilisateurPatient.fxml"));
        
        Scene scenebps = new Scene(bPS);
        Stage stagebps=new Stage();
        stagebps.setTitle("Patient");
        stagebps.setScene(scenebps);
        stagebps.show();}
}
