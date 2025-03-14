package Collection_Framework_Queue;

import java.util.ArrayDeque;

public class ArrayDeque_Example 
{
    public static void main(String[] args) 
    {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.offer("Apple");
        deque.offer("Banana");
        deque.offer("Cherry");

        // Displaying the deque
        System.out.println("ArrayDeque: " + deque);

        // Removing elements
        System.out.println("Removed (poll): " + deque.poll());
        System.out.println("Deque after poll: " + deque);

        // Adding to the front and rear
        deque.offerFirst("First");
        deque.offerLast("Last");

        // Displaying the updated deque
        System.out.println("Updated ArrayDeque: " + deque);
    }
}
