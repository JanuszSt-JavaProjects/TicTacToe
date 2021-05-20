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
        startMainLogic.setBtn1(id1);
        startMainLogic.setBtn2(id2);
        startMainLogic.setBtn3(id3);
        startMainLogic.setBtn4(id4);
        startMainLogic.setBtn5(id5);
        startMainLogic.setBtn6(id6);
        startMainLogic.setBtn7(id7);
        startMainLogic.setBtn8(id8);
        startMainLogic.setBtn9(id9);

        startMainLogic.buttonSetCreator();

        label1.setText("Hello !\n" +
                "This is \"Tic Tac Toe\" Game\n" +
                "Rules are simple: press any button to mark field by \"X\" sign. " +
                "Next Computer takes its choice\n and marks chosen field by \"O\" sign " +
                "Wins Player who first marks 3 \"X\"-es or \"O\"-s  in: horizontal, vertical or diagonal line.\n" +
                "Your move! - Start!");
    }


    @FXML
    Label label1;

    @FXML
    Button id1;
    @FXML
    Button id2;
    @FXML
    Button id3;
    @FXML
    Button id4;
    @FXML
    Button id5;
    @FXML
    Button id6;
    @FXML
    Button id7;
    @FXML
    Button id8;
    @FXML
    Button id9;

    @FXML
    public void buttonAction(ActionEvent event) {
        Button usedButton = (Button) event.getSource();
        startMainLogic.gameExecute(usedButton);
    }
}
