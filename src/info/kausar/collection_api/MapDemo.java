package info.kausar.collection_api;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// To achieve Key Value pairing we use Map
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // For Generic safety use diamond bracket and use there type
        map.put("myName", "Kausar");
        map.put("myBoss", "Roy");
        map.put("myColleague", "Shafi");
        // HashMap and HashSet both use HashCoding(Fetch the nearest value while saving)
        System.out.println(map);


        //to fetch value with the help of key we need to set value with Set
        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " : " + map.get(key) );

        }

    }
}
