package String;

public class Immutability_Demonstration 
{
    public static void main(String[] args) 
    {
        String str = "Java";
        System.out.println("Original: " + str);

        // Trying to modify
        str.concat(" Programming");
        System.out.println("After concat: " + str); // Still "Java"

        // Assigning the result of concat
        str = str.concat(" Programming");
        System.out.println("Modified: " + str); // Now "Java Programming"
    }
}

