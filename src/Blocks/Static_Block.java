package Blocks;

public class Static_Block 
{
    static int staticVariable;

    // Static block
    static 
    {
        staticVariable = 10;
        System.out.println("Static block executed. Static variable initialized to " + staticVariable);
    }

    public static void main(String[] args) 
    {
        System.out.println("Main method executed. Static variable is " + staticVariable);
    }
}

/**

Static block executed. Static variable initialized to 10
Main method executed. Static variable is 10


*/