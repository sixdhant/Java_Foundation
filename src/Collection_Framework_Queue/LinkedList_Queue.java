package Collection_Framework_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue 
{
    public static void main(String[] args) 
    {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.offer("Cherry"); // Using offer (alternative to add)

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Viewing the head of the Queue
        System.out.println("Head of Queue (peek): " + queue.peek());

        // Removing elements from the Queue
        System.out.println("Removed (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Viewing the head again
        System.out.println("Head of Queue (element): " + queue.element());

        // Removing another element
        System.out.println("Removed (remove): " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // Check if queue is empty
        System.out.println("Is Queue empty? " + queue.isEmpty());
    }
}
