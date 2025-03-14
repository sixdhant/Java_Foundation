package This_Keyword;

public class _3_Instance_Methods 
{
    public void methodA() 
    {
        System.out.println("Method A called");
        this.methodB(); // Calls methodB of the current object
    }

    public void methodB() 
    {
        System.out.println("Method B called");
        this.methodc();
    }
    
    public void methodc() 
    {
        System.out.println("Method C called");
        
    }
    
    public static void main(String[] args) 
    {
        _3_Instance_Methods obj = new _3_Instance_Methods();
        obj.methodA();
    }
}

/**

Method A called
Method B called
Method C called


*/