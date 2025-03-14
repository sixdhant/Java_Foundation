package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample1 {
    public static void main(String[] args) 
    {
        // Sample string
        String sentence = "apple,banana,orange,grape";

        // Create a StringTokenizer object using a comma as a delimiter
        StringTokenizer tokenizer = new StringTokenizer(sentence, ",");

        /*
        while (tokenizer.hasMoreTokens()) 
        {
            System.out.println(tokenizer.nextToken());
        } */
        
        for (int i = 0; tokenizer.hasMoreTokens(); i++) 
        {
        	System.out.println(tokenizer.nextToken());
        }
    }
}
