package edu.cesur.extraordinaria.app;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

	private static Scene scene;
	private static final String PATH="/edu/cesur/extraordinaria/vista/";

	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(PATH+"Login.fxml"));
		Parent root = fxmlLoader.load();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
	
	@Override
		public void stop() throws Exception {
			System.out.println("Cerrando app");
			//aquí gestiono el cierre de la conexión a la bdd
			super.stop();
		}

}