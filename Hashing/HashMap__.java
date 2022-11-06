import java.util.*;

public class HashMap__ {
    public static void main(String[] args) {
        // Country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 50);

        System.out.println(map);
        //**It will update the value is value already exist
        map.put("China", 150);
        System.out.println(map);

        //Search
        if(map.containsKey("Indonesia")){
        System.out.println("Key is present in the map");
        } else {
        System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China")); //key exist
        System.out.println(map.get("Indonesia")); //key doesn't exist

        //Iteration in HashMap
        // Iteration(1)
        for(Map.Entry<String, Integer> e: map.entrySet()) {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        }

        //Iteration(2)
        Set<String> keys = map.keySet();
        for(String key : keys){
        System.out.println(key+" "+ map.get(key));
        }

        //Removing
        map.remove("China");
        System.out.println(map);
    }
}
