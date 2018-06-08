package vn.quantda.javafx.modular.module2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import vn.quantda.javafx.modular.core.SceneMediator;

public class Module2ScreenController implements Initializable {

	SceneMediator sceneMediator;
	
	@FXML
    private Button switchScreenButton;

    @FXML
    void handleSwitchScreen(ActionEvent event) {
    	System.out.println("Moving out of Module2Screen ...");
    	this.sceneMediator.moveToScene("Screen1");
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Module2Screen loaded");

	}
	
	public void setSceneMediator(SceneMediator sceneMediator) {
		this.sceneMediator = sceneMediator;
	}

}
