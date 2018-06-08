package vn.quantda.javafx.modular.main;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vn.quantda.javafx.modular.core.SceneMediator;
import vn.quantda.javafx.modular.module1.Module1ScreenLoader;
import vn.quantda.javafx.modular.module2.Module2ScreenLoader;

public class JavaFX8ModularMain extends Application implements SceneMediator {

	Stage primaryStage;
	Scene scene1, scene2;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
		// load screen 1
		Module1ScreenLoader module1ScreenLoader = new Module1ScreenLoader();
		module1ScreenLoader.setSceneMediator(this);
		Parent screen1 = module1ScreenLoader.getView();
		scene1 = new Scene(screen1);
		Module2ScreenLoader module2ScreenLoader = new Module2ScreenLoader();
		module2ScreenLoader.setSceneMediator(this);
		Parent screen2 = module2ScreenLoader.getView();
		scene2 = new Scene(screen2);
		this.primaryStage.setScene(scene1);
		this.primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void moveToScene(String name) {
		
		if (null != name && !name.isEmpty()) {
			System.out.println("Received a request to move to " + name);
			if (name.equals("Screen1")) {
				this.primaryStage.setScene(scene1);
				this.primaryStage.show();
			} else {
				this.primaryStage.setScene(scene2);
				this.primaryStage.show();
			}
		} else {
			System.out.println("Nonsense! No screen name assigned.");
		}
	}
}
