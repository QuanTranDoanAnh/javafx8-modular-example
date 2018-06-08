package vn.quantda.javafx.modular.module1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import vn.quantda.javafx.modular.core.SceneMediator;

public class Module1ScreenController implements Initializable {

	SceneMediator sceneMediator;
	
	@FXML
    private Button switchScreenButton;

    @FXML
    void handleSwitchScreen(ActionEvent event) {
    	System.out.println("Moving out of Module1Screen ...");
    	this.sceneMediator.moveToScene("Screen2");
    	
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Module1Screen loaded");

	}
	
	public void setSceneMediator(SceneMediator sceneMediator) {
		this.sceneMediator = sceneMediator;
	}
}
