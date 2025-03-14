package Exception_Handling;

import java.io.IOException;

public class Throws_Exception 
{
    public static void main(String[] args) 
    {
        try 
        {
            readFile();
        } 
        catch (IOException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method declares that it may throw IOException
    public static void readFile() throws IOException 
    {
        throw new IOException("File not found.");
    }
}
