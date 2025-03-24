package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // Using HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);

        // Accessing values
        System.out.println("Value for key 2: " + hashMap.get(2));

        // Using TreeMap (Sorted)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);
        System.out.println("TreeMap (sorted by key): " + treeMap);
    }
}
