package Collection_Framework_List;

import java.util.ArrayList;

public class Common_Operations 
{
    public static void main(String[] args) 
    {
        // Create a list
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Original List: " + list);

        // Get element by index
        System.out.println("Element at index 1: " + list.get(1));

        // Update an element
        list.set(1, "Blueberry");
        System.out.println("Updated List: " + list);

        // Remove an element
        list.remove("Apple");
        System.out.println("After Removal: " + list);

        // Check if an element exists
        System.out.println("Contains 'Cherry': " + list.contains("Cherry"));

        // Iterate over the list
        System.out.println("Iterating over list:");
        for (String item : list) 
        {
            System.out.println(item);
        }
    }
}
