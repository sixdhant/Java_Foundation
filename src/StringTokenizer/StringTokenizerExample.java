package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // Sample string
        String sentence = "Java is fun and easy to learn";

        // Create a StringTokenizer object using space as a delimiter
        StringTokenizer tokenizer = new StringTokenizer(sentence);

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
