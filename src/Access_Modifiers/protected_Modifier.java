package Access_Modifiers;

class SubClass extends ProtectedExample 
{
    public void show() 
    {
        System.out.println(protectedField); // Accessible due to inheritance
        display();
    }
}

public class protected_Modifier 
{
    public static void main(String[] args) 
    {
        SubClass obj = new SubClass();
        obj.show(); // Output: Protected Access
                    //         This is a protected method
    }
}
