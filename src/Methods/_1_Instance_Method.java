package Methods;

public class _1_Instance_Method 
{
    // Instance method
    public void displayMessage() 
    {
        System.out.println("Hello, this is an instance method!");
    }

    public static void main(String[] args) {
        // Create an object of the class
        _1_Instance_Method obj = new _1_Instance_Method();
        
        // Call the instance method
        obj.displayMessage();
    }
}
/**

Hello, this is an instance method!

**/