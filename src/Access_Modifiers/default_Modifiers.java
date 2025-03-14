package Access_Modifiers;

class DefaultExample 
{
    String defaultField = "Default Access";

    void display() 
    {
        System.out.println("This is a default method");
    }
}

public class default_Modifiers 
{
    public static void main(String[] args) 
    {
        DefaultExample obj = new DefaultExample();
        System.out.println(obj.defaultField); // Output: Default Access
        obj.display();                        // Output: This is a default method
    }
}
