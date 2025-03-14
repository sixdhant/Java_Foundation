package Access_Modifiers;

class PublicExample
{
    public String name = "Public Access";

    public void display() 
    {
        System.out.println("This is a public method");
    }
}

public class public_Modifier 
{
    public static void main(String[] args) 
    {
        PublicExample obj = new PublicExample();
        System.out.println(obj.name); // Output: Public Access
        obj.display();               // Output: This is a public method
    }
}
