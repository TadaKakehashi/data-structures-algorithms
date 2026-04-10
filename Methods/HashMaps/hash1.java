package Methods.HashMaps;
import java.util.*;

public class hash1 {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Kunal",89);
        map.put("Tada",42);
        map.put("Ray",100);

        System.out.println(map.get("Ray"));
        System.out.println(map.getOrDefault("Aryan", 54));
        System.out.println(map.containsKey("Ray"));
        System.out.println(map);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(100);

        System.out.println(set);
    }
}
