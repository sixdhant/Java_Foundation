package Collection_Framework_Set;

import java.util.TreeSet;

public class TreeSet_Example 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<>();

		// Adding elements to the TreeSet
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(20); // Duplicate, will not be added

		// Displaying the TreeSet (sorted order)
		System.out.println("TreeSet (Sorted): " + set);

		// Checking the first and last elements
		System.out.println("First Element: " + set.first());
		System.out.println("Last Element: " + set.last());

		// Removing an element
		set.remove(10);
		System.out.println("After removing 10: " + set);
	}
}
