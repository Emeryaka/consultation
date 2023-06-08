package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SwitchPage implements ISwitchPage{
	
    @FXML
    private Button loginButton;

	
	/**
	 * Aller sur la page de menu
	 */
    @Override
    public void login(String url, Button btn, String style){
   	 try {
			Parent root;
			root = FXMLLoader.load(getClass().getResource(url));

			Stage stage = new Stage();

			Scene scene = new Scene(root);

			btn.getScene().getWindow().hide();
		    scene.getStylesheets().add(getClass().getResource(style).toExternalForm());
			stage.setScene(scene);
//			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();
		} catch (IOException error) {
			// TODO Auto-generated catch block
			error.printStackTrace();
		}
   }

    

}
