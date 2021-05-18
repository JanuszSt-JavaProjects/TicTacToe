package kodilla.XOgame.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WinChecker {
    private Set<String> row1 = new HashSet<>(Arrays.asList("id1", "id2", "id3"));
    private Set<String> row2 = new HashSet<>(Arrays.asList("id4", "id5", "id6"));
    private Set<String> row3 = new HashSet<>(Arrays.asList("id7", "id8", "id9"));

    private Set<String> col1 = new HashSet<>(Arrays.asList("id1", "id4", "id7"));
    private Set<String> col2 = new HashSet<>(Arrays.asList("id2", "id5", "id8"));
    private Set<String> col3 = new HashSet<>(Arrays.asList("id3", "id6", "id9"));

    private Set<String> diag1 = new HashSet<>(Arrays.asList("id1", "id5", "id9"));
    private Set<String> diag2 = new HashSet<>(Arrays.asList("id3", "id5", "id7"));


     boolean winConditionCheck(Set<String> playerScoreSet) {

        if (playerScoreSet.equals(row1) ||
                playerScoreSet.equals(row2) ||
                playerScoreSet.equals(row3) ||

                playerScoreSet.equals(col1) ||
                playerScoreSet.equals(col2) ||
                playerScoreSet.equals(col3) ||

                playerScoreSet.equals(diag1) ||
                playerScoreSet.equals(diag2)) {

            return true;
        }
        return false;

    }
}
