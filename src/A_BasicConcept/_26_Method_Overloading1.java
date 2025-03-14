/* 		Method Overloading Example - Subtraction	*/

package A_BasicConcept;
public class _26_Method_Overloading1 
{
    public static void main(String[] args) 
    {
        Calculator1 calc = new Calculator1();  // Object Creation
        
        calc.subtract(50, 20);            // Subtract two integers
        calc.subtract(100.5, 25.5);       // Subtract two doubles
        calc.subtract(100);               // Subtract from a default value
        int result = calc.subtract();     // Subtract two internal values
        System.out.println("Result of internal subtraction: " + result);
    }
}

class Calculator1 
{
    // Method 1: Subtract two integers
    void subtract(int x, int y) 
    {
        int result = x - y;
        System.out.println("Subtraction of two integers: " + result);
    }
    
    // Method 2: Subtract two doubles
    void subtract(double x, double y) 
    {
        double result = x - y;
        System.out.println("Subtraction of two doubles: " + result);
    }
    
    // Method 3: Subtract from a default value (single parameter)
    void subtract(int x) 
    {
        int defaultValue = 100;
        int result = defaultValue - x;
        System.out.println("Subtraction from default value: " + result);
    }
    
    // Method 4: Subtract using internal values (no parameters)
    int subtract() 
    {
        int a = 30, b = 10;
        return a - b;
    }
}

/*
Subtraction of two integers: 30
Subtraction of two doubles: 75.0
Subtraction from default value: 0
Result of internal subtraction: 20

*/