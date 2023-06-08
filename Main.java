package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../interfaces/PageDeConnexion.fxml"));
            primaryStage.setTitle("Formulaire de Connexion");
            Scene scene = new Scene(root, 400, 300);
            scene.getStylesheets().add(getClass().getResource("../interfaces/PageDeConnexion.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void showMenu(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../interface/Menu.fxml"));
        stage.setTitle("Menu Principal");
        stage.setScene(new Scene(root, 800, 600));
        stage.show();
    }

	public static Main getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
