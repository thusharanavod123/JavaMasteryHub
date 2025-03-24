package collections;


    import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements
        System.out.println("First element in ArrayList: " + arrayList.get(0));

        // Iterating over List
        for (String fruit : arrayList) {
            System.out.println("Fruit: " + fruit);
        }
    }
}


