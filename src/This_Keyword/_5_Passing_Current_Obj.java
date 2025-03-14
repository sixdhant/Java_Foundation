package This_Keyword;

public class _5_Passing_Current_Obj 
{
    public void display(_5_Passing_Current_Obj obj) 
    {
        System.out.println("Method called using the current object");
    }

    public void callDisplay() 
    {
        display(this); // Passes the current object
    }

    public static void main(String[] args) 
    {
        _5_Passing_Current_Obj obj = new _5_Passing_Current_Obj();
        obj.callDisplay();
    }
}

/**

Method called using the current object

*/