package This_Keyword;

public class _2_Another_Constructor 
{
    private String name;

    // Constructor 1
    public _2_Another_Constructor()
    {
        this("Default Name"); // Calls Constructor 2
    }

    // Constructor 2
    public _2_Another_Constructor(String name) 
    {
        this.name = name;
    }

    public void displayName() 
    {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args)
    {
        _2_Another_Constructor obj = new _2_Another_Constructor(); // Calls Constructor 1
        obj.displayName();
    }
}

