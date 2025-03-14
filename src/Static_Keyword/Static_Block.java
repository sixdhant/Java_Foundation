package Static_Keyword;

public class Static_Block 
{
    // Static variable
    static int number;

    // Static block
    static 
    {
        number = 42;
        System.out.println("Static block executed"); // First Executed 
    }

    public static void main(String[] args) 
    {
        System.out.println("Number: " + Static_Block.number); // Second Executed
    }
}

/**

Static block executed
Number: 42

*/