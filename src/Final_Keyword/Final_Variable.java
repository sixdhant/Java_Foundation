package Final_Keyword;


public class Final_Variable 
{
    public static void main(String[] args) 
    {
        final int MAX_VALUE = 100;
        
        System.out.println("Maximum Value: " + MAX_VALUE);
        
        // Trying to change the value of a final variable results in a compile-time error
        // MAX_VALUE = 200;  // Uncommenting this will cause a compile-time error
    }
}
