package Methods;

public class _5_Overloaded_Methods 
{
    // Method with no parameters
    public void printMessage() 
    {
        System.out.println("No arguments provided.");
    }

    // Method with one parameter
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        _5_Overloaded_Methods obj = new _5_Overloaded_Methods();
        obj.printMessage();
        obj.printMessage("Hello, Overloading!");
    }
}
/**
 * 
 * No arguments provided.
   Message: Hello, Overloading!

 * 
 */

