package Super_Keyword;

class Parent6 
{
    Parent6(String message) 
    {
        System.out.println("Parent class constructor: " + message);
    }
}

class Child6 extends Parent6
{
    Child6(String message) 
    {
        super(message); // Calls Parent class constructor
        System.out.println("Child class constructor: " + message);
    }
}

public class Call_Parent_Class_Constructor 
{
    public static void main(String[] args) 
    {
        Child6 obj = new Child6("Hello");
    }
}
