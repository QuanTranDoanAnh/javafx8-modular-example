package vn.quantda.javafx.modular.module2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vn.quantda.javafx.modular.core.SceneMediator;

public class MainApp extends Application {
	SceneMediator sceneMediator;
	Stage primaryStage;
	Scene scene1, scene2;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;

		
		
		/*try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Module2Screen.fxml"));
			Parent screen2;

			screen2 = (Parent) loader.load();*/

			// load screen 1
			Module2ScreenLoader module1ScreenLoader = new Module2ScreenLoader();
			Parent screen2 = module1ScreenLoader.getView();
			scene2 = new Scene(screen2);
			this.primaryStage.setScene(scene2);
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
