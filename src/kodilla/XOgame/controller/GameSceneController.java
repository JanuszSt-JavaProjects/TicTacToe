package kodilla.XOgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import kodilla.XOgame.model.MainLogic;

public class GameSceneController {
    private MainLogic startMainLogic;

    public void initialize() {

        startMainLogic = new MainLogic();
        startMainLogic.setLabel(label1);
    }


    @FXML
    Label label1;


    @FXML
    Button usedButton;


    public void buttonAction(ActionEvent event) {
        usedButton = (Button) event.getSource();
        startMainLogic.gameMove(usedButton);
    }

    void setLabelText(String winMessage) {
        label1.setText(winMessage);
    }
}
