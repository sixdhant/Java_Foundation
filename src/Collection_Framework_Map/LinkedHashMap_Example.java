package Collection_Framework_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Example 
{
    public static void main(String[] args) 
    {
        // Create a LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Adding key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 2);

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + map);

        // Iterating over the LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
