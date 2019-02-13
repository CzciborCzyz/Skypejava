package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapyTest {
    public static void main(String[] args) {
        Map<String,Integer> oceny = new LinkedHashMap<String, Integer>();
        oceny.put("Matematyka", 1);
        oceny.put("Geografia",4);
        oceny.put("Polski", 6);
        oceny.put("Inforamtyka", 3);
        oceny.put("Fizyka",2);
        System.out.println(oceny);
        System.out.println(oceny.values());


    }
}
