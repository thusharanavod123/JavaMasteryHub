package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Using LinkedList as a Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        System.out.println("Queue: " + queue);

        // Removing elements
        System.out.println("Processing: " + queue.poll()); // Removes first element
        System.out.println("Queue after poll: " + queue);

        // Using PriorityQueue (Sorted order)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        System.out.println("PriorityQueue (sorted): " + priorityQueue);
    }
}

