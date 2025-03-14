package This_Keyword;

public class _1_Accesing_Instance_Var 
{
    private int number;

    // Constructor with parameter
    public _1_Accesing_Instance_Var(int number) 
    {
        this.number = number; // Resolves conflict
    }

    public void displayNumber() 
    {
        System.out.println("Number: " + this.number);
    }

    public static void main(String[] args) 
    {
        _1_Accesing_Instance_Var obj = new _1_Accesing_Instance_Var(10);
        obj.displayNumber();
    }
}

/**

Number: 10

*/