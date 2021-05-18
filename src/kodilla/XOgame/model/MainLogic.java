package kodilla.XOgame.model;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.HashSet;
import java.util.Set;

public class MainLogic {
    Set<String> PlayerScoreSet = new HashSet<>();
    Set<String> ComputerScoreSet = new HashSet<>();


    private final Set<String> idSet = new ItemsShuffler().generateBeginningSet();
    WinChecker winChecker = new WinChecker();
    Label label;

    public void gameMove(Button pressedButton) {
//        this.label = label;
        String pressedButtonId = pressedButton.getId();

        if (pressedButtonId.equals("id3"))label.setText("-------------");
        idSet.remove(pressedButtonId);


        pressedButton.setText("X");
        pressedButton.setDisable(true);
    }

    private void winCheck(Set<String> gamerScoreSet) {
        if (winChecker.winConditionCheck(gamerScoreSet)) {
        }
    }

    void setLabelText(String messageText) {

    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
