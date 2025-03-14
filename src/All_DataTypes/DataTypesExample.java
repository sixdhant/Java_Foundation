package All_DataTypes;

import java.util.Arrays;

public class DataTypesExample {

    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 10;	//8-bit integer
        short shortVar = 20;	//16-bit integer
        int intVar = 30;		// 32-bit integer
        long longVar = 10000000000L;	//64-bit integer
        float floatVar = 5.5f;			//32-bit floating point
        double doubleVar = 10.123;		//64-bit floating point
        char charVar = 'A';				//Single character
        boolean booleanVar = true;		//true-false

        // Non-Primitive Data Types
        String stringVar = "Siddhant Deshmukh";
        int[] arrayVar = {1, 2, 3, 4, 5}; // Array
        DataTypesExample obj = new DataTypesExample(); // Class Object

        // Output Primitive Data Types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);

        // Output Non-Primitive Data Types
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String: " + stringVar);
        System.out.println("Array: " + Arrays.toString(arrayVar));
        System.out.println("Object: " + obj.toString());
    }

    @Override
    public String toString() {
        return "This is a DataTypesExample object.";
    }
}

