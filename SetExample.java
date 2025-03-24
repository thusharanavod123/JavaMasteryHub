package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Using HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java"); // Duplicate, won't be added
        System.out.println("HashSet: " + hashSet);

        // Using TreeSet (Sorted)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println("TreeSet (sorted): " + treeSet);

        // Checking existence
        System.out.println("Is Java in the set? " + hashSet.contains("Java"));
    }
}

