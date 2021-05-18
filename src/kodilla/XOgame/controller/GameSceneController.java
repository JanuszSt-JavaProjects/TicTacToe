package kodilla.XOgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import kodilla.XOgame.model.MainLogic;

public class GameSceneController {

    MainLogic startMainLogic = new MainLogic();

    @FXML
    public void initialize(){

    }


    @FXML
    Button usedButton;

    public void buttonAction(ActionEvent event) {

        usedButton = (Button) event.getSource();
        startMainLogic.gameMove(usedButton);
    }

}
