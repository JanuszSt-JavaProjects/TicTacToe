package kodilla.XOgame.model;

import java.util.*;

public class ItemsShuffler {



    public void generateBeginningSet(){

        Set <String> workingSet= new HashSet<>();

        List<String> list = Arrays.asList("id1", "id2", "id3", "id3", "id4", "id5", "id6", "id7", "id8", "id9");
        Collections.shuffle(list);

        workingSet.addAll( list);
    }

}
