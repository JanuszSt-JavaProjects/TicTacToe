package kodilla.XOgame.model;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import kodilla.XOgame.Main;

import java.util.*;

public class MainLogic extends Main {

    Label label;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    Set<Button> buttonsSet = new HashSet<>();

    Set<String> playerScoreIdSet = new HashSet<>();
    Set<String> computerScoreIdSet = new HashSet<>();

    Button computerButton = new Button();
    ArrayDeque<Button> computerButtonChoiceQueue = new ArrayDeque<>();

    boolean continueGame = true;

    WinChecker winChecker = new WinChecker();


    public void buttonSetCreator() {

        buttonsSet.add(btn1);
        buttonsSet.add(btn2);
        buttonsSet.add(btn3);
        buttonsSet.add(btn4);
        buttonsSet.add(btn5);
        buttonsSet.add(btn6);
        buttonsSet.add(btn7);
        buttonsSet.add(btn8);
        buttonsSet.add(btn9);

        computerButtonChoiceQueue.addAll(buttonsSet.stream().toList());

    }

    public void gameMoves(Button pressedButton) {

        // Player move
        if (continueGame) {
            pressedButton.setText("X");
            pressedButton.setDisable(true);

            buttonsSet.remove(pressedButton);

            String pressedButtonId = pressedButton.getId();
            playerScoreIdSet.add(pressedButtonId);

            winConditionsCheck(playerScoreIdSet, "You Win !!!");
        }

        // Computer move
        if (continueGame) {
            shuffler();
            computerButtonChoiceQueue.clear();
            computerButtonChoiceQueue.addAll(buttonsSet.stream().toList());

            computerButton = computerButtonChoiceQueue.pollFirst();
            try {
                computerScoreIdSet.add(computerButton.getId());

                computerButton.setText("O");
                computerButton.setDisable(true);
                winConditionsCheck(computerScoreIdSet, "Computer WINS !");
                buttonsSet.remove(computerButton);

            } catch (NullPointerException e) {
                zeroSizeConditionCheck();
            }
        }
    }

    private void winConditionsCheck(Set<String> gamerScoreSet, String specifiedGamerWinText) {
        if (winChecker.winConditionCheck(gamerScoreSet)) {

            label.setText(String.valueOf(specifiedGamerWinText));

            for (Button button : buttonsSet) {
                button.setDisable(true);
            }
            continueGame = false;

            try {
                stop();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }

    void zeroSizeConditionCheck() {
        if ((computerButtonChoiceQueue.size() == 0) || (buttonsSet.size() == 0)) {
            label.setText(" DRAW - nobody wins.");
            continueGame = false;

            try {
                stop();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    void shuffler() {
        ArrayList<Button> shuffledList = new ArrayList<>(buttonsSet);
        Collections.shuffle(shuffledList);
    }


    public void setLabel(Label label) {
        this.label = label;
    }

    public void setBtn1(Button btn1) {
        this.btn1 = btn1;
    }

    public void setBtn2(Button btn2) {
        this.btn2 = btn2;
    }

    public void setBtn3(Button btn3) {
        this.btn3 = btn3;
    }

    public void setBtn4(Button btn4) {
        this.btn4 = btn4;
    }

    public void setBtn5(Button btn5) {
        this.btn5 = btn5;
    }

    public void setBtn6(Button btn6) {
        this.btn6 = btn6;
    }

    public void setBtn7(Button btn7) {
        this.btn7 = btn7;
    }

    public void setBtn8(Button btn8) {
        this.btn8 = btn8;
    }

    public void setBtn9(Button btn9) {
        this.btn9 = btn9;
    }

}
