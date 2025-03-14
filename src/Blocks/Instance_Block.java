package Blocks;

public class Instance_Block {
    int instanceVariable;

    // Instance block
    {
        instanceVariable = 5;
        System.out.println("Instance block executed. Instance variable initialized to " + instanceVariable);
    }

    // Constructor
    public Instance_Block() 
    {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) 
    {
        System.out.println("Creating first object...");
        Instance_Block obj1 = new Instance_Block();

        System.out.println("Creating second object...");
        Instance_Block obj2 = new Instance_Block();
    }
}

/**

Creating first object...
Instance block executed. Instance variable initialized to 5
Constructor executed.
Creating second object...
Instance block executed. Instance variable initialized to 5
Constructor executed.

*/