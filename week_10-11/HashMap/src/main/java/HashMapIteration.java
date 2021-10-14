import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        //create hashmap
        HashMap<Integer, String> stuff = new HashMap<Integer, String>();

        //put key-value pair into hashmap
        stuff.put(1, "First thing");
        stuff.put(2, "Second thing");
        stuff.put(4, "Fourth thing");
        stuff.put(3, "Third thing");

        System.out.println(iterateWhile(stuff));
        System.out.println();
        System.out.println(iterateFor(stuff));    }

    public static StringBuilder iterateWhile(HashMap<Integer, String> map){
        //Iterator
        Iterator iterator = map.entrySet().iterator();
        StringBuilder x = new StringBuilder();

        //loop through map with while loop
        while(iterator.hasNext()){
            Map.Entry<Integer, String> newMap = (Map.Entry<Integer, String >)iterator.next();

            //display HashMap
            x.append("\n" + newMap.getKey() + " = " + newMap.getValue());
        }
        return x;
    }

   public static StringBuilder iterateFor(HashMap<Integer, String> map){
        StringBuilder x = new StringBuilder();
        //loop through map with advanced for loop
        for(Map.Entry<Integer, String> newMap : map.entrySet()){
            //display HashMap
            x.append("\n" + newMap.getKey() + " : " + newMap.getValue());
        }
        return x;
    }
}
