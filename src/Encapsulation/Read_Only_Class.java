package Encapsulation;

class ReadOnly 
{
    private String name = "ReadOnly Example";

    // Only getter, no setter
    public String getName() 
    {
        return name;
    }
}

public class Read_Only_Class 
{
    public static void main(String[] args) 
    {
        ReadOnly obj = new ReadOnly();
        System.out.println("Name: " + obj.getName()); // Output: Name: ReadOnly Example
    }
}
