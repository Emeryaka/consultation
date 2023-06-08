package controller;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PageDeConnexionController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }
    
    private ISwitchPage switchPage = new SwitchPage();

    @FXML
    private void handleLogin(){
        String username = usernameField.getText();
        String password = passwordField.getText();
        
       
        // Vérification des informations de connexion
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Connexion réussie !");
            switchPage.login("../interfaces/Menu.fxml", loginButton, "../interfaces/Menu.css");
        } else {
            // Gérer une tentative de connexion invalide
            System.out.println("Nom d'utilisateur ou mot de passe incorrect !");
        }
    }
    

}