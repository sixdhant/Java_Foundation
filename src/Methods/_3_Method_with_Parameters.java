package Methods;

public class _3_Method_with_Parameters 
{
    // Method with parameters
    public int add(int a, int b) 
    {
        return a + b;
    }

    public static void main(String[] args) {
        _3_Method_with_Parameters calc = new _3_Method_with_Parameters();
        int result = calc.add(5, 10);
        System.out.println("Sum: " + result);
    }
}

/**
 * 
 * Sum: 15

 */
