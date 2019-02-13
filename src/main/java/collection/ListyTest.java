package collection;

import java.util.ArrayList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Krzysiek");
        name.add("Staszek");
        name.add("Iwona");
        name.add("Samanta");
        System.out.println(name);
        name.remove(3);
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.contains("Iwona"));
        System.out.println(name.get(0));
        System.out.println(name.isEmpty());
        name.clear();
        System.out.println(name);







    }
}
