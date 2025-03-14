package Collection_Framework_List;

import java.util.LinkedList;

public class LinkedList_example 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Rabbit");

        System.out.println("LinkedList: " + list);

        // Using LinkedList as a Queue
        list.addFirst("First Element");
        list.addLast("Last Element");
        System.out.println("After additions: " + list);
    }
}
