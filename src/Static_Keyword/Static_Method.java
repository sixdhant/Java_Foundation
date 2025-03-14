package Static_Keyword;

public class Static_Method {
    // Static method
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        int result = Static_Method.add(5, 10); // No need for an object
        System.out.println("Result: " + result);
    }
}
/**
 * 
 * Output : Result: 15
 * 
 */
