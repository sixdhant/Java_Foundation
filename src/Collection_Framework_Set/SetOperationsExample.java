package Collection_Framework_Set;

import java.util.HashSet;
import java.util.Iterator;

public class SetOperationsExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Apple"); // Duplicate, will not be added

        // Display the Set
        System.out.println("Initial Set: " + set);

        // Check the size of the Set
        System.out.println("Size of the Set: " + set.size());

        // Check if an element exists
        System.out.println("Contains 'Banana': " + set.contains("Banana"));
        System.out.println("Contains 'Grapes': " + set.contains("Grapes"));

        // Remove an element from the Set
        set.remove("Cherry");
        System.out.println("After removing 'Cherry': " + set);

        // Iterate over the Set using enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        for (String item : set) {
            System.out.println(item);
        }

        // Iterate over the Set using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clear all elements from the Set
        set.clear();
        System.out.println("After clearing the Set: " + set);

        // Check if the Set is empty
        System.out.println("Is the Set empty? " + set.isEmpty());
    }
}

