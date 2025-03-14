package Access_Modifiers;

class PrivateExample 
{
    private String secret = "Private Data";

    private void displaySecret() 
    {
        System.out.println(secret);
    }

    public void accessSecret() 
    {
        displaySecret(); // Indirect access to private method
    }
}

public class private_Modifier 
{
    public static void main(String[] args) 
    {
        PrivateExample obj = new PrivateExample();
        // System.out.println(obj.secret); // Error: secret has private access
        obj.accessSecret();               // Output: Private Data
    }
}
