package kodilla.XOgame.model;

import javafx.scene.control.Button;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WinChecker extends MainLogic{
    private Set<String> row1 = new HashSet<>(Arrays.asList("id1", "id2", "id3"));
    private Set<String> row2 = new HashSet<>(Arrays.asList("id4", "id5", "id6"));
    private Set<String> row3 = new HashSet<>(Arrays.asList("id7", "id8", "id9"));

    private Set<String> col1 = new HashSet<>(Arrays.asList("id1", "id4", "id7"));
    private Set<String> col2 = new HashSet<>(Arrays.asList("id2", "id5", "id8"));
    private Set<String> col3 = new HashSet<>(Arrays.asList("id3", "id6", "id9"));

    private Set<String> diag1 = new HashSet<>(Arrays.asList("id1", "id5", "id9"));
    private Set<String> diag2 = new HashSet<>(Arrays.asList("id3", "id5", "id7"));


    boolean winConditionCheck(Set<String> playerScoreSet) {

        if (playerScoreSet.containsAll(row1) ||
                playerScoreSet.containsAll(row2) ||
                playerScoreSet.containsAll(row3) ||

                playerScoreSet.containsAll(col1) ||
                playerScoreSet.containsAll(col2) ||
                playerScoreSet.containsAll(col3) ||

                playerScoreSet.containsAll(diag1) ||
                playerScoreSet.containsAll(diag2)) {

            return true;
        }
        return false;
    }

    void endGameExecute(Set<String> gamerScoreSet, String specifiedGamerWinText) {
        if (winConditionCheck(gamerScoreSet)) {

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

}
