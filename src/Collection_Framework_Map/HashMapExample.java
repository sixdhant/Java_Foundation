package Collection_Framework_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 2);
        map.put("Apple", 4); // Updates the value for "Apple"

        // Displaying the Map
        System.out.println("HashMap: " + map);

        // Accessing a value by key
        System.out.println("Value for 'Apple': " + map.get("Apple"));

        // Removing a key-value pair
        map.remove("Banana");
        System.out.println("After removing 'Banana': " + map);

        // Checking if a key exists
        System.out.println("Contains key 'Cherry': " + map.containsKey("Cherry"));

        // Checking if a value exists
        System.out.println("Contains value 5: " + map.containsValue(5));

        // Iterating through the Map
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Displaying keys and values separately
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        // Clearing the Map
        map.clear();
        System.out.println("After clearing: " + map);
        System.out.println("Is Map empty? " + map.isEmpty());
    }
}
