/* 			Instance Block Example			*/

package com.JavaBasicConcept;

public class _15_Instance_Block {

    public static void main(String[] args) 
    {
        // No instance block will run unless we create an object of the class.

        _15_Instance_Block obj = new _15_Instance_Block();  // Object creation triggers the instance block
    }

    // Instance Block (Non-static block)
    {
        // Instance block is executed when an object of the class is created.
        // It runs every time a new object is instantiated, before the constructor is called.
        String sName = "Siddhant Deshmukh";
        System.out.println("Output is: " + sName);
    }
}


/*

Output is: Siddhant Deshmukh

*/