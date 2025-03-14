package Collection_Framework_Queue;

import java.util.PriorityQueue;

public class PriorityQueue_Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);

        // Displaying the PriorityQueue (does not maintain insertion order)
        System.out.println("PriorityQueue: " + priorityQueue);

        // Viewing the head element
        System.out.println("Head of PriorityQueue (peek): " + priorityQueue.peek());

        // Removing elements in priority order
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed: " + priorityQueue.poll());
        }
    }
}
