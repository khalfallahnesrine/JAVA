import java.sql.*;


import java.io.IOException;
import java.sql.DriverManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CONNEXIONINTERFACEController {

    @FXML
    private CheckBox CHECKMDP;

    @FXML
    Hyperlink Linkmdp;

    @FXML
     PasswordField Passwordfield;
     @FXML
      TextField nomutilisateur ;

    @FXML
     Button bpp;

    @FXML
    Button bps;
    @FXML
     Button breset ;

    @FXML
     Label labelconnexion;

    @FXML
    public void GoToPP(ActionEvent event) throws IOException {
        bpp.getScene().getWindow().hide();
        Parent bPP = FXMLLoader.load(getClass().getResource("HOME.fxml"));
        
        Scene scenebpp = new Scene(bPP);
        Stage stagebpp=new Stage();
        stagebpp.setTitle("WIH HOME");
        stagebpp.setScene(scenebpp);
        stagebpp.show();}
         
        public void GoToPs(ActionEvent event) throws IOException {
        bps.getScene().getWindow().hide();
        Parent bPP = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        
        Scene scenebpp = new Scene(bPP);
        Stage stagebpp=new Stage();
        stagebpp.setTitle("WIH HOME");
        stagebpp.setScene(scenebpp);
        stagebpp.show();}
    
        public void reset (ActionEvent event){
        Passwordfield.setText("");
        nomutilisateur.setText(" ");
        
        }
        
        /*public void login (ActionEvent event){
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306:womeninhealth?useSSl=false","nesrine","Nesrine@21001203") ;
                        String username =nomutilisateur.getText();
                        String Passworld =Passwordfield.getText() ;
                         
                  Statement  st =  conn.createStatement() ;
                  String sql ="select*from utilisateurpatient where email ='"++username+ "'and motdepass ='"++password+"'"; 
                  ResultSet RS =st.executeQuery(sql);
                  if (RS.next()){dispose();}
             }
            catch(Exception exceptionlogin){
                 System.out.println(exceptionlogin.getMessage());
            }*/
        
        }
        /* public void GoToPS(ActionEvent event) throws IOException {
        bps.getScene().getWindow().hide();
        Parent bPS = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        
        Scene scenebps = new Scene(bPS);
        Stage stagebps=new Stage();
        stagebps.setTitle("Votre Acceuil");
        stagebps.setScene(scenebps);
        stagebps.show();}
*/
   


    
    
        
    

  
    /*public void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
      if(CHECKMDP.isSelected())
        {
             Passwordfield.managedProperty().bind(CHECKMDP.selectedProperty().not());
              Passwordfield.visibleProperty().bind(CHECKMDP.selectedProperty().not());
        }
        
          
        
    }*/

