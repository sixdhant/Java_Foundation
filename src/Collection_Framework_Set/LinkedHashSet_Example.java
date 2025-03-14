package Collection_Framework_Set;

import java.util.LinkedHashSet;

public class LinkedHashSet_Example 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        // Iterating through the LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String item : set) 
        {
            System.out.println(item);
        }
    }
}
