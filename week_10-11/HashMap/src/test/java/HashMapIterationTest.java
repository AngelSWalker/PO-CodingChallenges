
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.HashMap;

class HashMapIterationTest {
    /*HashMapIteration hashMapIteration = new HashMapIteration();*/

    @Test
    void iterateWhile () {
        //create hashmap
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //put key-value pair into hashmap
        map.put(1, "First thing");
        map.put(2, "Second thing");


        StringBuilder x = new StringBuilder();
        x.append("\n" + "1 = First thing");
        x.append("\n" + "2 = Second thing");

        StringBuilder actual = HashMapIteration.iterateWhile(map);

        assertEquals(x.toString(), actual.toString());

    }

    @Test
    void iterateFor () {
        //create hashmap
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //put key-value pair into hashmap
        map.put(1, "First thing");
        map.put(2, "Second thing");


        StringBuilder x = new StringBuilder();
        x.append("\n" + "1 : First thing");
        x.append("\n" + "2 : Second thing");

        StringBuilder actual = HashMapIteration.iterateFor(map);

        assertEquals(x.toString(), actual.toString());
    }

}