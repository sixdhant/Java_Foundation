package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {
    public static void main(String[] args) {
        // Sample string
        String sentence = "apple,banana,orange,grape";

        // Create a StringTokenizer object using a comma as a delimiter
        StringTokenizer tokenizer = new StringTokenizer(sentence, ",");

        // Get the number of tokens
        int tokenCount = tokenizer.countTokens();
        System.out.println("Number of tokens: " + tokenCount);

        for (int i = 0; tokenizer.hasMoreTokens(); i++) 
        {
        	System.out.println(tokenizer.nextToken());
        }
    }
}

