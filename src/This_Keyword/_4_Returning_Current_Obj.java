package This_Keyword;

public class _4_Returning_Current_Obj 
{
    private int value;

    public _4_Returning_Current_Obj setValue(int value) 
    {
        this.value = value;
        return this; // Returns the current object
    }

    public void displayValue() 
    {
        System.out.println("Value: " + this.value);
    }

    public static void main(String[] args) 
    {
        _4_Returning_Current_Obj obj = new _4_Returning_Current_Obj();
        obj.setValue(50).displayValue(); // Method chaining
    }
}
/**
 * 
 * Value: 50 
 */
