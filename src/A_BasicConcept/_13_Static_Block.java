/* 			Static Block Example			*/

package A_BasicConcept;

public class _13_Static_Block {

    public static void main(String[] args) 
    {
        // The static block will execute before the main method, even if there is no object creation here
    }

    // Static Block
    static 
    {
        // Static block is executed when the class is loaded into memory, no object creation is needed.
        String sName = "Siddhant Deshmukh";
        System.out.println("Output is: " + sName);
    }
}

/*

Output is: Siddhant Deshmukh

*/