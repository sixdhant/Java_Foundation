package Methods;

public class _4_Method_with_Return_Type 
{
    // Method with return type
    public int square(int number) 
    {
        return number * number;
    }

    public static void main(String[] args) 
    {
        _4_Method_with_Return_Type calc = new _4_Method_with_Return_Type();
        int result = calc.square(4);
        System.out.println("Square: " + result);
    }
}

/**

Square: 16

*/