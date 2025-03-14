package Collection_Framework_List;

import java.util.ArrayList;

public class ArrayList_example 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Apple"); // Allows duplicates

		System.out.println("ArrayList: " + list);
	}
}
