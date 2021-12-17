package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollPane = loader.load();

			// Macete para se ajustar ao tamanho da janela e tudo se ajustar.
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);

			Scene mainScene = new Scene(scrollPane);
			primaryStage.setScene(mainScene);
			// Titulo a ser exibido na tela de cima
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
