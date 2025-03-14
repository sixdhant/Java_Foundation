package Collection_Framework_Set;

import java.util.HashSet;

public class HashSet_Example 
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Checking if an element exists
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // Iterating through the HashSet
        System.out.println("Iterating over HashSet:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
