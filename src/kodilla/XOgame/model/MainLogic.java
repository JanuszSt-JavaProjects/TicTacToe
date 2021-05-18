package kodilla.XOgame.model;

import javafx.scene.control.Button;

import java.util.Set;

public class MainLogic {
private Set idSet;


    public void gameMove(Button pressedButton) {

        pressedButton.setText("X");
        System.out.println(pressedButton.getId());
        System.out.println("Excellent Action !!");
        pressedButton.setDisable(true);

    }

    public void setIdSet(Set idSet) {
        this.idSet = idSet;
    }
}
