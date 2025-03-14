/* 			Class and Object Simple Example	*/

package A_BasicConcept;

// Main class where the execution starts
public class _01_Class_Object {

    // Main method: Entry point of the Java application
    public static void main(String[] args) {
        // Object Creation
        // 'sid' is an object of class Siddhant1
        Siddhant1 sid 	= 	new Siddhant1();
       // Reference     	// instance
        
        
        // Calling the 'show' method using the object 'sid'
        sid.show();
    }
}

// Defining the class 'Siddhant1'
class Siddhant1 {
    // Declaring an integer variable and initializing it
    int iNo1 = 100;
    
    // Declaring a String variable and initializing it
    String sName = "Siddhant Deshmukh";
    
    // Defining the 'show' method, which prints the values of iNo1 and sName
    void show() {
        // Printing the value of 'iNo1' and 'sName' with some formatting
        System.out.println("Output is: " + iNo1 + " / " + sName);
    }
}

/**

Output is: 100 / Siddhant Deshmukh

*/