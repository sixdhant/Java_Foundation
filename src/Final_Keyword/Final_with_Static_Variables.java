package Final_Keyword;

public class Final_with_Static_Variables 
{
    public static final double PI = 3.14159; // Static and final variable

    public static void main(String[] args) 
    {
        System.out.println("Value of PI: " + PI);
        // PI = 3.14; // This will cause a compilation error
    }
}
