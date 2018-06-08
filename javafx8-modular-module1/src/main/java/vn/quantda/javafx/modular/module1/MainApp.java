package vn.quantda.javafx.modular.module1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	Stage primaryStage;
	Scene scene1, scene2;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;

		
		
		/*try {*/
			/*FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Module1Screen.fxml"));
			Parent screen1;

			screen1 = (Parent) loader.load();*/

			// load screen 1
			Module1ScreenLoader module1ScreenLoader = new Module1ScreenLoader();
			Parent screen1 = module1ScreenLoader.getView();
			scene1 = new Scene(screen1);
			this.primaryStage.setScene(scene1);
			this.primaryStage.show();
		/*} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public static void main(String[] args) {
		launch(args);
	}
}
