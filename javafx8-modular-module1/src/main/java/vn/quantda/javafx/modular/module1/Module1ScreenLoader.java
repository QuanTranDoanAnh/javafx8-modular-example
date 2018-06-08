package vn.quantda.javafx.modular.module1;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import vn.quantda.javafx.modular.core.SceneMediator;

public class Module1ScreenLoader {
	SceneMediator sceneMediator;
	
	public Parent getView() {
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			System.out.println("Class Loader:" + classLoader.toString());
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/vn/quantda/javafx/modular/module1/Module1Screen.fxml"));
			Parent view = loader.load();
			Module1ScreenController controller = (Module1ScreenController) loader.getController();
			System.out.println("Controller1: " + controller);
			controller.setSceneMediator(sceneMediator);
			return view;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setSceneMediator(SceneMediator sceneMediator) {
		this.sceneMediator = sceneMediator;
	}
	
}
