package Collection_Framework_Map;

import java.util.TreeMap;

public class Tree_Map_Example 
{
    public static void main(String[] args) 
    {
        // Create a TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // Adding key-value pairs
        map.put("Banana", 5);
        map.put("Apple", 3);
        map.put("Cherry", 2);

        // Displaying the TreeMap (sorted by keys)
        System.out.println("TreeMap (Sorted): " + map);

        // Retrieving the first and last keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
    }
}
