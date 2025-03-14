package Static_Keyword;

public class Static_Variable 
{
    // Static variable
    static int count = 0;

    // Instance method
    public Static_Variable() 
    {
        count++;
    }

    public static void main(String[] args) {
        Static_Variable obj1 = new Static_Variable();
        Static_Variable obj2 = new Static_Variable();
        Static_Variable obj3 = new Static_Variable();
        
        System.out.println("Count: " + Static_Variable.count); // Access using class name
    }
}

/**

Output : Count: 3

*/